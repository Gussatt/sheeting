// src/db/db.ts
import Dexie, { Table } from 'dexie';

export interface Transaction {
  id: string;
  amount: number;
  type: 'income' | 'expense' | 'daily' | 'savings' | 'credit';
  date: Date;
  tagId: string;
  isRecurring: boolean;
  recurringFrequency?: 'weekly' | 'monthly' | 'yearly';
  description: string;
  debtId?: string;
}

export interface BudgetCategory {
  id: string;
  userId: string;
  name: string;
  monthlyAmount: number;
}

export interface Tag {
  id: string;
  userId: string;
  name: string;
  color?: string;
}

export class SheetingDB extends Dexie {
  transactions!: Table<Transaction>;
  budgetCategories!: Table<BudgetCategory>;
  tags!: Table<Tag>;

  constructor() {
    super('SheetingDB');
    this.version(2).stores({
      transactions: 'id, type, date, tagId, isRecurring',
      budgetCategories: 'id, userId',
      tags: 'id, userId'
    });
  }
}

export const db = new SheetingDB();
