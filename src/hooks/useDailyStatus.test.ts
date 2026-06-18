import { describe, it, expect, vi } from 'vitest';

// Mock the db module to avoid pulling in expo-sqlite / react-native
vi.mock('../db/db', () => ({
  db: { query: vi.fn(), exec: vi.fn() },
  useSQL: vi.fn(() => []),
}));

import { buildDateKey } from './useDailyStatus';

describe('buildDateKey', () => {
  it('formats a year, month (0-indexed), and day into YYYY-MM-DD', () => {
    expect(buildDateKey(2026, 5, 18)).toBe('2026-06-18');
  });

  it('zero-pads single-digit months and days', () => {
    expect(buildDateKey(2026, 0, 3)).toBe('2026-01-03');
  });
});
