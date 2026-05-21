# Sheeting Phase 1: Core Data & Ledger UI Implementation Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Implement the foundational database schema and the core interactive Ledger row UI component.

**Architecture:** We use Dexie for IndexedDB local-first storage. The UI uses standard CSS and React functional components.

**Tech Stack:** React 19, TypeScript, Vite, Dexie.js, Vitest, React Testing Library.

---

### Task 1: Database Schema Expansion

**Files:**
- Modify: `src/db/db.ts`
- Modify: `src/db/db.test.ts`

- [ ] **Step 1: Write the failing test**

```typescript
// src/db/db.test.ts
import { describe, it, expect, beforeEach } from 'vitest';
import { db } from './db';

describe('SheetingDB', () => {
  beforeEach(async () => {
    await db.delete();
    await db.open();
  });

  it('should store and retrieve BudgetCategories and Tags', async () => {
    await db.budgetCategories.add({ id: 'cat1', userId: 'u1', name: 'Comida', monthlyAmount: 200 });
    await db.tags.add({ id: 'tag1', userId: 'u1', name: 'Alimentação', color: '#ff0000' });

    const cat = await db.budgetCategories.get('cat1');
    const tag = await db.tags.get('tag1');

    expect(cat?.name).toBe('Comida');
    expect(tag?.name).toBe('Alimentação');
  });
});
```

- [ ] **Step 2: Run test to verify it fails**

Run: `npx vitest run src/db/db.test.ts`
Expected: FAIL (Property 'budgetCategories' does not exist on type 'SheetingDB')

- [ ] **Step 3: Write minimal implementation**

```typescript
// src/db/db.ts
import Dexie, { Table } from 'dexie';

export interface Transaction {
  id: string;
  amount: number;
  type: 'income' | 'expense' | 'daily' | 'savings' | 'credit';
  date: Date;
  tagId: string;
  isRecurring: boolean;
  recurringFrequency?: 'weekly' | 'monthly' | 'yearly';
  description: string;
  debtId?: string;
}

export interface BudgetCategory {
  id: string;
  userId: string;
  name: string;
  monthlyAmount: number;
}

export interface Tag {
  id: string;
  userId: string;
  name: string;
  color?: string;
}

export class SheetingDB extends Dexie {
  transactions!: Table<Transaction>;
  budgetCategories!: Table<BudgetCategory>;
  tags!: Table<Tag>;

  constructor() {
    super('SheetingDB');
    this.version(2).stores({
      transactions: 'id, type, date, tagId, isRecurring',
      budgetCategories: 'id, userId',
      tags: 'id, userId'
    });
  }
}

export const db = new SheetingDB();
```

- [ ] **Step 4: Run test to verify it passes**

Run: `npx vitest run src/db/db.test.ts`
Expected: PASS

- [ ] **Step 5: Commit**

```bash
git add src/db/db.ts src/db/db.test.ts
git commit -m "feat: expand db schema with budget categories and tags"
```

### Task 2: Ledger Row Component

**Files:**
- Create: `src/components/Ledger/LedgerRow.tsx`
- Create: `src/components/Ledger/LedgerRow.test.tsx`

- [ ] **Step 1: Write the failing test**

```tsx
// src/components/Ledger/LedgerRow.test.tsx
import React from 'react';
import { render, screen } from '@testing-library/react';
import { describe, it, expect } from 'vitest';
import { LedgerRow } from './LedgerRow';

describe('LedgerRow', () => {
  it('renders green background for positive balance', () => {
    render(<LedgerRow day={1} type="income" total={100} balance={1500} isCheckedIn={true} />);
    const row = screen.getByTestId('ledger-row');
    expect(row.style.backgroundColor).toBe('rgb(160, 220, 137)'); // #A0DC89
  });

  it('renders red background for negative balance', () => {
    render(<LedgerRow day={2} type="expense" total={50} balance={-100} isCheckedIn={false} />);
    const row = screen.getByTestId('ledger-row');
    expect(row.style.backgroundColor).toBe('rgb(242, 109, 112)'); // #F26D70
  });
});
```

- [ ] **Step 2: Run test to verify it fails**

Run: `npx vitest run src/components/Ledger/LedgerRow.test.tsx`
Expected: FAIL (Cannot find module './LedgerRow')

- [ ] **Step 3: Write minimal implementation**

```tsx
// src/components/Ledger/LedgerRow.tsx
import React from 'react';

interface LedgerRowProps {
  day: number;
  type: 'income' | 'expense' | 'daily' | 'savings' | 'credit';
  total: number;
  balance: number;
  isCheckedIn: boolean;
}

export const LedgerRow: React.FC<LedgerRowProps> = ({ day, type, total, balance, isCheckedIn }) => {
  const getBgColor = (bal: number) => {
    if (bal < 0) return '#F26D70'; // Red
    if (bal < 100) return '#FCE9B5'; // Yellow
    return '#A0DC89'; // Green
  };

  return (
    <div data-testid="ledger-row" style={{ display: 'flex', backgroundColor: getBgColor(balance), padding: '8px' }}>
      <div>{day} {isCheckedIn && '✅'}</div>
      <div>{type}</div>
      <div>R$ {total.toFixed(2)}</div>
      <div>R$ {balance.toFixed(2)}</div>
    </div>
  );
};
```

- [ ] **Step 4: Run test to verify it passes**

Run: `npx vitest run src/components/Ledger/LedgerRow.test.tsx`
Expected: PASS

- [ ] **Step 5: Commit**

```bash
git add src/components/Ledger/LedgerRow.tsx src/components/Ledger/LedgerRow.test.tsx
git commit -m "feat: create LedgerRow component with dynamic coloring"
```