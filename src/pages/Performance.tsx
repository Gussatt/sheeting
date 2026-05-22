import { useSQL } from '../db/db';
import type { BudgetCategory, Transaction } from '../db/db';
import { calculateProjection } from '../utils/projection';
import { HorizonteGrid } from '../components/Ledger/HorizonteGrid';
import { calculateDailyBudget } from '../utils/budgetCalc';
import { startOfMonth, endOfMonth, isWithinInterval } from 'date-fns';
import { ArrowDownLeft, ArrowUpRight, CirclePlay, Landmark, CreditCard } from 'lucide-react';

export const Performance = () => {
  const now = new Date();
  const monthStart = startOfMonth(now);
  const monthEnd = endOfMonth(now);

  const categories = useSQL<BudgetCategory>('SELECT * FROM budget_categories');
  const allTransactions = useSQL<Transaction>('SELECT * FROM transactions');
  
  const currentMonthTransactions = allTransactions.filter(t => 
    isWithinInterval(new Date(t.date), { start: monthStart, end: monthEnd })
  );

  const getTotal = (type: string) => currentMonthTransactions
    .filter(t => t.type === type)
    .reduce((sum, t) => sum + t.amount, 0);

  const income = getTotal('income');
  const expense = getTotal('expense');
  const daily = getTotal('daily');
  const savings = getTotal('savings');
  const credit = getTotal('credit');

  const performance = income - (expense + daily + savings + credit);
  const costOfLiving = expense + daily + credit;
  const savedPercent = income > 0 ? Math.round((savings / income) * 100) : 0;
  
  const dayOfMonth = now.getDate();
  const avgDaily = dayOfMonth > 0 ? daily / dayOfMonth : 0;

  const { daily: dailyPlanned } = calculateDailyBudget(categories, 30);
  const projections = calculateProjection(now, performance, dailyPlanned, allTransactions, 4);

  const MetricItem = ({ label, value, subvalue, color, math }: any) => (
    <div style={{ display: 'flex', justifyContent: 'space-between', alignItems: 'flex-start', padding: '1.25rem 0', borderBottom: '1px solid var(--color-border)' }}>
      <div style={{ display: 'flex', flexDirection: 'column', gap: '0.5rem' }}>
        <span style={{ fontWeight: '500', fontSize: '1.1rem' }}>{label}</span>
        <div style={{ display: 'flex', alignItems: 'center', gap: '4px', color: 'var(--color-text-secondary)', fontSize: '0.85rem' }}>
          {math}
        </div>
      </div>
      <div style={{ display: 'flex', flexDirection: 'column', alignItems: 'flex-end', gap: '0.25rem' }}>
        <span style={{ fontWeight: 'bold', color: typeof value === 'number' && value < 0 ? 'var(--status-red)' : color || 'white', fontSize: '1.1rem' }}>
          {typeof value === 'number' ? `R$ ${value.toLocaleString('pt-BR', { minimumFractionDigits: 2 })}` : value}
        </span>
        <span style={{ fontSize: '0.85rem', color: 'var(--color-text-secondary)' }}>{subvalue}</span>
      </div>
    </div>
  );

  return (
    <div className="performance-page" style={{ padding: '0 1rem 80px 1rem' }}>
      <header style={{ padding: '1.5rem 0' }}>
        <h1 style={{ fontSize: '1.25rem', margin: 0 }}>Cálculos do mês</h1>
      </header>

      <div className="metrics-list">
        <MetricItem 
          label="Performance"
          value={performance}
          subvalue={performance < 0 ? "Faltou dinheiro" : "Dentro da meta"}
          math={<><ArrowDownLeft size={14} color="var(--status-green)"/> - <ArrowUpRight size={14} color="var(--status-red)"/> - <CirclePlay size={14} color="var(--status-pink)"/> - <Landmark size={14} color="var(--status-light-green)"/> - <CreditCard size={14} color="var(--status-purple)"/></>}
        />
        
        <MetricItem 
          label="Economizado"
          value={`${savedPercent}%`}
          subvalue="Acima do ideal"
          color="var(--status-light-green)"
          math={
            <div style={{ display: 'flex', alignItems: 'center', gap: '8px' }}>
              <Landmark size={14} color="var(--status-light-green)"/>
              <div style={{ width: '60px', height: '8px', background: 'var(--color-border)', borderRadius: '4px', overflow: 'hidden' }}>
                <div style={{ width: `${savedPercent}%`, height: '100%', background: 'var(--status-light-green)' }} />
              </div>
              <ArrowDownLeft size={14} color="var(--status-green)"/>
            </div>
          }
        />

        <MetricItem 
          label="Custo de vida"
          value={costOfLiving}
          subvalue="Dentro da renda"
          math={<><ArrowUpRight size={14} color="var(--status-red)"/> + <CirclePlay size={14} color="var(--status-pink)"/> + <CreditCard size={14} color="var(--status-purple)"/></>}
        />

        <MetricItem 
          label="Diário médio"
          value={avgDaily}
          subvalue={<span style={{ color: 'var(--status-pink)' }}>D R$ {dailyPlanned.toFixed(2)}</span>}
          math={<><CirclePlay size={14} color="var(--status-pink)"/> / {dayOfMonth}</>}
        />
      </div>

      <header style={{ padding: '2rem 0 1rem 0' }}>
        <h1 style={{ fontSize: '1.25rem', margin: 0 }}>Horizonte</h1>
      </header>
      
      <div style={{ margin: '0 -1rem' }}>
        <HorizonteGrid projections={projections} />
      </div>
    </div>
  );
};
