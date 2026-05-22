# Interaction Hook & 5-Cell Ledger Row Refactor Implementation Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Refactor LedgerRow to support a 5-cell layout for the "Todas" view, with each cell supporting click and long press interactions via a custom hook.

**Architecture:** Use the existing `useLongPress` hook to handle interactions. Update `LedgerRow` to render 5 fixed cells (income, expense, daily, savings, credit) when the "Todas" view is active. Cells with 0 balance will have reduced opacity. Long press on a cell will navigate to the transaction entry page with pre-filled details.

**Tech Stack:** React 19, TypeScript, Lucide React, date-fns, React Router.

---

### Task 1: Refactor LedgerRow Component

**Files:**
- Modify: `src/components/Ledger/LedgerRow.tsx`

- [ ] **Step 1: Update LedgerRowProps and TransactionType**
  - Add `onCellClick` and `onCellLongPress` to props.
  - Add `isTodas` flag or detect it from transactions if needed, but better to pass it.
  - Update `TransactionType` to include all 5 types: `income`, `expense`, `daily`, `savings`, `credit`.

- [ ] **Step 2: Implement 5-cell layout in LedgerRow**
  - Loop through all 5 types.
  - For each type, calculate total and check if it has transactions.
  - Apply `useLongPress` to each cell.
  - Set `opacity: 0.3` for empty cells.
  - Ensure the layout matches the high-fidelity dense stack design.

### Task 2: Update SheetView Page

**Files:**
- Modify: `src/pages/SheetView.tsx`

- [ ] **Step 1: Implement navigation on long press**
  - Create a handler for `onCellLongPress` that navigates to `/add` with `type` and `date` as search parameters.
  - Create a handler for `onCellClick` that opens the transaction list.

- [ ] **Step 2: Pass new props to LedgerRow**
  - Pass `onCellClick`, `onCellLongPress`, and whether it's the "Todas" view.

### Task 3: Verification and Testing

**Files:**
- Modify: `src/App.test.tsx` or create new tests.
- Test: `src/components/Ledger/LedgerRow.test.tsx` (create)

- [ ] **Step 1: Write tests for LedgerRow refactor**
  - Verify 5 cells are rendered in "Todas" view.
  - Verify opacity of empty cells.
  - Verify click and long press triggers.

- [ ] **Step 2: Verify SheetView integration**
  - Manually check (or write integration test) that long pressing a cell navigates to the correct page.
