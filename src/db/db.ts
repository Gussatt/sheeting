import Dexie, { Table } from 'dexie';

export interface Transaction {
  id: string;
  amount: number;
  type: 'income' | 'expense';
  date: Date;
  tagId: string;
  isRecurring: boolean;
  recurringFrequency?: 'weekly' | 'monthly' | 'yearly';
  description: string;
  debtId?: string;
}

export class SheetingDB extends Dexie {
  transactions!: Table<Transaction>;

  constructor() {
    super('SheetingDB');
    this.version(1).stores({
      transactions: 'id, type, date, tagId, isRecurring'
    });
  }
}

export const db = new SheetingDB();
