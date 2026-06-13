import { useTheme } from '../context/ThemeContext';

export const colors = {
  light: {
    bg: '#ffffff',
    surface: '#f5f5f5',
    textPrimary: '#1a1a1a',
    textSecondary: '#666666',
    border: '#e0e0e0',
    primary: '#1a1a1a',
  },
  dark: {
    bg: '#1a1a1a',
    surface: '#2a2a2a',
    textPrimary: '#ffffff',
    textSecondary: '#a0a0a0',
    border: '#333333',
    primary: '#ffffff',
  },
  status: {
    green: '#27AE60',
    yellow: '#F1C40F',
    red: '#E74C3C',
    pink: '#E91E63',
    purple: '#9B59B6',
    lightGreen: '#2ECC71',
  }
};

export const useAppTheme = () => {
  const { theme } = useTheme();
  return {
    colors: { ...colors[theme], ...colors.status },
    isDark: theme === 'dark'
  };
};
