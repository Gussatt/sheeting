import React, { useLayoutEffect } from 'react';
import { View, Text, Pressable, StyleSheet, LayoutAnimation, LayoutChangeEvent } from 'react-native';
import type { Transaction } from '../../db/db';
import { isWeekend, isToday } from 'date-fns';
import { useAppTheme } from '../../styles/theme';
import { TypeIcon, type TransactionType } from './TypeIcon';

interface CellProps {
  type: TransactionType;
  total: number;
  transactions: Transaction[];
  onClick: (type: TransactionType, txs: Transaction[]) => void;
  onLongPress: (type: TransactionType) => void;
}

const LedgerCell: React.FC<CellProps> = ({ type, total, transactions, onClick, onLongPress }) => {
  const { colors } = useAppTheme();
  const isVirtual = transactions.some(t => t.id.startsWith('virtual-'));

  return (
    <Pressable 
      onPress={() => onClick(type, transactions)}
      onLongPress={() => onLongPress(type)}
      style={[
        styles.cellContainer, 
        { opacity: (total === 0) ? 0.3 : 1 }
      ]}
    >
      <View style={styles.cellLeft}>
        <TypeIcon type={type} />
      </View>
      <Text style={{ 
        color: (type === 'income' && total > 0) ? colors.green : colors.textPrimary,
        fontSize: 16
      }}>
        R$ {total.toLocaleString('pt-BR', { minimumFractionDigits: 2 })}
      </Text>
    </Pressable>
  );
};
export { type TransactionType } from './TypeIcon';

interface LedgerRowProps {
  date: Date;
  transactions: Transaction[];
  balance: number;
  isCheckedIn: boolean;
  filter: string;
  onCellClick: (type: TransactionType, txs: Transaction[]) => void;
  onCellLongPress: (type: TransactionType) => void;
  onLayout?: (event: LayoutChangeEvent) => void;
}

export const LedgerRow: React.FC<LedgerRowProps> = ({
  date,
  transactions,
  balance,
  isCheckedIn,
  filter,
  onCellClick,
  onCellLongPress,
  onLayout
}) => {
  const { colors, isDark } = useAppTheme();

  useLayoutEffect(() => {
    LayoutAnimation.configureNext(LayoutAnimation.Presets.easeInEaseOut);
  }, [filter]);

  const getBalanceBgColor = (bal: number) => {
    if (bal < 100) return colors.red;
    if (bal < 500) return colors.yellow;
    return colors.green;
  };

  const types: TransactionType[] = ['income', 'expense', 'daily', 'savings', 'credit'];
  const activeTypes = filter === 'all' ? types : [filter as TransactionType];
  const isWeekendRow = isWeekend(date);
  const isTodayRow = isToday(date);
  const isSingleFilter = filter !== 'all';

  return (
    <View 
      onLayout={onLayout}
      style={[styles.rowContainer, { 
      backgroundColor: isWeekendRow ? colors.surface : 'transparent',
      borderBottomColor: colors.border
    }]}>
      {/* Date Column */}
      <View style={[styles.dateCol, {
        backgroundColor: isTodayRow ? colors.primary : 'transparent',
        borderRightColor: colors.border,
        alignItems: 'center',
        justifyContent: isSingleFilter ? 'center' : 'flex-start',
        paddingTop: isSingleFilter ? 0 : 10,
      }]}>
        <Text style={[styles.dateText, {
          color: isTodayRow ? colors.bg : colors.textPrimary,
        }]}>
          {date.getDate()}
        </Text>
        {isCheckedIn && (
          <View style={[styles.checkDot, { backgroundColor: isTodayRow ? colors.bg : colors.textPrimary }]} />
        )}
      </View>

      {/* Data Column */}
      <View style={styles.dataCol}>
        {activeTypes.map((type, idx) => {
          const typeTransactions = transactions.filter(t => t.type === type);
          const total = typeTransactions.reduce((sum, t) => sum + Number(t.amount), 0);
          return (
            <View
              key={type}
              style={[styles.dataCellWrapper, {
                borderBottomWidth: idx < activeTypes.length - 1 ? 1 : 0,
                borderBottomColor: colors.border
              }]}
            >
              <LedgerCell
                type={type}
                total={total}
                transactions={typeTransactions}
                onClick={onCellClick}
                onLongPress={onCellLongPress}
              />
            </View>
          );
        })}
      </View>

      {/* Balance Column */}
      <View style={[styles.balanceCol, {
        backgroundColor: getBalanceBgColor(balance),
        alignItems: isSingleFilter ? 'center' : 'flex-end',
        paddingTop: isSingleFilter ? 0 : 10,
      }]}>
        <Text style={styles.balanceText}>
          R$ {balance.toLocaleString('pt-BR', { minimumFractionDigits: 2 })}
        </Text>
      </View>
    </View>
  );
};

const styles = StyleSheet.create({
  cellContainer: {
    flexDirection: 'row',
    justifyContent: 'space-between',
    alignItems: 'center',
    paddingVertical: 10,
    paddingHorizontal: 16,
    flex: 1,
  },
  cellLeft: {
    flexDirection: 'row',
    alignItems: 'center',
    gap: 10,
  },
  rowContainer: {
    flexDirection: 'row',
    borderBottomWidth: 1,
    minHeight: 48,
  },
  dateCol: {
    width: '12%',
    position: 'relative',
    borderRightWidth: 1,
  },
  dateText: {
    fontSize: 19,
    fontWeight: '600',
    textAlign: 'center',
    width: '100%',
  },
  checkDot: {
    position: 'absolute',
    top: 4,
    right: 4,
    width: 6,
    height: 6,
    borderRadius: 3,
  },
  dataCol: {
    flex: 1,
    flexDirection: 'column',
  },
  dataCellWrapper: {
    flex: 1,
  },
  balanceCol: {
    width: '44%',
    justifyContent: 'center',
    alignItems: 'flex-end',
    paddingRight: 16,
  },
  balanceText: {
    color: 'white',
    fontWeight: 'bold',
    fontSize: 17,
    textAlign: 'right',
    width: '100%',
  }
});
