import { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import { db, useSQL } from '../db/db';
import type { BudgetCategory } from '../db/db';
import { calculateDailyBudget } from '../utils/budgetCalc';
import { BudgetCategoryItem } from '../components/Budget/BudgetCategoryItem';
import { Plus, ArrowLeft } from 'lucide-react';

export const DailyCalculation = () => {
  const navigate = useNavigate();
  const [days, setDays] = useState(30);
  const categories = useSQL<BudgetCategory>('SELECT * FROM budget_categories');
  
  const { total, daily } = calculateDailyBudget(categories, days);

  const handleDelete = async (id: string) => {
    if (id && confirm('Remover esta previsão?')) {
      await db.exec('DELETE FROM budget_categories WHERE id = $1', [id]);
    }
  };

  const handleAdd = async () => {
    const name = prompt('Nome da categoria:');
    const amountStr = prompt('Valor mensal:');
    const amount = parseFloat(amountStr || '0');
    if (name && !isNaN(amount)) {
      await db.exec(
        'INSERT INTO budget_categories (id, name, monthly_amount) VALUES ($1, $2, $3)',
        [crypto.randomUUID(), name, amount]
      );
    }
  };

  return (
    <div className="daily-calc-container" style={{ padding: '0 1rem 160px 1rem' }}>
      <header style={{ display: 'flex', justifyContent: 'space-between', alignItems: 'center', padding: '1.5rem 0' }}>
        <div style={{ display: 'flex', alignItems: 'center', gap: '1rem' }}>
          <button onClick={() => navigate(-1)} style={{ background: 'none', border: 'none', color: 'white', cursor: 'pointer' }}>
            <ArrowLeft size={24} />
          </button>
          <h1 style={{ fontSize: '1.25rem', margin: 0 }}>Previsão de diário</h1>
        </div>
        <button onClick={handleAdd} style={{ background: 'none', border: 'none', color: 'white', cursor: 'pointer' }}>
          <Plus size={24} />
        </button>
      </header>

      <div className="category-list" style={{ display: 'flex', flexDirection: 'column' }}>
        {categories.map(cat => (
          <BudgetCategoryItem 
            key={cat.id} 
            name={cat.name} 
            amount={cat.monthlyAmount} 
            onDelete={() => handleDelete(cat.id)} 
          />
        ))}
      </div>

      <footer style={{ 
        position: 'fixed', 
        bottom: '70px', 
        left: 0, 
        right: 0, 
        background: 'var(--color-bg)', 
        padding: '1.5rem', 
        borderTop: '1px solid var(--color-border)',
        maxWidth: '600px',
        margin: '0 auto'
      }}>
        <div style={{ display: 'flex', justifyContent: 'space-between', marginBottom: '1rem' }}>
          <span style={{ color: 'var(--color-text-secondary)' }}>Total mensal</span>
          <span style={{ fontWeight: 'bold' }}>R$ {total.toLocaleString('pt-BR', { minimumFractionDigits: 2 })}</span>
        </div>
        
        <div style={{ display: 'flex', justifyContent: 'space-between', alignItems: 'center', marginBottom: '1.5rem' }}>
          <span style={{ color: 'var(--color-text-secondary)' }}>Dividido por</span>
          <select 
            value={days} 
            onChange={(e) => setDays(Number(e.target.value))} 
            style={{ 
              background: 'none', 
              border: 'none', 
              color: 'white', 
              fontWeight: '500', 
              fontSize: '1rem',
              cursor: 'pointer'
            }}
          >
            <option value={28}>28 dias</option>
            <option value={30}>30 dias</option>
            <option value={31}>31 dias</option>
          </select>
        </div>

        <div style={{ borderTop: '1px solid var(--color-border)', paddingTop: '1rem', display: 'flex', justifyContent: 'flex-end' }}>
          <span style={{ fontSize: '1.75rem', fontWeight: 'bold' }}>
            R$ {daily.toLocaleString('pt-BR', { minimumFractionDigits: 2 })}
          </span>
        </div>
      </footer>
    </div>
  );
};
