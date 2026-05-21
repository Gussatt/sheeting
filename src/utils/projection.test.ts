import { describe, it, expect } from 'vitest';
import { calculateProjection } from './projection';
import { Transaction } from '../db/db';

describe('calculateProjection', () => {
  it('projects balance correctly with daily allowance and recurring items', () => {
    const startDate = new Date('2026-05-01T12:00:00');
    const initialBalance = 1000;
    const dailyAllowance = 50; // Spend per day
    const transactions: Transaction[] = [
      { id: '1', amount: 500, type: 'income', date: new Date('2026-05-15T12:00:00'), tagId: 't', isRecurring: false, description: 'Bonus' }
    ];

    const result = calculateProjection(startDate, initialBalance, dailyAllowance, transactions, 1); // 1 month
    
    // Day 1: 1000 - 50 = 950
    expect(result[0].days[0].balance).toBe(950);
    // Day 15: Previous(14 days) + 500 - 50
    // 1000 - (15 * 50) + 500 = 1000 - 750 + 500 = 750
    expect(result[0].days[14].balance).toBe(750);
  });
});
