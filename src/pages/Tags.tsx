import { useSQL } from '../db/db';
import type { Tag, Transaction } from '../db/db';
import { Search, Edit2, Share2 } from 'lucide-react';
import { startOfMonth, endOfMonth, isWithinInterval } from 'date-fns';
import { TagTrapezoid } from '../components/Ledger/TagTrapezoid';

export const Tags = () => {
  const now = new Date();
  const monthStart = startOfMonth(now);
  const monthEnd = endOfMonth(now);

  const tags = useSQL<Tag>('SELECT * FROM tags');
  const transactions = useSQL<Transaction>('SELECT * FROM transactions');

  const currentMonthTransactions = transactions.filter(t => 
    isWithinInterval(new Date(t.date), { start: monthStart, end: monthEnd })
  );

  const getTagTotal = (tagId: string) => currentMonthTransactions
    .filter(t => t.tagId === tagId)
    .reduce((sum, t) => sum + Number(t.amount), 0);

  return (
    <div className="tags-page" style={{ padding: '0 1rem 80px 1rem' }}>
      <header style={{ display: 'flex', justifyContent: 'space-between', alignItems: 'center', padding: '1.5rem 0' }}>
        <h1 style={{ fontSize: '1.25rem', margin: 0 }}>Tags</h1>
        <div style={{ display: 'flex', gap: '1rem' }}>
          <button style={{ background: 'none', border: 'none', color: 'white', cursor: 'pointer' }}><Edit2 size={20}/></button>
          <button style={{ background: 'none', border: 'none', color: 'white', cursor: 'pointer' }}><Share2 size={20}/></button>
        </div>
      </header>

      <div style={{ position: 'relative', marginBottom: '1.5rem' }}>
        <Search size={18} style={{ position: 'absolute', left: '12px', top: '50%', transform: 'translateY(-50%)', color: 'var(--color-text-secondary)' }} />
        <input 
          type="text" 
          placeholder="Filtrar tags" 
          style={{ 
            width: '100%', 
            padding: '0.75rem 1rem 0.75rem 2.5rem', 
            borderRadius: '8px', 
            border: 'none', 
            background: 'var(--color-surface)', 
            color: 'white',
            boxSizing: 'border-box'
          }}
        />
      </div>

      <div className="tags-list" style={{ display: 'flex', flexDirection: 'column' }}>
        {tags.length === 0 && (
          <p style={{ textAlign: 'center', color: 'var(--color-text-secondary)', marginTop: '2rem' }}>
            Nenhuma tag cadastrada.
          </p>
        )}
        {tags.map(tag => (
          <div key={tag.id} style={{ display: 'flex', justifyContent: 'space-between', alignItems: 'center', padding: '1rem 0', borderBottom: '1px solid var(--color-border)' }}>
            <div style={{ display: 'flex', alignItems: 'center', gap: '1rem' }}>
              <TagTrapezoid color={tag.color || 'var(--color-text-secondary)'} />
              <span style={{ fontWeight: '500' }}>{tag.name}</span>
            </div>
            <span style={{ fontWeight: 'bold' }}>
              R$ {getTagTotal(tag.id).toLocaleString('pt-BR', { minimumFractionDigits: 2 })}
            </span>
          </div>
        ))}
      </div>
    </div>
  );
};
