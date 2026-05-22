import React from 'react';
import { HorizonteCell } from './HorizonteCell';
import type { MonthProjection } from '../../utils/projection';

interface Props {
  projections: MonthProjection[];
}

export const HorizonteGrid: React.FC<Props> = ({ projections }) => {
  const maxDays = 31;

  return (
    <div className="horizonte-grid-container" style={{ 
      display: 'flex', 
      overflowX: 'auto', 
      gap: '1px', 
      backgroundColor: 'var(--color-border)',
      border: '1px solid var(--color-border)',
      WebkitOverflowScrolling: 'touch'
    }}>
      {projections.map((month, idx) => {
        // Simple logic to check if it's the current month for styling
        // Note: monthName is in format 'MMM/yy', we can parse it or pass a date object
        // For now, let's assume the first projection is the current month
        const isCurrentMonth = idx === 0;

        return (
          <div key={month.monthName} style={{ 
            display: 'flex', 
            flexDirection: 'column', 
            minWidth: '120px',
            backgroundColor: 'var(--color-bg)',
            flex: 1
          }}>
            <header style={{ 
              height: '40px', 
              display: 'flex', 
              alignItems: 'center', 
              justifyContent: 'center',
              backgroundColor: isCurrentMonth ? '#1a1a1a' : 'white',
              color: isCurrentMonth ? 'white' : 'black',
              fontWeight: 'bold',
              fontSize: '0.9rem',
              borderBottom: '1px solid var(--color-border)'
            }}>
              {month.monthName}
            </header>
            
            {Array.from({ length: maxDays }, (_, i) => {
              const dayData = month.days.find(d => d.day === i + 1);
              if (dayData) {
                return (
                  <HorizonteCell 
                    key={i} 
                    day={dayData.day} 
                    balance={dayData.balance} 
                  />
                );
              }
              return (
                <div key={i} style={{ 
                  height: '32px', 
                  borderBottom: '1px solid var(--color-border)',
                  backgroundColor: 'rgba(255,255,255,0.05)' 
                }} />
              );
            })}
          </div>
        );
      })}
    </div>
  );
};
