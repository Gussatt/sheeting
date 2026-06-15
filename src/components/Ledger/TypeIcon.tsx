import React from 'react';
import { View } from 'react-native';
import { useAppTheme } from '../../styles/theme';
import { AppIcon, AppIconName } from '../AppIcon';

export type TransactionType = 'income' | 'expense' | 'daily' | 'savings' | 'credit';

export const TypeIcon = ({ type, size = 18 }: { type: TransactionType, size?: number }) => {
  const { colors } = useAppTheme();

  let iconName: AppIconName | null = null;

  switch (type) {
    case 'income': iconName = 'entradas'; break;
    case 'expense': iconName = 'saidas'; break;
    case 'daily': iconName = 'diario'; break;
    case 'savings': iconName = 'economia'; break;
    case 'credit': iconName = 'cartao'; break;
  }

  if (!iconName) {
    return <View style={{ width: size, height: size, backgroundColor: colors.textSecondary }} />;
  }

  return <AppIcon name={iconName} size={size} />;
};
