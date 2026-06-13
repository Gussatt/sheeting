import React from 'react';
import { 
  ArrowDownLeft, ArrowUpRight, CirclePlay, Landmark, CreditCard, X
} from 'lucide-react';
import { useNavigate } from 'react-router-dom';

interface Props {
  isOpen: boolean;
  onClose: () => void;
}

const ADD_OPTIONS = [
  { type: 'income', label: 'Entrada', description: 'Salário, comissão, vales', icon: ArrowDownLeft, color: 'var(--status-green)' },
  { type: 'expense', label: 'Saída', description: 'Gastos fixos, boletos, aluguel', icon: ArrowUpRight, color: 'var(--status-red)' },
  { type: 'daily', label: 'Diário', description: 'Gastos variáveis, compras', icon: CirclePlay, color: 'var(--status-pink)' },
  { type: 'savings', label: 'Economia', description: 'Reserva, investimento', icon: Landmark, color: 'var(--status-light-green)' },
  { type: 'credit', label: 'Gasto com cartão', description: 'Gastos ou total da fatura', icon: CreditCard, color: 'var(--status-purple)' },
];

export const TransactionTypeModal: React.FC<Props> = ({ isOpen, onClose }) => {
  const navigate = useNavigate();

  if (!isOpen) return null;

  return (
    <>
      <div className="overlay" onClick={onClose} style={{ zIndex: 3000 }} />
      <div className="filter-sheet" style={{ zIndex: 3001, backgroundColor: 'var(--color-bg)', padding: '1rem 0' }}>
        <header style={{ 
          display: 'flex', 
          justifyContent: 'space-between', 
          alignItems: 'center', 
          padding: '1rem 1.5rem',
          borderBottom: '1px solid var(--color-border)'
        }}>
          <h2 style={{ margin: 0, fontSize: '1.4rem', fontWeight: 'bold', color: 'var(--color-text-primary)' }}>Adicionar</h2>
          <button onClick={onClose} style={{ background: 'none', border: 'none', color: 'var(--color-text-primary)', cursor: 'pointer' }}>
            <X size={24} />
          </button>
        </header>

        <div style={{ display: 'flex', flexDirection: 'column' }}>
          {ADD_OPTIONS.map((opt) => (
            <button
              key={opt.type}
              onClick={() => {
                navigate(`/add?type=${opt.type}`);
                onClose();
              }}
              style={{
                display: 'flex', 
                alignItems: 'center', 
                gap: '1.25rem', 
                padding: '1.25rem 1.5rem', 
                border: 'none', 
                background: 'transparent',
                borderBottom: '1px solid var(--color-border)',
                cursor: 'pointer',
                textAlign: 'left',
                width: '100%'
              }}
            >
              <div style={{ 
                width: '40px', height: '40px', borderRadius: '50%', backgroundColor: 'var(--color-surface)', 
                display: 'flex', alignItems: 'center', justifyContent: 'center'
              }}>
                <opt.icon color={opt.color} size={24} />
              </div>
              <div style={{ display: 'flex', flexDirection: 'column', gap: '2px' }}>
                <span style={{ fontSize: '1.1rem', fontWeight: 'bold', color: 'var(--color-text-primary)' }}>{opt.label}</span>
                <span style={{ fontSize: '0.85rem', color: 'var(--color-text-secondary)' }}>{opt.description}</span>
              </div>
            </button>
          ))}
        </div>
      </div>
    </>
  );
};
