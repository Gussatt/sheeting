import React from 'react';

interface Props {
  name: string;
  amount: number;
  onDelete: () => void;
}

export const BudgetCategoryItem: React.FC<Props> = ({ name, amount, onDelete }) => {
  return (
    <div 
      onClick={() => {
        if (confirm(`Remover ${name}?`)) onDelete();
      }}
      style={{ 
        display: 'flex', 
        justifyContent: 'space-between', 
        alignItems: 'center',
        padding: '1.5rem 0', 
        borderBottom: '1px solid #E0E0E0',
        cursor: 'pointer'
      }}
    >
      <span style={{ fontWeight: '600', fontSize: '1.1rem', color: '#1a1a1a' }}>{name}</span>
      <span style={{ fontWeight: '500', fontSize: '1.1rem', color: '#1a1a1a' }}>
        R$ {amount.toLocaleString('pt-BR', { minimumFractionDigits: 2 })}
      </span>
    </div>
  );
};
