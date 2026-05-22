# SheetView PGLite Refactor Implementation Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Refactor `src/pages/SheetView.tsx` to use the new PGLite-based `useSQL` hook instead of Dexie's `useLiveQuery`.

**Architecture:** Replace the Dexie-specific query with a PostgreSQL query using `useSQL`. Ensure date filtering and month navigation remain functional.

**Tech Stack:** React 19, TypeScript, PGLite, date-fns.

---

### Task 1: Refactor SheetView.tsx

**Files:**
- Modify: `src/pages/SheetView.tsx`

- [ ] **Step 1: Update imports**
  Replace `useLiveQuery` from `dexie-react-hooks` with `useSQL` and `Transaction` from `../db/db`.

- [ ] **Step 2: Update the transactions query**
  Replace the `useLiveQuery` block with a `useSQL` call.

```typescript
  const transactions = useSQL<Transaction>(
    `SELECT * FROM transactions 
     WHERE date >= $1 AND date <= $2 
     ORDER BY date ASC`,
    [monthStart.toISOString(), monthEnd.toISOString()]
  );
```

- [ ] **Step 3: Handle potential null/undefined from useSQL**
  `useSQL` returns an empty array by default, but ensuring it handles it correctly in the render.

- [ ] **Step 4: Verify the changes**
  Since I don't have a visual environment, I'll check for lint errors and ensure the component compiles.

- [ ] **Step 5: Commit**

```bash
git add src/pages/SheetView.tsx
git commit -m "refactor: migrate SheetView to PGLite"
```
