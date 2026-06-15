import React from 'react';
import { StyleSheet } from 'react-native';
import Svg, { Polygon } from 'react-native-svg';

interface TagTrapezoidProps {
  color: string;
  size?: number;
}

const styles = StyleSheet.create({
  svg: { flexShrink: 0 }
});

export const TagTrapezoid: React.FC<TagTrapezoidProps> = ({ color, size = 16 }) => {
  const width = size * 1.33; // maintaining aspect ratio
  
  return (
    <Svg width={width} height={size} viewBox="0 0 100 75" style={styles.svg}>
      <Polygon points="0,0 75,0 100,37.5 75,75 0,75" fill={color} />
    </Svg>
  );
};
