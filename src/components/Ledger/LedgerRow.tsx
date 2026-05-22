import React from 'react';
import { ArrowDownLeft, ArrowUpRight, CirclePlay, Landmark, CreditCard, Check } from 'lucide-react';
import type { Transaction } from '../../db/db';
import { useLongPress } from '../../hooks/useLongPress';
import { isWeekend } from 'date-fns';

export type TransactionType = 'income' | 'expense' | 'daily' | 'savings' | 'credit';

interface CellProps {
  type: TransactionType;
  total: number;
  transactions: Transaction[];
  onClick: (type: TransactionType, txs: Transaction[]) => void;
  onLongPress: (type: TransactionType) => void;
}

const TypeIcon = ({ type, size = 18 }: { type: TransactionType; size?: number }) => {
  switch (type) {
    case 'income': return <ArrowDownLeft size={size} color="var(--status-green)" />;
    case 'expense': return <ArrowUpRight size={size} color="var(--status-red)" />;
    case 'daily': return <CirclePlay size={size} color="var(--status-pink)" />;
    case 'savings': return <Landmark size={size} color="var(--status-light-green)" />;
    case 'credit': return <CreditCard size={size} color="var(--status-purple)" />;
    default: return null;
  }
};

const LedgerCell: React.FC<CellProps> = ({ type, total, transactions, onClick, onLongPress }) => {
  const handlers = useLongPress(
    () => onClick(type, transactions),
    () => onLongPress(type)
  );

  return (
    <div 
      {...handlers}
      style={{ 
        display: 'flex', 
        alignItems: 'center', 
        gap: '12px', 
        height: '36px',
        cursor: 'pointer',
        padding: '0 8px',
        opacity: total === 0 ? 0.3 : 1,
        transition: 'opacity 0.2s',
      }}
    >
      <TypeIcon type={type} />
      <span style={{ fontSize: '0.95rem', flex: 1, color: 'var(--color-text-primary)' }}>
        R$ {total.toLocaleString('pt-BR', { minimumFractionDigits: 2 })}
      </span>
    </div>
  );
};

interface LedgerRowProps {
  date: Date;
  transactions: Transaction[];
  balance: number;
  isCheckedIn: boolean;
  filter: string;
  onCellClick: (type: TransactionType, txs: Transaction[]) => void;
  onCellLongPress: (type: TransactionType) => void;
}

export const LedgerRow: React.FC<LedgerRowProps> = ({ 
  date, 
  transactions, 
  balance, 
  isCheckedIn, 
  filter,
  onCellClick,
  onCellLongPress
}) => {
  const getBalanceBgColor = (bal: number) => {
    if (bal < 100) return 'var(--status-red)';
    if (bal < 500) return 'var(--status-yellow)';
    return 'var(--status-green)';
  };

  const types: TransactionType[] = ['income', 'expense', 'daily', 'savings', 'credit'];
  const activeTypes = filter === 'all' ? types : [filter as TransactionType];
  const isWeekendRow = isWeekend(date);

  return (
    <div 
      data-testid="ledger-row" 
      style={{ 
        display: 'grid', 
        gridTemplateColumns: '50px 1fr 100px', 
        minHeight: '44px',
        borderBottom: '1px solid var(--color-border)',
        backgroundColor: isWeekendRow ? 'var(--color-weekend-bg)' : 'var(--color-bg)'
      }}
    >
      {/* Day Column */}
      <div style={{ 
        display: 'flex', 
        alignItems: 'center', 
        justifyContent: 'center', 
        position: 'relative',
        fontSize: '1.1rem',
        fontWeight: '500',
        color: 'var(--color-text-primary)'
      }}>
        {date.getDate()}
        {isCheckedIn && (
          <div style={{ 
            position: 'absolute', 
            top: '4px', 
            right: '4px', 
            background: 'var(--status-green)', 
            borderRadius: '2px',
            padding: '1px'
          }}>
            <Check size={8} color="white" strokeWidth={4} />
          </div>
        )}
      </div>

      {/* Data Column */}
      <div style={{ display: 'flex', flexDirection: 'column', borderLeft: '1px solid var(--color-border)' }}>
        {activeTypes.map((type, idx) => {
          const typeTransactions = transactions.filter(t => t.type === type);
          const total = typeTransactions.reduce((sum, t) => sum + Number(t.amount), 0);
          return (
            <div key={type} style={{ borderBottom: idx < activeTypes.length - 1 ? '1px solid var(--color-border)' : 'none' }}>
              <LedgerCell 
                type={type}
                total={total}
                transactions={typeTransactions}
                onClick={onCellClick}
                onLongPress={onCellLongPress}
              />
            </div>
          );
        })}
      </div>

      {/* Balance Column */}
      <div style={{ 
        backgroundColor: getBalanceBgColor(balance),
        display: 'flex',
        alignItems: 'center',
        justifyContent: 'center',
        color: 'white',
        fontWeight: '600',
        fontSize: '0.9rem',
        padding: '0 8px',
        textAlign: 'center'
      }}>
        R$ {balance.toLocaleString('pt-BR', { minimumFractionDigits: 2 })}
      </div>
    </div>
  );
};
