import React from 'react';
import { View } from 'react-native';
import { ArrowDownLeft, ArrowUpRight, Calendar, PiggyBank, CreditCard } from 'lucide-react-native';
import { useAppTheme } from '../../styles/theme';

export type TransactionType = 'income' | 'expense' | 'daily' | 'savings' | 'credit';

export const TypeIcon = ({ type, size = 18 }: { type: TransactionType, size?: number }) => {
  const { colors } = useAppTheme();

  switch (type) {
    case 'income': return <ArrowDownLeft size={size} color={colors.green} />;
    case 'expense': return <ArrowUpRight size={size} color={colors.red} />;
    case 'daily': return <Calendar size={size} color={colors.textPrimary} />;
    case 'savings': return <PiggyBank size={size} color={colors.yellow} />;
    case 'credit': return <CreditCard size={size} color={colors.purple} />;
    default: return <View style={{ width: size, height: size, backgroundColor: colors.textSecondary }} />;
  }
};
