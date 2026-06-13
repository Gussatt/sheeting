import React from 'react';

interface TagTrapezoidProps {
  color: string;
  size?: number;
}

export const TagTrapezoid: React.FC<TagTrapezoidProps> = ({ color, size = 16 }) => {
  // SVG aspect ratio is 28:24 (approx 1.16:1)
  const width = size * 1.16;
  
  return (
    <svg 
      width={width} 
      height={size} 
      viewBox="0 0 28 24" 
      fill={color} 
      xmlns="http://www.w3.org/2000/svg"
      style={{ flexShrink: 0 }}
    >
      <path d="M4 8 Q4 6 6 6 H17 Q18 6 18.7 6.7 L23 11 Q24 12 23 13 L18.7 17.3 Q18 18 17 18 H6 Q4 18 4 16 Z"/>
    </svg>
  );
};
