import React, { useState, useMemo, useEffect } from 'react';
import { View, Text, StyleSheet, Pressable, ScrollView } from 'react-native';
import { ChevronLeft, ChevronRight, Plus } from 'lucide-react-native';
import { useRouter, useLocalSearchParams } from 'expo-router';
import { useSQL, type Transaction } from '../src/db/db';
import { format, addDays } from 'date-fns';
import { useSafeAreaInsets } from 'react-native-safe-area-context';
import { useAppTheme } from '../src/styles/theme';
import { TypeIcon, type TransactionType } from '../src/components/Ledger/TypeIcon';

const TYPE_LABELS: Record<string, string> = {
  all: 'Todas', income: 'Entradas', expense: 'Saídas',
  daily: 'Diários', savings: 'Economias', credit: 'Gastos com cartão'
};

export default function TransactionsPage() {
  const { colors } = useAppTheme();
  const router = useRouter();
  const insets = useSafeAreaInsets();
  const { date: dateParam, type: typeParam } = useLocalSearchParams<{ date: string; type: string }>();

  const [currentDate, setCurrentDate] = useState(() => {
    if (dateParam) {
      const [y, m, d] = dateParam.split('-').map(Number);
      return new Date(y, m - 1, d);
    }
    return new Date();
  });
  const [filter, setFilter] = useState<TransactionType | 'all'>((typeParam as TransactionType | 'all') || 'all');

  const dateStr = currentDate.toISOString().split('T')[0];

  const dayTransactions = useSQL<Transaction>(
    `SELECT * FROM transactions WHERE date LIKE ? ORDER BY date ASC`,
    useMemo(() => [`${dateStr}%`], [dateStr])
  );

  const filteredTransactions = filter === 'all'
    ? dayTransactions
    : dayTransactions.filter(t => t.type === filter);

  const changeDay = (offset: number) => {
    setCurrentDate(prev => addDays(prev, offset));
  };

  return (
    <View style={[styles.container, { backgroundColor: colors.bg, paddingTop: insets.top }]}>
      <View style={[styles.header, { borderBottomColor: colors.border }]}>
        <Pressable onPress={() => router.back()} style={styles.backBtn}>
          <ChevronLeft size={24} color={colors.textSecondary} />
        </Pressable>

        <View style={styles.dayNav}>
          <Pressable onPress={() => changeDay(-1)}>
            <ChevronLeft size={20} color={colors.textPrimary} />
          </Pressable>
          <Text style={[styles.dayText, { color: colors.textPrimary }]}>
            {format(currentDate, 'dd/MM')}
          </Text>
          <Pressable onPress={() => changeDay(1)}>
            <ChevronRight size={20} color={colors.textPrimary} />
          </Pressable>
        </View>

        <Pressable
          onPress={() => router.push(`/add?type=${filter === 'all' ? 'expense' : filter}&date=${dateStr}`)}
          style={styles.addBtn}
        >
          <Plus size={24} color={colors.textSecondary} />
        </Pressable>
      </View>

      <View style={styles.filterRow}>
        <View style={[styles.filterChip, { borderColor: colors.border }]}>
          <TypeIcon type={(filter === 'all' ? 'income' : filter) as TransactionType} size={16} />
          <Text style={[styles.filterText, { color: colors.textPrimary }]}>
            {TYPE_LABELS[filter] || filter}
          </Text>
        </View>
      </View>

      <ScrollView style={styles.list}>
        {filteredTransactions.length === 0 ? (
          <Text style={[styles.emptyText, { color: colors.textSecondary }]}>
            Nenhuma transação para este filtro.
          </Text>
        ) : (
          filteredTransactions.map((tx) => (
            <Pressable
              key={tx.id}
              onPress={() => router.push(`/add?id=${tx.id}`)}
              style={[styles.txRow, { borderBottomColor: colors.border }]}
            >
              <View style={styles.txLeft}>
                <TypeIcon type={tx.type as TransactionType} size={20} />
                <View style={styles.txInfo}>
                  <Text style={[styles.txType, { color: colors.textPrimary }]}>
                    {tx.type.charAt(0).toUpperCase() + tx.type.slice(1)}
                  </Text>
                  <Text style={[styles.txDate, { color: colors.textSecondary }]}>
                    {format(new Date(tx.date), 'dd/MM')}
                  </Text>
                </View>
              </View>
              <View style={styles.txRight}>
                <Text style={[styles.txAmount, { color: colors.textPrimary }]}>
                  R$ {Number(tx.amount).toLocaleString('pt-BR', { minimumFractionDigits: 2 })}
                </Text>
                <Text style={[styles.txDesc, { color: colors.textSecondary }]}>
                  {tx.description || TYPE_LABELS[tx.type] || tx.type}
                </Text>
              </View>
            </Pressable>
          ))
        )}
      </ScrollView>
    </View>
  );
}

const styles = StyleSheet.create({
  container: { flex: 1 },
  header: {
    flexDirection: 'row',
    justifyContent: 'space-between',
    alignItems: 'center',
    paddingHorizontal: 16,
    paddingVertical: 16,
    borderBottomWidth: 1,
  },
  backBtn: { padding: 4 },
  dayNav: {
    flexDirection: 'row',
    alignItems: 'center',
    gap: 16,
  },
  dayText: {
    fontSize: 18,
    fontWeight: '600',
  },
  addBtn: { padding: 4 },
  filterRow: {
    paddingHorizontal: 16,
    paddingVertical: 12,
  },
  filterChip: {
    flexDirection: 'row',
    alignItems: 'center',
    gap: 8,
    borderWidth: 1,
    paddingVertical: 6,
    paddingHorizontal: 16,
    borderRadius: 20,
    alignSelf: 'flex-start',
  },
  filterText: {
    fontSize: 14,
    fontWeight: '500',
  },
  list: {
    flex: 1,
    paddingHorizontal: 16,
  },
  emptyText: {
    textAlign: 'center',
    marginTop: 64,
    fontSize: 16,
  },
  txRow: {
    flexDirection: 'row',
    justifyContent: 'space-between',
    alignItems: 'center',
    paddingVertical: 16,
    borderBottomWidth: 1,
  },
  txLeft: {
    flexDirection: 'row',
    alignItems: 'center',
    gap: 16,
  },
  txInfo: {
    flexDirection: 'column',
    gap: 2,
  },
  txType: {
    fontSize: 16,
    fontWeight: '500',
  },
  txDate: {
    fontSize: 12,
  },
  txRight: {
    flexDirection: 'column',
    alignItems: 'flex-end',
    gap: 2,
  },
  txAmount: {
    fontSize: 16,
    fontWeight: 'bold',
  },
  txDesc: {
    fontSize: 12,
  },
});
