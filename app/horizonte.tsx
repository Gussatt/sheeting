import React from 'react';
import { View, Text, StyleSheet, Pressable } from 'react-native';
import { useSQL } from '../src/db/db';
import type { BudgetCategory, Transaction } from '../src/db/db';
import { calculateProjection } from '../src/utils/projection';
import { HorizonteGrid } from '../src/components/Ledger/HorizonteGrid';
import { calculateDailyBudget } from '../src/utils/budgetCalc';
import { useRouter } from 'expo-router';
import { ChevronLeft, Plus } from 'lucide-react-native';
import { useFilteredTransactions } from '../src/hooks/useFilteredTransactions';
import { startOfMonth } from 'date-fns';
import { useAppTheme } from '../src/styles/theme';
import { useSafeAreaInsets } from 'react-native-safe-area-context';

export default function HorizonteScreen() {
  const router = useRouter();
  const { colors } = useAppTheme();
  const insets = useSafeAreaInsets();
  const now = new Date();
  const monthStart = startOfMonth(now);

  const categories = useSQL<BudgetCategory>('SELECT * FROM budget_categories');
  const allTransactions = useSQL<Transaction>('SELECT * FROM transactions');
  
  const filteredTransactions = useFilteredTransactions(allTransactions, 'calcSaldos');

  const balanceAtStartOfMonth = filteredTransactions
    .filter(t => new Date(t.date) < monthStart)
    .reduce((sum, t) => {
      const amount = Number(t.amount);
      return t.type === 'income' ? sum + amount : sum - amount;
    }, 0);

  const { daily: dailyPlanned } = calculateDailyBudget(categories, 30);
  
  const projections = calculateProjection(now, balanceAtStartOfMonth, dailyPlanned, filteredTransactions, 3);

  return (
    <View style={[styles.container, { backgroundColor: colors.bg, paddingTop: insets.top }]}>
      <View style={[styles.header, { borderBottomColor: colors.border }]}>
        <View style={styles.headerLeft}>
          <Pressable onPress={() => router.back()} style={styles.iconBtn}>
            <ChevronLeft size={28} color={colors.textPrimary} />
          </Pressable>
          <Text style={[styles.title, { color: colors.textPrimary }]}>Horizonte</Text>
        </View>
        <Pressable onPress={() => router.push('/add')} style={styles.iconBtn}>
          <Plus size={28} color={colors.textPrimary} />
        </Pressable>
      </View>

      <HorizonteGrid projections={projections} />
    </View>
  );
}

const styles = StyleSheet.create({
  container: { flex: 1 },
  header: {
    flexDirection: 'row',
    alignItems: 'center',
    justifyContent: 'space-between',
    padding: 16,
    borderBottomWidth: 1,
  },
  headerLeft: {
    flexDirection: 'row',
    alignItems: 'center',
    gap: 16,
  },
  iconBtn: { padding: 4 },
  title: {
    fontSize: 22,
    fontWeight: 'bold',
  }
});
