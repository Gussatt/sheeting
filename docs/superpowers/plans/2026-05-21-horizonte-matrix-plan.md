# Horizonte Matrix Implementation Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Implement the "Horizonte" projection matrix, a multi-month grid showing financial health forecasts.

**Architecture:** 
- **Utility:** A projection engine that takes initial balance, recurring transactions, and daily allowances to compute daily balances for N months.
- **Component:** A scrollable grid (Months as columns, Days as rows) using the `HorizonteCell` component.

**Tech Stack:** React 19, TypeScript, Dexie, Vitest.

---

### Task 1: Projection Logic Utility

**Files:**
- Create: `src/utils/projection.ts`
- Create: `src/utils/projection.test.ts`

- [ ] **Step 1: Write the failing test**

```typescript
import { describe, it, expect } from 'vitest';
import { calculateProjection } from './projection';
import { Transaction, BudgetCategory } from '../db/db';

describe('calculateProjection', () => {
  it('projects balance correctly with daily allowance and recurring items', () => {
    const startDate = new Date('2026-05-01');
    const initialBalance = 1000;
    const dailyAllowance = 50; // Spend per day
    const transactions: Transaction[] = [
      { id: '1', amount: 500, type: 'income', date: new Date('2026-05-15'), tagId: 't', isRecurring: false, description: 'Bonus' }
    ];

    const result = calculateProjection(startDate, initialBalance, dailyAllowance, transactions, 1); // 1 month
    
    // Day 1: 1000 - 50 = 950
    expect(result[0].days[0].balance).toBe(950);
    // Day 15: Previous(14 days) + 500 - 50
    // 1000 - (15 * 50) + 500 = 1000 - 750 + 500 = 750
    expect(result[0].days[14].balance).toBe(750);
  });
});
```

- [ ] **Step 2: Run test to verify it fails**

- [ ] **Step 3: Write minimal implementation**

```typescript
import { Transaction } from '../db/db';
import { addDays, format, startOfMonth, endOfMonth, eachDayOfInterval, isSameDay } from 'date-fns';

export interface DayProjection {
  day: number;
  balance: number;
}

export interface MonthProjection {
  monthName: string;
  days: DayProjection[];
}

export const calculateProjection = (
  startDate: Date,
  initialBalance: number,
  dailyAllowance: number,
  transactions: Transaction[],
  monthsToProject: number = 3
): MonthProjection[] => {
  let currentBalance = initialBalance;
  const projections: MonthProjection[] = [];
  let currentDate = startOfMonth(startDate);

  for (let m = 0; m < monthsToProject; m++) {
    const monthStart = startOfMonth(currentDate);
    const monthEnd = endOfMonth(currentDate);
    const daysInMonth = eachDayOfInterval({ start: monthStart, end: monthEnd });
    
    const dayProjections: DayProjection[] = [];

    daysInMonth.forEach((date) => {
      // 1. Subtract daily allowance
      currentBalance -= dailyAllowance;

      // 2. Add/Sub transactions for this day
      const daysTransactions = transactions.filter(t => isSameDay(new Date(t.date), date));
      daysTransactions.forEach(t => {
        if (t.type === 'income') currentBalance += t.amount;
        else currentBalance -= t.amount;
      });

      dayProjections.push({
        day: date.getDate(),
        balance: currentBalance
      });
    });

    projections.push({
      monthName: format(currentDate, 'MMM/yy'),
      days: dayProjections
    });

    currentDate = addDays(monthEnd, 1);
  }

  return projections;
};
```

- [ ] **Step 4: Run test to verify it passes**

- [ ] **Step 5: Commit**

```bash
git add src/utils/projection.ts src/utils/projection.test.ts
git commit -m "feat: implement financial projection logic utility"
```

---

### Task 2: Horizonte Grid Component

**Files:**
- Create: `src/components/Ledger/HorizonteGrid.tsx`
- Create: `src/components/Ledger/HorizonteGrid.test.tsx`

- [ ] **Step 1: Write the failing test**

```tsx
import React from 'react';
import { render, screen } from '@testing-library/react';
import { describe, it, expect } from 'vitest';
import { HorizonteGrid } from './HorizonteGrid';

describe('HorizonteGrid', () => {
  it('renders correct number of months and day rows', () => {
    const projections = [
      { monthName: 'May/26', days: [{ day: 1, balance: 100 }, { day: 2, balance: 200 }] },
      { monthName: 'Jun/26', days: [{ day: 1, balance: 300 }, { day: 2, balance: 400 }] }
    ];
    render(<HorizonteGrid projections={projections} />);
    
    expect(screen.getByText('May/26')).toBeInTheDocument();
    expect(screen.getByText('Jun/26')).toBeInTheDocument();
    expect(screen.getAllByTestId('horizonte-cell')).toHaveLength(4);
  });
});
```

- [ ] **Step 2: Run test to verify it fails**

- [ ] **Step 3: Write minimal implementation**

```tsx
import React from 'react';
import { HorizonteCell } from './HorizonteCell';
import { MonthProjection } from '../../utils/projection';

interface Props {
  projections: MonthProjection[];
}

export const HorizonteGrid: React.FC<Props> = ({ projections }) => {
  const maxDays = 31;

  return (
    <div style={{ display: 'flex', overflowX: 'auto', padding: '1rem', gap: '1rem' }}>
      {/* Labels Column */}
      <div style={{ display: 'flex', flexDirection: 'column', gap: '4px', paddingTop: '2rem' }}>
        {Array.from({ length: maxDays }, (_, i) => (
          <div key={i} style={{ height: '30px', display: 'flex', alignItems: 'center', fontSize: '0.8rem', opacity: 0.6 }}>
            {i + 1}
          </div>
        ))}
      </div>

      {/* Month Columns */}
      {projections.map((month) => (
        <div key={month.monthName} style={{ display: 'flex', flexDirection: 'column', gap: '4px', alignItems: 'center' }}>
          <span style={{ fontSize: '0.9rem', fontWeight: 'bold', marginBottom: '8px' }}>{month.monthName}</span>
          {Array.from({ length: maxDays }, (_, i) => {
            const dayData = month.days.find(d => d.day === i + 1);
            return dayData ? (
              <HorizonteCell key={i} day={dayData.day} forecast={dayData.balance} />
            ) : (
              <div key={i} style={{ width: '30px', height: '30px' }} /> // Empty cell for short months
            );
          })}
        </div>
      ))}
    </div>
  );
};
```

- [ ] **Step 4: Run test to verify it passes**

- [ ] **Step 5: Commit**

```bash
git add src/components/Ledger/HorizonteGrid.tsx src/components/Ledger/HorizonteGrid.test.tsx
git commit -m "feat: implement HorizonteGrid component"
```
