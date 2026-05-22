# Interaction Hook & 5-Cell Ledger Row Refactor Implementation Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Implement a robust long-press hook and refactor the LedgerRow to display a dense 5-cell stack for the "Todas" view, with navigation state persistence.

**Architecture:** Use a custom hook `useLongPress` to handle both click and long-press events with touch/mouse support. Refactor `LedgerRow` to render 5 `LedgerCell` components. Use React Router's `location.state` for passing context between pages.

**Tech Stack:** React 19, TypeScript, React Router, Lucide React.

---

### Task 1: Refactor useLongPress Hook

**Files:**
- Modify: `src/hooks/useLongPress.ts`
- Modify: `src/hooks/useLongPress.test.tsx`

- [ ] **Step 1: Update useLongPress.ts to handle touch move and context menu**

```typescript
import { useCallback, useRef } from 'react';

export const useLongPress = (
  onClick: () => void,
  onLongPress: () => void,
  ms: number = 500
) => {
  const timerRef = useRef<ReturnType<typeof setTimeout> | null>(null);
  const isLongPressActive = useRef(false);

  const start = useCallback((e: React.MouseEvent | React.TouchEvent) => {
    isLongPressActive.current = false;
    timerRef.current = setTimeout(() => {
      isLongPressActive.current = true;
      onLongPress();
    }, ms);
  }, [onLongPress, ms]);

  const stop = useCallback((e: React.MouseEvent | React.TouchEvent) => {
    if (timerRef.current) {
      clearTimeout(timerRef.current);
      timerRef.current = null;
    }
    
    if (!isLongPressActive.current) {
      onClick();
    }
    isLongPressActive.current = false;
  }, [onClick]);

  const clear = useCallback(() => {
    if (timerRef.current) {
      clearTimeout(timerRef.current);
      timerRef.current = null;
    }
    isLongPressActive.current = false;
  }, []);

  return {
    onMouseDown: start,
    onMouseUp: stop,
    onMouseLeave: clear,
    onTouchStart: start,
    onTouchEnd: stop,
    onTouchMove: clear,
    onContextMenu: (e: React.MouseEvent) => {
      if (isLongPressActive.current) {
        e.preventDefault();
      }
    },
  };
};
```

- [ ] **Step 2: Update useLongPress.test.tsx to verify new behavior**

```typescript
// ... existing imports
  it('clears timer on touch move', () => {
    const onClick = vi.fn();
    const onLongPress = vi.fn();
    const { result } = renderHook(() => useLongPress(onClick, onLongPress));

    act(() => {
      result.current.onTouchStart({} as any);
    });

    act(() => {
      vi.advanceTimersByTime(200);
      result.current.onTouchMove();
    });

    act(() => {
      vi.advanceTimersByTime(400);
    });

    expect(onLongPress).not.toHaveBeenCalled();
    expect(onClick).not.toHaveBeenCalled();
  });
// ...
```

- [ ] **Step 3: Run tests and verify they pass**

Run: `npm test src/hooks/useLongPress.test.tsx`

---

### Task 2: Refactor LedgerRow for Dense 5-Cell Stack

**Files:**
- Modify: `src/components/Ledger/LedgerRow.tsx`
- Modify: `src/components/Ledger/LedgerRow.test.tsx`

- [ ] **Step 1: Update LedgerRow.tsx with exactly 5 cells and dense styling**

```typescript
// ...
const LedgerCell: React.FC<{
  type: TransactionType;
  transactions: Transaction[];
  onClick: (type: TransactionType, transactions: Transaction[]) => void;
  onLongPress: (type: TransactionType) => void;
}> = ({ type, transactions, onClick, onLongPress }) => {
  const total = transactions.reduce((sum, t) => sum + t.amount, 0);
  const isEmpty = transactions.length === 0;

  const handlers = useLongPress(
    () => onClick(type, transactions),
    () => onLongPress(type)
  );

  return (
    <div 
      {...handlers}
      style={{ 
        display: 'flex', 
        alignItems: 'center', 
        gap: '8px', 
        height: '24px', // Dense height
        cursor: 'pointer',
        opacity: isEmpty ? 0.3 : 1,
        transition: 'opacity 0.2s',
        padding: '0 8px'
      }}
    >
      <div style={{ width: '20px', display: 'flex', justifyContent: 'center' }}>
        <TypeIcon type={type} />
      </div>
      <span style={{ fontSize: '0.85rem', flex: 1, whiteSpace: 'nowrap', overflow: 'hidden', textOverflow: 'ellipsis' }}>
        {total > 0 ? `R$ ${total.toLocaleString('pt-BR', { minimumFractionDigits: 2 })}` : '—'}
      </span>
    </div>
  );
};
// ...
```

- [ ] **Step 2: Update LedgerRow styles to accommodate dense stack**

Ensure the grid layout is correct.

- [ ] **Step 3: Run tests and verify they pass**

Run: `npm test src/components/Ledger/LedgerRow.test.tsx`

---

### Task 3: Update SheetView Navigation

**Files:**
- Modify: `src/pages/SheetView.tsx`

- [ ] **Step 1: Update handleCellLongPress to use state for navigation**

```typescript
  const handleCellLongPress = useCallback((type: TransactionType, date: Date) => {
    const dateStr = date.toISOString().split('T')[0];
    navigate('/add', { state: { type, date: dateStr } });
  }, [navigate]);
```

- [ ] **Step 2: Verify props passed to LedgerRow**

---

### Task 4: Update AddTransaction to consume state

**Files:**
- Modify: `src/pages/AddTransaction.tsx`
- Modify: `src/pages/AddTransaction.test.tsx`

- [ ] **Step 1: Update AddTransaction.tsx to read from location.state**

```typescript
import { useLocation, useNavigate, useParams, useSearchParams } from 'react-router-dom';
// ...
export const AddTransaction = () => {
  const { id } = useParams();
  const location = useLocation();
  const [searchParams] = useSearchParams();
  const state = location.state as { type?: string; date?: string } | undefined;
  // ...
  const [initialData, setInitialData] = useState<Partial<Transaction> | undefined>(() => {
    if (id) return undefined;
    
    const queryType = searchParams.get('type');
    const queryDate = searchParams.get('date');
    const type = state?.type || queryType;
    const date = state?.date || queryDate;

    if (type || date) {
      return {
        type: (type as any) || 'expense',
        date: date ? new Date(date + 'T12:00:00') : new Date()
      };
    }
    return undefined;
  });
  // ...
```

- [ ] **Step 2: Update AddTransaction.test.tsx to verify state pre-filling**

- [ ] **Step 3: Run tests and verify they pass**

Run: `npm test src/pages/AddTransaction.test.tsx`
