import { describe, it, expect, beforeEach, beforeAll } from 'vitest';
import { db } from './db';

describe('SheetingDB', () => {
  beforeAll(async () => {
    db.setDataDir('memory');
    await db.init();
  });

  beforeEach(async () => {
    await db.exec('DELETE FROM transactions');
    await db.exec('DELETE FROM budget_categories');
    await db.exec('DELETE FROM tags');
  });

  it('should store and retrieve BudgetCategories and Tags via SQL', async () => {
    const catId = crypto.randomUUID();
    const tagId = crypto.randomUUID();

    await db.exec(
      'INSERT INTO budget_categories (id, name, monthly_amount) VALUES ($1, $2, $3)',
      [catId, 'Comida', 200]
    );
    await db.exec(
      'INSERT INTO tags (id, name, color) VALUES ($1, $2, $3)',
      [tagId, 'Alimentação', '#ff0000']
    );

    const cats = await db.query<any>('SELECT * FROM budget_categories WHERE id = $1', [catId]);
    const tags = await db.query<any>('SELECT * FROM tags WHERE id = $1', [tagId]);

    expect(cats[0].name).toBe('Comida');
    expect(cats[0].monthlyAmount).toBe("200.00"); // Postgres DECIMAL returns as string in some drivers, or we mapped it.
    expect(tags[0].name).toBe('Alimentação');
  });

  it('should successfully add and retrieve a transaction via SQL', async () => {
    const txId = crypto.randomUUID();
    const now = new Date().toISOString();

    await db.exec(
      `INSERT INTO transactions (id, amount, type, date, description, tag_id, is_recurring) 
       VALUES ($1, $2, $3, $4, $5, $6, $7)`,
      [txId, 100.50, 'income', now, 'Test Income', 'tag-1', false]
    );

    const rows = await db.query<any>('SELECT * FROM transactions WHERE id = $1', [txId]);
    expect(rows).toHaveLength(1);
    expect(rows[0].id).toBe(txId);
    expect(Number(rows[0].amount)).toBe(100.50);
    expect(rows[0].description).toBe('Test Income');
  });
});
