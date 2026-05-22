import { useSQL, db } from '../db/db';
import { User, Database, LogOut, ChevronRight, AlertTriangle, Moon, Sun } from 'lucide-react';
import { useNavigate } from 'react-router-dom';
import { useTheme } from '../context/ThemeContext';

export const Menu = () => {
  const navigate = useNavigate();
  const { theme, toggleTheme } = useTheme();
  // Fetch user config (future)
  const config = useSQL<{ key: string, value: string }>('SELECT * FROM config');
  const userName = config.find(c => c.key === 'user_name')?.value || 'Usuário';

  const handleReset = async () => {
    if (confirm('ATENÇÃO: Isso apagará TODAS as suas transações e categorias. Deseja continuar?')) {
      await db.exec('DELETE FROM transactions');
      await db.exec('DELETE FROM budget_categories');
      await db.exec('DELETE FROM tags');
      alert('Dados apagados com sucesso.');
      navigate('/');
    }
  };

  const SettingItem = ({ icon: Icon, label, value, onClick, color }: any) => (
    <div 
      onClick={onClick}
      style={{ 
        display: 'flex', 
        justifyContent: 'space-between', 
        alignItems: 'center', 
        padding: '1.25rem 0', 
        borderBottom: '1px solid var(--color-border)',
        cursor: 'pointer'
      }}
    >
      <div style={{ display: 'flex', alignItems: 'center', gap: '1rem' }}>
        <Icon size={22} color={color || 'var(--color-text-secondary)'} />
        <div style={{ display: 'flex', flexDirection: 'column' }}>
          <span style={{ fontWeight: '500' }}>{label}</span>
          {value && <span style={{ fontSize: '0.85rem', color: 'var(--color-text-secondary)' }}>{value}</span>}
        </div>
      </div>
      <ChevronRight size={18} color="var(--color-text-secondary)" />
    </div>
  );

  return (
    <div className="menu-page" style={{ padding: '0 1rem 80px 1rem' }}>
      <header style={{ padding: '1.5rem 0' }}>
        <h1 style={{ fontSize: '1.25rem', margin: 0 }}>Menu</h1>
      </header>

      <div style={{ 
        background: 'var(--color-surface)', 
        borderRadius: '16px', 
        padding: '1.5rem', 
        display: 'flex', 
        alignItems: 'center', 
        gap: '1rem',
        marginBottom: '2rem'
      }}>
        <div style={{ 
          width: '50px', 
          height: '50px', 
          borderRadius: '50%', 
          background: 'var(--color-primary)', 
          display: 'flex', 
          alignItems: 'center', 
          justifyContent: 'center' 
        }}>
          <User color="white" size={30} />
        </div>
        <div style={{ display: 'flex', flexDirection: 'column' }}>
          <span style={{ fontWeight: 'bold', fontSize: '1.1rem' }}>{userName}</span>
          <span style={{ fontSize: '0.85rem', color: 'var(--status-green)' }}>Assinatura ativa</span>
        </div>
      </div>

      <div className="settings-group">
        <h2 style={{ fontSize: '0.85rem', color: 'var(--color-text-secondary)', textTransform: 'uppercase', letterSpacing: '1px', marginBottom: '0.5rem' }}>Perfil</h2>
        <SettingItem icon={User} label="Editar Perfil" value="Nome, sobrenome, e-mail" />
        
        <h2 style={{ fontSize: '0.85rem', color: 'var(--color-text-secondary)', textTransform: 'uppercase', letterSpacing: '1px', marginBottom: '0.5rem', marginTop: '2rem' }}>Configurações</h2>
        <SettingItem 
          icon={theme === 'dark' ? Moon : Sun} 
          label="Tema" 
          value={theme === 'dark' ? 'Escuro' : 'Claro'} 
          onClick={toggleTheme}
        />

        <h2 style={{ fontSize: '0.85rem', color: 'var(--color-text-secondary)', textTransform: 'uppercase', letterSpacing: '1px', marginBottom: '0.5rem', marginTop: '2rem' }}>Dados</h2>
        <SettingItem icon={Database} label="Exportar Dados" value="Backup em JSON ou CSV" />
        <SettingItem 
          icon={AlertTriangle} 
          label="Zerar minha conta" 
          value="Apagar todo o histórico" 
          color="var(--status-red)" 
          onClick={handleReset}
        />
      </div>

      <button 
        style={{ 
          width: '100%', 
          marginTop: '3rem', 
          padding: '1rem', 
          borderRadius: '12px', 
          border: '1px solid var(--color-border)', 
          background: 'none', 
          color: 'var(--status-red)',
          display: 'flex',
          alignItems: 'center',
          justifyContent: 'center',
          gap: '0.5rem',
          fontWeight: 'bold',
          cursor: 'pointer'
        }}
      >
        <LogOut size={20} /> Sair
      </button>
    </div>
  );
};
