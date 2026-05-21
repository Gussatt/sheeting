// src/utils/budgetCalc.ts
import { BudgetCategory } from '../db/db';

export const calculateDailyBudget = (categories: BudgetCategory[], days: number) => {
  const total = categories.reduce((sum, cat) => sum + cat.monthlyAmount, 0);
  const daily = days > 0 ? Number((total / days).toFixed(2)) : 0;
  return { total, daily };
};
