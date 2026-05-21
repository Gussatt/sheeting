// src/db/db.test.ts
import { describe, it, expect, beforeEach } from 'vitest';
import 'fake-indexeddb/auto';
import { db } from './db';

describe('SheetingDB', () => {
  beforeEach(async () => {
    await db.delete();
    await db.open();
  });

  it('should store and retrieve BudgetCategories and Tags', async () => {
    const newCat = { id: 'cat1', userId: 'u1', name: 'Comida', monthlyAmount: 200 };
    const newTag = { id: 'tag1', userId: 'u1', name: 'Alimentação', color: '#ff0000' };

    await db.budgetCategories.add(newCat);
    await db.tags.add(newTag);

    const cat = await db.budgetCategories.get('cat1');
    const tag = await db.tags.get('tag1');

    expect(cat).toEqual(newCat);
    expect(tag).toEqual(newTag);
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
