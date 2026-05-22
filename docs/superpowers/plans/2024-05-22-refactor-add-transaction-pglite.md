# Refactor AddTransaction.tsx for PGLite Implementation Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Refactor `src/pages/AddTransaction.tsx` to use PGLite SQL commands instead of Dexie methods.

**Architecture:** Use `db.exec`, `db.query`, and `useSQL` from `src/db/db.ts` to interact with the PGLite database. Ensure date and UUID handling are Postgres-compatible.

**Tech Stack:** React, PGLite, SQL, TypeScript.

---

### Task 1: Create failing test for AddTransaction

**Files:**
- Create: `src/pages/AddTransaction.test.tsx`

- [ ] **Step 1: Write the failing test**

```tsx
import { render, screen, fireEvent, waitFor } from '@testing-library/react';
import { describe, it, expect, vi, beforeEach } from 'vitest';
import { AddTransaction } from './AddTransaction';
import { MemoryRouter, Route, Routes } from 'react-router-dom';
import { db } from '../db/db';

vi.mock('../db/db', () => ({
  db: {
    query: vi.fn(),
    exec: vi.fn(),
    init: vi.fn().mockResolvedValue(undefined),
  },
  useSQL: vi.fn().mockReturnValue([]),
}));

describe('AddTransaction', () => {
  beforeEach(() => {
    vi.clearAllMocks();
  });

  it('submits a new transaction', async () => {
    render(
      <MemoryRouter initialEntries={['/add']}>
        <Routes>
          <Route path="/add" element={<AddTransaction />} />
        </Routes>
      </MemoryRouter>
    );

    // Fill form (assuming TransactionForm handles inputs)
    // For now, just check if it calls db.exec on submit
    // We might need to mock TransactionForm or use real one
  });
});
```

- [ ] **Step 2: Run test to verify it fails**

Run: `npm test src/pages/AddTransaction.test.tsx`
Expected: FAIL (due to type errors or missing implementation)

### Task 2: Refactor fetch logic in AddTransaction.tsx

**Files:**
- Modify: `src/pages/AddTransaction.tsx`

- [ ] **Step 1: Replace useLiveQuery with useSQL for tags**

```tsx
const tags = useSQL<Tag>('SELECT * FROM tags');
```

- [ ] **Step 2: Replace db.transactions.get with db.query**

```tsx
  useEffect(() => {
    if (id) {
      db.query<Transaction>('SELECT * FROM transactions WHERE id = $1', [id]).then(rows => {
        if (rows.length > 0) setInitialData(rows[0]);
        setLoading(false);
      });
    }
  }, [id]);
```

### Task 3: Refactor handleSubmit in AddTransaction.tsx

**Files:**
- Modify: `src/pages/AddTransaction.tsx`

- [ ] **Step 1: Update Insert logic**

```tsx
    } else {
      await db.exec(
        'INSERT INTO transactions (id, amount, type, date, description, tag_id, is_recurring) VALUES ($1, $2, $3, $4, $5, $6, $7)',
        [
          crypto.randomUUID(),
          Number(data.amount),
          data.type,
          data.date || new Date().toISOString(),
          data.description || '',
          data.tagId || null,
          data.isRecurring || false,
        ]
      );
    }
```

- [ ] **Step 2: Update Update logic**

```tsx
    if (id) {
      await db.exec(
        'UPDATE transactions SET amount = $2, type = $3, date = $4, description = $5, tag_id = $6, is_recurring = $7 WHERE id = $1',
        [
          id,
          Number(data.amount),
          data.type,
          data.date,
          data.description,
          data.tagId,
          data.isRecurring,
        ]
      );
```

### Task 4: Refactor handleDelete in AddTransaction.tsx

**Files:**
- Modify: `src/pages/AddTransaction.tsx`

- [ ] **Step 1: Update Delete logic**

```tsx
  const handleDelete = async () => {
    if (id && confirm('Deseja realmente excluir esta transação?')) {
      await db.exec('DELETE FROM transactions WHERE id = $1', [id]);
      navigate('/');
    }
  };
```

### Task 5: Final verification

- [ ] **Step 1: Run all tests**

Run: `npm test`
Expected: PASS
