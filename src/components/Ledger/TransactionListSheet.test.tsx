import { describe, it, expect, vi, beforeEach } from 'vitest';
import { render, screen } from '@testing-library/react';
import { TransactionListSheet } from './TransactionListSheet';
import { BrowserRouter } from 'react-router-dom';
import { ThemeProvider } from '../../context/ThemeContext';
import * as dbExports from '../../db/db';
import { addDays, format } from 'date-fns';

vi.mock('../../db/db', () => ({
  useSQL: vi.fn(),
  db: {
    exec: vi.fn(),
    init: vi.fn().mockResolvedValue(undefined),
  }
}));

describe('TransactionListSheet', () => {
  beforeEach(() => {
    vi.clearAllMocks();
  });

  it('renders transactions and shows correct date format', () => {
    const testDate = new Date('2026-05-01T12:00:00Z');
    (dbExports.useSQL as any).mockImplementation((query: string) => {
      if (query.includes('FROM transactions')) {
        return [{ id: '1', amount: 1000, type: 'income', date: '2026-05-01', description: 'Salary' }];
      }
      return []; // categories
    });

    render(
      <BrowserRouter>
        <ThemeProvider>
          <TransactionListSheet 
            isOpen={true}
            initialDate={testDate}
            initialType="all"
            onClose={() => {}}
          />
        </ThemeProvider>
      </BrowserRouter>
    );

    expect(screen.getByText('01/05')).toBeInTheDocument();
    expect(screen.getByText('Salary')).toBeInTheDocument();
    expect(screen.getByText('R$ 1.000,00')).toBeInTheDocument();
  });

  it('shows diary prediction on future dates when no real daily entry exists', () => {
    const tomorrow = addDays(new Date(), 1);
    const dateStr = format(tomorrow, 'dd/MM');

    (dbExports.useSQL as any).mockImplementation((query: string) => {
      if (query.includes('FROM transactions')) return []; // No transactions
      if (query.includes('FROM budget_categories')) return [{ id: '1', monthlyAmount: 3000, name: 'Test' }];
      return [];
    });

    render(
      <BrowserRouter>
        <ThemeProvider>
          <TransactionListSheet 
            isOpen={true}
            initialDate={tomorrow}
            initialType="all"
            onClose={() => {}}
          />
        </ThemeProvider>
      </BrowserRouter>
    );

    expect(screen.getByText(dateStr)).toBeInTheDocument();
    expect(screen.getByText('Previsão de diário')).toBeInTheDocument();
    // 3000 / 30 = 100
    expect(screen.getByText('R$ 100,00')).toBeInTheDocument();
  });

  it('hides diary prediction when a real daily transaction exists', () => {
    const tomorrow = addDays(new Date(), 1);

    (dbExports.useSQL as any).mockImplementation((query: string) => {
      if (query.includes('FROM transactions')) {
        return [{ id: 'real-1', amount: 50, type: 'daily', date: tomorrow.toISOString(), description: 'Real lunch' }];
      }
      if (query.includes('FROM budget_categories')) return [{ id: '1', monthlyAmount: 3000, name: 'Test' }];
      return [];
    });

    render(
      <BrowserRouter>
        <ThemeProvider>
          <TransactionListSheet 
            isOpen={true}
            initialDate={tomorrow}
            initialType="all"
            onClose={() => {}}
          />
        </ThemeProvider>
      </BrowserRouter>
    );

    expect(screen.queryByText('Previsão de diário')).not.toBeInTheDocument();
    expect(screen.getByText('Real lunch')).toBeInTheDocument();
  });
});
