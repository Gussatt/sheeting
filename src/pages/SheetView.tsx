import { useState, useMemo, useCallback, useRef, useEffect } from 'react';
import { useSQL, db, type Transaction, type BudgetCategory } from '../db/db';
import { format, startOfMonth, endOfMonth, eachDayOfInterval, isSameDay, isToday } from 'date-fns';
import { LedgerRow, type TransactionType } from '../components/Ledger/LedgerRow';
import { FilterSheet } from '../components/Ledger/FilterSheet';
import { TransactionListSheet } from '../components/Ledger/TransactionListSheet';
import type { FilterType } from '../components/Ledger/FilterSheet';
import { ChevronLeft, ChevronRight, Calendar } from 'lucide-react';
import { useNavigate } from 'react-router-dom';
import { calculateDailyBudget } from '../utils/budgetCalc';
import { calculateProjection } from '../utils/projection';

const getStatusColor = (balance: number) => {
  if (balance < 100) return 'var(--status-red)';
  if (balance < 500) return 'var(--status-yellow)';
  return 'var(--status-green)';
};

export const SheetView = () => {
  const navigate = useNavigate();
  const [currentDate, setCurrentDate] = useState(new Date());
  const [filter, setFilter] = useState<FilterType>('all');
  const [isFilterOpen, setIsFilterOpen] = useState(false);
  const [isListOpen, setIsListOpen] = useState(false);
  const [selectedDate, setSelectedDate] = useState<Date>(new Date());
  const [selectedType, setSelectedType] = useState<FilterType>('all');

  const todayRef = useRef<HTMLDivElement>(null);

  const monthStart = startOfMonth(currentDate);
  const monthEnd = endOfMonth(currentDate);
  const daysInMonth = useMemo(() => eachDayOfInterval({ start: monthStart, end: monthEnd }), [monthStart, monthEnd]);

  const transactions = useSQL<Transaction>(
    `SELECT * FROM transactions 
     WHERE date >= $1 AND date <= $2 
     ORDER BY date ASC`,
    useMemo(() => [monthStart.toISOString(), monthEnd.toISOString()], [monthStart, monthEnd])
  );

  const allTransactions = useSQL<Transaction>(`SELECT * FROM transactions`);
  const categories = useSQL<BudgetCategory>(`SELECT * FROM budget_categories`);

  const statuses = useSQL<{ date: string, isChecked: boolean }>(
    `SELECT * FROM daily_status`
  );

  const projectionDots = useMemo(() => {
    if (!allTransactions.length && !categories.length) return Array(9).fill('var(--status-yellow)');
    
    const today = new Date();
    const currentBalance = allTransactions
      .filter(t => new Date(t.date) <= today)
      .reduce((sum, t) => t.type === 'income' ? sum + Number(t.amount) : sum - Number(t.amount), 0);

    const { daily: dailyPlanned } = calculateDailyBudget(categories, 30);
    const projection = calculateProjection(today, currentBalance, dailyPlanned, allTransactions, 1);
    
    const projectedDays = projection[0]?.days || [];
    return Array.from({ length: 9 }, (_, i) => {
      const dayData = projectedDays[i];
      return dayData ? getStatusColor(dayData.balance) : 'var(--status-yellow)';
    });
  }, [allTransactions, categories]);

  const dailyData = useMemo(() => {
    let currentBalance = 0;
    return daysInMonth.map((date) => {
      const dateStr = date.toISOString().split('T')[0];
      const dayTransactions = transactions.filter(t => isSameDay(new Date(t.date), date));
      const status = statuses.find(s => s.date === dateStr);
      
      const dayTotalAll = dayTransactions.reduce((sum, t) => {
        if (t.type === 'income') return sum + Number(t.amount);
        return sum - Number(t.amount);
      }, 0);
      currentBalance += dayTotalAll;

      return {
        date,
        dayTransactions,
        balance: currentBalance,
        isChecked: status?.isChecked || false
      };
    });
  }, [daysInMonth, transactions, statuses]);

  const handleCellClick = useCallback((type: TransactionType, date: Date) => {
    setSelectedDate(date);
    setSelectedType(type);
    setIsListOpen(true);
  }, []);

  const handleCellLongPress = useCallback((type: TransactionType, date: Date) => {
    const dateStr = date.toISOString().split('T')[0];
    navigate(`/add?type=${type}&date=${dateStr}`);
  }, [navigate]);

  const handleToggleCheck = async (date: Date) => {
    const dateStr = date.toISOString().split('T')[0];
    const current = statuses.find(s => s.date === dateStr);
    if (current) {
      await db.exec('UPDATE daily_status SET is_checked = $1 WHERE date = $2', [!current.isChecked, dateStr]);
    } else {
      await db.exec('INSERT INTO daily_status (date, is_checked) VALUES ($1, $2)', [dateStr, true]);
    }
  };

  const changeMonth = (offset: number) => {
    const next = new Date(currentDate);
    next.setMonth(currentDate.getMonth() + offset);
    setCurrentDate(next);
  };

  const getFilterLabel = (t: FilterType) => {
    const labels: Record<FilterType, string> = {
      all: 'Todas', income: 'Entradas', expense: 'Saídas', 
      daily: 'Diários', savings: 'Economias', credit: 'Gastos com cartão'
    };
    return labels[t];
  };

  const jumpToToday = () => {
    const now = new Date();
    setCurrentDate(now);
    // Smooth scroll is handled in useEffect when currentDate matches today
  };

  useEffect(() => {
    if (isToday(currentDate) && todayRef.current) {
      todayRef.current.scrollIntoView({ behavior: 'smooth', block: 'center' });
    }
  }, [currentDate]);

  const formatMonth = (date: Date) => {
    const formatted = format(date, 'MMM/yy');
    return formatted.charAt(0).toUpperCase() + formatted.slice(1);
  };

  return (
    <div className="sheet-view" style={{ paddingBottom: '80px', marginTop: '-1rem' }}>
      <header style={{ 
        display: 'flex', 
        justifyContent: 'space-between', 
        alignItems: 'center', 
        padding: '1.25rem 0',
        backgroundColor: 'var(--color-bg)',
        position: 'sticky',
        top: 0,
        zIndex: 100,
        borderBottom: '1px solid var(--color-border)'
      }}>
        <div 
          onClick={jumpToToday}
          style={{ position: 'relative', width: '40px', height: '40px', display: 'flex', alignItems: 'center', justifyContent: 'center', cursor: 'pointer' }}
        >
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
          <button onClick={() => changeMonth(-1)} style={{ background: 'none', border: 'none', color: 'white', cursor: 'pointer' }}><ChevronLeft size={20}/></button>
          <span style={{ fontWeight: '600', fontSize: '1.3rem' }}>{formatMonth(currentDate)}</span>
          <button onClick={() => changeMonth(1)} style={{ background: 'none', border: 'none', color: 'white', cursor: 'pointer' }}><ChevronRight size={20}/></button>
        </div>

        <button 
          onClick={() => navigate('/performance')}
          style={{ background: 'none', border: 'none', cursor: 'pointer', padding: '4px' }}
        >
          <div style={{ display: 'grid', gridTemplateColumns: 'repeat(3, 1fr)', gap: '3px', padding: '4px', borderRadius: '4px' }}>
            {projectionDots.map((color, i) => (
              <div key={i} style={{ width: '8px', height: '8px', backgroundColor: color, borderRadius: '2px' }} />
            ))}
          </div>
        </button>
      </header>

      <div style={{ 
        display: 'flex', 
        alignItems: 'center', 
        padding: '1.5rem 0 1rem 0', 
        fontSize: '0.9rem', 
        color: 'var(--color-text-secondary)',
        borderBottom: '1px solid var(--color-border)',
        marginBottom: '4px',
        gap: '0.5rem'
      }}>
        <span style={{ width: '50px', textAlign: 'center', fontWeight: '500' }}>Dia</span>
        <button 
          onClick={() => setIsFilterOpen(true)} 
          style={{ 
            display: 'flex', 
            alignItems: 'center', 
            gap: '0.5rem', 
            background: 'var(--color-surface)', 
            border: '1px solid var(--color-border)', 
            padding: '8px 20px', 
            borderRadius: '24px', 
            color: 'var(--color-text-primary)',
            cursor: 'pointer',
            fontSize: '0.95rem',
            fontWeight: '600',
            boxShadow: '0 2px 4px rgba(0,0,0,0.1)'
          }}
        >
          <div style={{ display: 'grid', gridTemplateColumns: 'repeat(2, 1fr)', gap: '2px', opacity: 0.8 }}>
            {[...Array(4)].map((_, i) => <div key={i} style={{ width: '3px', height: '3px', backgroundColor: 'currentColor', borderRadius: '50%' }} />)}
          </div>
          {getFilterLabel(filter)}
          <ChevronRight size={14} style={{ transform: 'rotate(90deg)', opacity: 0.6 }} />
        </button>
        <div style={{ flex: 1 }} />
        <span style={{ width: '100px', textAlign: 'center', fontWeight: '500' }}>Saldos</span>
      </div>

      <div className="ledger-list" style={{ display: 'flex', flexDirection: 'column' }}>
        {dailyData.map(({ date, dayTransactions, balance, isChecked }) => (
          <div 
            key={date.toISOString()} 
            ref={isToday(date) ? todayRef : null}
            onClick={(e) => {
              const rect = e.currentTarget.getBoundingClientRect();
              if (e.clientX - rect.left < 50) {
                handleToggleCheck(date);
              }
            }}
          >
            <LedgerRow 
              date={date}
              transactions={dayTransactions}
              balance={balance}
              isCheckedIn={isChecked}
              filter={filter}
              onCellClick={(type) => handleCellClick(type, date)}
              onCellLongPress={(type) => handleCellLongPress(type, date)}
            />
          </div>
        ))}
      </div>

      <FilterSheet 
        isOpen={isFilterOpen} 
        onSelect={(t) => { setFilter(t); setIsFilterOpen(false); }} 
        onClose={() => setIsFilterOpen(false)} 
      />

      <TransactionListSheet 
        isOpen={isListOpen}
        initialDate={selectedDate}
        initialType={selectedType}
        onClose={() => setIsListOpen(false)}
      />
    </div>
  );
};
