import React from 'react';
import { View, Text, StyleSheet, ScrollView } from 'react-native';
import { parse } from 'date-fns';
import { HorizonteCell } from './HorizonteCell';
import type { MonthProjection } from '../../utils/projection';
import { useAppTheme } from '../../styles/theme';
import { buildDateKey } from '../../hooks/useDailyStatus';

interface Props {
  projections: MonthProjection[];
  checkedDates?: Set<string>;
  onToggleDay?: (dateKey: string) => void;
}

export const HorizonteGrid: React.FC<Props> = ({ projections, checkedDates, onToggleDay }) => {
  const { colors, isDark } = useAppTheme();
  const maxDays = 31;

  return (
    <ScrollView
      horizontal
      style={styles.horizontalScroll}
      contentContainerStyle={styles.contentContainer}
    >
      {projections.map((month, idx) => {
        const isCurrentMonth = idx === 0;
        const parsedDate = parse(month.monthName, 'MMM/yy', new Date());
        const year = parsedDate.getFullYear();
        const month0 = parsedDate.getMonth();

        return (
          <View
            key={month.monthName}
            style={[
              styles.monthCol,
              { backgroundColor: colors.bg, borderRightColor: colors.border },
            ]}
          >
            <View
              style={[
                styles.header,
                {
                  backgroundColor: isCurrentMonth ? (isDark ? '#fff' : '#1a1a1a') : colors.surface,
                  borderBottomColor: colors.border,
                },
              ]}
            >
              <Text
                style={[
                  styles.headerText,
                  { color: isCurrentMonth ? (isDark ? '#000' : '#fff') : colors.textPrimary },
                ]}
              >
                {month.monthName}
              </Text>
            </View>

            <ScrollView style={styles.verticalScroll}>
              {Array.from({ length: maxDays }, (_, i) => {
                const dayData = month.days.find((d) => d.day === i + 1);
                if (dayData) {
                  const dateKey = buildDateKey(year, month0, dayData.day);
                  return (
                    <HorizonteCell
                      key={i}
                      day={dayData.day}
                      balance={dayData.balance}
                      isChecked={checkedDates?.has(dateKey)}
                      onToggle={onToggleDay ? () => onToggleDay(dateKey) : undefined}
                    />
                  );
                }
                return (
                  <View key={i} style={[styles.emptyCell, { borderBottomColor: colors.border }]} />
                );
              })}
            </ScrollView>
          </View>
        );
      })}
    </ScrollView>
  );
};

const styles = StyleSheet.create({
  horizontalScroll: {
    flex: 1,
  },
  contentContainer: {
    flexDirection: 'row',
  },
  monthCol: {
    width: 120,
    borderRightWidth: 1,
  },
  header: {
    height: 40,
    alignItems: 'center',
    justifyContent: 'center',
    borderBottomWidth: 1,
  },
  headerText: {
    fontWeight: 'bold',
    fontSize: 14,
  },
  verticalScroll: {
    flex: 1,
  },
  emptyCell: {
    height: 36,
    borderBottomWidth: 1,
    opacity: 0.1,
  },
});
