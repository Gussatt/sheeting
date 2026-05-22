import React from 'react';
import { HorizonteCell } from './HorizonteCell';
import type { MonthProjection } from '../../utils/projection';

interface Props {
  projections: MonthProjection[];
}

export const HorizonteGrid: React.FC<Props> = ({ projections }) => {
  const maxDays = 31;

  return (
    <div className="horizonte-grid-container" style={{ display: 'flex', overflowX: 'auto', padding: '1rem', gap: '1rem' }}>
      {/* Labels Column */}
      <div style={{ display: 'flex', flexDirection: 'column', gap: '4px', paddingTop: '2.5rem' }}>
        {Array.from({ length: maxDays }, (_, i) => (
          <div key={i} style={{ height: '30px', display: 'flex', alignItems: 'center', fontSize: '0.8rem', opacity: 0.6 }}>
            {i + 1}
          </div>
        ))}
      </div>

      {/* Month Columns */}
      {projections.map((month) => (
        <div key={month.monthName} style={{ display: 'flex', flexDirection: 'column', gap: '4px', alignItems: 'center' }}>
          <span style={{ fontSize: '0.9rem', fontWeight: 'bold', marginBottom: '8px', height: '1.5rem' }}>{month.monthName}</span>
          {Array.from({ length: maxDays }, (_, i) => {
            const dayData = month.days.find(d => d.day === i + 1);
            return dayData ? (
              <HorizonteCell key={i} day={dayData.day} forecast={dayData.balance} />
            ) : (
              <div key={i} style={{ width: '30px', height: '30px' }} /> // Empty cell for short months
            );
          })}
        </div>
      ))}
    </div>
  );
};
