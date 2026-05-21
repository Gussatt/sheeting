// src/components/Ledger/HorizonteCell.tsx
import React from 'react';

interface HorizonteCellProps {
  day: number;
  forecast: number;
}

export const HorizonteCell: React.FC<HorizonteCellProps> = ({ day, forecast }) => {
  const getCellColor = (val: number) => {
    if (val < 0) return 'rgb(248, 190, 191)'; // #F8BEBF - Pink/Light Red
    if (val < 100) return 'rgb(252, 233, 181)'; // #FCE9B5 - Yellow
    return 'rgb(149, 253, 184)'; // #95FDB8 - Light Green
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
