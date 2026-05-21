import React, { useState } from 'react';
import { useLiveQuery } from 'dexie-react-hooks';
import { db } from '../db/db';
import { calculateDailyBudget } from '../utils/budgetCalc';
import { BudgetCategoryItem } from '../components/Budget/BudgetCategoryItem';
import { Plus } from 'lucide-react';

export const DailyCalculation = () => {
  const [days, setDays] = useState(30);
  const categories = useLiveQuery(() => db.budgetCategories.toArray()) || [];
  
  const { total, daily } = calculateDailyBudget(categories, days);

  const handleDelete = async (id: string) => {
    await db.budgetCategories.delete(id);
  };

  const handleAdd = async () => {
    const name = prompt('Nome da categoria:');
    const amount = parseFloat(prompt('Valor mensal:') || '0');
    if (name && !isNaN(amount)) {
      await db.budgetCategories.add({ 
        id: crypto.randomUUID(), 
        userId: 'default', 
        name, 
        monthlyAmount: amount 
      });
    }
  };

  return (
    <div className="daily-calc-container" style={{ paddingBottom: '100px' }}>
      <header style={{ display: 'flex', justifyContent: 'space-between', alignItems: 'center', padding: '1rem 0' }}>
        <h1 style={{ fontSize: '1.25rem', margin: 0 }}>Previsão de diário</h1>
        <button onClick={handleAdd} style={{ background: 'none', border: 'none', cursor: 'pointer' }}><Plus /></button>
      </header>

      <div className="category-list">
        {categories.map(cat => (
          <BudgetCategoryItem 
            key={cat.id} 
            name={cat.name} 
            amount={cat.monthlyAmount} 
            onDelete={() => handleDelete(cat.id)} 
          />
        ))}
      </div>

      <footer style={{ position: 'fixed', bottom: '70px', left: 0, right: 0, background: 'var(--color-surface)', padding: '1rem', borderTop: '1px solid var(--color-border)' }}>
        <div style={{ display: 'flex', justifyContent: 'space-between', marginBottom: '0.5rem' }}>
          <span>Total mensal</span>
          <span>R$ {total.toLocaleString('pt-BR', { minimumFractionDigits: 2 })}</span>
        </div>
        <div style={{ display: 'flex', justifyContent: 'space-between', alignItems: 'center', marginBottom: '1rem' }}>
          <span>Dividido por</span>
          <select value={days} onChange={(e) => setDays(Number(e.target.value))} style={{ padding: '4px' }}>
            <option value={28}>28 dias</option>
            <option value={30}>30 dias</option>
            <option value={31}>31 dias</option>
          </select>
        </div>
        <div style={{ display: 'flex', justifyContent: 'flex-end', fontSize: '1.5rem', fontWeight: 'bold' }}>
          R$ {daily.toLocaleString('pt-BR', { minimumFractionDigits: 2 })}
        </div>
      </footer>
    </div>
  );
};
