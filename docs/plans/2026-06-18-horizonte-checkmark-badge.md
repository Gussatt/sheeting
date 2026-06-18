# Horizonte Checkmark Badge — Implementation Plan

> **For Gemini:** REQUIRED SUB-SKILL: Use superpowers:executing-plans to implement this plan task-by-task.

**Goal:** When the user taps the day-number column in any HorizonteCell, toggle a folded-corner triangle badge (with ✓) on the top-right of that column, persisted in the existing `daily_status` table.

**Architecture:** The `daily_status` table already has `date TEXT PK, is_checked INTEGER`. We add a `useDailyStatus` hook that reads checked dates and exposes a toggle function. HorizonteGrid passes this data down. HorizonteCell becomes tappable on the day column and renders an SVG triangle badge when checked.

**Tech Stack:** React Native, expo-sqlite (via existing `db`/`useSQL`), react-native-svg (already in project)

---

### Task 1: Create `useDailyStatus` hook

**Files:**
- Create: `src/hooks/useDailyStatus.ts`
- Create: `src/hooks/useDailyStatus.test.ts`

**Step 1: Write the failing test**

```typescript
// src/hooks/useDailyStatus.test.ts
import { describe, it, expect } from 'vitest';
import { buildDateKey } from './useDailyStatus';

describe('buildDateKey', () => {
  it('formats a year, month (0-indexed), and day into YYYY-MM-DD', () => {
    expect(buildDateKey(2026, 5, 18)).toBe('2026-06-18');
  });

  it('zero-pads single-digit months and days', () => {
    expect(buildDateKey(2026, 0, 3)).toBe('2026-01-03');
  });
});
```

**Step 2: Run test to verify it fails**

Run: `npx vitest run src/hooks/useDailyStatus.test.ts`
Expected: FAIL — `buildDateKey` is not defined

**Step 3: Write minimal implementation**

```typescript
// src/hooks/useDailyStatus.ts
import { useCallback } from 'react';
import { db, useSQL } from '../db/db';

/** Build a `YYYY-MM-DD` key from year, 0-indexed month, and day. */
export function buildDateKey(year: number, month0: number, day: number): string {
  const mm = String(month0 + 1).padStart(2, '0');
  const dd = String(day).padStart(2, '0');
  return `${year}-${mm}-${dd}`;
}

interface DailyStatusRow {
  date: string;
  isChecked: number;
}

/**
 * Reactive hook — reads all checked dates from `daily_status` and
 * returns a Set<string> of date keys plus a toggle function.
 */
export function useDailyStatus() {
  const rows = useSQL<DailyStatusRow>('SELECT date, is_checked FROM daily_status WHERE is_checked = 1');
  const checkedDates = new Set(rows.map(r => r.date));

  const toggleDate = useCallback(async (dateKey: string) => {
    const existing = await db.query<DailyStatusRow>(
      'SELECT is_checked FROM daily_status WHERE date = $1',
      [dateKey]
    );

    if (existing.length === 0) {
      await db.exec(
        'INSERT INTO daily_status (date, is_checked) VALUES ($1, 1)',
        [dateKey]
      );
    } else {
      const newVal = existing[0].isChecked ? 0 : 1;
      await db.exec(
        'UPDATE daily_status SET is_checked = $1 WHERE date = $2',
        [newVal, dateKey]
      );
    }
  }, []);

  return { checkedDates, toggleDate };
}
```

**Step 4: Run test to verify it passes**

Run: `npx vitest run src/hooks/useDailyStatus.test.ts`
Expected: PASS

**Step 5: Commit**

```bash
git add src/hooks/useDailyStatus.ts src/hooks/useDailyStatus.test.ts
git commit -m "feat: useDailyStatus hook with buildDateKey helper"
```

---

### Task 2: Add checkmark badge to HorizonteCell

**Files:**
- Modify: `src/components/Ledger/HorizonteCell.tsx`

**Step 1: Update HorizonteCell to accept `isChecked` and `onToggle` props**

Add new props to the interface:
```typescript
interface HorizonteCellProps {
  day: number;
  balance: number;
  isChecked?: boolean;
  onToggle?: () => void;
}
```

**Step 2: Wrap the day column in a Pressable and render the triangle badge**

Replace the existing day column `<View>` with a `<Pressable>` that calls `onToggle` on press. When `isChecked` is true, render an SVG triangle (folded corner) in the top-right with a ✓ inside.

The triangle badge: a small ~14px right-triangle positioned absolutely at `top: 0, right: 0` of the day column, using `react-native-svg`.

Full updated component:

```tsx
import React from 'react';
import { View, Text, StyleSheet, Pressable } from 'react-native';
import Svg, { Path, Polyline } from 'react-native-svg';
import { useAppTheme } from '../../styles/theme';

interface HorizonteCellProps {
  day: number;
  balance: number;
  isChecked?: boolean;
  onToggle?: () => void;
}

export const HorizonteCell: React.FC<HorizonteCellProps> = ({ day, balance, isChecked, onToggle }) => {
  const { colors } = useAppTheme();

  const getCellColor = (val: number) => {
    if (val < 0) return colors.pink;
    if (val < 1000) return colors.yellow;
    return colors.lightGreen;
  };

  const formatBalance = (val: number) => {
    if (Math.abs(val) >= 1000) {
      const k = val / 1000;
      return `${k.toLocaleString('pt-BR', { minimumFractionDigits: 0, maximumFractionDigits: 1 })}K`;
    }
    return val.toLocaleString('pt-BR', { minimumFractionDigits: 2, maximumFractionDigits: 2 });
  };

  return (
    <View style={[styles.container, { borderBottomColor: colors.border }]}>
      <Pressable
        onPress={onToggle}
        style={[styles.dayCol, { backgroundColor: colors.bg, borderRightColor: colors.border }]}
      >
        <Text style={[styles.dayText, { color: colors.textPrimary }]}>{day}</Text>
        {isChecked && (
          <View style={styles.badgeContainer}>
            <Svg width={14} height={14} viewBox="0 0 14 14">
              <Path d="M0,0 L14,0 L14,14 Z" fill={colors.green} />
              <Polyline
                points="5,3 7,6 11,1"
                fill="none"
                stroke="#fff"
                strokeWidth={1.5}
                strokeLinecap="round"
                strokeLinejoin="round"
              />
            </Svg>
          </View>
        )}
      </Pressable>
      <View style={[styles.balanceCol, { backgroundColor: getCellColor(balance) }]}>
        <Text style={[styles.balanceText, { color: colors.bg }]}>
          {formatBalance(balance)}
        </Text>
      </View>
    </View>
  );
};

const styles = StyleSheet.create({
  container: {
    flexDirection: 'row',
    height: 36,
    borderBottomWidth: 1,
    width: '100%',
  },
  dayCol: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
    borderRightWidth: 1,
    position: 'relative',
  },
  dayText: {
    fontSize: 14,
    fontWeight: '500',
  },
  badgeContainer: {
    position: 'absolute',
    top: 0,
    right: 0,
  },
  balanceCol: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
  balanceText: {
    fontSize: 14,
    fontWeight: 'bold',
  },
});
```

**Step 3: Commit**

```bash
git add src/components/Ledger/HorizonteCell.tsx
git commit -m "feat: checkmark triangle badge on HorizonteCell day column"
```

---

### Task 3: Wire HorizonteGrid to pass check state down

**Files:**
- Modify: `src/components/Ledger/HorizonteGrid.tsx`

**Step 1: Add props for checkedDates and onToggleDay**

```typescript
interface Props {
  projections: MonthProjection[];
  checkedDates?: Set<string>;
  onToggleDay?: (dateKey: string) => void;
}
```

**Step 2: Parse month/year from each `monthName` (format: `MMM/yy`) and pass `isChecked`/`onToggle` to each cell**

Inside the map, derive the year and month from `month.monthName` using `parse` from `date-fns`. Then for each day cell, build the date key and check membership.

Updated render for each `HorizonteCell`:
```tsx
import { parse } from 'date-fns';
import { buildDateKey } from '../../hooks/useDailyStatus';

// Inside the component, inside projections.map:
const parsedDate = parse(month.monthName, 'MMM/yy', new Date());
const year = parsedDate.getFullYear();
const month0 = parsedDate.getMonth();

// Then for each cell:
const dateKey = buildDateKey(year, month0, dayData.day);
<HorizonteCell
  key={i}
  day={dayData.day}
  balance={dayData.balance}
  isChecked={checkedDates?.has(dateKey)}
  onToggle={onToggleDay ? () => onToggleDay(dateKey) : undefined}
/>
```

**Step 3: Commit**

```bash
git add src/components/Ledger/HorizonteGrid.tsx
git commit -m "feat: wire checkedDates and onToggleDay through HorizonteGrid"
```

---

### Task 4: Wire horizonte.tsx page to the hook

**Files:**
- Modify: `app/horizonte.tsx`

**Step 1: Import and use `useDailyStatus` hook**

```typescript
import { useDailyStatus } from '../src/hooks/useDailyStatus';

// Inside HorizonteScreen:
const { checkedDates, toggleDate } = useDailyStatus();

// Pass to HorizonteGrid:
<HorizonteGrid
  projections={projections}
  checkedDates={checkedDates}
  onToggleDay={toggleDate}
/>
```

**Step 2: Commit**

```bash
git add app/horizonte.tsx
git commit -m "feat: connect Horizonte page to daily_status toggle"
```

---

### Task 5: Manual verification & final commit

**Step 1:** Run all tests: `npx vitest run`  
**Step 2:** Verify TypeScript compiles: `npx tsc --noEmit`  
**Step 3:** Squash/amend if desired, or leave as feature commits
