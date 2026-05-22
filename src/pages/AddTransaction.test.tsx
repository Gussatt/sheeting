import { render, screen, fireEvent, waitFor } from '@testing-library/react';
import { describe, it, expect, vi, beforeEach, beforeAll } from 'vitest';
import { AddTransaction } from './AddTransaction';
import { MemoryRouter, Route, Routes } from 'react-router-dom';
import { db, useSQL } from '../db/db';

vi.mock('../db/db', () => ({
  db: {
    query: vi.fn(),
    exec: vi.fn(),
    init: vi.fn().mockResolvedValue(undefined),
  },
  useSQL: vi.fn(),
}));

// Mock Lucide icons
vi.mock('lucide-react', () => ({
  ArrowLeft: () => <div data-testid="arrow-left" />,
  ArrowDownLeft: () => <div />,
  ArrowUpRight: () => <div />,
  CirclePlay: () => <div />,
  Landmark: () => <div />,
  CreditCard: () => <div />,
  Save: () => <div />,
  Trash2: () => <div />,
  X: () => <div />,
  LayoutGrid: () => <div />,
  ChevronDown: () => <div />,
}));

describe('AddTransaction', () => {
  beforeAll(() => {
    Object.defineProperty(global, 'crypto', {
      value: {
        randomUUID: () => 'test-uuid'
      }
    });
  });

  beforeEach(() => {
    vi.clearAllMocks();
    (db.query as any).mockResolvedValue([]);
    (db.exec as any).mockResolvedValue(undefined);
    (useSQL as any).mockReturnValue([]);
  });

  it('renders the form and submits a new transaction', async () => {
    (useSQL as any).mockReturnValue([{ id: 'tag1', name: 'Food' }]);

    render(
      <MemoryRouter initialEntries={['/add']}>
        <Routes>
          <Route path="/add" element={<AddTransaction />} />
        </Routes>
      </MemoryRouter>
    );

    expect(screen.getByText('Nova Transação')).toBeInTheDocument();

    fireEvent.change(screen.getByPlaceholderText('0,00'), { target: { value: '100.50' } });
    fireEvent.change(screen.getByPlaceholderText('Ex: Almoço, Salário...'), { target: { value: 'Lunch' } });
    
    const form = screen.getByLabelText('transaction-form');
    fireEvent.submit(form);

    await waitFor(() => {
      expect(db.exec).toHaveBeenCalled();
    }, { timeout: 3000 });
  });

  it('loads and updates an existing transaction', async () => {
    const existingTransaction = {
      id: 'tx1',
      amount: 50.0,
      type: 'income',
      date: new Date('2026-05-21').toISOString(),
      description: 'Refund',
      tagId: 'tag1',
      isRecurring: false
    };

    (db.query as any).mockResolvedValue([existingTransaction]);
    (useSQL as any).mockReturnValue([{ id: 'tag1', name: 'Food' }]);

    render(
      <MemoryRouter initialEntries={['/edit/tx1']}>
        <Routes>
          <Route path="/edit/:id" element={<AddTransaction />} />
        </Routes>
      </MemoryRouter>
    );

    await waitFor(() => {
      expect(screen.getByText('Editar Transação')).toBeInTheDocument();
    });

    expect(screen.getByDisplayValue('50')).toBeInTheDocument();
    expect(screen.getByDisplayValue('Refund')).toBeInTheDocument();

    fireEvent.change(screen.getByPlaceholderText('0,00'), { target: { value: '60.00' } });
    
    const form = screen.getByLabelText('transaction-form');
    fireEvent.submit(form);

    await waitFor(() => {
      expect(db.exec).toHaveBeenCalled();
    }, { timeout: 3000 });
  });

  it('deletes a transaction', async () => {
    const existingTransaction = {
      id: 'tx1',
      amount: 50.0,
      type: 'income',
      date: new Date('2026-05-21').toISOString(),
      description: 'Refund',
      tagId: 'tag1',
      isRecurring: false
    };

    (db.query as any).mockResolvedValue([existingTransaction]);
    vi.spyOn(window, 'confirm').mockReturnValue(true);

    render(
      <MemoryRouter initialEntries={['/edit/tx1']}>
        <Routes>
          <Route path="/edit/:id" element={<AddTransaction />} />
        </Routes>
      </MemoryRouter>
    );

    await waitFor(() => {
      expect(screen.getByText(/Excluir/i)).toBeInTheDocument();
    });

    fireEvent.click(screen.getByText(/Excluir/i));

    await waitFor(() => {
      expect(db.exec).toHaveBeenCalled();
    }, { timeout: 3000 });
  });
});
