import React from 'react';
import { View, Text, StyleSheet } from 'react-native';
import { useAppTheme } from '../../styles/theme';

interface HorizonteCellProps {
  day: number;
  balance: number;
}

export const HorizonteCell: React.FC<HorizonteCellProps> = ({ day, balance }) => {
  const { colors } = useAppTheme();
  
  const getCellColor = (val: number) => {
    if (val < 0) return colors.pink;
    if (val < 1000) return colors.yellow;
    return colors.lightGreen;
  };

  const formatBalance = (val: number) => {
    if (Math.abs(val) >= 1000) {
      return `${(val / 1000).toFixed(val % 1000 === 0 ? 0 : 2)}K`;
    }
    return val.toString();
  };

  return (
    <View style={[styles.container, { borderBottomColor: colors.border }]}>
      <View style={[styles.dayCol, { backgroundColor: colors.bg, borderRightColor: colors.border }]}>
        <Text style={[styles.dayText, { color: colors.textPrimary }]}>{day}</Text>
      </View>
      <View style={[styles.balanceCol, { backgroundColor: getCellColor(balance) }]}>
        <Text style={[styles.balanceText, { color: colors.bg }]}>
          {formatBalance(balance)}
        </Text>
      </View>
    </View>
  );
};

const styles = StyleSheet.create({
  container: {
    flexDirection: 'row',
    height: 36,
    borderBottomWidth: 1,
    width: '100%',
  },
  dayCol: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
    borderRightWidth: 1,
  },
  dayText: {
    fontSize: 14,
    fontWeight: '500',
  },
  balanceCol: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
  balanceText: {
    fontSize: 14,
    fontWeight: 'bold',
  }
});
