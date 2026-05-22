import React from 'react';

interface HorizonteCellProps {
  day: number;
  balance: number;
}

export const HorizonteCell: React.FC<HorizonteCellProps> = ({ day, balance }) => {
  const getCellColor = (val: number) => {
    if (val < 0) return 'var(--status-pink)';
    if (val < 1000) return 'var(--status-yellow)';
    return 'var(--status-light-green)';
  };

  const formatBalance = (val: number) => {
    if (Math.abs(val) >= 1000) {
      return `${(val / 1000).toFixed(val % 1000 === 0 ? 0 : 2)}K`;
    }
    return val.toString();
  };

  return (
    <div 
      style={{ 
        display: 'grid',
        gridTemplateColumns: '35px 1fr',
        height: '32px',
        borderBottom: '1px solid var(--color-border)',
        width: '100%',
        fontSize: '0.85rem'
      }}
    >
      <div style={{ 
        display: 'flex', 
        alignItems: 'center', 
        justifyContent: 'center',
        backgroundColor: 'var(--color-bg)',
        color: 'var(--color-text-primary)',
        borderRight: '1px solid var(--color-border)'
      }}>
        {day}
      </div>
      <div 
        data-testid="horizonte-cell"
        style={{ 
          backgroundColor: getCellColor(balance), 
          display: 'flex', 
          alignItems: 'center', 
          justifyContent: 'center',
          fontWeight: '500',
          color: 'var(--color-bg)' // Dark text on status colors
        }}
      >
        {formatBalance(balance)}
      </div>
    </div>
  );
};
