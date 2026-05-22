import React, { useMemo } from 'react';
import { useSQL, type Transaction, type BudgetCategory } from '../../db/db';
import { calculateDailyBudget } from '../../utils/budgetCalc';
import { calculateProjection } from '../../utils/projection';
import { useFilteredTransactions } from '../../hooks/useFilteredTransactions';

const getStatusColor = (balance: number) => {
  if (balance < 100) return 'var(--status-red)';
  if (balance < 500) return 'var(--status-yellow)';
  return 'var(--status-green)';
};

export const StatusDots: React.FC = () => {
  const allTransactions = useSQL<Transaction>(`SELECT * FROM transactions`);
  const categories = useSQL<BudgetCategory>(`SELECT * FROM budget_categories`);

  // StatusDots uses 'calcSaldos' for balance projection status
  const filteredTransactions = useFilteredTransactions(allTransactions, 'calcSaldos');

  const dots = useMemo(() => {
    const now = new Date();
    const currentBalance = filteredTransactions
      .filter(t => new Date(t.date) <= now)
      .reduce((sum, t) => {
        const amount = Number(t.amount);
        return t.type === 'income' ? sum + amount : sum - amount;
      }, 0);

    const { daily: dailyPlanned } = calculateDailyBudget(categories, 30);
    const projections = calculateProjection(now, currentBalance, dailyPlanned, filteredTransactions, 1);
    
    // Flatten all projected days from the first month
    const allDays = projections[0]?.days || [];
    // Take the next 9 days (including today)
    const todayDay = now.getDate();
    const startIndex = allDays.findIndex(d => d.day === todayDay);
    const next9Days = allDays.slice(startIndex >= 0 ? startIndex : 0, (startIndex >= 0 ? startIndex : 0) + 9);

    return Array.from({ length: 9 }, (_, i) => {
      const dayData = next9Days[i];
      return dayData ? getStatusColor(dayData.balance) : 'rgba(255,255,255,0.1)';
    });
  }, [filteredTransactions, categories]);

  return (
    <div style={{ 
      display: 'grid', 
      gridTemplateColumns: 'repeat(3, 1fr)', 
      gap: '3px', 
      padding: '4px'
    }}>
      {dots.map((color, i) => (
        <div 
          key={i} 
          style={{ 
            width: '8px', 
            height: '8px', 
            backgroundColor: color, 
            borderRadius: '2px' 
          }} 
        />
      ))}
    </div>
  );
};
