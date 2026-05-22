import { useSQL } from '../db/db';
import type { BudgetCategory, Transaction } from '../db/db';
import { calculateProjection } from '../utils/projection';
import { HorizonteGrid } from '../components/Ledger/HorizonteGrid';
import { calculateDailyBudget } from '../utils/budgetCalc';
import { useNavigate } from 'react-router-dom';
import { ChevronLeft, Plus } from 'lucide-react';
import { useFilteredTransactions } from '../hooks/useFilteredTransactions';

export const Horizonte = () => {
  const navigate = useNavigate();
  const now = new Date();

  const categories = useSQL<BudgetCategory>('SELECT * FROM budget_categories');
  const allTransactions = useSQL<Transaction>('SELECT * FROM transactions');
  
  // Horizonte uses 'calcSaldos' for balance projection
  const filteredTransactions = useFilteredTransactions(allTransactions, 'calcSaldos');

  // Calculate current actual balance to start projection
  const currentBalance = filteredTransactions
    .filter(t => new Date(t.date) <= now)
    .reduce((sum, t) => {
      const amount = Number(t.amount);
      return t.type === 'income' ? sum + amount : sum - amount;
    }, 0);

  const { daily: dailyPlanned } = calculateDailyBudget(categories, 30);
  
  // Project 3 months as shown in screenshot
  const projections = calculateProjection(now, currentBalance, dailyPlanned, filteredTransactions, 3);

  return (
    <div className="horizonte-page" style={{ paddingBottom: '80px' }}>
      <header style={{ 
        display: 'flex', 
        alignItems: 'center', 
        justifyContent: 'space-between', 
        padding: '1rem 1.25rem',
        backgroundColor: 'var(--color-bg)',
        borderBottom: '1px solid var(--color-border)',
        position: 'sticky',
        top: 0,
        zIndex: 101
      }}>
        <div style={{ display: 'flex', alignItems: 'center', gap: '1rem' }}>
          <button 
            onClick={() => navigate(-1)} 
            style={{ background: 'none', border: 'none', color: 'var(--color-text-primary)', cursor: 'pointer', padding: '4px' }}
          >
            <ChevronLeft size={28} />
          </button>
          <h1 style={{ fontSize: '1.5rem', fontWeight: 'bold', margin: 0 }}>Horizonte de saldos</h1>
        </div>
        <button 
          onClick={() => navigate('/add')}
          style={{ background: 'none', border: 'none', color: 'var(--color-text-primary)', cursor: 'pointer', padding: '4px' }}
        >
          <Plus size={28} />
        </button>
      </header>

      <HorizonteGrid projections={projections} />
    </div>
  );
};
