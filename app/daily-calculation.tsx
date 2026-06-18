import React, { useState } from 'react';
import { View, Text, StyleSheet, Pressable, ScrollView } from 'react-native';
import { useRouter } from 'expo-router';
import { db, useSQL } from '../src/db/db';
import type { BudgetCategory } from '../src/db/db';
import { calculateDailyBudget } from '../src/utils/budgetCalc';
import { Plus, ArrowLeft, ChevronDown } from 'lucide-react-native';
import { useAppTheme } from '../src/styles/theme';
import { useSafeAreaInsets } from 'react-native-safe-area-context';

export default function DailyCalculationScreen() {
  const router = useRouter();
  const { colors } = useAppTheme();
  const insets = useSafeAreaInsets();
  const [days, setDays] = useState(30);
  const categories = useSQL<BudgetCategory>('SELECT * FROM budget_categories');
  
  const { total, daily } = calculateDailyBudget(categories, days);

  const handleDelete = async (id: string) => {
    await db.exec('DELETE FROM budget_categories WHERE id = ?', [id]);
  };

  const handleAdd = () => {
    router.push('/add-budget-category');
  };

  return (
    <View style={[styles.container, { backgroundColor: colors.bg, paddingTop: insets.top }]}>
      <View style={[styles.header, { borderBottomColor: colors.border }]}>
        <View style={styles.headerLeft}>
          <Pressable onPress={() => router.back()} style={styles.iconBtn}>
            <ArrowLeft size={28} color={colors.textPrimary} />
          </Pressable>
          <Text style={[styles.title, { color: colors.textPrimary }]}>Previsão de diário</Text>
        </View>
        <Pressable onPress={handleAdd} style={styles.iconBtn}>
          <Plus size={32} color={colors.textPrimary} />
        </Pressable>
      </View>

      <ScrollView style={styles.content} contentContainerStyle={{ paddingBottom: 120 }}>
        {categories.length === 0 ? (
          <View style={styles.emptyState}>
            <Pressable 
              onPress={handleAdd}
              style={[styles.emptyAddBtn, { borderColor: colors.border }]}
            >
              <Plus size={48} color={colors.border} />
            </Pressable>
            <Text style={[styles.emptyText, { color: colors.textSecondary }]}>
              Adicione seus gastos mensais aproximados para calcular a previsão de diário.
            </Text>
          </View>
        ) : (
          categories.map(cat => (
            <View key={cat.id} style={[styles.categoryItem, { borderBottomColor: colors.border }]}>
              <Pressable 
                onPress={() => {
                  // In a real app we'd use Alert.alert here
                  handleDelete(cat.id);
                }}
                style={styles.categoryItemContent}
              >
                <Text style={[styles.categoryName, { color: colors.textPrimary }]}>{cat.name}</Text>
                <Text style={[styles.categoryAmount, { color: colors.textPrimary }]}>
                  R$ {Number(cat.monthlyAmount || 0).toLocaleString('pt-BR', { minimumFractionDigits: 2 })}
                </Text>
              </Pressable>
            </View>
          ))
        )}
      </ScrollView>

      <View style={[styles.footer, { backgroundColor: colors.bg, borderTopColor: colors.border }]}>
        <View style={styles.footerRow}>
          <Text style={[styles.footerLabel, { color: colors.textPrimary }]}>Total mensal</Text>
          <Text style={[styles.footerLabel, { color: colors.textPrimary }]}>
            R$ {Number(total || 0).toLocaleString('pt-BR', { minimumFractionDigits: 2 })}
          </Text>
        </View>
        
        <View style={[styles.footerRow, { marginBottom: 24 }]}>
          <Text style={[styles.footerLabel, { color: colors.textPrimary }]}>Dividido por</Text>
          <View style={styles.daysSelector}>
            <Text style={[styles.daysText, { color: colors.textPrimary }]}>{days} dias</Text>
            <ChevronDown size={18} color={colors.textPrimary} />
          </View>
        </View>

        <View style={styles.footerResult}>
          <Text style={[styles.dailyText, { color: colors.textPrimary }]}>
            R$ {Number(daily || 0).toLocaleString('pt-BR', { minimumFractionDigits: 2 })}
          </Text>
        </View>
      </View>
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
  },
  content: {
    flex: 1,
    paddingHorizontal: 24,
  },
  emptyState: {
    alignItems: 'center',
    justifyContent: 'center',
    paddingTop: 80,
    gap: 32,
  },
  emptyAddBtn: {
    width: 100,
    height: 100,
    borderRadius: 50,
    borderWidth: 4,
    alignItems: 'center',
    justifyContent: 'center',
  },
  emptyText: {
    fontSize: 16,
    textAlign: 'center',
    maxWidth: 300,
    lineHeight: 24,
  },
  categoryItem: {
    borderBottomWidth: 1,
  },
  categoryItemContent: {
    flexDirection: 'row',
    justifyContent: 'space-between',
    alignItems: 'center',
    paddingVertical: 24,
  },
  categoryName: {
    fontSize: 18,
    fontWeight: '600',
  },
  categoryAmount: {
    fontSize: 18,
    fontWeight: '500',
  },
  footer: {
    position: 'absolute',
    bottom: 0,
    left: 0,
    right: 0,
    padding: 24,
    paddingBottom: 40,
    borderTopWidth: 1,
  },
  footerRow: {
    flexDirection: 'row',
    justifyContent: 'space-between',
    alignItems: 'center',
    marginBottom: 16,
  },
  footerLabel: {
    fontSize: 18,
    fontWeight: '600',
  },
  daysSelector: {
    flexDirection: 'row',
    alignItems: 'center',
    gap: 8,
  },
  daysText: {
    fontSize: 18,
    fontWeight: '600',
  },
  footerResult: {
    alignItems: 'flex-end',
    marginTop: 8,
  },
  dailyText: {
    fontSize: 36,
    fontWeight: 'bold',
  }
});
