import { useState } from 'react';
import { useSQL } from '../db/db';
import type { Tag, Transaction } from '../db/db';
import { Search, PlusCircle, Calendar, ChevronLeft, ChevronRight } from 'lucide-react';
import { startOfMonth, endOfMonth, isWithinInterval, format } from 'date-fns';
import { TagTrapezoid } from '../components/Ledger/TagTrapezoid';
import { TagEditorModal } from '../components/Forms/TagEditorModal';

export const Tags = () => {
  const [currentDate, setCurrentDate] = useState(new Date());
  const [isModalOpen, setIsModalOpen] = useState(false);
  const [selectedTag, setSelectedTag] = useState<Tag | undefined>(undefined);
  
  const monthStart = startOfMonth(currentDate);
  const monthEnd = endOfMonth(currentDate);

  const tags = useSQL<Tag>('SELECT * FROM tags');
  const transactions = useSQL<Transaction>('SELECT * FROM transactions');

  const currentMonthTransactions = transactions.filter(t => 
    isWithinInterval(new Date(t.date), { start: monthStart, end: monthEnd })
  );

  const getTagTotal = (tagId: string) => currentMonthTransactions
    .filter(t => t.tagId === tagId)
    .reduce((sum, t) => sum + Number(t.amount), 0);

  const changeMonth = (offset: number) => {
    const next = new Date(currentDate);
    next.setMonth(currentDate.getMonth() + offset);
    setCurrentDate(next);
  };

  const formatMonth = (date: Date) => {
    const formatted = format(date, 'MMM/yy');
    return formatted.charAt(0).toUpperCase() + formatted.slice(1);
  };

  return (
    <div className="tags-page" style={{ padding: '0 1.25rem 80px 1.25rem' }}>
      <header style={{ 
        display: 'flex', 
        justifyContent: 'space-between', 
        alignItems: 'center', 
        padding: '1.25rem 0',
        backgroundColor: 'var(--color-bg)',
        position: 'sticky',
        top: 0,
        zIndex: 100
      }}>
        <div style={{ position: 'relative', width: '40px', height: '40px', display: 'flex', alignItems: 'center', justifyContent: 'center' }}>
          <Calendar size={32} color="var(--color-primary)" />
          <span style={{ 
            position: 'absolute', 
            top: '55%', 
            left: '50%', 
            transform: 'translate(-50%, -50%)', 
            fontSize: '0.75rem', 
            fontWeight: 'bold',
            color: 'white'
          }}>
            {new Date().getDate()}
          </span>
        </div>

        <div style={{ display: 'flex', alignItems: 'center', gap: '1rem' }}>
          <button onClick={() => changeMonth(-1)} style={{ background: 'none', border: 'none', color: 'var(--color-text-primary)', cursor: 'pointer' }}><ChevronLeft size={24}/></button>
          <span style={{ fontWeight: '700', fontSize: '1.4rem' }}>{formatMonth(currentDate)}</span>
          <button onClick={() => changeMonth(1)} style={{ background: 'none', border: 'none', color: 'var(--color-text-primary)', cursor: 'pointer' }}><ChevronRight size={24}/></button>
        </div>

        <button 
          onClick={() => { setSelectedTag(undefined); setIsModalOpen(true); }}
          style={{ background: 'none', border: 'none', color: 'var(--color-text-primary)', cursor: 'pointer' }}
        >
          <PlusCircle size={28} />
        </button>
      </header>

      <div style={{ position: 'relative', marginBottom: '1.5rem' }}>
        <Search size={18} style={{ position: 'absolute', left: '12px', top: '50%', transform: 'translateY(-50%)', color: 'var(--color-text-secondary)' }} />
        <input 
          type="text" 
          placeholder="Filtrar tags" 
          style={{ 
            width: '100%', 
            padding: '0.75rem 1rem 0.75rem 2.5rem', 
            borderRadius: '12px', 
            border: '1px solid var(--color-border)', 
            background: 'var(--color-surface)', 
            color: 'var(--color-text-primary)',
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
          <div 
            key={tag.id} 
            onClick={() => { setSelectedTag(tag); setIsModalOpen(true); }}
            style={{ display: 'flex', justifyContent: 'space-between', alignItems: 'center', padding: '1.25rem 0', borderBottom: '1px solid var(--color-border)', cursor: 'pointer' }}
          >
            <div style={{ display: 'flex', alignItems: 'center', gap: '1rem' }}>
              <TagTrapezoid color={tag.color} />
              <span style={{ fontWeight: '600', fontSize: '1.1rem' }}>{tag.name}</span>
            </div>
            <span style={{ fontWeight: 'bold', fontSize: '1.1rem' }}>
              R$ {getTagTotal(tag.id).toLocaleString('pt-BR', { minimumFractionDigits: 2 })}
            </span>
          </div>
        ))}
      </div>

      <TagEditorModal 
        isOpen={isModalOpen}
        onClose={() => setIsModalOpen(false)}
        onSave={() => {}}
        tag={selectedTag}
      />
    </div>
  );
};
