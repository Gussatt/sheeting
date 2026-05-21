import { render, screen } from '@testing-library/react';
import { describe, it, expect, vi } from 'vitest';
import { DailyCalculation } from './DailyCalculation';
import { MemoryRouter } from 'react-router-dom';

// Mock Dexie hooks
vi.mock('dexie-react-hooks', () => ({
  useLiveQuery: () => [
    { id: '1', name: 'Aluguel', monthlyAmount: 1000 },
    { id: '2', name: 'Lazer', monthlyAmount: 500 }
  ]
}));

describe('DailyCalculation Page', () => {
  it('displays the total monthly and daily calculation', async () => {
    render(<MemoryRouter><DailyCalculation /></MemoryRouter>);
    
    expect(screen.getByText('Previsão de diário')).toBeInTheDocument();
    expect(screen.getByText('R$ 1.500,00')).toBeInTheDocument(); // 1000 + 500
    expect(screen.getByText('R$ 50,00')).toBeInTheDocument(); // 1500 / 30
  });
});
