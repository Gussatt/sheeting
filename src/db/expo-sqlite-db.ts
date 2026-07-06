import { useState, useEffect } from 'react';
// @ts-ignore - this will only compile in an Expo project with expo-sqlite installed
import * as SQLite from 'expo-sqlite';

export interface Transaction {
  id: string;
  amount: number;
  type: 'income' | 'expense' | 'daily' | 'savings' | 'credit';
  date: Date | string;
  tagId: string;
  isRecurring: boolean;
  recurringFrequency?: 'daily' | 'weekly' | 'monthly' | 'yearly';
  recurringIndefinite?: boolean;
  recurringCount?: number;
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
  color: string;
  calcSaldos: boolean;
  calcPerformance: boolean;
  calcEconomizado: boolean;
  calcCustoVida: boolean;
  calcDiarioMedio: boolean;
}

const toCamel = (str: string) =>
  str.replace(/([-_][a-z])/g, (group) => group.toUpperCase().replace('-', '').replace('_', ''));

export function mapKeys<T>(obj: any, mapper: (s: string) => string): T {
  if (Array.isArray(obj)) return obj.map((v) => mapKeys(v, mapper)) as any;
  if (obj !== null && typeof obj === 'object' && obj.constructor === Object) {
    return Object.keys(obj).reduce(
      (acc, key) => ({
        ...acc,
        [mapper(key)]: mapKeys(obj[key], mapper),
      }),
      {},
    ) as T;
  }
  return obj;
}

// Global event bus to emulate PGlite's live queries across the app
type Listener = () => void;
const listeners: Set<Listener> = new Set();
const dbEvents = {
  subscribe: (listener: Listener) => {
    listeners.add(listener);
    return { unsubscribe: () => listeners.delete(listener) };
  },
  next: () => {
    listeners.forEach((l) => l());
  },
};

class SheetingSQLiteDB {
  private db: SQLite.SQLiteDatabase | null = null;
  private initPromise: Promise<void> | null = null;
  private suppressEvents = false;

  async init() {
    if (this.initPromise) return this.initPromise;
    this.initPromise = (async () => {
      console.log('Initializing Expo SQLite...');
      // @ts-ignore
      this.db = await SQLite.openDatabaseAsync('sheeting.db');

      console.log('Applying SQLite schema...');
      await this.db.execAsync(`
        PRAGMA journal_mode = WAL;
        PRAGMA foreign_keys = ON;

        CREATE TABLE IF NOT EXISTS transactions (
          id TEXT PRIMARY KEY,
          amount REAL NOT NULL,
          type TEXT NOT NULL,
          date TEXT NOT NULL,
          description TEXT,
          tag_id TEXT,
          is_recurring INTEGER DEFAULT 0,
          recurring_frequency TEXT,
          recurring_indefinite INTEGER DEFAULT 1,
          recurring_count INTEGER
        );

        CREATE TABLE IF NOT EXISTS budget_categories (
          id TEXT PRIMARY KEY,
          name TEXT NOT NULL,
          monthly_amount REAL NOT NULL
        );

        CREATE TABLE IF NOT EXISTS tags (
          id TEXT PRIMARY KEY,
          name TEXT NOT NULL,
          color TEXT,
          calc_saldos INTEGER DEFAULT 1,
          calc_performance INTEGER DEFAULT 1,
          calc_economizado INTEGER DEFAULT 1,
          calc_custo_vida INTEGER DEFAULT 1,
          calc_diario_medio INTEGER DEFAULT 1
        );

        CREATE TABLE IF NOT EXISTS config (
          key TEXT PRIMARY KEY,
          value TEXT
        );

        CREATE TABLE IF NOT EXISTS daily_status (
          date TEXT PRIMARY KEY,
          is_checked INTEGER DEFAULT 0
        );

        CREATE TABLE IF NOT EXISTS tag_keywords (
          id TEXT PRIMARY KEY,
          tag_id TEXT NOT NULL,
          keyword TEXT NOT NULL,
          FOREIGN KEY (tag_id) REFERENCES tags(id) ON DELETE CASCADE
        );

        CREATE INDEX IF NOT EXISTS idx_tag_keywords_tag_id ON tag_keywords(tag_id);
        CREATE INDEX IF NOT EXISTS idx_tag_keywords_keyword ON tag_keywords(keyword);
      `);
      console.log('Schema applied successfully.');
    })();
    return this.initPromise;
  }

  // Convert Postgres $1 parameter notation to SQLite ? notation
  private convertSql(sql: string) {
    return sql.replace(/\$[0-9]+/g, '?');
  }

  async query<T>(sql: string, params: any[] = []): Promise<T[]> {
    await this.init();
    const sqliteQuery = this.convertSql(sql);
    // @ts-ignore
    const result = await this.db!.getAllAsync(sqliteQuery, params);

    // SQLite returns booleans as 0/1, convert them back or map keys
    const mapped = mapKeys<T[]>(result, toCamel);

    // Simple boolean mapping for specific known fields
    return (mapped as any[]).map((row) => {
      const fixedRow = { ...row };
      if ('isRecurring' in fixedRow) fixedRow.isRecurring = !!fixedRow.isRecurring;
      if ('calcSaldos' in fixedRow) fixedRow.calcSaldos = !!fixedRow.calcSaldos;
      // Convert SQLite TEXT dates back to format expected by UI if necessary
      return fixedRow;
    }) as T[];
  }

  async exec(sql: string, params: any[] = []): Promise<void> {
    await this.init();
    const sqliteQuery = this.convertSql(sql);
    // @ts-ignore
    await this.db!.runAsync(sqliteQuery, params);

    // Notify all useSQL hooks that data has changed (unless suppressed by a transaction)
    if (!this.suppressEvents) {
      dbEvents.next();
    }
  }

  async withTransactionAsync(task: () => Promise<void>): Promise<void> {
    await this.init();
    const previous = this.suppressEvents;
    this.suppressEvents = true;
    try {
      // @ts-ignore
      await this.db!.withTransactionAsync(task);
    } finally {
      this.suppressEvents = previous;
    }
    // Notify all useSQL hooks once after the transaction commits
    dbEvents.next();
  }
}

export const db = new SheetingSQLiteDB();

export function useSQL<T>(query: string, params?: any[]): T[] {
  const [results, setResults] = useState<T[]>([]);
  const paramsStr = JSON.stringify(params);

  const fetchResults = async () => {
    try {
      const res = await db.query<T>(query, params);
      setResults(res);
    } catch (err) {
      console.error('useSQL Error:', err);
    }
  };

  useEffect(() => {
    fetchResults();

    // Re-fetch whenever a write operation occurs
    const subscription = dbEvents.subscribe(() => {
      fetchResults();
    });

    return () => {
      subscription.unsubscribe();
    };
  }, [query, paramsStr]);

  return results;
}
