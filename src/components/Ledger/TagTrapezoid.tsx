import React from 'react';

interface TagTrapezoidProps {
  color: string;
  size?: number;
}

export const TagTrapezoid: React.FC<TagTrapezoidProps> = ({ color, size = 16 }) => {
  return (
    <div 
      style={{ 
        width: `${size}px`, 
        height: `${size * 0.75}px`, 
        backgroundColor: color, 
        clipPath: 'polygon(0% 0%, 75% 0%, 100% 50%, 75% 100%, 0% 100%)',
        flexShrink: 0
      }} 
    />
  );
};
