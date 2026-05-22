# Daily Calculation Page Implementation Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Implement the "Daily Calculation" page (Previsão de diário) with category management and real-time budget math.

**Architecture:** Use `useLiveQuery` from `dexie-react-hooks` to subscribe to database changes. The UI will feature a list of monthly budget items and a summary footer with calculation results.

**Tech Stack:** React 19, TypeScript, Dexie.js, Lucide Icons, Vitest.

---

### Task 1: Category Item Component

**Files:**
- Create: `src/components/Budget/BudgetCategoryItem.tsx`
- Create: `src/components/Budget/BudgetCategoryItem.test.tsx`

- [ ] **Step 1: Write the failing test**

```tsx
import React from 'react';
import { render, screen, fireEvent } from '@testing-library/react';
import { describe, it, expect, vi } from 'vitest';
import { BudgetCategoryItem } from './BudgetCategoryItem';

describe('BudgetCategoryItem', () => {
  it('renders category details and delete button', () => {
    const onDelete = vi.fn();
    render(<BudgetCategoryItem name="Comida" amount={200} onDelete={onDelete} />);
    
    expect(screen.getByText('Comida')).toBeInTheDocument();
    expect(screen.getByText('R$ 200,00')).toBeInTheDocument();
    
    fireEvent.click(screen.getByRole('button', { name: /delete/i }));
    expect(onDelete).toHaveBeenCalled();
  });
});
```

- [ ] **Step 2: Run test to verify it fails**

Run: `npm test src/components/Budget/BudgetCategoryItem.test.tsx`

- [ ] **Step 3: Write minimal implementation**

```tsx
import React from 'react';
import { Trash2 } from 'lucide-react';

interface Props {
  name: string;
  amount: number;
  onDelete: () => void;
}

export const BudgetCategoryItem: React.FC<Props> = ({ name, amount, onDelete }) => {
  return (
    <div style={{ display: 'flex', justifyContent: 'space-between', padding: '12px', borderBottom: '1px solid var(--color-border)' }}>
      <div style={{ display: 'flex', flexDirection: 'column' }}>
        <span style={{ fontWeight: '500' }}>{name}</span>
        <span style={{ fontSize: '0.9rem', color: 'var(--color-text)', opacity: 0.7 }}>R$ {amount.toLocaleString('pt-BR', { minimumFractionDigits: 2 })}</span>
      </div>
      <button 
        onClick={onDelete} 
        aria-label="delete"
        style={{ background: 'none', border: 'none', color: 'var(--status-red)', cursor: 'pointer' }}
      >
        <Trash2 size={20} />
      </button>
    </div>
  );
};
```

- [ ] **Step 4: Run test to verify it passes**

Run: `npm test src/components/Budget/BudgetCategoryItem.test.tsx`

- [ ] **Step 5: Commit**

```bash
git add src/components/Budget/BudgetCategoryItem.tsx src/components/Budget/BudgetCategoryItem.test.tsx
git commit -m "feat: create BudgetCategoryItem component"
```

---

### Task 2: Daily Calculation Page Logic & Layout

**Files:**
- Modify: `src/pages/DailyCalculation.tsx`
- Create: `src/pages/DailyCalculation.test.tsx`

- [ ] **Step 1: Write the failing test**

```tsx
import { render, screen } from '@testing-library/react';
import { describe, it, expect, vi } from 'vitest';
import { DailyCalculation } from './DailyCalculation';
import { MemoryRouter } from 'react-router-dom';

// Mock Dexie hooks
vi.mock('dexie-react-hooks', () => ({
  useLiveQuery: () => [
    { id: '1', name: 'Aluguel', monthlyAmount: 1000 },
    { id: '2', name: 'Lazer', monthlyAmount: 500 }
  ]
}));

describe('DailyCalculation Page', () => {
  it('displays the total monthly and daily calculation', async () => {
    render(<MemoryRouter><DailyCalculation /></MemoryRouter>);
    
    expect(screen.getByText('Previsão de diário')).toBeInTheDocument();
    expect(screen.getByText('R$ 1.500,00')).toBeInTheDocument(); // 1000 + 500
    expect(screen.getByText('R$ 50,00')).toBeInTheDocument(); // 1500 / 30
  });
});
```

- [ ] **Step 2: Run test to verify it fails**

Run: `npm test src/pages/DailyCalculation.test.tsx`

- [ ] **Step 3: Write minimal implementation**

```tsx
import React, { useState } from 'react';
import { useLiveQuery } from 'dexie-react-hooks';
import { db } from '../db/db';
import { calculateDailyBudget } from '../utils/budgetCalc';
import { BudgetCategoryItem } from '../components/Budget/BudgetCategoryItem';
import { Plus } from 'lucide-react';

export const DailyCalculation = () => {
  const [days, setDays] = useState(30);
  const categories = useLiveQuery(() => db.budgetCategories.toArray()) || [];
  
  const { total, daily } = calculateDailyBudget(categories, days);

  const handleDelete = async (id: string) => {
    await db.budgetCategories.delete(id);
  };

  const handleAdd = async () => {
    const name = prompt('Nome da categoria:');
    const amount = parseFloat(prompt('Valor mensal:') || '0');
    if (name && !isNaN(amount)) {
      await db.budgetCategories.add({ 
        id: crypto.randomUUID(), 
        userId: 'default', 
        name, 
        monthlyAmount: amount 
      });
    }
  };

  return (
    <div className="daily-calc-container" style={{ paddingBottom: '100px' }}>
      <header style={{ display: 'flex', justifyContent: 'space-between', alignItems: 'center', padding: '1rem 0' }}>
        <h1 style={{ fontSize: '1.25rem', margin: 0 }}>Previsão de diário</h1>
        <button onClick={handleAdd} style={{ background: 'none', border: 'none', cursor: 'pointer' }}><Plus /></button>
      </header>

      <div className="category-list">
        {categories.map(cat => (
          <BudgetCategoryItem 
            key={cat.id} 
            name={cat.name} 
            amount={cat.monthlyAmount} 
            onDelete={() => handleDelete(cat.id)} 
          />
        ))}
      </div>

      <footer style={{ position: 'fixed', bottom: '70px', left: 0, right: 0, background: 'var(--color-surface)', padding: '1rem', borderTop: '1px solid var(--color-border)' }}>
        <div style={{ display: 'flex', justifyContent: 'space-between', marginBottom: '0.5rem' }}>
          <span>Total mensal</span>
          <span>R$ {total.toLocaleString('pt-BR', { minimumFractionDigits: 2 })}</span>
        </div>
        <div style={{ display: 'flex', justifyContent: 'space-between', alignItems: 'center', marginBottom: '1rem' }}>
          <span>Dividido por</span>
          <select value={days} onChange={(e) => setDays(Number(e.target.value))} style={{ padding: '4px' }}>
            <option value={28}>28 dias</option>
            <option value={30}>30 dias</option>
            <option value={31}>31 dias</option>
          </select>
        </div>
        <div style={{ display: 'flex', justifyContent: 'flex-end', fontSize: '1.5rem', fontWeight: 'bold' }}>
          R$ {daily.toLocaleString('pt-BR', { minimumFractionDigits: 2 })}
        </div>
      </footer>
    </div>
  );
};
```

- [ ] **Step 4: Run test to verify it passes**

Run: `npm test src/pages/DailyCalculation.test.tsx`

- [ ] **Step 5: Commit**

```bash
git add src/pages/DailyCalculation.tsx src/pages/DailyCalculation.test.tsx
git commit -m "feat: implement DailyCalculation page with category management"
```
