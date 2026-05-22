// src/components/Ledger/HorizonteCell.test.tsx
import { render, screen } from '@testing-library/react';
import { describe, it, expect } from 'vitest';
import { HorizonteCell } from './HorizonteCell';

describe('HorizonteCell', () => {
  it('renders green cell for positive forecast', () => {
    render(<HorizonteCell day={1} forecast={200} />);
    const cell = screen.getByTestId('horizonte-cell');
    expect(cell.style.backgroundColor).toBe('var(--status-light-green)');
  });
  
  it('renders pink cell for negative forecast', () => {
    render(<HorizonteCell day={2} forecast={-50} />);
    const cell = screen.getByTestId('horizonte-cell');
    expect(cell.style.backgroundColor).toBe('var(--status-pink)');
  });
});
