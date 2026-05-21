import React from 'react';

interface LedgerRowProps {
  day: number;
  type: 'income' | 'expense' | 'daily' | 'savings' | 'credit';
  total: number;
  balance: number;
  isCheckedIn: boolean;
}

export const LedgerRow: React.FC<LedgerRowProps> = ({ day, type, total, balance, isCheckedIn }) => {
  const getBgColor = (bal: number) => {
    if (bal < 0) return 'var(--status-red)';
    if (bal < 100) return 'var(--status-yellow)';
    return 'var(--status-green)';
  };

  return (
    <div data-testid="ledger-row" style={{ display: 'flex', backgroundColor: getBgColor(balance), padding: '8px' }}>
      <div>{day} {isCheckedIn && '✅'}</div>
      <div>{type}</div>
      <div>R$ {total.toFixed(2)}</div>
      <div>R$ {balance.toFixed(2)}</div>
    </div>
  );
};
