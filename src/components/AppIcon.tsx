import React from 'react';
import { View, StyleProp, ViewStyle } from 'react-native';
import { useAppTheme } from '../styles/theme';

import AddTags from '../assets/icons/add_tags.svg';
import Adicao from '../assets/icons/adicao.svg';
import AdicaoNight from '../assets/icons/adicao_night.svg';
import Cartao from '../assets/icons/cartao.svg';
import Checkin from '../assets/icons/checkin.svg';
import CheckinNight from '../assets/icons/checkin_night.svg';
import Config from '../assets/icons/config.svg';
import DiarioTotais from '../assets/icons/diario_totais.svg';
import Diario from '../assets/icons/diario.svg';
import Economia from '../assets/icons/economia.svg';
import Edit from '../assets/icons/edit.svg';
import Entradas from '../assets/icons/entradas.svg';
import Filtro from '../assets/icons/filtro.svg';
import FiltroNight from '../assets/icons/filtro_night.svg';
import GenericTag from '../assets/icons/generic_tag.svg';
import Ledger from '../assets/icons/ledger.svg';
import Navegacao from '../assets/icons/navegacao.svg';
import NavegacaoNight from '../assets/icons/navegacao_night.svg';
import PrevisaoDiario from '../assets/icons/previsao_diario.svg';
import Saidas from '../assets/icons/saidas.svg';
import Tags from '../assets/icons/tags.svg';
import TagsNight from '../assets/icons/tags_night.svg';
import Totais from '../assets/icons/totais.svg';
import TotaisNight from '../assets/icons/totais_night.svg';
import Trash from '../assets/icons/trash.svg';
import User from '../assets/icons/user.svg';

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

const ICONS: Record<AppIconName, { default: React.FC<any>; dark?: React.FC<any> }> = {
  add_tags: { default: AddTags },
  adicao: { default: Adicao, dark: AdicaoNight },
  cartao: { default: Cartao },
  checkin: { default: Checkin, dark: CheckinNight },
  config: { default: Config },
  diario_totais: { default: DiarioTotais },
  diario: { default: Diario },
  economia: { default: Economia },
  edit: { default: Edit },
  entradas: { default: Entradas },
  filtro: { default: Filtro, dark: FiltroNight },
  generic_tag: { default: GenericTag },
  ledger: { default: Ledger },
  navegacao: { default: Navegacao, dark: NavegacaoNight },
  previsao_diario: { default: PrevisaoDiario },
  saidas: { default: Saidas },
  tags: { default: Tags, dark: TagsNight },
  totais: { default: Totais, dark: TotaisNight },
  trash: { default: Trash },
  user: { default: User },
};

export interface AppIconProps {
  name: AppIconName;
  size?: number;
  width?: number;
  height?: number;
  color?: string;
  style?: StyleProp<ViewStyle>;
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
  const IconComponent = (themeToUse === 'dark' && iconSet.dark) ? iconSet.dark : iconSet.default;

  return (
    <View style={style}>
      <IconComponent 
        width={width || size} 
        height={height || size} 
        color={color} 
      />
    </View>
  );
};