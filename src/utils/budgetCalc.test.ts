// src/utils/budgetCalc.test.ts
import { describe, it, expect } from 'vitest';
import { calculateDailyBudget } from './budgetCalc';
import { BudgetCategory } from '../db/db';

describe('calculateDailyBudget', () => {
  it('sums categories and divides by days', () => {
    const categories: BudgetCategory[] = [
      { id: '1', userId: '1', name: 'Comida', monthlyAmount: 200 },
      { id: '2', userId: '1', name: 'Transporte', monthlyAmount: 500 }
    ];
    
    const result = calculateDailyBudget(categories, 30);
    expect(result.total).toBe(700);
    expect(result.daily).toBe(23.33); // 700 / 30 rounded to 2 decimals
  });
});
