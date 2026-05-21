# Sheeting Phase 2: Navigation & Budgeting Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Implement the persistent bottom navigation and the budgeting calculation logic (Previsão de diário).

**Architecture:** Bottom nav handles app-wide routing. Budgeting logic aggregates stored categories and divides them by a provided divisor.

**Tech Stack:** React 19, TypeScript, React Router.

---

### Task 1: Bottom Navigation Layout

**Files:**
- Create: `src/components/Layout/BottomNav.tsx`
- Create: `src/components/Layout/BottomNav.test.tsx`

- [ ] **Step 1: Write the failing test**

```tsx
// src/components/Layout/BottomNav.test.tsx
import React from 'react';
import { render, screen } from '@testing-library/react';
import { describe, it, expect } from 'vitest';
import { MemoryRouter } from 'react-router-dom';
import { BottomNav } from './BottomNav';

describe('BottomNav', () => {
  it('renders all 5 main navigation buttons', () => {
    render(
      <MemoryRouter>
        <BottomNav />
      </MemoryRouter>
    );
    expect(screen.getByText('Saldos')).toBeDefined();
    expect(screen.getByText('Totais')).toBeDefined();
    expect(screen.getByText('+')).toBeDefined();
    expect(screen.getByText('Tags')).toBeDefined();
    expect(screen.getByText('Menu')).toBeDefined();
  });
});
```

- [ ] **Step 2: Run test to verify it fails**

Run: `npx vitest run src/components/Layout/BottomNav.test.tsx`
Expected: FAIL

- [ ] **Step 3: Write minimal implementation**

```tsx
// src/components/Layout/BottomNav.tsx
import React from 'react';
import { Link } from 'react-router-dom';

export const BottomNav: React.FC = () => {
  return (
    <nav style={{ display: 'flex', justifyContent: 'space-around', position: 'fixed', bottom: 0, width: '100%', background: '#fff' }}>
      <Link to="/">Saldos</Link>
      <Link to="/performance">Totais</Link>
      <Link to="/add" style={{ fontSize: '24px', fontWeight: 'bold' }}>+</Link>
      <Link to="/category">Tags</Link>
      <Link to="/menu">Menu</Link>
    </nav>
  );
};
```

- [ ] **Step 4: Run test to verify it passes**

Run: `npx vitest run src/components/Layout/BottomNav.test.tsx`
Expected: PASS

- [ ] **Step 5: Commit**

```bash
git add src/components/Layout/BottomNav.tsx src/components/Layout/BottomNav.test.tsx
git commit -m "feat: add persistent bottom navigation"
```

### Task 2: Budgeting Calculations (Previsão de diário)

**Files:**
- Create: `src/utils/budgetCalc.ts`
- Create: `src/utils/budgetCalc.test.ts`

- [ ] **Step 1: Write the failing test**

```typescript
// src/utils/budgetCalc.test.ts
import { describe, it, expect } from 'vitest';
import { calculateDailyBudget } from './budgetCalc';
import { BudgetCategory } from '../db/db';

describe('calculateDailyBudget', () => {
  it('sums categories and divides by days', () => {
    const categories: BudgetCategory[] = [
      { id: '1', userId: '1', name: 'Comida', monthlyAmount: 200 },
      { id: '2', userId: '1', name: 'Transporte', monthlyAmount: 500 }
    ];
    
    const result = calculateDailyBudget(categories, 30);
    expect(result.total).toBe(700);
    expect(result.daily).toBe(23.33); // 700 / 30 rounded to 2 decimals
  });
});
```

- [ ] **Step 2: Run test to verify it fails**

Run: `npx vitest run src/utils/budgetCalc.test.ts`
Expected: FAIL

- [ ] **Step 3: Write minimal implementation**

```typescript
// src/utils/budgetCalc.ts
import { BudgetCategory } from '../db/db';

export const calculateDailyBudget = (categories: BudgetCategory[], days: number) => {
  const total = categories.reduce((sum, cat) => sum + cat.monthlyAmount, 0);
  const daily = days > 0 ? Number((total / days).toFixed(2)) : 0;
  return { total, daily };
};
```

- [ ] **Step 4: Run test to verify it passes**

Run: `npx vitest run src/utils/budgetCalc.test.ts`
Expected: PASS

- [ ] **Step 5: Commit**

```bash
git add src/utils/budgetCalc.ts src/utils/budgetCalc.test.ts
git commit -m "feat: add daily budget calculation utility"
```