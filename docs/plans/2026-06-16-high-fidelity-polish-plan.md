# Final High-Fidelity Polish Plan

> **For Gemini:** REQUIRED SUB-SKILL: Use superpowers:executing-plans to implement this plan task-by-task.

**Goal:** Restore the high-fidelity UI elements and animations that were lost during the initial React Native migration.

**Architecture:** We will restore the `TagTrapezoid` using `react-native-svg`. We will rebuild the custom Calendar picker natively inside `TransactionForm`. Finally, we will implement `LayoutAnimation` across the app to restore the fluid CSS transitions that were present in the Web version.

**Tech Stack:** React Native, react-native-svg, LayoutAnimation.

---

### Task 1: Restore TagTrapezoid Component

**Files:**

- Create: `src/components/Ledger/TagTrapezoid.tsx`
- Modify: `app/(tabs)/tags.tsx`

**Step 1: Implement TagTrapezoid natively**
Create `src/components/Ledger/TagTrapezoid.tsx` using `react-native-svg`'s `Polygon` to replicate the CSS `clipPath` behavior.

```tsx
// src/components/Ledger/TagTrapezoid.tsx
import React from 'react';
import Svg, { Polygon } from 'react-native-svg';

interface TagTrapezoidProps {
  color: string;
  size?: number;
}

export const TagTrapezoid: React.FC<TagTrapezoidProps> = ({ color, size = 16 }) => {
  const width = size * 1.33; // maintaining aspect ratio

  return (
    <Svg width={width} height={size} viewBox="0 0 100 75" style={{ flexShrink: 0 }}>
      <Polygon points="0,0 75,0 100,37.5 75,75 0,75" fill={color} />
    </Svg>
  );
};
```

**Step 2: Re-integrate into Tags list**
In `app/(tabs)/tags.tsx`, replace the basic `tagColorBlock` view with the `<TagTrapezoid>` component.

**Step 3: Commit**

```bash
git add src/components/Ledger/TagTrapezoid.tsx app/(tabs)/tags.tsx
git commit -m "feat: restore custom TagTrapezoid component using react-native-svg"
```

---

### Task 2: Restore High-Fidelity Custom Calendar

**Files:**

- Modify: `src/components/Forms/TransactionForm.tsx`

**Step 1: Remove generic DateTimePicker**
Uninstall `@react-native-community/datetimepicker`.
Remove the `DateTimePicker` code and imports from `TransactionForm.tsx`.

**Step 2: Re-implement Calendar Grid**
Recreate the exact grid logic used in the Web version (using `date-fns`) but with Native `View`, `Text`, and `Pressable` inside the `Modal` for `activeModal === 'date'`. Make sure to implement the `subMonths` and `addMonths` chevrons.

**Step 3: Commit**

```bash
npm uninstall @react-native-community/datetimepicker
git add src/components/Forms/TransactionForm.tsx package.json
git commit -m "feat: restore custom calendar picker in transaction form"
```

---

### Task 3: Implement Layout Animations

**Files:**

- Modify: `app/_layout.tsx`
- Modify: `src/components/Ledger/LedgerRow.tsx`
- Modify: `src/components/Forms/TransactionForm.tsx`

**Step 1: Global Enable on Android**
In `app/_layout.tsx` (or inside a boot hook), ensure UIManager enables LayoutAnimation for Android:

```tsx
import { Platform, UIManager } from 'react-native';

if (Platform.OS === 'android' && UIManager.setLayoutAnimationEnabledExperimental) {
  UIManager.setLayoutAnimationEnabledExperimental(true);
}
```

**Step 2: Add fluidity to UI State Changes**
In `LedgerRow.tsx` (when filtering changes) and `TransactionForm.tsx` (when opening the repeat logic or switching modals), call `LayoutAnimation.configureNext(LayoutAnimation.Presets.easeInEaseOut)` right before setting the new state.

**Step 3: Commit**

```bash
git add app/_layout.tsx src/components/Ledger/LedgerRow.tsx src/components/Forms/TransactionForm.tsx
git commit -m "feat: introduce LayoutAnimation for fluid UI transitions"
```
