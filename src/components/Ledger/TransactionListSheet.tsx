import React, { useState, useMemo, useEffect } from 'react';
import { View, Text, Modal, Pressable, StyleSheet, ScrollView } from 'react-native';
import { ChevronLeft, ChevronRight, Plus, X } from 'lucide-react-native';
import { useRouter } from 'expo-router';
import { useSQL, type Transaction } from '../../db/db';
import { format, addDays } from 'date-fns';
import { useAppTheme } from '../../styles/theme';
import { TypeIcon, type TransactionType } from './TypeIcon';

interface TransactionListSheetProps {
  isOpen: boolean;
  initialDate: Date;
  initialType: TransactionType | 'all';
  onClose: () => void;
}

const TYPE_LABELS: Record<string, string> = {
  all: 'Todas', income: 'Entradas', expense: 'Saídas',
  daily: 'Diários', savings: 'Economias', credit: 'Gastos com cartão'
};

export const TransactionListSheet: React.FC<TransactionListSheetProps> = ({ isOpen, initialDate, initialType, onClose }) => {
  const { colors } = useAppTheme();
  const router = useRouter();
  const [currentDate, setCurrentDate] = useState(initialDate);
  const [filter, setFilter] = useState<TransactionType | 'all'>(initialType);

  useEffect(() => {
    if (isOpen) {
      setCurrentDate(initialDate);
      setFilter(initialType);
    }
  }, [isOpen, initialDate, initialType]);

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
    <Modal visible={isOpen} transparent animationType="slide" onRequestClose={onClose}>
      <Pressable style={styles.overlay} onPress={onClose}>
        <View style={[styles.sheet, { backgroundColor: colors.bg }]} onStartShouldSetResponder={() => true}>
          <View style={[styles.header, { borderBottomColor: colors.border }]}>
            <Pressable onPress={onClose} style={styles.closeBtn}>
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
                  onPress={() => {
                    router.push(`/add?id=${tx.id}`);
                    onClose();
                  }}
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

          <Pressable onPress={onClose} style={styles.closeFooter}>
            <Text style={[styles.closeFooterText, { color: colors.textSecondary }]}>Fechar</Text>
          </Pressable>
        </View>
      </Pressable>
    </Modal>
  );
};

const styles = StyleSheet.create({
  overlay: {
    flex: 1,
    backgroundColor: 'rgba(0,0,0,0.5)',
    justifyContent: 'flex-end',
  },
  sheet: {
    height: '80%',
    borderTopLeftRadius: 16,
    borderTopRightRadius: 16,
    paddingTop: 16,
  },
  header: {
    flexDirection: 'row',
    justifyContent: 'space-between',
    alignItems: 'center',
    paddingHorizontal: 16,
    paddingBottom: 16,
    borderBottomWidth: 1,
  },
  closeBtn: {
    padding: 4,
  },
  dayNav: {
    flexDirection: 'row',
    alignItems: 'center',
    gap: 16,
  },
  dayText: {
    fontSize: 18,
    fontWeight: '600',
  },
  addBtn: {
    padding: 4,
  },
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
  closeFooter: {
    paddingVertical: 16,
    alignItems: 'center',
  },
  closeFooterText: {
    fontSize: 16,
  },
});
