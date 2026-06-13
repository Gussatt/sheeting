import React, { useState } from 'react';
import { View, Text, StyleSheet, Pressable, ScrollView } from 'react-native';
import { useSQL } from '../../src/db/db';
import type { BudgetCategory, Transaction } from '../../src/db/db';
import { calculateDailyBudget } from '../../src/utils/budgetCalc';
import { startOfMonth, endOfMonth, isWithinInterval, format, getDaysInMonth } from 'date-fns';
import { ChevronLeft, ChevronRight, ArrowDownLeft, ArrowUpRight, Calendar, PiggyBank, CreditCard, TrendingUp, MoreHorizontal } from 'lucide-react-native';
import { useRouter } from 'expo-router';
import { useFilteredTransactions } from '../../src/hooks/useFilteredTransactions';
import { useTheme } from '../../src/context/ThemeContext';
import { useAppTheme } from '../../src/styles/theme';

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
  icon: React.ReactNode;
}

const MovementItem = ({ label, value, icon }: MovementItemProps) => {
  const { colors } = useAppTheme();
  return (
    <View style={[styles.movementContainer, { borderBottomColor: colors.border }]}>
      <View style={styles.movementLeft}>
        {icon}
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
    <ScrollView style={[styles.container, { backgroundColor: colors.bg }]} contentContainerStyle={{ paddingBottom: 100 }}>
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
              <ArrowDownLeft size={16} color={colors.green} />
              <Text style={{color: colors.textSecondary}}>-</Text>
              <ArrowUpRight size={16} color={colors.red} />
              <Text style={{color: colors.textSecondary}}>-</Text>
              <Calendar size={16} color={colors.textPrimary} />
              <Text style={{color: colors.textSecondary}}>-</Text>
              <PiggyBank size={16} color={colors.yellow} />
              <Text style={{color: colors.textSecondary}}>-</Text>
              <CreditCard size={16} color={colors.purple} />
              <Text style={{color: colors.textSecondary}}>-</Text>
              <TrendingUp size={16} color={colors.pink} />
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
              <PiggyBank size={16} color={colors.yellow} />
              <View style={[styles.progressTrack, { backgroundColor: colors.surface, borderColor: colors.border }]}>
                <View style={[styles.progressFill, { width: `${savedPercent}%`, backgroundColor: colors.lightGreen }]} />
              </View>
              <ArrowDownLeft size={16} color={colors.green} />
            </View>
          }
        />

        <MetricItem 
          label="Custo de vida"
          value={costOfLiving}
          subvalue={costOfLiving > income ? "Acima da renda" : "Dentro da renda"}
          math={
            <View style={styles.mathRow}>
              <ArrowUpRight size={16} color={colors.red} />
              <Text style={{color: colors.textSecondary}}>+</Text>
              <Calendar size={16} color={colors.textPrimary} />
              <Text style={{color: colors.textSecondary}}>+</Text>
              <CreditCard size={16} color={colors.purple} />
              <Text style={{color: colors.textSecondary}}>+</Text>
              <TrendingUp size={16} color={colors.pink} />
            </View>
          }
        />

        <Pressable onPress={() => router.push('/diario-medio')}>
          <MetricItem 
            label="Diário médio"
            value={avgDaily}
            math={
              <View style={[styles.mathRow, { gap: 4 }]}>
                <Calendar size={18} color={colors.pink} />
                <Text style={{ color: colors.pink, fontWeight: 'bold' }}>/ {monthsWithDaily}</Text>
              </View>
            }
            subvalue={
              <View style={[styles.mathRow, { gap: 4 }]}>
                <TrendingUp size={16} color={colors.pink} />
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
        <MovementItem label="Entradas" value={income} icon={<ArrowDownLeft size={24} color={colors.green} />} />
        <MovementItem label="Saídas" value={expense} icon={<ArrowUpRight size={24} color={colors.red} />} />
        <MovementItem label="Diários" value={daily} icon={<Calendar size={24} color={colors.textPrimary} />} />
        <MovementItem label="Economias" value={savings} icon={<PiggyBank size={24} color={colors.yellow} />} />
        <MovementItem label="Gastos com cartão" value={credit} icon={<CreditCard size={24} color={colors.purple} />} />
        
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
    paddingVertical: 20,
    borderBottomWidth: 1,
  },
  metricLeft: {
    flexDirection: 'column',
    gap: 6,
  },
  metricLabel: {
    fontWeight: '600',
    fontSize: 17,
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
    fontSize: 17,
  },
  metricSubvalue: {
    fontSize: 13,
  },
  progressTrack: {
    width: 80,
    height: 10,
    borderRadius: 50,
    borderWidth: 1,
    overflow: 'hidden',
  },
  progressFill: {
    height: '100%',
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
    paddingVertical: 20,
    borderBottomWidth: 1,
  },
  movementLeft: {
    flexDirection: 'row',
    alignItems: 'center',
    gap: 16,
  },
  movementLabel: {
    fontWeight: '500',
    fontSize: 16,
  },
  movementValue: {
    fontWeight: '500',
    fontSize: 16,
  },
  viewAllButton: {
    flexDirection: 'row',
    alignItems: 'center',
    gap: 16,
    paddingVertical: 20,
  },
  viewAllText: {
    fontWeight: '500',
    fontSize: 16,
  }
});
