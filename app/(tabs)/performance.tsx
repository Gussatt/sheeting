import React, { useState } from 'react';
import { View, Text, StyleSheet, Pressable, ScrollView } from 'react-native';
import { useSQL } from '../../src/db/db';
import type { BudgetCategory, Transaction } from '../../src/db/db';
import { calculateDailyBudget } from '../../src/utils/budgetCalc';
import { startOfMonth, endOfMonth, isWithinInterval, format, getDaysInMonth } from 'date-fns';
import { ChevronLeft, ChevronRight, MoreHorizontal, Calendar } from 'lucide-react-native';
import { useRouter } from 'expo-router';
import { useSafeAreaInsets } from 'react-native-safe-area-context';
import { useAppTheme } from '../../src/styles/theme';
import { AppIcon } from '../../src/components/AppIcon';

interface MetricItemProps {
  label: string;
  value: string | number;
  subvalue?: React.ReactNode;
  color?: string;
  math?: React.ReactNode;
  secondaryValue?: string;
}

const MetricItem = ({ label, value, subvalue, color, math, secondaryValue }: MetricItemProps) => {
  const { colors } = useAppTheme();
  return (
    <View style={[styles.metricContainer, { borderBottomColor: colors.border }]}>
      <View style={styles.metricLeft}>
        <Text style={[styles.metricLabel, { color: colors.textPrimary }]}>{label}</Text>
        <View style={styles.metricMath}>
          {math}
        </View>
      </View>
      <View style={styles.metricRight}>
        <View style={styles.metricValueRow}>
          {secondaryValue ? <Text style={[styles.metricSecondary, { color: colors.pink }]}>{secondaryValue}</Text> : null}
          <Text style={[
            styles.metricValue, 
            { color: typeof value === 'number' && value < 0 ? colors.red : color || colors.textPrimary }
          ]}>
            {typeof value === 'number' ? `R$ ${value.toLocaleString('pt-BR', { minimumFractionDigits: 2 })}` : value}
          </Text>
        </View>
        <Text style={[styles.metricSubvalue, { color: colors.textSecondary }]}>{subvalue}</Text>
      </View>
    </View>
  );
};

const MovementItem = ({ label, value, iconName }: { label: string; value: number; iconName: string }) => {
  const { colors } = useAppTheme();
  return (
    <View style={[styles.movementContainer, { borderBottomColor: colors.border }]}>
      <View style={styles.movementLeft}>
        <AppIcon name={iconName as any} size={20} />
        <Text style={[styles.movementLabel, { color: colors.textPrimary }]}>{label}</Text>
      </View>
      <Text style={[styles.movementValue, { color: colors.textPrimary }]}>
        R$ {value.toLocaleString('pt-BR', { minimumFractionDigits: 2 })}
      </Text>
    </View>
  );
};

export default function PerformanceScreen() {
  const [currentDate, setCurrentDate] = useState(new Date());
  const { colors } = useAppTheme();
  const router = useRouter();
  const insets = useSafeAreaInsets();
  
  const start = startOfMonth(currentDate);
  const end = endOfMonth(currentDate);

  const transactions = useSQL<Transaction>('SELECT * FROM transactions');
  const budgets = useSQL<BudgetCategory>('SELECT * FROM budget_categories');

  const monthTransactions = transactions.filter(t => 
    isWithinInterval(new Date(t.date), { start, end })
  );

  const income = monthTransactions.filter(t => t.type === 'income').reduce((sum, t) => sum + Number(t.amount), 0);
  const expense = monthTransactions.filter(t => t.type === 'expense').reduce((sum, t) => sum + Number(t.amount), 0);
  const daily = monthTransactions.filter(t => t.type === 'daily').reduce((sum, t) => sum + Number(t.amount), 0);
  const savings = monthTransactions.filter(t => t.type === 'savings').reduce((sum, t) => sum + Number(t.amount), 0);
  const credit = monthTransactions.filter(t => t.type === 'credit').reduce((sum, t) => sum + Number(t.amount), 0);
  const daysInMonth = getDaysInMonth(currentDate);
  const { daily: dailyPlanned } = calculateDailyBudget(budgets, daysInMonth);
  
  const performance = income - expense - daily - savings - credit;
  const costOfLiving = expense + daily + credit;
  const savedPercent = income > 0 ? Math.round((savings / income) * 100) : 0;
  
  const avgDaily = daysInMonth > 0 ? daily / daysInMonth : 0;
  const monthsWithDaily = 1; // placeholder for multi-month calc

  const changeMonth = (delta: number) => {
    const next = new Date(currentDate);
    next.setMonth(next.getMonth() + delta);
    setCurrentDate(next);
  };

  return (
    <ScrollView style={[styles.container, { backgroundColor: colors.bg, paddingTop: insets.top }]} contentContainerStyle={{ paddingBottom: 100 }}>
      <View style={[styles.header, { backgroundColor: colors.bg, borderBottomColor: colors.border }]}>
        <View style={styles.todayContainer}>
          <Calendar size={28} color={colors.textPrimary} strokeWidth={2} />
          <Text style={[styles.todayText, { color: colors.textPrimary, position: 'absolute', top: 12, fontSize: 10 }]}>
            {new Date().getDate()}
          </Text>
        </View>

        <View style={styles.monthSelector}>
          <Pressable onPress={() => changeMonth(-1)}>
            <ChevronLeft size={24} color={colors.textPrimary} />
          </Pressable>
          <Text style={[styles.monthText, { color: colors.textPrimary }]}>{format(currentDate, 'MMM/yy')}</Text>
          <Pressable onPress={() => changeMonth(1)}>
            <ChevronRight size={24} color={colors.textPrimary} />
          </Pressable>
        </View>

        <Pressable style={styles.moreBtn}>
          <MoreHorizontal size={24} color={colors.textPrimary} />
        </Pressable>
      </View>

      <View style={styles.metricsList}>
        <MetricItem 
          label="Performance"
          value={performance}
          subvalue={performance < 0 ? "Faltou dinheiro" : "Dentro da meta"}
          math={
            <View style={styles.mathRow}>
              <AppIcon name="entradas" size={16} />
              <Text style={[styles.mathSymbol, { color: colors.textSecondary }]}>-</Text>
              <AppIcon name="saidas" size={16} />
              <Text style={[styles.mathSymbol, { color: colors.textSecondary }]}>-</Text>
              <AppIcon name="previsao_diario" size={16} color={colors.pink} />
              <Text style={[styles.mathSymbol, { color: colors.textSecondary }]}>-</Text>
              <AppIcon name="economia" size={16} />
              <Text style={[styles.mathSymbol, { color: colors.textSecondary }]}>-</Text>
              <AppIcon name="cartao" size={16} />
            </View>
          }
        />
        
        <MetricItem 
          label="Economizado"
          value={`${savedPercent}%`}
          subvalue="Acima do ideal"
          color={colors.textPrimary}
          math={
            <View style={styles.mathRow}>
              <AppIcon name="economia" size={16} />
              <View style={[styles.progressTrack, { backgroundColor: colors.surface, borderColor: colors.border }]}>
                <View style={[styles.progressFill, { width: `${savedPercent}%`, backgroundColor: colors.lightGreen }]} />
              </View>
              <AppIcon name="entradas" size={16} />
            </View>
          }
        />

        <MetricItem 
          label="Custo de vida"
          value={costOfLiving}
          subvalue={costOfLiving > income ? "Acima da renda" : "Dentro da renda"}
          math={
            <View style={styles.mathRow}>
              <AppIcon name="saidas" size={16} />
              <Text style={[styles.mathSymbol, { color: colors.textSecondary }]}>+</Text>
              <AppIcon name="previsao_diario" size={16} color={colors.pink} />
              <Text style={[styles.mathSymbol, { color: colors.textSecondary }]}>+</Text>
              <AppIcon name="cartao" size={16} />
            </View>
          }
        />

        <Pressable onPress={() => router.push('/diario-medio')}>
          <MetricItem 
            label="Diário médio"
            value={avgDaily}
            math={
              <View style={[styles.mathRow, { gap: 4 }]}>
                <AppIcon name="diario" size={18} />
                <Text style={[styles.mathMarker, { color: colors.pink }]}>/ {monthsWithDaily}</Text>
              </View>
            }
            subvalue={
              <View style={[styles.mathRow, { gap: 4 }]}>
                <AppIcon name="previsao_diario" size={16} color={colors.pink} />
                <Text style={{ color: colors.pink, fontSize: 14, fontWeight: '500' }}>
                  R$ {dailyPlanned.toLocaleString('pt-BR', { minimumFractionDigits: 2 })}
                </Text>
              </View>
            }
          />
        </Pressable>
      </View>

      <View style={styles.movementsSection}>
        <Text style={[styles.movementsTitle, { color: colors.textSecondary }]}>Movimentações do mês</Text>
        <MovementItem label="Entradas" value={income} iconName="entradas" />
        <MovementItem label="Saídas" value={expense} iconName="saidas" />
        <MovementItem label="Diários" value={daily} iconName="diario" />
        <MovementItem label="Economias" value={savings} iconName="economia" />
        <MovementItem label="Gastos com cartão" value={credit} iconName="cartao" />

        <Pressable onPress={() => router.push('/')} style={styles.viewAllButton}>
          <MoreHorizontal size={24} color={colors.textPrimary} />
          <Text style={[styles.viewAllText, { color: colors.textPrimary }]}>Ver todas</Text>
        </Pressable>
      </View>
    </ScrollView>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
  },
  header: {
    flexDirection: 'row',
    alignItems: 'center',
    justifyContent: 'space-between',
    paddingHorizontal: 16,
    paddingVertical: 12,
    borderBottomWidth: 1,
  },
  todayContainer: {
    width: 40,
    height: 40,
    alignItems: 'center',
    justifyContent: 'center',
  },
  todayText: {
    fontSize: 16,
    fontWeight: 'bold',
  },
  monthSelector: {
    flexDirection: 'row',
    alignItems: 'center',
    gap: 12,
  },
  monthText: {
    fontSize: 18,
    fontWeight: 'bold',
    textTransform: 'capitalize',
    minWidth: 80,
    textAlign: 'center',
  },
  moreBtn: {
    padding: 8,
  },
  metricsList: {
    padding: 16,
    gap: 16,
  },
  metricContainer: {
    flexDirection: 'row',
    justifyContent: 'space-between',
    alignItems: 'center',
    paddingVertical: 24,
    borderBottomWidth: 1,
  },
  metricLeft: {
    flex: 1,
  },
  metricLabel: {
    fontSize: 20,
    fontWeight: '600',
    marginBottom: 8,
  },
  metricMath: {
    marginTop: 4,
  },
  mathRow: {
    flexDirection: 'row',
    alignItems: 'center',
    gap: 8,
  },
  mathSymbol: {
    fontSize: 16,
    fontWeight: '500',
  },
  mathMarker: {
    fontSize: 14,
    fontWeight: 'bold',
  },
  metricRight: {
    alignItems: 'flex-end',
  },
  metricValueRow: {
    flexDirection: 'row',
    alignItems: 'baseline',
    gap: 4,
  },
  metricSecondary: {
    fontSize: 14,
    fontWeight: '600',
  },
  metricValue: {
    fontSize: 24,
    fontWeight: 'bold',
  },
  metricSubvalue: {
    fontSize: 14,
    marginTop: 4,
  },
  progressTrack: {
    width: 80,
    height: 10,
    borderRadius: 5,
    borderWidth: 1,
    overflow: 'hidden',
  },
  progressFill: {
    height: '100%',
  },
  movementsSection: {
    paddingHorizontal: 16,
    marginTop: 32,
  },
  movementsTitle: {
    fontSize: 14,
    fontWeight: '600',
    marginBottom: 8,
  },
  movementContainer: {
    flexDirection: 'row',
    justifyContent: 'space-between',
    alignItems: 'center',
    paddingVertical: 20,
    borderBottomWidth: 1,
  },
  movementLeft: {
    flexDirection: 'row',
    alignItems: 'center',
    gap: 16,
  },
  movementLabel: {
    fontSize: 16,
    fontWeight: '500',
  },
  movementValue: {
    fontSize: 16,
    fontWeight: '500',
  },
  viewAllButton: {
    flexDirection: 'row',
    alignItems: 'center',
    gap: 16,
    paddingVertical: 20,
  },
  viewAllText: {
    fontSize: 16,
    fontWeight: '500',
  },
});
