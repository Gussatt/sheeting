import React from 'react';
import { Trash2 } from 'lucide-react';

interface Props {
  name: string;
  amount: number;
  onDelete: () => void;
}

export const BudgetCategoryItem: React.FC<Props> = ({ name, amount, onDelete }) => {
  return (
    <div style={{ display: 'flex', justifyContent: 'space-between', padding: '12px', borderBottom: '1px solid var(--color-border)' }}>
      <div style={{ display: 'flex', flexDirection: 'column' }}>
        <span style={{ fontWeight: '500' }}>{name}</span>
        <span style={{ fontSize: '0.9rem', color: 'var(--color-text)', opacity: 0.7 }}>R$ {amount.toLocaleString('pt-BR', { minimumFractionDigits: 2 })}</span>
      </div>
      <button 
        onClick={onDelete} 
        aria-label="delete"
        style={{ background: 'none', border: 'none', color: 'var(--status-red)', cursor: 'pointer' }}
      >
        <Trash2 size={20} />
      </button>
    </div>
  );
};
