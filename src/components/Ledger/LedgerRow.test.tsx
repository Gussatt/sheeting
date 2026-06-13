import { describe, it, expect } from 'vitest';
import { render, screen } from '@testing-library/react';
import { LedgerRow } from './LedgerRow';
import { BrowserRouter } from 'react-router-dom';
import { ThemeProvider } from '../../context/ThemeContext';

describe('LedgerRow', () => {
  const mockTransactions: any[] = [
    { id: '1', amount: 1000, type: 'income', date: '2026-05-01', description: 'Salary' },
    { id: '2', amount: 200, type: 'expense', date: '2026-05-01', description: 'Rent' },
  ];

  it('renders correctly and aligns balance text top-right', () => {
    render(
      <BrowserRouter>
        <ThemeProvider>
          <LedgerRow 
            date={new Date('2026-05-01T12:00:00Z')}
            transactions={mockTransactions}
            balance={800}
            isCheckedIn={false}
            filter="all"
            onCellClick={() => {}}
            onCellLongPress={() => {}}
          />
        </ThemeProvider>
      </BrowserRouter>
    );

    const balanceText = screen.getByText('R$ 800,00');
    const balanceCell = balanceText.closest('div');
    expect(balanceCell?.style.alignItems).toBe('flex-start'); // Top
    expect(balanceCell?.style.justifyContent).toBe('flex-end'); // Right
  });

  it('highlights today cell correctly in dark mode (white bg)', () => {
    // Force today's date
    const today = new Date();
    const day = today.getDate().toString();

    render(
      <BrowserRouter>
        <ThemeProvider initialTheme="dark">
          <LedgerRow 
            date={today}
            transactions={[]}
            balance={0}
            isCheckedIn={false}
            filter="all"
            onCellClick={() => {}}
            onCellLongPress={() => {}}
          />
        </ThemeProvider>
      </BrowserRouter>
    );

    const dayCell = screen.getByText(day);
    // Support both hex and rgb normalization
    const bg = dayCell.style.backgroundColor;
    expect(bg === '#FFFFFF' || bg === '#ffffff' || bg === 'rgb(255, 255, 255)').toBe(true);
    
    const color = dayCell.style.color;
    expect(color === '#000000' || color === 'rgb(0, 0, 0)').toBe(true);
  });

  it('colors income green ONLY if total > 0', () => {
    render(
      <BrowserRouter>
        <ThemeProvider>
          <LedgerRow 
            date={new Date()}
            transactions={[{ 
              id: '1', 
              amount: 0, 
              type: 'income', 
              date: new Date().toISOString(),
              description: '',
              tagId: '',
              isRecurring: false 
            }]}
            balance={0}
            isCheckedIn={false}
            filter="all"
            onCellClick={() => {}}
            onCellLongPress={() => {}}
          />
        </ThemeProvider>
      </BrowserRouter>
    );

    // R$ 0,00 for income should NOT be green
    const incomeValue = screen.getAllByText('R$ 0,00')[0];
    expect(incomeValue.style.color).not.toContain('var(--status-green)');
  });
});
