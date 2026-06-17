import React from 'react';
import { View, Text, Modal, Pressable } from 'react-native';
import { useAppTheme } from '../../styles/theme';
import { AppIcon, AppIconName } from '../AppIcon';

export type FilterType = 'all' | 'income' | 'expense' | 'daily' | 'savings' | 'credit';

const FILTER_OPTIONS: { id: FilterType, label: string, icon: AppIconName }[] = [
  { id: 'all', label: 'Todas', icon: 'filtro' },
  { id: 'income', label: 'Entradas', icon: 'entradas' },
  { id: 'expense', label: 'Saídas', icon: 'saidas' },
  { id: 'daily', label: 'Diário', icon: 'diario' },
  { id: 'savings', label: 'Economia', icon: 'economia' },
  { id: 'credit', label: 'Cartão', icon: 'cartao' }
];

export const FilterSheet = ({ isOpen, onSelect, onClose }: { isOpen: boolean, onSelect: (t: FilterType) => void, onClose: () => void }) => {
  const { colors } = useAppTheme();
  
  if (!isOpen) return null;

  return (
    <Modal visible={isOpen} transparent animationType="slide" onRequestClose={onClose}>
      <Pressable style={{ flex: 1, backgroundColor: 'rgba(0,0,0,0.5)', justifyContent: 'flex-end' }} onPress={onClose}>
        <View style={{ backgroundColor: colors.bg, padding: 24, borderTopLeftRadius: 16, borderTopRightRadius: 16 }}>
          <Text style={{ fontSize: 20, fontWeight: 'bold', color: colors.textPrimary, marginBottom: 16 }}>Filtrar por</Text>
          {FILTER_OPTIONS.map((opt) => (
            <Pressable 
              key={opt.id} 
              onPress={() => onSelect(opt.id)} 
              style={{ 
                flexDirection: 'row', 
                alignItems: 'center', 
                paddingVertical: 12, 
                borderBottomWidth: 1, 
                borderBottomColor: colors.border,
                gap: 12
              }}
            >
              <AppIcon name={opt.icon} size={24} color={colors.textPrimary} />
              <Text style={{ fontSize: 16, color: colors.textPrimary }}>{opt.label}</Text>
            </Pressable>
          ))}
        </View>
      </Pressable>
    </Modal>
  );
};
