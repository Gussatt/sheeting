import React from 'react';
import { View, Text, StyleSheet, Pressable } from 'react-native';
import Svg, { Path, Polyline } from 'react-native-svg';
import { useAppTheme } from '../../styles/theme';

interface HorizonteCellProps {
  day: number;
  balance: number;
  isChecked?: boolean;
  onToggle?: () => void;
}

export const HorizonteCell: React.FC<HorizonteCellProps> = ({
  day,
  balance,
  isChecked,
  onToggle,
}) => {
  const { colors } = useAppTheme();

  const getCellColor = (val: number) => {
    if (val < 0) return colors.pink;
    if (val < 1000) return colors.yellow;
    return colors.lightGreen;
  };

  const formatBalance = (val: number) => {
    if (Math.abs(val) >= 1000) {
      const k = val / 1000;
      return `${k.toLocaleString('pt-BR', { minimumFractionDigits: 0, maximumFractionDigits: 1 })}K`;
    }
    return val.toLocaleString('pt-BR', { minimumFractionDigits: 2, maximumFractionDigits: 2 });
  };

  return (
    <View style={[styles.container, { borderBottomColor: colors.border }]}>
      <Pressable
        onPress={onToggle}
        style={[styles.dayCol, { backgroundColor: colors.bg, borderRightColor: colors.border }]}
      >
        <Text style={[styles.dayText, { color: colors.textPrimary }]}>{day}</Text>
        {isChecked && (
          <View style={styles.badgeContainer}>
            <Svg width={14} height={14} viewBox="0 0 14 14">
              <Path d="M0,0 L14,0 L14,14 Z" fill={colors.green} />
              <Polyline
                points="5,3 7,6 11,1"
                fill="none"
                stroke="#fff"
                strokeWidth={1.5}
                strokeLinecap="round"
                strokeLinejoin="round"
              />
            </Svg>
          </View>
        )}
      </Pressable>
      <View style={[styles.balanceCol, { backgroundColor: getCellColor(balance) }]}>
        <Text style={[styles.balanceText, { color: colors.bg }]}>{formatBalance(balance)}</Text>
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
    position: 'relative' as const,
  },
  dayText: {
    fontSize: 14,
    fontWeight: '500',
  },
  badgeContainer: {
    position: 'absolute' as const,
    top: 0,
    right: 0,
  },
  balanceCol: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
  balanceText: {
    fontSize: 14,
    fontWeight: 'bold',
  },
});
