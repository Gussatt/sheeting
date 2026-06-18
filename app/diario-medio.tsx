import React, { useState } from 'react';
import { View, Text, StyleSheet, Pressable, ScrollView } from 'react-native';
import { useRouter } from 'expo-router';
import { ArrowLeft, ChevronLeft, ChevronRight, ChevronDown } from 'lucide-react-native';
import { useSQL } from '../src/db/db';
import type { Transaction } from '../src/db/db';
import { startOfMonth, endOfMonth, isWithinInterval, format, getDaysInMonth } from 'date-fns';
import { ptBR } from 'date-fns/locale/pt-BR';
import { useAppTheme } from '../src/styles/theme';
import { useSafeAreaInsets } from 'react-native-safe-area-context';

export default function DiarioMedioScreen() {
  const router = useRouter();
  const { colors } = useAppTheme();
  const insets = useSafeAreaInsets();
  const [currentYear, setCurrentYear] = useState(new Date().getFullYear());
  const [showExplanation, setShowExplanation] = useState(true);

  const allTransactions = useSQL<Transaction>('SELECT * FROM transactions');

  const months = Array.from({ length: 6 }, (_, i) => new Date(currentYear, i, 1));

  const monthData = months.map(date => {
    const monthStart = startOfMonth(date);
    const monthEnd = endOfMonth(date);
    const dayOfMonth = getDaysInMonth(date);
    
    const currentMonthTransactions = allTransactions.filter(t => 
      isWithinInterval(new Date(t.date), { start: monthStart, end: monthEnd })
    );

    const dailyExpenses = currentMonthTransactions
      .filter(t => t.type === 'daily')
      .reduce((sum, t) => sum + Number(t.amount), 0);

    const avgDaily = dailyExpenses / dayOfMonth;

    const monthName = format(date, 'MMMM', { locale: ptBR });
    const capitalizedMonthName = monthName.charAt(0).toUpperCase() + monthName.slice(1);

    return {
      name: capitalizedMonthName,
      avg: avgDaily,
      total: dailyExpenses,
      days: dayOfMonth
    };
  });

  return (
    <View style={[styles.container, { backgroundColor: colors.bg, paddingTop: insets.top }]}>
      <View style={[styles.header, { borderBottomColor: colors.border }]}>
        <View style={styles.headerLeft}>
          <Pressable onPress={() => router.back()} style={styles.iconBtn}>
            <ArrowLeft size={28} color={colors.textPrimary} />
          </Pressable>
          <Text style={[styles.title, { color: colors.textPrimary }]}>Diário médio</Text>
        </View>
      </View>

      <ScrollView contentContainerStyle={styles.content}>
        <View style={[styles.yearSelector, { backgroundColor: colors.surface, borderColor: colors.border }]}>
          <Pressable onPress={() => setCurrentYear(y => y - 1)} style={styles.iconBtn}>
            <ChevronLeft size={24} color={colors.textPrimary} />
          </Pressable>
          <Text style={[styles.yearText, { color: colors.textPrimary }]}>{currentYear}</Text>
          <Pressable onPress={() => setCurrentYear(y => y + 1)} style={styles.iconBtn}>
            <ChevronRight size={24} color={colors.textPrimary} />
          </Pressable>
        </View>

        <View style={[styles.explanationSection, { borderBottomColor: colors.border, paddingBottom: showExplanation ? 24 : 16 }]}>
          <Pressable 
            onPress={() => setShowExplanation(!showExplanation)}
            style={[styles.explanationHeader, { marginBottom: showExplanation ? 16 : 0 }]}
          >
            <Text style={[styles.explanationTitle, { color: colors.textSecondary }]}>Como funciona o diário médio?</Text>
            <ChevronDown size={20} color={colors.textSecondary} style={{ transform: [{ rotate: showExplanation ? '180deg' : '0deg' }] }} />
          </Pressable>
          
          {showExplanation && (
            <Text style={[styles.explanationText, { color: colors.textPrimary }]}>
              É a soma de todos os gastos diários (sem considerar previsão futura) dividida pelo número de dias do mês. Assim você sabe, em média, quanto gasta por dia no seu estilo de vida.
            </Text>
          )}
        </View>

        <View style={styles.list}>
          {monthData.map((data, idx) => (
            <View key={idx} style={styles.listItem}>
              <Text style={[styles.listMonth, { color: colors.textPrimary }]}>{data.name}</Text>
              <View style={styles.listRight}>
                <Text style={[styles.listAvg, { color: colors.textPrimary }]}>
                  R$ {data.avg.toFixed(2).replace('.', ',')}
                </Text>
                <Text style={[styles.listDetail, { color: colors.textSecondary }]}>
                  R$ {data.total.toFixed(2).replace('.', ',')} / {data.days}
                </Text>
              </View>
            </View>
          ))}
        </View>
      </ScrollView>
    </View>
  );
}

const styles = StyleSheet.create({
  container: { flex: 1 },
  header: {
    flexDirection: 'row',
    alignItems: 'center',
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
    padding: 20,
    paddingBottom: 60,
  },
  yearSelector: {
    flexDirection: 'row',
    alignItems: 'center',
    justifyContent: 'space-between',
    paddingHorizontal: 16,
    paddingVertical: 12,
    borderRadius: 12,
    borderWidth: 1,
    marginBottom: 24,
  },
  yearText: {
    fontSize: 18,
    fontWeight: 'bold',
  },
  explanationSection: {
    borderBottomWidth: 1,
    marginBottom: 24,
  },
  explanationHeader: {
    flexDirection: 'row',
    justifyContent: 'space-between',
    alignItems: 'center',
  },
  explanationTitle: {
    fontSize: 16,
    fontWeight: '500',
  },
  explanationText: {
    fontSize: 15,
    lineHeight: 22,
  },
  list: {
    gap: 24,
  },
  listItem: {
    flexDirection: 'row',
    justifyContent: 'space-between',
    alignItems: 'flex-start',
  },
  listMonth: {
    fontSize: 18,
    fontWeight: 'bold',
  },
  listRight: {
    alignItems: 'flex-end',
    gap: 4,
  },
  listAvg: {
    fontSize: 18,
    fontWeight: '500',
  },
  listDetail: {
    fontSize: 14,
  }
});
