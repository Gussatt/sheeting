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
