import React from 'react';
import { NavLink } from 'react-router-dom';
import { Grid, Activity, PlusCircle, Tag, Menu } from 'lucide-react';

export const Layout = ({ children }: { children: React.ReactNode }) => {
  return (
    <div className="layout-container">
      <main className="layout-main">
        {children}
      </main>
      
      <nav className="bottom-nav">
        <NavLink to="/" className={({ isActive }) => `bottom-nav-item ${isActive ? 'active' : ''}`}>
          <Grid size={24} />
          <span>Saldos</span>
        </NavLink>
        
        <NavLink to="/performance" className={({ isActive }) => `bottom-nav-item ${isActive ? 'active' : ''}`}>
          <Activity size={24} />
          <span>Totais</span>
        </NavLink>

        <NavLink to="/add" className={({ isActive }) => `bottom-nav-item fab ${isActive ? 'active' : ''}`}>
          <PlusCircle size={32} />
        </NavLink>

        <NavLink to="/category" className={({ isActive }) => `bottom-nav-item ${isActive ? 'active' : ''}`}>
          <Tag size={24} />
          <span>Tags</span>
        </NavLink>

        <NavLink to="/menu" className={({ isActive }) => `bottom-nav-item ${isActive ? 'active' : ''}`}>
          <Menu size={24} />
          <span>Menu</span>
        </NavLink>
      </nav>
    </div>
  );
};
