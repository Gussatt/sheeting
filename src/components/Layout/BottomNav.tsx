// src/components/Layout/BottomNav.tsx
import React from 'react';
import { Link } from 'react-router-dom';

export const BottomNav: React.FC = () => {
  return (
    <nav style={{ display: 'flex', justifyContent: 'space-around', position: 'fixed', bottom: 0, width: '100%', background: '#fff' }}>
      <Link to="/">Saldos</Link>
      <Link to="/performance">Totais</Link>
      <Link to="/add" style={{ fontSize: '24px', fontWeight: 'bold' }}>+</Link>
      <Link to="/category">Tags</Link>
      <Link to="/menu">Menu</Link>
    </nav>
  );
};
