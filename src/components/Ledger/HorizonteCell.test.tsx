// src/components/Ledger/HorizonteCell.test.tsx
import { render, screen } from '@testing-library/react';
import { describe, it, expect } from 'vitest';
import { HorizonteCell } from './HorizonteCell';

describe('HorizonteCell', () => {
  it('renders green cell for high balance', () => {
    render(<HorizonteCell day={1} balance={1200} />);
    const cell = screen.getByTestId('horizonte-cell');
    expect(cell.style.backgroundColor).toBe('var(--status-light-green)');
  });
  
  it('renders yellow cell for medium balance', () => {
    render(<HorizonteCell day={1} balance={500} />);
    const cell = screen.getByTestId('horizonte-cell');
    expect(cell.style.backgroundColor).toBe('var(--status-yellow)');
  });
  
  it('renders pink cell for negative balance', () => {
    render(<HorizonteCell day={2} balance={-50} />);
    const cell = screen.getByTestId('horizonte-cell');
    expect(cell.style.backgroundColor).toBe('var(--status-pink)');
  });
});
