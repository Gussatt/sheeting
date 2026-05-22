import { render, screen } from '@testing-library/react';
import { describe, it, expect, vi, beforeEach } from 'vitest';
import { TransactionListSheet } from './TransactionListSheet';
import { MemoryRouter } from 'react-router-dom';
import { useSQL } from '../../db/db';

vi.mock('../../db/db', () => ({
  useSQL: vi.fn(),
}));

describe('TransactionListSheet', () => {
  const initialDate = new Date('2026-05-01T12:00:00');
  
  beforeEach(() => {
    vi.clearAllMocks();
    (useSQL as any).mockReturnValue([
      { id: '1', type: 'income', amount: 1000, date: initialDate.toISOString(), description: 'Salary', tagId: 't1' }
    ]);
  });

  it('renders transactions and allows day navigation', async () => {
    render(
      <MemoryRouter>
        <TransactionListSheet 
          isOpen={true} 
          initialDate={initialDate} 
          initialType="all" 
          onClose={vi.fn()} 
        />
      </MemoryRouter>
    );

    expect(screen.getAllByText('01/05')[0]).toBeInTheDocument();
    expect(screen.getByText('Salary')).toBeInTheDocument();
    expect(screen.getByText('R$ 1.000,00')).toBeInTheDocument();
  });
});
