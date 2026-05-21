import React from 'react';

type FilterType = 'all' | 'income' | 'expense' | 'daily' | 'savings' | 'credit';

interface FilterSheetProps {
  isOpen: boolean;
  onSelect: (type: FilterType) => void;
  onClose: () => void;
}

export const FilterSheet: React.FC<FilterSheetProps> = ({ isOpen, onSelect, onClose }) => {
  if (!isOpen) return null;

  return (
    <div style={{ position: 'fixed', bottom: 0, width: '100%', background: 'white', padding: '16px' }}>
      <h3>Mostrar</h3>
      <button onClick={onClose}>X</button>
      <ul>
        <li onClick={() => onSelect('income')}>Entradas</li>
        <li onClick={() => onSelect('expense')}>Saídas</li>
        <li onClick={() => onSelect('daily')}>Diários</li>
        <li onClick={() => onSelect('savings')}>Economias</li>
        <li onClick={() => onSelect('credit')}>Gastos com cartão</li>
      </ul>
    </div>
  );
};
