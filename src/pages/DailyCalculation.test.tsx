import { render, screen } from '@testing-library/react';
import { describe, it, expect, vi } from 'vitest';
import { DailyCalculation } from './DailyCalculation';
import { MemoryRouter } from 'react-router-dom';

// Mock db hooks
vi.mock('../db/db', async (importOriginal) => {
  const actual = await importOriginal() as any;
  return {
    ...actual,
    useSQL: vi.fn(() => [
      { id: '1', name: 'Aluguel', monthlyAmount: 1000 },
      { id: '2', name: 'Lazer', monthlyAmount: 500 }
    ])
  };
});

describe('DailyCalculation Page', () => {
  it('displays the total monthly and daily calculation', async () => {
    render(<MemoryRouter><DailyCalculation /></MemoryRouter>);
    
    expect(screen.getByText('Previsão de diário')).toBeInTheDocument();
    expect(screen.getByText('R$ 1.500,00')).toBeInTheDocument(); // 1000 + 500
    expect(screen.getByText('R$ 50,00')).toBeInTheDocument(); // 1500 / 30
  });
});
