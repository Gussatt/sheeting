// src/db/db.ts
import Dexie, { type Table } from 'dexie';

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

const toCamel = (str: string) => str.replace(/([-_][a-z])/g, (group) => group.toUpperCase().replace('-', '').replace('_', ''));
const toSnake = (str: string) => str.replace(/[A-Z]/g, (letter) => `_${letter.toLowerCase()}`);

export function mapKeys<T>(obj: any, mapper: (s: string) => string): T {
  if (Array.isArray(obj)) return obj.map(v => mapKeys(v, mapper)) as any;
  if (obj !== null && typeof obj === 'object' && obj.constructor === Object) {
    return Object.keys(obj).reduce((acc, key) => ({
      ...acc,
      [mapper(key)]: mapKeys(obj[key], mapper)
    }), {}) as T;
  }
  return obj;
}

console.log('Initializing SheetingDB...');
export class SheetingDB extends Dexie {
  transactions!: Table<Transaction>;
  budgetCategories!: Table<BudgetCategory>;
  tags!: Table<Tag>;

  constructor() {
    super('SheetingDB');
    try {
      this.version(2).stores({
        transactions: 'id, type, date, tagId, isRecurring',
        budgetCategories: 'id, userId',
        tags: 'id, userId'
      });
      console.log('SheetingDB schema defined');
    } catch (e) {
      console.error('Error defining SheetingDB schema:', e);
    }
  }
}

export const db = new SheetingDB();
console.log('SheetingDB instance created');
