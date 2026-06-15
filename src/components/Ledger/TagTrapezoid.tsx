import React from 'react';
import Svg, { Polygon } from 'react-native-svg';

interface TagTrapezoidProps {
  color: string;
  size?: number;
}

export const TagTrapezoid: React.FC<TagTrapezoidProps> = ({ color, size = 16 }) => {
  const width = size * 1.33; // maintaining aspect ratio
  
  return (
    <Svg width={width} height={size} viewBox="0 0 100 75" style={{ flexShrink: 0 }}>
      <Polygon points="0,0 75,0 100,37.5 75,75 0,75" fill={color} />
    </Svg>
  );
};
