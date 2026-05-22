import { PGlite } from '@electric-sql/pglite';
import { live } from '@electric-sql/pglite/live';
import { useState, useEffect } from 'react';
// @ts-ignore - Vite raw import
import schemaSql from './schema.sql?raw';

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

const toCamel = (str: string) => str.replace(/([-_][a-z])/g, (group) => group.toUpperCase().replace('-', '').replace('_', ''));

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

class SheetingDB {
  private pg: PGlite | null = null;
  private initPromise: Promise<void> | null = null;
  private dataDir: string = 'idb://sheeting-db';

  setDataDir(dir: string) {
    this.dataDir = dir;
    this.pg = null;
    this.initPromise = null;
  }

  async init() {
    if (this.initPromise) return this.initPromise;
    this.initPromise = (async () => {
      console.log(`Initializing PGLite with dataDir: ${this.dataDir}...`);
      this.pg = await PGlite.create({
        dataDir: this.dataDir === 'memory' ? undefined : this.dataDir,
        extensions: { live }
      });
      console.log('PGLite instance created, applying schema...');
      await this.pg.exec(schemaSql);
      console.log('Schema applied successfully.');
    })();
    return this.initPromise;
  }

  async query<T>(sql: string, params?: any[]): Promise<T[]> {
    await this.init();
    const res = await this.pg!.query(sql, params);
    return mapKeys<T[]>(res.rows, toCamel);
  }

  async exec(sql: string, params?: any[]): Promise<void> {
    await this.init();
    await this.pg!.query(sql, params);
  }

  get instance() {
    return this.pg;
  }
}

export const db = new SheetingDB();

export function useSQL<T>(query: string, params?: any[]): T[] {
  const [results, setResults] = useState<T[]>([]);
  const paramsStr = JSON.stringify(params);

  useEffect(() => {
    let unsub: (() => void) | undefined;

    (async () => {
      await db.init();
      const ret = await (db.instance as any).live.query(query, params || [], (res: any) => {
        setResults(mapKeys<T[]>(res.rows, toCamel));
      });
      unsub = ret.unsubscribe;
    })();

    return () => {
      if (unsub) unsub();
    };
  }, [query, paramsStr]);

  return results;
}
