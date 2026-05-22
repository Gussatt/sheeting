import React from 'react';
import { ArrowDownLeft, ArrowUpRight, CirclePlay, Landmark, CreditCard, X, LayoutGrid } from 'lucide-react';
import { motion, AnimatePresence } from 'framer-motion';

export type FilterType = 'all' | 'income' | 'expense' | 'daily' | 'savings' | 'credit';

interface FilterSheetProps {
  isOpen: boolean;
  onSelect: (type: FilterType) => void;
  onClose: () => void;
}

const FilterIcon = ({ type }: { type: FilterType }) => {
  const size = 20;
  switch (type) {
    case 'all': return <LayoutGrid size={size} />;
    case 'income': return <ArrowDownLeft size={size} color="var(--status-green)" />;
    case 'expense': return <ArrowUpRight size={size} color="var(--status-red)" />;
    case 'daily': return <CirclePlay size={size} color="var(--status-pink)" />;
    case 'savings': return <Landmark size={size} color="var(--status-light-green)" />;
    case 'credit': return <CreditCard size={size} color="var(--status-purple)" />;
    default: return null;
  }
};

export const FilterSheet: React.FC<FilterSheetProps> = ({ isOpen, onSelect, onClose }) => {
  const filters: { type: FilterType; label: string }[] = [
    { type: 'all', label: 'Todas' },
    { type: 'income', label: 'Entradas' },
    { type: 'expense', label: 'Saídas' },
    { type: 'daily', label: 'Diários' },
    { type: 'savings', label: 'Economias' },
    { type: 'credit', label: 'Gastos com cartão' },
  ];

  return (
    <AnimatePresence>
      {isOpen && (
        <>
          <motion.div 
            initial={{ opacity: 0 }}
            animate={{ opacity: 1 }}
            exit={{ opacity: 0 }}
            className="overlay" 
            onClick={onClose} 
            style={{ zIndex: 1500 }}
          />
          <motion.div 
            initial={{ y: '100%' }}
            animate={{ y: 0 }}
            exit={{ y: '100%' }}
            transition={{ type: 'spring', damping: 25, stiffness: 200 }}
            className="filter-sheet"
            style={{ zIndex: 2000 }}
          >
            <div style={{ display: 'flex', justifyContent: 'space-between', alignItems: 'center', marginBottom: '1.5rem' }}>
              <h3 style={{ margin: 0 }}>Mostrar</h3>
              <button className="filter-sheet-close" onClick={onClose} aria-label="Fechar">
                <X size={24} />
              </button>
            </div>
            
            <ul className="filter-sheet-list">
              {filters.map((filter) => (
                <li key={filter.type}>
                  <button 
                    className="filter-sheet-item" 
                    onClick={() => onSelect(filter.type)}
                    style={{ display: 'flex', alignItems: 'center', gap: '1rem' }}
                  >
                    <FilterIcon type={filter.type} />
                    <span>{filter.label}</span>
                  </button>
                </li>
              ))}
            </ul>
          </motion.div>
        </>
      )}
    </AnimatePresence>
  );
};
