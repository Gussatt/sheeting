# Tag Management & Calculation Engine Implementation Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Implement a high-fidelity tag management system with advanced calculation overrides and fix theme consistency issues.

**Architecture:** 
- Centralize transaction filtering logic into a `useFilteredTransactions` hook to respect tag-level overrides globally.
- Update the PGLite schema to store per-metric calculation flags for each tag.
- Use CSS `clip-path` for the custom trapezoid tag shape and CSS variables for all theme-dependent styling.

**Tech Stack:** React 19, TypeScript, PGLite, date-fns, Lucide React, CSS.

---

## File Structure

### Data Layer
- `src/db/db.ts`: Update `Tag` interface.
- `src/db/schema.sql`: Add boolean columns to `tags` table.
- `src/hooks/useFilteredTransactions.ts`: **New** Centralized filtering logic.

### Components
- `src/components/Ledger/TagTrapezoid.tsx`: **New** Reusable high-fidelity tag icon.
- `src/components/Forms/TagEditorModal.tsx`: **New** Full-screen tag creation/edit sheet.

### Refactor Targets
- `src/utils/projection.ts`: Update to support tag-based filtering.
- `src/utils/budgetCalc.ts`: Update to support tag-based filtering.
- `src/pages/Performance.tsx`: Update metrics to use filtered transactions.
- `src/pages/SheetView.tsx`: Update ledger list to use filtered transactions.
- `src/pages/DailyCalculation.tsx`: Update totals to respect tag overrides.

---

## Tasks

### Task 1: Update Tag Schema & Interface

**Files:**
- Modify: `src/db/db.ts`
- Modify: `src/db/schema.sql`

- [ ] **Step 1: Update Tag interface**

```typescript
// src/db/db.ts
export interface Tag {
  id: string;
  name: string;
  color: string;
  calcSaldos: boolean;
  calcPerformance: boolean;
  calcEconomizado: boolean;
  calcCustoVida: boolean;
  calcDiarioMedio: boolean;
}
```

- [ ] **Step 2: Update database schema**

```sql
-- src/db/schema.sql
CREATE TABLE IF NOT EXISTS tags (
  id UUID PRIMARY KEY,
  name TEXT NOT NULL,
  color TEXT,
  calc_saldos BOOLEAN DEFAULT TRUE,
  calc_performance BOOLEAN DEFAULT TRUE,
  calc_economizado BOOLEAN DEFAULT TRUE,
  calc_custo_vida BOOLEAN DEFAULT TRUE,
  calc_diario_medio BOOLEAN DEFAULT TRUE
);
```

- [ ] **Step 3: Commit**

```bash
git add src/db/db.ts src/db/schema.sql
git commit -m "db: update tag schema for advanced calculations"
```

---

### Task 2: Implement Filtered Transactions Hook

**Files:**
- Create: `src/hooks/useFilteredTransactions.ts`
- Create: `src/hooks/useFilteredTransactions.test.ts`

- [ ] **Step 1: Write failing test**

```typescript
// src/hooks/useFilteredTransactions.test.ts
import { describe, it, expect } from 'vitest';
import { filterTransactionsByMetric } from './useFilteredTransactions';

describe('filterTransactionsByMetric', () => {
  const mockTags = [{ id: '1', calcSaldos: false, name: 'Ignore' }];
  const mockTxs = [{ tagId: '1', amount: 100, description: 'Test' }];

  it('filters out transactions based on tag settings', () => {
    const result = filterTransactionsByMetric(mockTxs as any, mockTags as any, 'calcSaldos');
    expect(result).toHaveLength(0);
  });
});
```

- [ ] **Step 2: Implement the filtering logic**

```typescript
// src/hooks/useFilteredTransactions.ts
import { useMemo } from 'react';
import { useSQL } from '../db/db';
import type { Transaction, Tag } from '../db/db';

export type MetricType = 'calcSaldos' | 'calcPerformance' | 'calcEconomizado' | 'calcCustoVida' | 'calcDiarioMedio';

export const filterTransactionsByMetric = (transactions: Transaction[], tags: Tag[], metric: MetricType) => {
  return transactions.filter(t => {
    if (!t.tagId) return true;
    const tag = tags.find(tag => tag.id === t.tagId);
    if (!tag) return true;
    return tag[metric];
  });
};

export const useFilteredTransactions = (transactions: Transaction[], metric: MetricType) => {
  const tags = useSQL<Tag>('SELECT * FROM tags');
  return useMemo(() => filterTransactionsByMetric(transactions, tags, metric), [transactions, tags, metric]);
};
```

- [ ] **Step 3: Run tests and commit**

```bash
npm test src/hooks/useFilteredTransactions.test.ts -- --run
git add src/hooks/useFilteredTransactions.ts src/hooks/useFilteredTransactions.test.ts
git commit -m "feat: add global transaction filtering hook"
```

---

### Task 3: Refactor Calculation Utilities

**Files:**
- Modify: `src/utils/projection.ts`
- Modify: `src/utils/budgetCalc.ts`

- [ ] **Step 1: Update projection logic to accept filtered transactions**

```typescript
// src/utils/projection.ts
// Ensure calculations remain accurate but accept a pre-filtered list of transactions
```

- [ ] **Step 2: Update budget calculation logic**

```typescript
// src/utils/budgetCalc.ts
// Similarly ensure it handles the incoming pre-filtered data
```

- [ ] **Step 3: Commit**

```bash
git add src/utils/projection.ts src/utils/budgetCalc.ts
git commit -m "refactor: update calc utilities for tag filtering"
```

---

### Task 4: High-Fidelity Tag UI

**Files:**
- Create: `src/components/Ledger/TagTrapezoid.tsx`
- Modify: `src/components/Ledger/LedgerRow.tsx`

- [ ] **Step 1: Implement Trapezoid shape**

```typescript
// src/components/Ledger/TagTrapezoid.tsx
import React from 'react';

export const TagTrapezoid = ({ color, size = 16 }: { color: string, size?: number }) => (
  <div style={{ 
    width: `${size}px`, 
    height: `${size * 0.75}px`, 
    backgroundColor: color, 
    clipPath: 'polygon(0% 0%, 75% 0%, 100% 50%, 75% 100%, 0% 100%)' 
  }} />
);
```

- [ ] **Step 2: Update LedgerRow to use new shape**

```typescript
// src/components/Ledger/LedgerRow.tsx
// Replace current clip-path logic with TagTrapezoid component where tags are shown
```

- [ ] **Step 3: Commit**

```bash
git add src/components/Ledger/TagTrapezoid.tsx src/components/Ledger/LedgerRow.tsx
git commit -m "ui: implement high-fidelity tag trapezoid shape"
```

---

### Task 5: Tag Editor Modal

**Files:**
- Create: `src/components/Forms/TagEditorModal.tsx`

- [ ] **Step 1: Implement Color Grid and Advanced Section**

```typescript
// src/components/Forms/TagEditorModal.tsx
// Implement full-screen modal with 8-color grid and segmented toggles for advanced settings
```

- [ ] **Step 2: Add PGLite persistence for Create/Edit/Delete**

- [ ] **Step 3: Commit**

```bash
git add src/components/Forms/TagEditorModal.tsx
git commit -m "feat: implement high-fidelity Tag Editor modal"
```

---

### Task 6: Theme Polish

**Files:**
- Modify: `src/index.css`
- Modify: `src/components/Ledger/LedgerRow.tsx`

- [ ] **Step 1: Define weekend variables in CSS**

```css
/* src/index.css */
:root { --color-weekend-bg: #1A1A1A; }
[data-theme='light'] { --color-weekend-bg: #F9FAFB; }
```

- [ ] **Step 2: Audit LedgerRow for hardcoded hex codes**

```typescript
// src/components/Ledger/LedgerRow.tsx
// Ensure all backgroundColors use var(--...) instead of #...
```

- [ ] **Step 3: Commit**

```bash
git add src/index.css src/components/Ledger/LedgerRow.tsx
git commit -m "ui: fix light theme weekend background consistency"
```

---

### Task 7: Final Integration

**Files:**
- Modify: `src/pages/Tags.tsx`
- Modify: `src/components/Forms/TransactionForm.tsx`

- [ ] **Step 1: Connect main Tags page to the Editor modal**

- [ ] **Step 2: Add "Create Tag" button to the transaction tag selection modal**

- [ ] **Step 3: Verify all metrics (Performance, Saldos, Horizonte) respect tag "Ignore" settings**

- [ ] **Step 4: Final commit**

```bash
git commit -a -m "feat: complete tag management and calculation engine integration"
```
