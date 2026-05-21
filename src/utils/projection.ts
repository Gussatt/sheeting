import { Transaction } from '../db/db';
import { addDays, format, startOfMonth, endOfMonth, eachDayOfInterval, isSameDay } from 'date-fns';

export interface DayProjection {
  day: number;
  balance: number;
}

export interface MonthProjection {
  monthName: string;
  days: DayProjection[];
}

export const calculateProjection = (
  startDate: Date,
  initialBalance: number,
  dailyAllowance: number,
  transactions: Transaction[],
  monthsToProject: number = 3
): MonthProjection[] => {
  let currentBalance = initialBalance;
  const projections: MonthProjection[] = [];
  let currentDate = startOfMonth(startDate);

  for (let m = 0; m < monthsToProject; m++) {
    const monthStart = startOfMonth(currentDate);
    const monthEnd = endOfMonth(currentDate);
    const daysInMonth = eachDayOfInterval({ start: monthStart, end: monthEnd });
    
    const dayProjections: DayProjection[] = [];

    daysInMonth.forEach((date) => {
      // 1. Subtract daily allowance
      currentBalance -= dailyAllowance;

      // 2. Add/Sub transactions for this day
      const daysTransactions = transactions.filter(t => isSameDay(new Date(t.date), date));
      daysTransactions.forEach(t => {
        if (t.type === 'income') currentBalance += t.amount;
        else if (t.type === 'expense') currentBalance -= t.amount;
        // Other types like 'daily' are handled by the dailyAllowance parameter
      });

      dayProjections.push({
        day: date.getDate(),
        balance: currentBalance
      });
    });

    projections.push({
      monthName: format(currentDate, 'MMM/yy'),
      days: dayProjections
    });

    currentDate = addDays(monthEnd, 1);
  }

  return projections;
};
