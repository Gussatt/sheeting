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
        gridTemplateColumns: '1fr 1fr',
        height: '36px',
        borderBottom: '1px solid var(--color-border)',
        width: '100%',
        fontSize: '0.9rem'
      }}
    >
      <div style={{ 
        display: 'flex', 
        alignItems: 'center', 
        justifyContent: 'center',
        backgroundColor: 'var(--color-bg)',
        color: 'var(--color-text-primary)',
        borderRight: '1px solid var(--color-border)',
        fontWeight: '500'
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
          fontWeight: 'bold',
          color: 'var(--color-bg)' // Dark text on status colors
        }}
      >
        {formatBalance(balance)}
      </div>
    </div>
  );
};
