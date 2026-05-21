import { render, screen } from '@testing-library/react';
import { describe, it, expect } from 'vitest';
import { LedgerRow } from './LedgerRow';

describe('LedgerRow', () => {
  it('renders green background for positive balance >= 100', () => {
    render(<LedgerRow day={1} type="income" total={100} balance={1500} isCheckedIn={true} />);
    const row = screen.getByTestId('ledger-row');
    expect(row.style.backgroundColor).toBe('var(--status-green)');
  });

  it('renders yellow background for balance between 0 and 100', () => {
    render(<LedgerRow day={3} type="expense" total={10} balance={50} isCheckedIn={false} />);
    const row = screen.getByTestId('ledger-row');
    expect(row.style.backgroundColor).toBe('var(--status-yellow)');
  });

  it('renders red background for negative balance', () => {
    render(<LedgerRow day={2} type="expense" total={50} balance={-100} isCheckedIn={false} />);
    const row = screen.getByTestId('ledger-row');
    expect(row.style.backgroundColor).toBe('var(--status-red)');
  });
});
