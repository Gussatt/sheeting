import { useCallback } from 'react';
import { db, useSQL } from '../db/db';

/** Build a `YYYY-MM-DD` key from year, 0-indexed month, and day. */
export function buildDateKey(year: number, month0: number, day: number): string {
  const mm = String(month0 + 1).padStart(2, '0');
  const dd = String(day).padStart(2, '0');
  return `${year}-${mm}-${dd}`;
}

interface DailyStatusRow {
  date: string;
  isChecked: number;
}

/**
 * Reactive hook — reads all checked dates from `daily_status` and
 * returns a Set<string> of date keys plus a toggle function.
 */
export function useDailyStatus() {
  const rows = useSQL<DailyStatusRow>('SELECT date, is_checked FROM daily_status WHERE is_checked = 1');
  const checkedDates = new Set(rows.map(r => r.date));

  const toggleDate = useCallback(async (dateKey: string) => {
    const existing = await db.query<DailyStatusRow>(
      'SELECT is_checked FROM daily_status WHERE date = $1',
      [dateKey]
    );

    if (existing.length === 0) {
      await db.exec(
        'INSERT INTO daily_status (date, is_checked) VALUES ($1, 1)',
        [dateKey]
      );
    } else {
      const newVal = existing[0].isChecked ? 0 : 1;
      await db.exec(
        'UPDATE daily_status SET is_checked = $1 WHERE date = $2',
        [newVal, dateKey]
      );
    }
  }, []);

  return { checkedDates, toggleDate };
}
