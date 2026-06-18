import React from 'react';
import { View, StyleSheet } from 'react-native';
import { useAppTheme } from '../../styles/theme';

interface Props {
  balances: number[];
}

const getColor = (bal: number, colors: any) => {
  if (bal < 100) return colors.red;
  if (bal < 500) return colors.yellow;
  return colors.green;
};

export const HorizonteGridButton = ({ balances }: Props) => {
  const { colors } = useAppTheme();
  const cells = balances.slice(0, 9);

  return (
    <View style={styles.grid}>
      {Array.from({ length: 9 }).map((_, i) => (
        <View
          key={i}
          style={[
            styles.cell,
            { backgroundColor: cells[i] !== undefined ? getColor(cells[i], colors) : colors.surface }
          ]}
        />
      ))}
    </View>
  );
};

const styles = StyleSheet.create({
  grid: {
    width: 26,
    height: 26,
    flexDirection: 'row',
    flexWrap: 'wrap',
    gap: 1,
    borderRadius: 5,
    overflow: 'hidden',
  },
  cell: {
    width: 8,
    height: 8,
  },
});
