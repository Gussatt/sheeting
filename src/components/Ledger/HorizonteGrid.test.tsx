import { render, screen } from '@testing-library/react';
import { describe, it, expect } from 'vitest';
import { HorizonteGrid } from './HorizonteGrid';

describe('HorizonteGrid', () => {
  it('renders correct number of months and day rows', () => {
    const projections = [
      { monthName: 'May/26', days: [{ day: 1, balance: 100 }, { day: 2, balance: 200 }] },
      { monthName: 'Jun/26', days: [{ day: 1, balance: 300 }, { day: 2, balance: 400 }] }
    ];
    render(<HorizonteGrid projections={projections} />);
    
    expect(screen.getByText('May/26')).toBeInTheDocument();
    expect(screen.getByText('Jun/26')).toBeInTheDocument();
    expect(screen.getAllByTestId('horizonte-cell')).toHaveLength(4);
  });
});
