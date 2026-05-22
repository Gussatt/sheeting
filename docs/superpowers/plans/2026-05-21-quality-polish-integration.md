# Sheeting Quality Polish & Integration Implementation Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Address code quality review issues and properly integrate newly created components with consistent styling and accessibility.

**Architecture:** Use CSS variables for status colors, semantic HTML for accessibility, and update navigation to match the final product structure.

**Tech Stack:** React 19, TypeScript, CSS Variables, Lucide React, Vitest.

---

### Task 1: Update CSS Variables

**Files:**
- Modify: `src/index.css`

- [ ] **Step 1: Add status colors to `:root`**

```css
:root {
  /* ... existing ... */
  --status-green: #96D87D;
  --status-light-green: #95FDB8;
  --status-yellow: #FCE9B5;
  --status-pink: #F8BEBF;
  --status-red: #F26D70;
}
```

- [ ] **Step 2: Commit changes**

```bash
git add src/index.css
git commit -m "style: add status color variables to index.css"
```

### Task 2: Refactor LedgerRow

**Files:**
- Modify: `src/components/Ledger/LedgerRow.tsx`
- Test: `src/components/Ledger/LedgerRow.test.tsx`

- [ ] **Step 1: Update LedgerRow.tsx to use CSS variables and new logic**

```tsx
export const LedgerRow: React.FC<LedgerRowProps> = ({ day, type, total, balance, isCheckedIn }) => {
  const getBgColor = (bal: number) => {
    if (bal < 0) return 'var(--status-red)';
    if (bal < 100) return 'var(--status-yellow)';
    return 'var(--status-green)';
  };

  return (
    <div data-testid="ledger-row" style={{ display: 'flex', backgroundColor: getBgColor(balance), padding: '8px' }}>
      {/* ... */}
    </div>
  );
};
```

- [ ] **Step 2: Add test case for yellow/warning threshold to LedgerRow.test.tsx**

```tsx
  it('renders yellow background for balance between 0 and 100', () => {
    render(<LedgerRow day={3} type="expense" total={10} balance={50} isCheckedIn={false} />);
    const row = screen.getByTestId('ledger-row');
    expect(row.style.backgroundColor).toBe('var(--status-yellow)');
  });
```

- [ ] **Step 3: Update existing tests to check for variable names**

- [ ] **Step 4: Run tests to verify**

Run: `npm test src/components/Ledger/LedgerRow.test.tsx`

- [ ] **Step 5: Commit changes**

```bash
git add src/components/Ledger/LedgerRow.tsx src/components/Ledger/LedgerRow.test.tsx
git commit -m "refactor: use status color variables in LedgerRow"
```

### Task 3: Integrate Bottom Navigation in Layout

**Files:**
- Modify: `src/components/Layout/Layout.tsx`
- Delete: `src/components/Layout/BottomNav.tsx`
- Delete: `src/components/Layout/BottomNav.test.tsx`

- [ ] **Step 1: Update Layout.tsx with new navigation items and icons**

Items: `Saldos` (/), `Totais` (/performance), `+` (/add), `Tags` (/category), `Menu` (/menu).
Icons: `Grid` (Saldos), `Activity` (Totais), `PlusCircle` (+), `Tag` (Tags), `Menu` (Menu).

- [ ] **Step 2: Delete redundant BottomNav files**

Run: `rm src/components/Layout/BottomNav.tsx src/components/Layout/BottomNav.test.tsx`

- [ ] **Step 3: Verify build**

Run: `npm run build`

- [ ] **Step 4: Commit changes**

```bash
git add src/components/Layout/Layout.tsx
git rm src/components/Layout/BottomNav.tsx src/components/Layout/BottomNav.test.tsx
git commit -m "feat: integrate bottom navigation in Layout and remove redundant files"
```

### Task 4: Fix FilterSheet

**Files:**
- Modify: `src/components/Ledger/FilterSheet.tsx`
- Modify: `src/components/Ledger/FilterSheet.test.tsx`
- Modify: `src/index.css` (Add .filter-sheet styles if needed)

- [ ] **Step 1: Refactor FilterSheet.tsx for accessibility and "Todos" option**

Use `<button>` for items, add "Todos" (type: 'all').

- [ ] **Step 2: Add CSS classes to FilterSheet.tsx and styles to index.css**

- [ ] **Step 3: Update FilterSheet.test.tsx**

- [ ] **Step 4: Run tests to verify**

Run: `npm test src/components/Ledger/FilterSheet.test.tsx`

- [ ] **Step 5: Commit changes**

```bash
git add src/components/Ledger/FilterSheet.tsx src/components/Ledger/FilterSheet.test.tsx src/index.css
git commit -m "refactor: improve FilterSheet accessibility and add 'Todos' option"
```

### Task 5: Refactor HorizonteCell

**Files:**
- Modify: `src/components/Ledger/HorizonteCell.tsx`

- [ ] **Step 1: Update HorizonteCell.tsx to use CSS variables**

- [ ] **Step 2: Commit changes**

```bash
git add src/components/Ledger/HorizonteCell.tsx
git commit -m "refactor: use status color variables in HorizonteCell"
```

### Task 6: Final Verification

- [ ] **Step 1: Run all tests**

Run: `npm test`

- [ ] **Step 2: Ensure project builds**

Run: `npm run build`
