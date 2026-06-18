import React, { useState, useMemo, useEffect } from 'react';
import { View, Text, StyleSheet, Pressable, ScrollView } from 'react-native';
import { ChevronLeft, ChevronRight, Plus, ChevronDown } from 'lucide-react-native';
import { useRouter, useLocalSearchParams } from 'expo-router';
import { useSQL, type Transaction } from '../src/db/db';
import { format, addDays } from 'date-fns';
import { useSafeAreaInsets } from 'react-native-safe-area-context';
import { useAppTheme } from '../src/styles/theme';
import { TypeIcon, type TransactionType } from '../src/components/Ledger/TypeIcon';
import { FilterSheet, type FilterType } from '../src/components/Ledger/FilterSheet';

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
  const [filter, setFilter] = useState<FilterType>((typeParam as FilterType) || 'all');
  const [isFilterOpen, setIsFilterOpen] = useState(false);

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
        <Pressable 
          onPress={() => setIsFilterOpen(true)}
          style={[styles.filterChip, { borderColor: colors.border }]}
        >
          <View style={styles.filterChipLeft}>
            {filter === 'all' ? (
              <View style={{ flexDirection: 'row', gap: 2, alignItems: 'center', justifyContent: 'center', width: 24 }}>
                <View style={[styles.dot, { backgroundColor: colors.green }]} />
                <View style={[styles.dot, { backgroundColor: colors.red }]} />
                <View style={[styles.dot, { backgroundColor: colors.pink }]} />
              </View>
            ) : (
              <TypeIcon type={filter as TransactionType} size={18} />
            )}
            <Text style={[styles.filterText, { color: colors.textPrimary }]}>
              {TYPE_LABELS[filter] || filter}
            </Text>
          </View>
          <ChevronDown size={20} color={colors.textSecondary} />
        </Pressable>
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
                    {tx.description || TYPE_LABELS[tx.type] || tx.type}
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
                  {TYPE_LABELS[tx.type] || tx.type}
                </Text>
              </View>
            </Pressable>
          ))
        )}
      </ScrollView>

      <FilterSheet 
        isOpen={isFilterOpen}
        onClose={() => setIsFilterOpen(false)}
        onSelect={(t) => {
          setFilter(t);
          setIsFilterOpen(false);
        }}
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
    justifyContent: 'space-between',
    borderWidth: 1,
    paddingVertical: 12,
    paddingHorizontal: 20,
    borderRadius: 30,
    width: '100%',
  },
  filterChipLeft: {
    flexDirection: 'row',
    alignItems: 'center',
    gap: 12,
  },
  filterText: {
    fontSize: 16,
    fontWeight: '600',
  },
  dot: {
    width: 4,
    height: 4,
    borderRadius: 2,
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
