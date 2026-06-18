import React, { useState, useMemo, useCallback, useRef, useEffect } from 'react';
import { View, Text, StyleSheet, Pressable, ScrollView } from 'react-native';
import { useSQL, db, type Transaction, type BudgetCategory } from '../../src/db/db';
import { format, startOfMonth, endOfMonth, eachDayOfInterval, isSameDay, isToday, startOfDay, isAfter } from 'date-fns';
import { LedgerRow, type TransactionType } from '../../src/components/Ledger/LedgerRow';
import { FilterSheet } from '../../src/components/Ledger/FilterSheet';
import type { FilterType } from '../../src/components/Ledger/FilterSheet';
import { ChevronLeft, ChevronRight, ChevronDown } from 'lucide-react-native';
import { useRouter } from 'expo-router';
import { useSafeAreaInsets } from 'react-native-safe-area-context';
import { HorizonteGridButton } from '../../src/components/Ledger/HorizonteGridButton';
import { useFilteredTransactions } from '../../src/hooks/useFilteredTransactions';
import { useTheme } from '../../src/context/ThemeContext';
import { useLanguage } from '../../src/context/LanguageContext';
import { TypeIcon } from '../../src/components/Ledger/TypeIcon';
import { calculateDailyBudget } from '../../src/utils/budgetCalc';
import { useAppTheme } from '../../src/styles/theme';

export default function LedgerScreen() {
  const { theme } = useTheme();
  const { colors, isDark } = useAppTheme();
  const { t } = useLanguage();
  const router = useRouter();
  const insets = useSafeAreaInsets();
  
  const [currentDate, setCurrentDate] = useState(new Date());
  const [filter, setFilter] = useState<FilterType>('all');
  const [isFilterOpen, setIsFilterOpen] = useState(false);
  const [shouldScrollToToday, setShouldScrollToToday] = useState(false);
  const scrollViewRef = useRef<ScrollView>(null);
  const todayRowY = useRef<number>(0);

  const monthStart = startOfMonth(currentDate);
  const monthEnd = endOfMonth(currentDate);
  const daysInMonth = useMemo(() => eachDayOfInterval({ start: monthStart, end: monthEnd }), [monthStart, monthEnd]);

  const transactions = useSQL<Transaction>(
    `SELECT * FROM transactions 
     WHERE date >= ? AND date <= ? 
     ORDER BY date ASC`,
    useMemo(() => [monthStart.toISOString(), monthEnd.toISOString()], [monthStart, monthEnd])
  );

  const filteredTransactions = useFilteredTransactions(transactions, 'calcSaldos');
  const statuses = useSQL<{ date: string, isChecked: boolean }>(`SELECT * FROM daily_status`);
  const categories = useSQL<BudgetCategory>('SELECT * FROM budget_categories');
  const { daily: dailyPredictionValue } = calculateDailyBudget(categories, 30);

  const dailyData = useMemo(() => {
    let runningBalance = 0;
    const result = [];
    const today = startOfDay(new Date());
    
    for (const date of daysInMonth) {
      const dateStr = date.toISOString().split('T')[0];
      let dayTransactions = filteredTransactions.filter(t => isSameDay(new Date(t.date), date));
      const status = statuses.find(s => s.date === dateStr);
      
      const isFuture = isAfter(startOfDay(date), today);
      const hasRealDaily = dayTransactions.some(t => t.type === 'daily');
      const virtualDaily = (isFuture && !hasRealDaily) ? dailyPredictionValue : 0;

      if (virtualDaily > 0) {
        dayTransactions = [
          ...dayTransactions,
          {
            id: `virtual-${dateStr}`,
            amount: virtualDaily,
            type: 'daily',
            date: date.toISOString(),
            description: 'Previsão de diário'
          } as Transaction
        ];
      }

      const dayTotalAll = dayTransactions.reduce((sum, t) => {
        const amount = Number(t.amount);
        if (t.type === 'income') return sum + amount;
        return sum - amount;
      }, 0);
      
      runningBalance += dayTotalAll;

      result.push({
        date,
        dayTransactions,
        balance: runningBalance,
        isChecked: status?.isChecked || false
      });
    }
    return result;
  }, [daysInMonth, filteredTransactions, statuses, dailyPredictionValue]);

  const futureBalances = useMemo(() => {
    if (dailyData.length === 0) return [];
    const lastEntry = dailyData[dailyData.length - 1];
    let balance = lastEntry.balance;
    const result: number[] = [balance];
    for (let i = 1; i < 9; i++) {
      balance -= dailyPredictionValue;
      result.push(balance);
    }
    return result;
  }, [dailyData, dailyPredictionValue]);

  const handleCellClick = useCallback((type: TransactionType, date: Date) => {
    const dateStr = date.toISOString().split('T')[0];
    router.push(`/transactions?type=${type}&date=${dateStr}`);
  }, [router]);

  const handleCellLongPress = useCallback((type: TransactionType, date: Date) => {
    const dateStr = date.toISOString().split('T')[0];
    router.push(`/add?type=${type}&date=${dateStr}`);
  }, [router]);

  const changeMonth = (offset: number) => {
    const next = new Date(currentDate);
    next.setMonth(currentDate.getMonth() + offset);
    setCurrentDate(next);
  };

  const getFilterLabel = (type: FilterType) => {
    const labels: Record<FilterType, string> = {
      all: t('filter.all'), income: t('filter.income'), expense: t('filter.expense'), 
      daily: 'Diário', savings: 'Economia', credit: 'Cartão'
    };
    return labels[type];
  };

  const jumpToToday = () => {
    setCurrentDate(new Date());
    setShouldScrollToToday(true);
  };

  useEffect(() => {
    if (shouldScrollToToday) {
      // Small delay to allow layout to settle after month change
      const timer = setTimeout(() => {
        scrollViewRef.current?.scrollTo({ y: todayRowY.current, animated: true });
        setShouldScrollToToday(false);
      }, 100);
      return () => clearTimeout(timer);
    }
  }, [shouldScrollToToday, dailyData]);

  const formatMonth = (date: Date) => {
    const formatted = format(date, 'MMM/yy');
    return formatted.charAt(0).toUpperCase() + formatted.slice(1);
  };

  return (
    <View style={[styles.container, { backgroundColor: colors.bg, paddingTop: insets.top }]}>
      <View style={[styles.header, { backgroundColor: colors.bg, borderBottomColor: colors.border }]}>
        <Pressable onPress={jumpToToday} style={styles.todayContainer}>
          <View style={styles.calendarIcon}>
            {/* Calendar top bar with pins */}
            <View style={[styles.calendarTop, { backgroundColor: colors.textPrimary }]}>
              <View style={[styles.calendarPin, { backgroundColor: colors.bg }]} />
              <View style={[styles.calendarPin, { backgroundColor: colors.bg }]} />
            </View>
            {/* Calendar body with day number */}
            <View style={[styles.calendarBody, { borderColor: colors.textPrimary }]}>
              <Text style={[styles.calendarDay, { color: colors.textPrimary }]}>
                {new Date().getDate()}
              </Text>
            </View>
          </View>
        </Pressable>

        <View style={styles.monthSelector}>
          <Pressable onPress={() => changeMonth(-1)}>
            <ChevronLeft size={24} color={colors.textPrimary} />
          </Pressable>
          <Text style={[styles.monthText, { color: colors.textPrimary }]}>{formatMonth(currentDate)}</Text>
          <Pressable onPress={() => changeMonth(1)}>
            <ChevronRight size={24} color={colors.textPrimary} />
          </Pressable>
        </View>

        <Pressable onPress={() => router.push('/horizonte')} style={{ padding: 4 }}>
          <HorizonteGridButton balances={futureBalances} />
        </Pressable>
      </View>

      <View style={[styles.columnsHeader, { backgroundColor: colors.surface, borderBottomColor: colors.border, borderTopColor: colors.border }]}>
        <Text style={[styles.colText, { width: '12%', paddingLeft: 16 }]}>Dia</Text>
        
        <View style={{ flex: 1, paddingHorizontal: 4 }}>
          <Pressable 
            onPress={() => setIsFilterOpen(true)} 
            style={[styles.filterBtn, { backgroundColor: colors.surface, borderColor: colors.border }]}
          >
            <View style={styles.filterIconWrapper}>
              {filter === 'all' ? (
                <View style={{ flexDirection: 'row', gap: 2 }}>
                  <View style={[styles.dot, { backgroundColor: colors.green }]} />
                  <View style={[styles.dot, { backgroundColor: colors.red }]} />
                  <View style={[styles.dot, { backgroundColor: colors.pink }]} />
                </View>
              ) : (
                <TypeIcon type={filter as TransactionType} size={16} />
              )}
            </View>
            <Text style={[styles.filterText, { color: colors.textPrimary }]}>{getFilterLabel(filter)}</Text>
            <ChevronDown size={14} color={colors.textSecondary} />
          </Pressable>
        </View>

        <Text style={[styles.colText, { width: '44%', textAlign: 'right', paddingRight: 16 }]}>Saldos</Text>
      </View>

      <ScrollView ref={scrollViewRef} style={styles.ledgerList}>
        {dailyData.map(({ date, dayTransactions, balance, isChecked }) => (
          <LedgerRow 
            key={date.toISOString()}
            date={date}
            transactions={dayTransactions}
            balance={balance}
            isCheckedIn={isChecked}
            filter={filter}
            onCellClick={(type) => handleCellClick(type, date)}
            onCellLongPress={(type) => handleCellLongPress(type, date)}
            onLayout={isToday(date) ? (e) => { todayRowY.current = e.nativeEvent.layout.y; } : undefined}
          />
        ))}
      </ScrollView>

      <FilterSheet 
        isOpen={isFilterOpen} 
        onSelect={(t) => { setFilter(t); setIsFilterOpen(false); }} 
        onClose={() => setIsFilterOpen(false)} 
      />
    </View>
  );
}

const styles = StyleSheet.create({
  container: { flex: 1 },
  header: {
    flexDirection: 'row',
    justifyContent: 'space-between',
    alignItems: 'center',
    paddingHorizontal: 20,
    paddingVertical: 16,
    borderBottomWidth: 1,
  },
  todayContainer: {
    width: 36,
    height: 36,
    alignItems: 'center',
    justifyContent: 'center',
  },
  calendarIcon: {
    width: 28,
    height: 28,
    overflow: 'hidden',
  },
  calendarTop: {
    height: 9,
    borderTopLeftRadius: 4,
    borderTopRightRadius: 4,
    flexDirection: 'row',
    justifyContent: 'space-evenly',
    alignItems: 'center',
  },
  calendarPin: {
    width: 3,
    height: 5,
    borderRadius: 1.5,
  },
  calendarBody: {
    flex: 1,
    borderLeftWidth: 2,
    borderRightWidth: 2,
    borderBottomWidth: 2,
    borderBottomLeftRadius: 4,
    borderBottomRightRadius: 4,
    alignItems: 'center',
    justifyContent: 'center',
  },
  calendarDay: {
    fontSize: 11,
    fontWeight: '800',
    marginTop: -1,
  },
  monthSelector: {
    flexDirection: 'row',
    alignItems: 'center',
    gap: 16,
  },
  monthText: {
    fontSize: 22,
    fontWeight: '700',
  },
  columnsHeader: {
    flexDirection: 'row',
    alignItems: 'center',
    paddingVertical: 12,
    borderTopWidth: 1,
    borderBottomWidth: 1,
  },
  colText: {
    fontSize: 14,
    fontWeight: '500',
    color: '#888',
  },
  filterBtn: {
    flexDirection: 'row',
    alignItems: 'center',
    justifyContent: 'space-between',
    borderWidth: 1,
    paddingVertical: 8,
    paddingHorizontal: 12,
    borderRadius: 40,
    width: '100%',
  },
  filterIconWrapper: {
    width: 24,
    height: 16,
    alignItems: 'center',
    justifyContent: 'center',
  },
  filterText: {
    fontSize: 14,
    fontWeight: 'bold',
    flex: 1,
    textAlign: 'center',
  },
  dot: {
    width: 4,
    height: 4,
    borderRadius: 2,
  },
  ledgerList: {
    flex: 1,
  }
});
