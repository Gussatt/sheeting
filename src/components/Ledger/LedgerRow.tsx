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
    if (bal < 0) return 'rgb(242, 109, 112)'; // #F26D70
    if (bal < 100) return 'rgb(252, 233, 181)'; // #FCE9B5
    return 'rgb(160, 220, 137)'; // #A0DC89
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
