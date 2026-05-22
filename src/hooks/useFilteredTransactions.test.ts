// src/hooks/useFilteredTransactions.test.ts
import { describe, it, expect } from 'vitest';
import { filterTransactionsByMetric } from './useFilteredTransactions';

describe('filterTransactionsByMetric', () => {
  const mockTags = [{ id: '1', calcSaldos: false, name: 'Ignore' }];
  const mockTxs = [{ tagId: '1', amount: 100, description: 'Test' }];

  it('filters out transactions based on tag settings', () => {
    const result = filterTransactionsByMetric(mockTxs as any, mockTags as any, 'calcSaldos');
    expect(result).toHaveLength(0);
  });
});
