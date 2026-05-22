import { render, screen } from '@testing-library/react';
import { describe, it, expect, vi } from 'vitest';
import { LedgerRow } from './LedgerRow';
import { MemoryRouter } from 'react-router-dom';
import type { Transaction } from '../../db/db';
import { ThemeProvider } from '../../context/ThemeContext';

describe('LedgerRow', () => {
  const mockTransactions: Transaction[] = [
    { id: '1', type: 'income', amount: 1000, date: new Date(), description: 'test', tagId: '', isRecurring: false },
    { id: '2', type: 'expense', amount: 200, date: new Date(), description: 'test', tagId: '', isRecurring: false }
  ];

  it('renders all 5 cells when filter is "all"', () => {
    render(
      <ThemeProvider>
        <MemoryRouter>
          <LedgerRow 
            date={new Date('2026-05-01T12:00:00')} 
            transactions={mockTransactions} 
            balance={800} 
            isCheckedIn={true} 
            filter="all"
            onCellClick={vi.fn()}
            onCellLongPress={vi.fn()}
          />
        </MemoryRouter>
      </ThemeProvider>
    );
    expect(screen.getByText('R$ 1.000,00')).toBeInTheDocument();
    expect(screen.getByText('R$ 200,00')).toBeInTheDocument();
    expect(screen.getAllByText('R$ 0,00')).toHaveLength(3);
  });

  it('applies correct background color to balance', () => {
    const { rerender } = render(
      <ThemeProvider>
        <MemoryRouter>
          <LedgerRow 
            date={new Date('2026-05-01T12:00:00')} 
            transactions={[]} 
            balance={600} 
            isCheckedIn={false} 
            filter="all"
            onCellClick={vi.fn()}
            onCellLongPress={vi.fn()}
          />
        </MemoryRouter>
      </ThemeProvider>
    );
    let row = screen.getByTestId('ledger-row');
    let balanceCell = row.lastChild as HTMLElement;
    expect(balanceCell.style.backgroundColor).toContain('var(--status-green)');

    rerender(
      <ThemeProvider>
        <MemoryRouter>
          <LedgerRow 
            date={new Date('2026-05-01T12:00:00')} 
            transactions={[]} 
            balance={300} 
            isCheckedIn={false} 
            filter="all"
            onCellClick={vi.fn()}
            onCellLongPress={vi.fn()}
          />
        </MemoryRouter>
      </ThemeProvider>
    );
    expect(balanceCell.style.backgroundColor).toContain('var(--status-yellow)');

    rerender(
      <ThemeProvider>
        <MemoryRouter>
          <LedgerRow 
            date={new Date('2026-05-01T12:00:00')} 
            transactions={[]} 
            balance={50} 
            isCheckedIn={false} 
            filter="all"
            onCellClick={vi.fn()}
            onCellLongPress={vi.fn()}
          />
        </MemoryRouter>
      </ThemeProvider>
    );
    expect(balanceCell.style.backgroundColor).toContain('var(--status-red)');
  });
});
