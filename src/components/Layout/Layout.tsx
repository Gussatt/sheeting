import React, { useState } from 'react';
import { NavLink } from 'react-router-dom';
import { LayoutGrid, Calculator, PlusCircle, Menu } from 'lucide-react';
import { useTheme } from '../../context/ThemeContext';
import tagsIcon from '../../assets/tags.svg';
import tagsNightIcon from '../../assets/tags_night.svg';
import { TransactionTypeModal } from '../Forms/TransactionTypeModal';

export const Layout = ({ children }: { children: React.ReactNode }) => {
  const { theme } = useTheme();
  const [isAddModalOpen, setIsAddModalOpen] = useState(false);

  return (
    <div className="layout-container">
      <main className="layout-main">
        {children}
      </main>
      
      <nav className="bottom-nav">
        <NavLink to="/" className={({ isActive }) => `bottom-nav-item ${isActive ? 'active' : ''}`}>
          <LayoutGrid size={24} />
          <span>Saldos</span>
        </NavLink>
        
        <NavLink to="/performance" className={({ isActive }) => `bottom-nav-item ${isActive ? 'active' : ''}`}>
          <Calculator size={24} />
          <span>Totais</span>
        </NavLink>

        <button 
          onClick={() => setIsAddModalOpen(true)}
          className="bottom-nav-item fab"
          style={{ background: 'none', border: 'none', cursor: 'pointer' }}
        >
          <PlusCircle size={32} />
        </button>

        <NavLink to="/category" className={({ isActive }) => `bottom-nav-item ${isActive ? 'active' : ''}`}>
          {({ isActive }) => (
            <>
              <img 
                src={theme === 'dark' ? tagsNightIcon : tagsIcon} 
                alt="tags" 
                style={{ 
                  width: '24px', 
                  height: '24px',
                  filter: isActive ? 'none' : 'grayscale(1) opacity(0.6)'
                }} 
              />
              <span>Tags</span>
            </>
          )}
        </NavLink>

        <NavLink to="/menu" className={({ isActive }) => `bottom-nav-item ${isActive ? 'active' : ''}`}>
          <Menu size={24} />
          <span>Menu</span>
        </NavLink>
      </nav>

      <TransactionTypeModal isOpen={isAddModalOpen} onClose={() => setIsAddModalOpen(false)} />
    </div>
  );
};
