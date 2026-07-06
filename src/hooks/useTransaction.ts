import { useState, useEffect, useMemo } from 'react';
import { db } from '../db/db';
import type { Transaction } from '../db/db';
import { findMatchingTagId } from '../utils/autoTag';

interface UseTransactionReturn {
  initialData: Partial<Transaction> | undefined;
  loading: boolean;
  saveTransaction: (data: Partial<Transaction>) => Promise<void>;
  deleteTransaction: () => Promise<void>;
}

export const useTransaction = (
  id?: string,
  typeParam?: string | null,
  dateParam?: string | null,
): UseTransactionReturn => {
  const [dbData, setDbData] = useState<Partial<Transaction> | undefined>(undefined);
  const [dbLoading, setDbLoading] = useState(!!id);

  useEffect(() => {
    if (id) {
      db.query<Transaction>('SELECT * FROM transactions WHERE id = $1', [id]).then((rows) => {
        if (rows.length > 0) {
          setDbData({
            ...rows[0],
            date: new Date(rows[0].date),
          });
        }
        setDbLoading(false);
      });
    }
  }, [id]);

  const initialData = useMemo(() => {
    if (id) return dbData;

    let initialDate = new Date();
    if (dateParam) {
      const [y, m, d] = dateParam.split('-').map(Number);
      initialDate = new Date(y, m - 1, d);
    }

    if (typeParam || dateParam) {
      return {
        type: (typeParam as Transaction['type']) || 'expense',
        date: initialDate,
        amount: 0,
        description: '',
        tagId: '',
        isRecurring: false,
      };
    }
    return undefined;
  }, [id, dbData, typeParam, dateParam]);

  const saveTransaction = async (data: Partial<Transaction>) => {
    if (!data.type) return;

    if (!data.tagId) {
      const description = (data.description || '').toLowerCase();
      if (description) {
        const keywords = await db.query<{ tagId: string; keyword: string }>(
          `SELECT tag_keywords.tag_id AS tag_id, keyword
           FROM tag_keywords
           JOIN tags ON tag_keywords.tag_id = tags.id
           ORDER BY tags.name ASC`,
        );
        const matchId = findMatchingTagId(description, keywords);
        if (matchId) data.tagId = matchId;
      }
    }

    const amount = Number(data.amount) || 0;
    const dateToStore = data.date instanceof Date ? data.date : new Date(data.date as string);
    dateToStore.setHours(12, 0, 0, 0);

    const params = [
      amount,
      data.type,
      dateToStore.toISOString(),
      data.description || '',
      data.tagId || null,
      data.isRecurring || false,
      data.recurringFrequency || null,
      data.recurringIndefinite ?? true,
      data.recurringCount || null,
    ];

    if (id) {
      await db.exec(
        `UPDATE transactions 
         SET amount = $1, type = $2, date = $3, description = $4, tag_id = $5, is_recurring = $6, 
             recurring_frequency = $7, recurring_indefinite = $8, recurring_count = $9 
         WHERE id = $10`,
        [...params, id],
      );
    } else {
      const newId =
        typeof crypto !== 'undefined' && crypto.randomUUID
          ? crypto.randomUUID()
          : Math.random().toString(36).substring(2) + Date.now().toString(36);

      await db.exec(
        `INSERT INTO transactions (id, amount, type, date, description, tag_id, is_recurring, 
                                 recurring_frequency, recurring_indefinite, recurring_count) 
         VALUES ($1, $2, $3, $4, $5, $6, $7, $8, $9, $10)`,
        [newId, ...params],
      );
    }
  };

  const deleteTransaction = async () => {
    if (id) {
      await db.exec('DELETE FROM transactions WHERE id = $1', [id]);
    }
  };

  return { initialData, loading: id ? dbLoading : false, saveTransaction, deleteTransaction };
};
