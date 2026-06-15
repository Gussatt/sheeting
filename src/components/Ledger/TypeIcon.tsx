import React from 'react';
import { View } from 'react-native';
import { Image } from 'expo-image';
import { useAppTheme } from '../../styles/theme';

export type TransactionType = 'income' | 'expense' | 'daily' | 'savings' | 'credit';

const entradasIcon = require('../../assets/icons/entradas.svg');
const saidasIcon = require('../../assets/icons/saidas.svg');
const diarioIcon = require('../../assets/icons/diario.svg');
const economiaIcon = require('../../assets/icons/economia.svg');
const cartaoIcon = require('../../assets/icons/cartao.svg');

export const TypeIcon = ({ type, size = 18 }: { type: TransactionType, size?: number }) => {
  const { colors } = useAppTheme();

  let iconSource;

  switch (type) {
    case 'income': iconSource = entradasIcon; break;
    case 'expense': iconSource = saidasIcon; break;
    case 'daily': iconSource = diarioIcon; break;
    case 'savings': iconSource = economiaIcon; break;
    case 'credit': iconSource = cartaoIcon; break;
    default: return <View style={{ width: size, height: size, backgroundColor: colors.textSecondary }} />;
  }

  return <Image source={iconSource} style={{ width: size, height: size }} contentFit="contain" />;
};
