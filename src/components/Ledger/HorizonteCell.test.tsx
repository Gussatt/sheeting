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
