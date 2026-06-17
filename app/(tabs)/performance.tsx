import React, { useState } from 'react';
import { View, Text, StyleSheet, Pressable, ScrollView } from 'react-native';
import { useSQL } from '../../src/db/db';
import type { BudgetCategory, Transaction } from '../../src/db/db';
import { calculateDailyBudget } from '../../src/utils/budgetCalc';
import { startOfMonth, endOfMonth, isWithinInterval, format, getDaysInMonth } from 'date-fns';
import { ChevronLeft, ChevronRight, MoreHorizontal } from 'lucide-react-native';
import { useRouter } from 'expo-router';
import { useSafeAreaInsets } from 'react-native-safe-area-context';
import { useFilteredTransactions } from '../../src/hooks/useFilteredTransactions';
import { useTheme } from '../../src/context/ThemeContext';
import { useAppTheme } from '../../src/styles/theme';
import { AppIcon, AppIconName } from '../../src/components/AppIcon';

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

interface MovementItemProps {
  label: string;
  value: number;
  iconName: AppIconName;
}

const MovementItem = ({ label, value, iconName }: MovementItemProps) => {
  const { colors } = useAppTheme();
  return (
    <View style={[styles.movementContainer, { borderBottomColor: colors.border }]}>
      <View style={styles.movementLeft}>
        <AppIcon name={iconName} size={24} />
        <Text style={[styles.movementLabel, { color: colors.textPrimary }]}>{label}</Text>
      </View>
      <Text style={[styles.movementValue, { color: colors.textPrimary }]}>
        R$ {value.toLocaleString('pt-BR', { minimumFractionDigits: 2 })}
      </Text>
    </View>
  );
};

export default function PerformanceScreen() {
  const { theme } = useTheme();
  const { colors } = useAppTheme();
  const router = useRouter();
  const insets = useSafeAreaInsets();
  const [currentDate, setCurrentDate] = useState(new Date());
  
  const monthStart = startOfMonth(currentDate);
  const monthEnd = endOfMonth(currentDate);

  const categories = useSQL<BudgetCategory>('SELECT * FROM budget_categories');
  const allTransactions = useSQL<Transaction>('SELECT * FROM transactions');
  
  const currentMonthTransactions = allTransactions.filter(t => 
    isWithinInterval(new Date(t.date), { start: monthStart, end: monthEnd })
  );

  const perfTxs = useFilteredTransactions(currentMonthTransactions, 'calcPerformance');
  const costTxs = useFilteredTransactions(currentMonthTransactions, 'calcCustoVida');
  const savedTxs = useFilteredTransactions(currentMonthTransactions, 'calcEconomizado');
  const dailyTxs = useFilteredTransactions(currentMonthTransactions, 'calcDiarioMedio');

  const getTotal = (txs: Transaction[], type: string) => txs
    .filter(t => t.type === type)
    .reduce((sum, t) => sum + Number(t.amount), 0);

  const income = getTotal(perfTxs, 'income');
  const expense = getTotal(perfTxs, 'expense');
  const daily = getTotal(perfTxs, 'daily');
  const savings = getTotal(perfTxs, 'savings');
  const credit = getTotal(perfTxs, 'credit');

  const performance = income - (expense + daily + savings + credit);
  const costOfLiving = getTotal(costTxs, 'expense') + getTotal(costTxs, 'daily') + getTotal(costTxs, 'credit');
  const savedIncome = getTotal(savedTxs, 'income');
  const savedAmount = getTotal(savedTxs, 'savings');
  const savedPercent = savedIncome > 0 ? Math.round((savedAmount / savedIncome) * 100) : 0;
  
  const daysInMonth = getDaysInMonth(currentDate);
  const dailyAmount = getTotal(dailyTxs, 'daily');
  const avgDaily = daysInMonth > 0 ? dailyAmount / daysInMonth : 0;
  const { daily: dailyPlanned } = calculateDailyBudget(categories, daysInMonth);

  const monthsWithDaily = new Set(
    allTransactions
      .filter(t => t.type === 'daily')
      .map(t => {
        const d = new Date(t.date);
        return `${d.getFullYear()}-${d.getMonth()}`;
      })
  ).size;

  const changeMonth = (offset: number) => {
    const next = new Date(currentDate);
    next.setMonth(currentDate.getMonth() + offset);
    setCurrentDate(next);
  };

  const formatMonth = (date: Date) => {
    const formatted = format(date, 'MMM/yy');
    return formatted.charAt(0).toUpperCase() + formatted.slice(1);
  };

  return (
    <ScrollView style={[styles.container, { backgroundColor: colors.bg, paddingTop: insets.top }]} contentContainerStyle={{ paddingBottom: 100 }}>
      <View style={[styles.header, { backgroundColor: colors.bg, borderBottomColor: colors.border }]}>
        <View style={styles.todayContainer}>
           <Text style={[styles.todayText, { color: colors.textPrimary }]}>{new Date().getDate()}</Text>
        </View>

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
          <MoreHorizontal size={24} color={colors.textPrimary} />
        </Pressable>
      </View>

      <View style={styles.subheader}>
        <Text style={[styles.subheaderTitle, { color: colors.textPrimary }]}>Cálculos do mês</Text>
      </View>

      <View style={styles.content}>
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
              <AppIcon name="diario" size={16} />
              <Text style={[styles.mathSymbol, { color: colors.textSecondary }]}>-</Text>
              <AppIcon name="economia" size={16} />
              <Text style={[styles.mathSymbol, { color: colors.textSecondary }]}>-</Text>
              <AppIcon name="cartao" size={16} />
              <Text style={[styles.mathSymbol, { color: colors.textSecondary }]}>-</Text>
              <Text style={[styles.mathMarker, { color: colors.pink }]}>M</Text>
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
              <AppIcon name="diario" size={16} />
              <Text style={[styles.mathSymbol, { color: colors.textSecondary }]}>+</Text>
              <AppIcon name="cartao" size={16} />
              <Text style={[styles.mathSymbol, { color: colors.textSecondary }]}>+</Text>
              <Text style={[styles.mathMarker, { color: colors.pink }]}>M</Text>
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
                <Text style={[styles.mathMarker, { color: colors.pink }]}>M</Text>
                <Text style={{ color: colors.pink, fontSize: 13, fontWeight: '500' }}>
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
        
        <Pressable 
          onPress={() => router.push('/')}
          style={styles.viewAllButton}
        >
          <MoreHorizontal size={24} color={colors.textPrimary} />
          <Text style={[styles.viewAllText, { color: colors.textPrimary }]}>Ver todas</Text>
        </Pressable>
      </View>
    </ScrollView>
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
    width: 40,
    height: 40,
    alignItems: 'center',
    justifyContent: 'center',
  },
  todayText: {
    fontSize: 12,
    fontWeight: 'bold',
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
  subheader: {
    paddingHorizontal: 20,
    paddingTop: 24,
    paddingBottom: 16,
  },
  subheaderTitle: {
    fontSize: 20,
    fontWeight: 'bold',
  },
  content: {
    paddingHorizontal: 20,
  },
  metricContainer: {
    flexDirection: 'row',
    justifyContent: 'space-between',
    alignItems: 'flex-start',
    paddingVertical: 16,
    borderBottomWidth: 1,
  },
  metricLeft: {
    flexDirection: 'column',
    gap: 8,
  },
  metricLabel: {
    fontWeight: '600',
    fontSize: 16,
  },
  metricMath: {
    flexDirection: 'row',
    alignItems: 'center',
    gap: 4,
  },
  mathRow: {
    flexDirection: 'row',
    alignItems: 'center',
    gap: 4,
  },
  mathSymbol: {
    fontSize: 14,
    fontWeight: '500',
  },
  mathMarker: {
    fontSize: 14,
    fontWeight: 'bold',
  },
  metricRight: {
    flexDirection: 'column',
    alignItems: 'flex-end',
    gap: 4,
  },
  metricValueRow: {
    flexDirection: 'row',
    alignItems: 'center',
    gap: 8,
  },
  metricSecondary: {
    fontSize: 14,
    fontWeight: '500',
  },
  metricValue: {
    fontWeight: 'bold',
    fontSize: 16,
  },
  metricSubvalue: {
    fontSize: 12,
  },
  progressTrack: {
    width: 80,
    height: 8,
    borderRadius: 4,
    borderWidth: 1,
    overflow: 'hidden',
  },
  progressFill: {
    height: '100%',
    borderRadius: 4,
  },
  movementsSection: {
    paddingHorizontal: 20,
    marginTop: 16,
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
    paddingVertical: 16,
    borderBottomWidth: 1,
  },
  movementLeft: {
    flexDirection: 'row',
    alignItems: 'center',
    gap: 16,
  },
  movementLabel: {
    fontWeight: '500',
    fontSize: 15,
  },
  movementValue: {
    fontWeight: '500',
    fontSize: 15,
  },
  viewAllButton: {
    flexDirection: 'row',
    alignItems: 'center',
    gap: 16,
    paddingVertical: 16,
  },
  viewAllText: {
    fontWeight: '500',
    fontSize: 15,
  }
});
