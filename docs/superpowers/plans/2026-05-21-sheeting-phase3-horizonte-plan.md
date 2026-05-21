# Sheeting Phase 3: Horizonte Grid & Filter UI

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Implement the "Mostrar" filter bottom sheet and the "Horizonte" grid view logic.

**Architecture:** Pure UI components driven by props to ensure they remain stateless and easily testable.

**Tech Stack:** React 19, TypeScript, Vitest.

---

### Task 1: Filter Bottom Sheet UI

**Files:**
- Create: `src/components/Ledger/FilterSheet.tsx`
- Create: `src/components/Ledger/FilterSheet.test.tsx`

- [ ] **Step 1: Write the failing test**

```tsx
// src/components/Ledger/FilterSheet.test.tsx
import React from 'react';
import { render, screen, fireEvent } from '@testing-library/react';
import { describe, it, expect, vi } from 'vitest';
import { FilterSheet } from './FilterSheet';

describe('FilterSheet', () => {
  it('calls onSelect with the chosen filter', () => {
    const onSelect = vi.fn();
    render(<FilterSheet isOpen={true} onSelect={onSelect} onClose={() => {}} />);
    
    fireEvent.click(screen.getByText('Entradas'));
    expect(onSelect).toHaveBeenCalledWith('income');
  });
});
```

- [ ] **Step 2: Run test to verify it fails**

Run: `npx vitest run src/components/Ledger/FilterSheet.test.tsx`
Expected: FAIL

- [ ] **Step 3: Write minimal implementation**

```tsx
// src/components/Ledger/FilterSheet.tsx
import React from 'react';

type FilterType = 'all' | 'income' | 'expense' | 'daily' | 'savings' | 'credit';

interface FilterSheetProps {
  isOpen: boolean;
  onSelect: (type: FilterType) => void;
  onClose: () => void;
}

export const FilterSheet: React.FC<FilterSheetProps> = ({ isOpen, onSelect, onClose }) => {
  if (!isOpen) return null;

  return (
    <div style={{ position: 'fixed', bottom: 0, width: '100%', background: 'white', padding: '16px' }}>
      <h3>Mostrar</h3>
      <button onClick={onClose}>X</button>
      <ul>
        <li onClick={() => onSelect('income')}>Entradas</li>
        <li onClick={() => onSelect('expense')}>Saídas</li>
        <li onClick={() => onSelect('daily')}>Diários</li>
        <li onClick={() => onSelect('savings')}>Economias</li>
        <li onClick={() => onSelect('credit')}>Gastos com cartão</li>
      </ul>
    </div>
  );
};
```

- [ ] **Step 4: Run test to verify it passes**

Run: `npx vitest run src/components/Ledger/FilterSheet.test.tsx`
Expected: PASS

- [ ] **Step 5: Commit**

```bash
git add src/components/Ledger/FilterSheet.tsx src/components/Ledger/FilterSheet.test.tsx
git commit -m "feat: create FilterSheet component"
```

### Task 2: Horizonte Grid Cell

**Files:**
- Create: `src/components/Ledger/HorizonteCell.tsx`
- Create: `src/components/Ledger/HorizonteCell.test.tsx`

- [ ] **Step 1: Write the failing test**

```tsx
// src/components/Ledger/HorizonteCell.test.tsx
import React from 'react';
import { render, screen } from '@testing-library/react';
import { describe, it, expect } from 'vitest';
import { HorizonteCell } from './HorizonteCell';

describe('HorizonteCell', () => {
  it('renders green cell for positive forecast', () => {
    render(<HorizonteCell day={1} forecast={200} />);
    const cell = screen.getByTestId('horizonte-cell');
    expect(cell.style.backgroundColor).toBe('rgb(149, 253, 184)'); // #95FDB8
  });
  
  it('renders pink cell for negative forecast', () => {
    render(<HorizonteCell day={2} forecast={-50} />);
    const cell = screen.getByTestId('horizonte-cell');
    expect(cell.style.backgroundColor).toBe('rgb(248, 190, 191)'); // #F8BEBF
  });
});
```

- [ ] **Step 2: Run test to verify it fails**

Run: `npx vitest run src/components/Ledger/HorizonteCell.test.tsx`
Expected: FAIL

- [ ] **Step 3: Write minimal implementation**

```tsx
// src/components/Ledger/HorizonteCell.tsx
import React from 'react';

interface HorizonteCellProps {
  day: number;
  forecast: number;
}

export const HorizonteCell: React.FC<HorizonteCellProps> = ({ day, forecast }) => {
  const getCellColor = (val: number) => {
    if (val < 0) return '#F8BEBF'; // Pink/Light Red
    if (val < 100) return '#FCE9B5'; // Yellow
    return '#95FDB8'; // Light Green
  };

  return (
    <div 
      data-testid="horizonte-cell" 
      style={{ backgroundColor: getCellColor(forecast), width: '30px', height: '30px', display: 'flex', alignItems: 'center', justifyContent: 'center' }}
    >
      {day}
    </div>
  );
};
```

- [ ] **Step 4: Run test to verify it passes**

Run: `npx vitest run src/components/Ledger/HorizonteCell.test.tsx`
Expected: PASS

- [ ] **Step 5: Commit**

```bash
git add src/components/Ledger/HorizonteCell.tsx src/components/Ledger/HorizonteCell.test.tsx
git commit -m "feat: create HorizonteCell with grid color mapping"
```