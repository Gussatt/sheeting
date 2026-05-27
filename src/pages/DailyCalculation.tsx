import { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import { db, useSQL } from '../db/db';
import type { BudgetCategory } from '../db/db';
import { calculateDailyBudget } from '../utils/budgetCalc';
import { BudgetCategoryItem } from '../components/Budget/BudgetCategoryItem';
import { Plus, ArrowLeft, ChevronDown } from 'lucide-react';

export const DailyCalculation = () => {
  const navigate = useNavigate();
  const [days, setDays] = useState(30);
  const categories = useSQL<BudgetCategory>('SELECT * FROM budget_categories');
  
  const { total, daily } = calculateDailyBudget(categories, days);

  const handleDelete = async (id: string) => {
    await db.exec('DELETE FROM budget_categories WHERE id = $1', [id]);
  };

  const handleAdd = async () => {
    const name = prompt('Nome da categoria:');
    const amountStr = prompt('Valor mensal:');
    if (!name || !amountStr) return;
    
    const amount = parseFloat(amountStr.replace(',', '.'));
    if (!isNaN(amount)) {
      await db.exec(
        'INSERT INTO budget_categories (id, name, monthly_amount) VALUES ($1, $2, $3)',
        [crypto.randomUUID(), name, amount]
      );
    }
  };

  return (
    <div className="daily-calc-page" style={{ 
      backgroundColor: 'var(--color-bg)', 
      minHeight: '100vh', 
      display: 'flex', 
      flexDirection: 'column' 
    }}>
      <header style={{ 
        display: 'flex', 
        justifyContent: 'space-between', 
        alignItems: 'center', 
        padding: '1rem 1.5rem',
        backgroundColor: 'var(--color-bg)',
        position: 'sticky',
        top: 0,
        zIndex: 10,
        borderBottom: '1px solid var(--color-border)'
      }}>
        <div style={{ display: 'flex', alignItems: 'center', gap: '1.25rem' }}>
          <button onClick={() => navigate(-1)} style={{ background: 'none', border: 'none', color: 'var(--color-text-primary)', cursor: 'pointer', padding: 0 }}>
            <ArrowLeft size={28} />
          </button>
          <h1 style={{ fontSize: '1.6rem', fontWeight: 'bold', color: 'var(--color-text-primary)', margin: 0 }}>Previsão de diário</h1>
        </div>
        <button onClick={handleAdd} style={{ background: 'none', border: 'none', color: 'var(--color-text-primary)', cursor: 'pointer', padding: 0 }}>
          <Plus size={32} />
        </button>
      </header>

      <div className="category-list" style={{ flex: 1, padding: '0 1.5rem' }}>
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
        padding: '2rem 1.5rem 100px 1.5rem', 
        backgroundColor: 'var(--color-bg)',
        borderTop: '1px solid var(--color-border)'
      }}>
        <div style={{ display: 'flex', justifyContent: 'space-between', marginBottom: '1.5rem' }}>
          <span style={{ fontSize: '1.2rem', fontWeight: '600', color: 'var(--color-text-primary)' }}>Total mensal</span>
          <span style={{ fontSize: '1.2rem', fontWeight: '600', color: 'var(--color-text-primary)' }}>R$ {total.toLocaleString('pt-BR', { minimumFractionDigits: 2 })}</span>
        </div>
        
        <div style={{ display: 'flex', justifyContent: 'space-between', alignItems: 'center', marginBottom: '2.5rem' }}>
          <span style={{ fontSize: '1.2rem', fontWeight: '600', color: 'var(--color-text-primary)' }}>Dividido por</span>
          <div style={{ display: 'flex', alignItems: 'center', gap: '0.5rem' }}>
            <select 
              value={days} 
              onChange={(e) => setDays(Number(e.target.value))} 
              style={{ 
                background: 'none', 
                border: 'none', 
                color: 'var(--color-text-primary)', 
                fontWeight: '600', 
                fontSize: '1.2rem',
                cursor: 'pointer',
                textAlign: 'right',
                appearance: 'none',
                WebkitAppearance: 'none'
              }}
            >
              <option value={28}>28 dias</option>
              <option value={30}>30 dias</option>
              <option value={31}>31 dias</option>
            </select>
            <ChevronDown size={18} color="var(--color-text-primary)" />
          </div>
        </div>

        <div style={{ display: 'flex', justifyContent: 'flex-end', marginTop: '1rem' }}>
          <span style={{ fontSize: '2.2rem', fontWeight: 'bold', color: 'var(--color-text-primary)' }}>
            R$ {daily.toLocaleString('pt-BR', { minimumFractionDigits: 2 })}
          </span>
        </div>
      </footer>
    </div>
  );
};
