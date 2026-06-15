import React from 'react';
import { Image, ImageStyle } from 'expo-image';
import { StyleProp } from 'react-native';
import { useAppTheme } from '../styles/theme';

export type AppIconName = 
  | 'add_tags' 
  | 'adicao' 
  | 'cartao' 
  | 'checkin' 
  | 'config' 
  | 'diario_totais' 
  | 'diario' 
  | 'economia' 
  | 'edit' 
  | 'entradas' 
  | 'filtro' 
  | 'generic_tag' 
  | 'ledger' 
  | 'navegacao' 
  | 'previsao_diario' 
  | 'saidas' 
  | 'tags' 
  | 'totais' 
  | 'trash' 
  | 'user';

const ICONS: Record<AppIconName, { default: any; dark?: any }> = {
  add_tags: { default: require('../assets/icons/add_tags.svg') },
  adicao: { default: require('../assets/icons/adicao.svg'), dark: require('../assets/icons/adicao_night.svg') },
  cartao: { default: require('../assets/icons/cartao.svg') },
  checkin: { default: require('../assets/icons/checkin.svg'), dark: require('../assets/icons/checkin_night.svg') },
  config: { default: require('../assets/icons/config.svg') },
  diario_totais: { default: require('../assets/icons/diario_totais.svg') },
  diario: { default: require('../assets/icons/diario.svg') },
  economia: { default: require('../assets/icons/economia.svg') },
  edit: { default: require('../assets/icons/edit.svg') },
  entradas: { default: require('../assets/icons/entradas.svg') },
  filtro: { default: require('../assets/icons/filtro.svg'), dark: require('../assets/icons/filtro_night.svg') },
  generic_tag: { default: require('../assets/icons/generic_tag.svg') },
  ledger: { default: require('../assets/icons/ledger.svg') },
  navegacao: { default: require('../assets/icons/navegacao.svg'), dark: require('../assets/icons/navegacao_night.svg') },
  previsao_diario: { default: require('../assets/icons/previsao_diario.svg') },
  saidas: { default: require('../assets/icons/saidas.svg') },
  tags: { default: require('../assets/icons/tags.svg'), dark: require('../assets/icons/tags_night.svg') },
  totais: { default: require('../assets/icons/totais.svg'), dark: require('../assets/icons/totais_night.svg') },
  trash: { default: require('../assets/icons/trash.svg') },
  user: { default: require('../assets/icons/user.svg') },
};

export interface AppIconProps {
  name: AppIconName;
  size?: number;
  width?: number;
  height?: number;
  color?: string;
  style?: StyleProp<ImageStyle>;
  forceTheme?: 'light' | 'dark';
}

/**
 * A templated Icon component that automatically resolves to the correct SVG asset
 * based on the current theme (light vs dark mode).
 */
export const AppIcon: React.FC<AppIconProps> = ({ 
  name, size = 24, width, height, color, style, forceTheme 
}) => {
  const { isDark } = useAppTheme();
  const themeToUse = forceTheme || (isDark ? 'dark' : 'light');
  
  const iconSet = ICONS[name];
  const source = (themeToUse === 'dark' && iconSet.dark) ? iconSet.dark : iconSet.default;

  return (
    <Image 
      source={source} 
      style={[{ width: width || size, height: height || size }, style]} 
      tintColor={color} 
      contentFit="contain" 
    />
  );
};
