import { useState } from 'react';
import { useSQL } from '../db/db';
import type { BudgetCategory, Transaction } from '../db/db';
import { calculateDailyBudget } from '../utils/budgetCalc';
import { startOfMonth, endOfMonth, isWithinInterval, format } from 'date-fns';
import { 
  ArrowDownLeft, ArrowUpRight, CirclePlay, Landmark, CreditCard, 
  ChevronLeft, ChevronRight, Calendar, LayoutGrid 
} from 'lucide-react';
import { useNavigate } from 'react-router-dom';

export const Performance = () => {
  const navigate = useNavigate();
  const [currentDate, setCurrentDate] = useState(new Date());
  
  const monthStart = startOfMonth(currentDate);
  const monthEnd = endOfMonth(currentDate);

  const categories = useSQL<BudgetCategory>('SELECT * FROM budget_categories');
  const allTransactions = useSQL<Transaction>('SELECT * FROM transactions');
  
  const currentMonthTransactions = allTransactions.filter(t => 
    isWithinInterval(new Date(t.date), { start: monthStart, end: monthEnd })
  );

  const getTotal = (type: string) => currentMonthTransactions
    .filter(t => t.type === type)
    .reduce((sum, t) => sum + Number(t.amount), 0);

  const income = getTotal('income');
  const expense = getTotal('expense');
  const daily = getTotal('daily');
  const savings = getTotal('savings');
  const credit = getTotal('credit');

  const performance = income - (expense + daily + savings + credit);
  const costOfLiving = expense + daily + credit;
  const savedPercent = income > 0 ? Math.round((savings / income) * 100) : 0;
  
  const dayOfMonth = currentDate.getMonth() === new Date().getMonth() ? new Date().getDate() : 30;
  const avgDaily = dayOfMonth > 0 ? daily / dayOfMonth : 0;

  const { daily: dailyPlanned } = calculateDailyBudget(categories, 30);

  const changeMonth = (offset: number) => {
    const next = new Date(currentDate);
    next.setMonth(currentDate.getMonth() + offset);
    setCurrentDate(next);
  };

  const MetricItem = ({ label, value, subvalue, color, math, secondaryValue }: any) => (
    <div style={{ display: 'flex', justifyContent: 'space-between', alignItems: 'flex-start', padding: '1.25rem 0', borderBottom: '1px solid var(--color-border)' }}>
      <div style={{ display: 'flex', flexDirection: 'column', gap: '0.4rem' }}>
        <span style={{ fontWeight: '600', fontSize: '1.1rem', color: 'var(--color-text-primary)' }}>{label}</span>
        <div style={{ display: 'flex', alignItems: 'center', gap: '4px', color: 'var(--color-text-secondary)', fontSize: '0.9rem' }}>
          {math}
        </div>
      </div>
      <div style={{ display: 'flex', flexDirection: 'column', alignItems: 'flex-end', gap: '0.25rem' }}>
        <div style={{ display: 'flex', alignItems: 'center', gap: '8px' }}>
          {secondaryValue && <span style={{ fontSize: '0.9rem', color: 'var(--status-pink)', fontWeight: '500' }}>{secondaryValue}</span>}
          <span style={{ fontWeight: 'bold', color: typeof value === 'number' && value < 0 ? 'var(--status-red)' : color || 'var(--color-text-primary)', fontSize: '1.1rem' }}>
            {typeof value === 'number' ? `R$ ${value.toLocaleString('pt-BR', { minimumFractionDigits: 2 })}` : value}
          </span>
        </div>
        <span style={{ fontSize: '0.85rem', color: 'var(--color-text-secondary)' }}>{subvalue}</span>
      </div>
    </div>
  );

  const MovementItem = ({ label, value, icon: Icon, color }: any) => (
    <div style={{ display: 'flex', justifyContent: 'space-between', alignItems: 'center', padding: '1.25rem 0', borderBottom: '1px solid var(--color-border)' }}>
      <div style={{ display: 'flex', alignItems: 'center', gap: '1rem' }}>
        <Icon size={20} color={color} />
        <span style={{ fontWeight: '500', fontSize: '1rem' }}>{label}</span>
      </div>
      <span style={{ fontWeight: '500', fontSize: '1rem' }}>
        R$ {value.toLocaleString('pt-BR', { minimumFractionDigits: 2 })}
      </span>
    </div>
  );

  const formatMonth = (date: Date) => {
    const formatted = format(date, 'MMM/yy');
    return formatted.charAt(0).toUpperCase() + formatted.slice(1);
  };

  return (
    <div className="performance-page" style={{ padding: '0 1.25rem 100px 1.25rem' }}>
      <header style={{ 
        display: 'flex', 
        justifyContent: 'space-between', 
        alignItems: 'center', 
        padding: '1.25rem 0',
        backgroundColor: 'var(--color-bg)',
        position: 'sticky',
        top: 0,
        zIndex: 100
      }}>
        <div style={{ position: 'relative', width: '40px', height: '40px', display: 'flex', alignItems: 'center', justifyContent: 'center' }}>
          <Calendar size={32} color="var(--color-primary)" />
          <span style={{ 
            position: 'absolute', 
            top: '55%', 
            left: '50%', 
            transform: 'translate(-50%, -50%)', 
            fontSize: '0.75rem', 
            fontWeight: 'bold',
            color: 'white'
          }}>
            {new Date().getDate()}
          </span>
        </div>

        <div style={{ display: 'flex', alignItems: 'center', gap: '1rem' }}>
          <button onClick={() => changeMonth(-1)} style={{ background: 'none', border: 'none', color: 'var(--color-text-primary)', cursor: 'pointer' }}><ChevronLeft size={24}/></button>
          <span style={{ fontWeight: '700', fontSize: '1.4rem' }}>{formatMonth(currentDate)}</span>
          <button onClick={() => changeMonth(1)} style={{ background: 'none', border: 'none', color: 'var(--color-text-primary)', cursor: 'pointer' }}><ChevronRight size={24}/></button>
        </div>

        <button 
          onClick={() => navigate('/horizonte')}
          style={{ background: 'none', border: 'none', cursor: 'pointer', color: 'var(--status-pink)' }}
        >
          <LayoutGrid size={32} />
        </button>
      </header>

      <section>
        <h2 style={{ fontSize: '0.9rem', color: 'var(--color-text-secondary)', fontWeight: '600', margin: '1.5rem 0 0.5rem 0' }}>Cálculos do mês</h2>
        <div className="metrics-list">
          <MetricItem 
            label="Performance"
            value={performance}
            subvalue={performance < 0 ? "Faltou dinheiro" : "Dentro da meta"}
            math={
              <div style={{ display: 'flex', alignItems: 'center', gap: '4px' }}>
                <ArrowDownLeft size={16} color="var(--status-green)"/>
                <span>-</span>
                <ArrowUpRight size={16} color="var(--status-red)"/>
                <span>-</span>
                <CirclePlay size={16} color="var(--status-pink)"/>
                <span>-</span>
                <Landmark size={16} color="var(--status-light-green)"/>
                <span>-</span>
                <CreditCard size={16} color="var(--status-purple)"/>
                <span>-</span>
                <span style={{ color: 'var(--status-pink)', fontWeight: 'bold' }}>:D</span>
              </div>
            }
          />
          
          <MetricItem 
            label="Economizado"
            value={`${savedPercent}%`}
            subvalue="Acima do ideal"
            color="var(--color-text-primary)"
            math={
              <div style={{ display: 'flex', alignItems: 'center', gap: '8px' }}>
                <Landmark size={16} color="var(--status-light-green)"/>
                <div style={{ width: '80px', height: '10px', background: 'var(--color-surface)', borderRadius: '5px', overflow: 'hidden', border: '1px solid var(--color-border)' }}>
                  <div style={{ width: `${savedPercent}%`, height: '100%', background: 'var(--status-light-green)' }} />
                </div>
                <ArrowDownLeft size={16} color="var(--status-green)"/>
              </div>
            }
          />

          <MetricItem 
            label="Custo de vida"
            value={costOfLiving}
            subvalue="Dentro da renda"
            math={
              <div style={{ display: 'flex', alignItems: 'center', gap: '4px' }}>
                <ArrowUpRight size={16} color="var(--status-red)"/>
                <span>+</span>
                <CirclePlay size={16} color="var(--status-pink)"/>
                <span>+</span>
                <CreditCard size={16} color="var(--status-purple)"/>
                <span>+</span>
                <span style={{ color: 'var(--status-pink)', fontWeight: 'bold' }}>:D</span>
              </div>
            }
          />

          <MetricItem 
            label="Diário médio"
            value={avgDaily}
            secondaryValue={`:D R$ ${dailyPlanned.toFixed(2)}`}
            subvalue=""
            math={
              <div style={{ display: 'flex', alignItems: 'center', gap: '4px' }}>
                <CirclePlay size={16} color="var(--status-pink)"/>
                <span>/ {dayOfMonth}</span>
              </div>
            }
          />
        </div>
      </section>

      <section>
        <h2 style={{ fontSize: '0.9rem', color: 'var(--color-text-secondary)', fontWeight: '600', margin: '2.5rem 0 0.5rem 0' }}>Movimentações do mês</h2>
        <div className="movements-list">
          <MovementItem label="Entradas" value={income} icon={ArrowDownLeft} color="var(--status-green)" />
          <MovementItem label="Saídas" value={expense} icon={ArrowUpRight} color="var(--status-red)" />
          <MovementItem label="Diários" value={daily} icon={CirclePlay} color="var(--status-pink)" />
          <MovementItem label="Economias" value={savings} icon={Landmark} color="var(--status-light-green)" />
          <MovementItem label="Gastos com cartão" value={credit} icon={CreditCard} color="var(--status-purple)" />
          
          <button 
            onClick={() => navigate('/')}
            style={{ 
              display: 'flex', 
              alignItems: 'center', 
              gap: '1rem', 
              padding: '1.25rem 0', 
              background: 'none', 
              border: 'none', 
              width: '100%',
              color: 'var(--color-text-primary)',
              cursor: 'pointer'
            }}
          >
            <div style={{ display: 'grid', gridTemplateColumns: 'repeat(2, 1fr)', gap: '2px', padding: '2px' }}>
              {[...Array(4)].map((_, i) => <div key={i} style={{ width: '4px', height: '4px', backgroundColor: 'var(--color-text-secondary)', borderRadius: '1px' }} />)}
            </div>
            <span style={{ fontWeight: '500', fontSize: '1rem' }}>Ver todas</span>
          </button>
        </div>
      </section>
    </div>
  );
};
