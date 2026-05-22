import { useSQL } from '../db/db';
import type { BudgetCategory, Transaction } from '../db/db';
import { calculateProjection } from '../utils/projection';
import { HorizonteGrid } from '../components/Ledger/HorizonteGrid';
import { calculateDailyBudget } from '../utils/budgetCalc';
import { useNavigate } from 'react-router-dom';
import { ChevronLeft, Plus } from 'lucide-react';

export const Horizonte = () => {
  const navigate = useNavigate();
  const now = new Date();

  const categories = useSQL<BudgetCategory>('SELECT * FROM budget_categories');
  const allTransactions = useSQL<Transaction>('SELECT * FROM transactions');
  
  // Calculate current actual balance to start projection
  const currentBalance = allTransactions
    .filter(t => new Date(t.date) <= now)
    .reduce((sum, t) => t.type === 'income' ? sum + t.amount : sum - t.amount, 0);

  const { daily: dailyPlanned } = calculateDailyBudget(categories, 30);
  
  // Project 3 months as shown in screenshot
  const projections = calculateProjection(now, currentBalance, dailyPlanned, allTransactions, 3);

  return (
    <div className="horizonte-page" style={{ height: '100vh', display: 'flex', flexDirection: 'column' }}>
      <header style={{ 
        display: 'flex', 
        alignItems: 'center', 
        justifyContent: 'space-between', 
        padding: '1rem',
        backgroundColor: 'var(--color-bg)',
        borderBottom: '1px solid var(--color-border)'
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

      <div style={{ flex: 1, overflowY: 'auto' }}>
        <HorizonteGrid projections={projections} />
      </div>
    </div>
  );
};
