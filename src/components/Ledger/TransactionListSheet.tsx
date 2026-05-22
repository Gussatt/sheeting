import React, { useState, useMemo } from 'react';
import { ArrowDownLeft, ArrowUpRight, CirclePlay, Landmark, CreditCard, ChevronLeft, ChevronRight, Plus } from 'lucide-react';
import { useSQL, type Transaction } from '../../db/db';
import { useNavigate } from 'react-router-dom';
import { format, addDays } from 'date-fns';
import { FilterSheet, type FilterType } from './FilterSheet';
import { motion, AnimatePresence } from 'framer-motion';

interface TransactionListSheetProps {
  isOpen: boolean;
  initialDate: Date;
  initialType: FilterType;
  onClose: () => void;
}

const TypeIcon = ({ type }: { type: string }) => {
  const size = 20;
  switch (type) {
    case 'income': return <ArrowDownLeft size={size} color="var(--status-green)" />;
    case 'expense': return <ArrowUpRight size={size} color="var(--status-red)" />;
    case 'daily': return <CirclePlay size={size} color="var(--status-pink)" />;
    case 'savings': return <Landmark size={size} color="var(--status-light-green)" />;
    case 'credit': return <CreditCard size={size} color="var(--status-purple)" />;
    default: return null;
  }
};

export const TransactionListSheet: React.FC<TransactionListSheetProps> = ({ isOpen, initialDate, initialType, onClose }) => {
  const navigate = useNavigate();
  const [currentDate, setCurrentDate] = useState(initialDate);
  const [filter, setFilter] = useState<FilterType>(initialType);
  const [isFilterOpen, setIsFilterOpen] = useState(false);

  useMemo(() => {
    if (isOpen) {
      setCurrentDate(initialDate);
      setFilter(initialType);
    }
  }, [isOpen, initialDate, initialType]);

  const dateStr = currentDate.toISOString().split('T')[0];
  
  const dayTransactions = useSQL<Transaction>(
    `SELECT * FROM transactions WHERE date(date) = date($1) ORDER BY date ASC`,
    useMemo(() => [currentDate.toISOString()], [currentDate])
  );

  const filteredTransactions = filter === 'all' 
    ? dayTransactions 
    : dayTransactions.filter(t => t.type === filter);

  const changeDay = (offset: number) => {
    setCurrentDate(prev => addDays(prev, offset));
  };

  const getFilterLabel = (t: FilterType) => {
    const labels: Record<FilterType, string> = {
      all: 'Todas', income: 'Entradas', expense: 'Saídas', 
      daily: 'Diários', savings: 'Economias', credit: 'Gastos com cartão'
    };
    return labels[t];
  };

  return (
    <AnimatePresence>
      {isOpen && (
        <>
          <motion.div 
            initial={{ opacity: 0 }}
            animate={{ opacity: 1 }}
            exit={{ opacity: 0 }}
            className="overlay" 
            onClick={onClose} 
            style={{ zIndex: 2500 }}
          />
          <motion.div 
            initial={{ y: '100%' }}
            animate={{ y: 0 }}
            exit={{ y: '100%' }}
            transition={{ type: 'spring', damping: 25, stiffness: 200 }}
            className="filter-sheet" 
            style={{ height: '90vh', display: 'flex', flexDirection: 'column', zIndex: 3000 }}
          >
            <header style={{ display: 'flex', justifyContent: 'space-between', alignItems: 'center', marginBottom: '1rem' }}>
              <button onClick={onClose} style={{ background: 'none', border: 'none', color: 'var(--color-text-secondary)' }}>
                <ChevronLeft size={24} />
              </button>
              
              <div style={{ display: 'flex', alignItems: 'center', gap: '1rem' }}>
                <button onClick={() => changeDay(-1)} style={{ background: 'none', border: 'none', color: 'var(--color-text-primary)' }}><ChevronLeft size={20}/></button>
                <span style={{ fontWeight: '600', fontSize: '1.1rem' }}>{format(currentDate, 'dd/MM')}</span>
                <button onClick={() => changeDay(1)} style={{ background: 'none', border: 'none', color: 'var(--color-text-primary)' }}><ChevronRight size={20}/></button>
              </div>

              <button 
                onClick={() => navigate(`/add?type=${filter === 'all' ? 'expense' : filter}&date=${dateStr}`)}
                style={{ background: 'none', border: 'none', color: 'var(--color-text-secondary)' }}
              >
                <Plus size={24} />
              </button>
            </header>

            <div style={{ padding: '0.5rem 0', marginBottom: '1rem' }}>
              <button 
                onClick={() => setIsFilterOpen(true)}
                style={{
                  display: 'flex',
                  alignItems: 'center',
                  gap: '0.5rem',
                  background: 'none',
                  border: '1px solid var(--color-border)',
                  padding: '6px 16px',
                  borderRadius: '20px',
                  color: 'var(--status-light-green)',
                  fontSize: '0.9rem',
                  fontWeight: '500'
                }}
              >
                <TypeIcon type={filter === 'all' ? 'income' : filter} />
                <span>{getFilterLabel(filter)}</span>
                <ChevronRight size={14} style={{ transform: 'rotate(90deg)', opacity: 0.6 }} />
              </button>
            </div>
            
            <div style={{ flex: 1, overflowY: 'auto' }}>
              {filteredTransactions.length === 0 ? (
                <div style={{ textAlign: 'center', marginTop: '4rem', opacity: 0.5 }}>
                  Nenhuma transação para este filtro.
                </div>
              ) : (
                <ul className="filter-sheet-list">
                  {filteredTransactions.map((tx) => (
                    <li key={tx.id} style={{ borderBottom: '1px solid var(--color-border)' }}>
                      <button 
                        className="filter-sheet-item" 
                        onClick={() => {
                          navigate(`/edit/${tx.id}`);
                          onClose();
                        }}
                        style={{ 
                          padding: '1rem 0',
                          borderRadius: 0,
                          justifyContent: 'space-between'
                        }}
                      >
                        <div style={{ display: 'flex', alignItems: 'center', gap: '1rem' }}>
                          <TypeIcon type={tx.type} />
                          <div style={{ display: 'flex', flexDirection: 'column' }}>
                            <span style={{ fontWeight: '500' }}>{tx.type.charAt(0).toUpperCase() + tx.type.slice(1)}</span>
                            <span style={{ fontSize: '0.75rem', color: 'var(--color-text-secondary)' }}>{format(new Date(tx.date), 'dd/MM')}</span>
                          </div>
                        </div>
                        <div style={{ display: 'flex', flexDirection: 'column', alignItems: 'flex-end' }}>
                          <span style={{ fontWeight: 'bold', color: 'var(--color-text-primary)' }}>
                            R$ {Number(tx.amount).toLocaleString('pt-BR', { minimumFractionDigits: 2 })}
                          </span>
                          <span style={{ fontSize: '0.75rem', color: 'var(--color-text-secondary)' }}>{tx.description || getFilterLabel(tx.type as any)}</span>
                        </div>
                      </button>
                    </li>
                  ))}
                </ul>
              )}
            </div>

            <button 
              onClick={onClose}
              style={{ width: '100%', padding: '1rem', background: 'none', border: 'none', color: 'var(--color-text-secondary)', fontSize: '1rem' }}
            >
              Fechar
            </button>

            <FilterSheet 
              isOpen={isFilterOpen}
              onSelect={(t) => { setFilter(t); setIsFilterOpen(false); }}
              onClose={() => setIsFilterOpen(false)}
            />
          </motion.div>
        </>
      )}
    </AnimatePresence>
  );
};
