// src/components/Ledger/HorizonteCell.tsx
import React from 'react';

interface HorizonteCellProps {
  day: number;
  forecast: number;
}

export const HorizonteCell: React.FC<HorizonteCellProps> = ({ day, forecast }) => {
  const getCellColor = (val: number) => {
    if (val < 0) return 'var(--status-pink)';
    if (val < 100) return 'var(--status-yellow)';
    return 'var(--status-light-green)';
  };

  return (
    <div 
      data-testid="horizonte-cell" 
      style={{ 
        backgroundColor: getCellColor(forecast), 
        width: '30px', 
        height: '30px', 
        display: 'flex', 
        alignItems: 'center', 
        justifyContent: 'center' 
      }}
    >
      {day}
    </div>
  );
};
