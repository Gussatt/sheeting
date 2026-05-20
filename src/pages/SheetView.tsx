import React, { useState } from 'react';
import { useNavigate } from 'react-router-dom';

export const SheetView = () => {
  const navigate = useNavigate();
  const [selectedCategory, setSelectedCategory] = useState('');

  const handleNavigation = (e: React.ChangeEvent<HTMLSelectElement>) => {
    const value = e.target.value;
    setSelectedCategory(value);
    if (value) {
      navigate(`/category/${value}`);
    }
  };

  return (
    <div>
      <div style={{ display: 'flex', justifyContent: 'space-between', alignItems: 'center', marginBottom: '1rem' }}>
        <h1>Planilha</h1>
        <select value={selectedCategory} onChange={handleNavigation} style={{ padding: '0.5rem', borderRadius: '4px' }}>
          <option value="">Detalhes...</option>
          <option value="diario">Diário</option>
          <option value="cartao">Cartão</option>
          <option value="saidas">Saídas</option>
          <option value="entradas">Entradas</option>
          <option value="economias">Economias</option>
        </select>
      </div>
      
      <div style={{ display: 'flex', flexDirection: 'column', gap: '1rem' }}>
        <div style={{ background: 'var(--color-surface)', padding: '1rem', borderRadius: '8px' }}>
          <h3>Visão Geral</h3>
          <ul>
            <li>Diário: R$ 50,00</li>
            <li>Cartão: R$ 1.200,00</li>
            <li>Saídas: R$ 800,00</li>
            <li>Entradas: R$ 5.000,00</li>
            <li>Economias: R$ 1.000,00</li>
          </ul>
        </div>
      </div>
    </div>
  );
};
