import React, { useState, useEffect } from 'react';
import { ArrowDownLeft, ArrowUpRight, CirclePlay, Landmark, CreditCard, Save, Trash2, ChevronDown } from 'lucide-react';
import type { Transaction, Tag } from '../../db/db';

type TransactionType = 'income' | 'expense' | 'daily' | 'savings' | 'credit';

interface Props {
  initialData?: Partial<Transaction>;
  tags: Tag[];
  onSubmit: (data: Partial<Transaction>) => void;
  onDelete?: () => void;
}

const TYPE_OPTIONS: { type: TransactionType; label: string; icon: any; color: string }[] = [
  { type: 'income', label: 'Entrada', icon: ArrowDownLeft, color: 'var(--status-green)' },
  { type: 'expense', label: 'Saída', icon: ArrowUpRight, color: 'var(--status-red)' },
  { type: 'daily', label: 'Diário', icon: CirclePlay, color: 'var(--status-pink)' },
  { type: 'savings', label: 'Economia', icon: Landmark, color: 'var(--status-light-green)' },
  { type: 'credit', label: 'Cartão', icon: CreditCard, color: 'var(--status-purple)' },
];

export const TransactionForm: React.FC<Props> = ({ initialData, tags, onSubmit, onDelete }) => {
  const [formData, setFormData] = useState<Partial<Transaction>>({
    type: 'expense',
    amount: 0,
    description: '',
    date: new Date(),
    isRecurring: false,
    tagId: '',
    ...initialData
  });

  const [isTypeModalOpen, setIsTypeModalOpen] = useState(false);

  useEffect(() => {
    if (initialData) {
      setFormData(prev => ({
        ...prev,
        ...initialData,
        date: initialData.date ? new Date(initialData.date as any) : prev.date
      }));
    }
  }, [initialData]);

  const handleSubmit = (e: React.FormEvent) => {
    e.preventDefault();
    onSubmit(formData);
  };

  const selectedType = TYPE_OPTIONS.find(opt => opt.type === formData.type) || TYPE_OPTIONS[1];

  return (
    <div style={{ display: 'flex', flexDirection: 'column', gap: '1.5rem', padding: '1rem 0' }}>
      {/* Type Selector Trigger */}
      <button 
        type="button"
        onClick={() => setIsTypeModalOpen(true)}
        style={{
          display: 'flex',
          alignItems: 'center',
          justifyContent: 'space-between',
          padding: '1rem',
          background: 'var(--color-surface)',
          border: '1px solid var(--color-border)',
          borderRadius: '12px',
          color: 'white',
          cursor: 'pointer'
        }}
      >
        <div style={{ display: 'flex', alignItems: 'center', gap: '1rem' }}>
          <selectedType.icon color={selectedType.color} size={24} />
          <span style={{ fontWeight: '600', fontSize: '1.1rem' }}>{selectedType.label}</span>
        </div>
        <ChevronDown size={20} color="var(--color-text-secondary)" />
      </button>

      <form 
        aria-label="transaction-form"
        onSubmit={handleSubmit} 
        style={{ display: 'flex', flexDirection: 'column', gap: '1.5rem' }}
      >
        {/* Amount Input */}
        <div>
          <label style={{ display: 'block', fontSize: '0.8rem', color: 'var(--color-text-secondary)', marginBottom: '0.5rem' }}>Valor</label>
          <div style={{ position: 'relative' }}>
            <span style={{ position: 'absolute', left: '1rem', top: '50%', transform: 'translateY(-50%)', fontWeight: 'bold', color: selectedType.color }}>R$</span>
            <input 
              type="number" 
              step="0.01"
              value={formData.amount || ''}
              onChange={e => setFormData({ ...formData, amount: parseFloat(e.target.value) })}
              style={{ 
                width: '100%', 
                padding: '1rem 1rem 1rem 3rem', 
                borderRadius: '12px', 
                border: '1px solid var(--color-border)', 
                background: 'var(--color-surface)',
                color: 'white',
                fontSize: '1.5rem',
                fontWeight: 'bold',
                boxSizing: 'border-box'
              }}
              placeholder="0,00"
              required
            />
          </div>
        </div>

        {/* Description Input */}
        <div>
          <label style={{ display: 'block', fontSize: '0.8rem', color: 'var(--color-text-secondary)', marginBottom: '0.5rem' }}>Descrição</label>
          <input 
            type="text" 
            value={formData.description}
            onChange={e => setFormData({ ...formData, description: e.target.value })}
            style={{ 
              width: '100%', 
              padding: '1.1rem', 
              borderRadius: '12px', 
              border: '1px solid var(--color-border)', 
              background: 'var(--color-surface)',
              color: 'white',
              boxSizing: 'border-box'
            }}
            placeholder="Ex: Almoço, Salário..."
          />
        </div>

        {/* Date & Tag Row */}
        <div style={{ display: 'grid', gridTemplateColumns: '1fr 1fr', gap: '1rem' }}>
          <div>
            <label style={{ display: 'block', fontSize: '0.8rem', color: 'var(--color-text-secondary)', marginBottom: '0.5rem' }}>Data</label>
            <input 
              type="date" 
              value={formData.date instanceof Date ? formData.date.toISOString().split('T')[0] : ''}
              onChange={e => setFormData({ ...formData, date: new Date(e.target.value) })}
              style={{ 
                width: '100%', 
                padding: '1.1rem', 
                borderRadius: '12px', 
                border: '1px solid var(--color-border)', 
                background: 'var(--color-surface)',
                color: 'white',
                boxSizing: 'border-box'
              }}
            />
          </div>
          <div>
            <label style={{ display: 'block', fontSize: '0.8rem', color: 'var(--color-text-secondary)', marginBottom: '0.5rem' }}>Tag</label>
            <select 
              value={formData.tagId}
              onChange={e => setFormData({ ...formData, tagId: e.target.value })}
              style={{ 
                width: '100%', 
                padding: '1.1rem', 
                borderRadius: '12px', 
                border: '1px solid var(--color-border)', 
                background: 'var(--color-surface)',
                color: 'white',
                boxSizing: 'border-box'
              }}
            >
              <option value="">Sem Tag</option>
              {tags.map(tag => (
                <option key={tag.id} value={tag.id}>{tag.name}</option>
              ))}
            </select>
          </div>
        </div>

        {/* Options */}
        <label style={{ display: 'flex', alignItems: 'center', gap: '0.75rem', cursor: 'pointer', padding: '0.5rem 0' }}>
          <input 
            type="checkbox" 
            checked={formData.isRecurring}
            onChange={e => setFormData({ ...formData, isRecurring: e.target.checked })}
            style={{ width: '20px', height: '20px' }}
          />
          <span style={{ fontSize: '1rem' }}>Repetir mensalmente</span>
        </label>

        {/* Actions */}
        <div style={{ display: 'flex', gap: '1rem', marginTop: '1rem' }}>
          {onDelete && (
            <button 
              type="button"
              onClick={onDelete}
              style={{ 
                flex: 1,
                padding: '1.1rem', 
                borderRadius: '12px', 
                border: '1px solid var(--status-red)', 
                backgroundColor: 'transparent', 
                color: 'var(--status-red)', 
                fontWeight: 'bold',
                display: 'flex',
                alignItems: 'center',
                justifyContent: 'center',
                gap: '0.5rem',
                cursor: 'pointer'
              }}
            >
              <Trash2 size={20} /> Excluir
            </button>
          )}
          <button 
            type="submit" 
            style={{ 
              flex: 2,
              padding: '1.1rem', 
              borderRadius: '12px', 
              border: 'none', 
              backgroundColor: 'var(--color-primary)', 
              color: 'white', 
              fontWeight: 'bold',
              display: 'flex',
              alignItems: 'center',
              justifyContent: 'center',
              gap: '0.5rem',
              cursor: 'pointer'
            }}
          >
            <Save size={20} /> Salvar
          </button>
        </div>
      </form>

      {/* Type Selection Modal */}
      {isTypeModalOpen && (
        <>
          <div className="overlay" onClick={() => setIsTypeModalOpen(false)} />
          <div className="filter-sheet">
            <h3 style={{ marginBottom: '1.5rem' }}>Tipo de Transação</h3>
            <div style={{ display: 'flex', flexDirection: 'column', gap: '0.5rem' }}>
              {TYPE_OPTIONS.map((opt) => (
                <button
                  key={opt.type}
                  onClick={() => {
                    setFormData({ ...formData, type: opt.type });
                    setIsTypeModalOpen(false);
                  }}
                  style={{
                    display: 'flex',
                    alignItems: 'center',
                    gap: '1rem',
                    padding: '1.25rem',
                    border: 'none',
                    borderRadius: '12px',
                    background: formData.type === opt.type ? 'var(--color-bg)' : 'transparent',
                    color: 'white',
                    cursor: 'pointer',
                    textAlign: 'left'
                  }}
                >
                  <opt.icon size={24} color={opt.color} />
                  <span style={{ fontSize: '1.1rem', fontWeight: formData.type === opt.type ? 'bold' : 'normal' }}>{opt.label}</span>
                </button>
              ))}
            </div>
          </div>
        </>
      )}
    </div>
  );
};
