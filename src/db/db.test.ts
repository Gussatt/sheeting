// src/db/db.test.ts
import { describe, it, expect, beforeEach } from 'vitest';
import 'fake-indexeddb/auto';
import { db } from './db';

describe('Database Adapter', () => {
  beforeEach(async () => {
    await db.transactions.clear();
  });

  it('should successfully add and retrieve a transaction', async () => {
    const tx = {
      id: 'tx-1',
      amount: 100,
      type: 'income' as const,
      date: new Date('2026-05-20'),
      tagId: 'tag-1',
      isRecurring: false,
      description: 'Test Income'
    };

    await db.transactions.add(tx);
    const stored = await db.transactions.get('tx-1');
    expect(stored).toEqual(tx);
  });
});
