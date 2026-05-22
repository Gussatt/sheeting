import React from 'react';
import { ArrowDownLeft, ArrowUpRight, CirclePlay, Landmark, CreditCard } from 'lucide-react';
import type { Transaction } from '../../db/db';
import { useLongPress } from '../../hooks/useLongPress';
import { isWeekend } from 'date-fns';

import { useTheme } from '../../context/ThemeContext';
import checkinIcon from '../../assets/checkin.svg';
import checkinNightIcon from '../../assets/checkin_night.svg';

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
        justifyContent: 'space-between',
        height: '40px',
        cursor: 'pointer',
        padding: '0 12px',
        opacity: total === 0 ? 0.3 : 1,
        transition: 'opacity 0.2s',
      }}
    >
      <TypeIcon type={type} size={20} />
      <span style={{ 
        fontSize: '1rem', 
        fontWeight: '500',
        color: 'var(--color-text-primary)',
        textAlign: 'right',
        whiteSpace: 'nowrap',
        overflow: 'hidden',
        textOverflow: 'ellipsis',
        flexShrink: 0
      }}>
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
  const { theme } = useTheme();

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
        gridTemplateColumns: '50px 1fr 1fr', 
        minHeight: '48px',
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
        fontSize: '1.2rem',
        fontWeight: '600',
        color: 'var(--color-text-primary)',
        borderRight: '1px solid var(--color-border)'
      }}>
        {date.getDate()}
        {isCheckedIn && (
          <img 
            src={theme === 'dark' ? checkinNightIcon : checkinIcon} 
            alt="checked"
            style={{ 
              position: 'absolute', 
              top: '2px', 
              right: '2px', 
              width: '16px',
              height: '16px'
            }} 
          />
        )}
      </div>

      {/* Data Column */}
      <div style={{ display: 'flex', flexDirection: 'column' }}>
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
        alignItems: 'flex-start',
        justifyContent: 'flex-end',
        color: 'white',
        fontWeight: '700',
        fontSize: '1rem',
        padding: '8px 12px',
        textAlign: 'right',
        whiteSpace: 'nowrap',
        overflow: 'hidden'
      }}>
        R$ {balance.toLocaleString('pt-BR', { minimumFractionDigits: 2 })}
      </div>
    </div>
  );
};
