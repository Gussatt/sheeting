// src/hooks/useFilteredTransactions.ts
import { useMemo } from 'react';
import { useSQL } from '../db/db';
import type { Transaction, Tag } from '../db/db';

export type MetricType = 'calcSaldos' | 'calcPerformance' | 'calcEconomizado' | 'calcCustoVida' | 'calcDiarioMedio';

export const filterTransactionsByMetric = (transactions: Transaction[], tags: Tag[], metric: MetricType) => {
  return transactions.filter(t => {
    if (!t.tagId) return true;
    const tag = tags.find(tag => tag.id === t.tagId);
    if (!tag) return true;
    return tag[metric];
  });
};

export const useFilteredTransactions = (transactions: Transaction[], metric: MetricType) => {
  const tags = useSQL<Tag>('SELECT * FROM tags');
  return useMemo(() => filterTransactionsByMetric(transactions, tags, metric), [transactions, tags, metric]);
};
