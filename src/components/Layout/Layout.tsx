import React from 'react';
import { NavLink } from 'react-router-dom';
import { Grid, Wallet, Activity, Calculator } from 'lucide-react';

export const Layout = ({ children }: { children: React.ReactNode }) => {
  return (
    <div className="layout-container">
      <main className="layout-main">
        {children}
      </main>
      
      <nav className="bottom-nav">
        <NavLink to="/" className={({ isActive }) => `bottom-nav-item ${isActive ? 'active' : ''}`}>
          <Grid size={20} />
          <span>Planilha</span>
        </NavLink>
        
        <NavLink to="/balances" className={({ isActive }) => `bottom-nav-item ${isActive ? 'active' : ''}`}>
          <Wallet size={20} />
          <span>Saldos</span>
        </NavLink>

        <NavLink to="/performance" className={({ isActive }) => `bottom-nav-item ${isActive ? 'active' : ''}`}>
          <Activity size={20} />
          <span>Desempenho</span>
        </NavLink>

        <NavLink to="/daily-calculation" className={({ isActive }) => `bottom-nav-item ${isActive ? 'active' : ''}`}>
          <Calculator size={20} />
          <span>Diário</span>
        </NavLink>
      </nav>
    </div>
  );
};
