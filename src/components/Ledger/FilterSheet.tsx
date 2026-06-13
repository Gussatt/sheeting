import React from 'react';
import { View, Text, Modal, Pressable } from 'react-native';
import { useAppTheme } from '../../styles/theme';

export type FilterType = 'all' | 'income' | 'expense' | 'daily' | 'savings' | 'credit';

export const FilterSheet = ({ isOpen, onSelect, onClose }: { isOpen: boolean, onSelect: (t: FilterType) => void, onClose: () => void }) => {
  const { colors } = useAppTheme();
  
  if (!isOpen) return null;

  return (
    <Modal visible={isOpen} transparent animationType="slide" onRequestClose={onClose}>
      <Pressable style={{ flex: 1, backgroundColor: 'rgba(0,0,0,0.5)', justifyContent: 'flex-end' }} onPress={onClose}>
        <View style={{ backgroundColor: colors.bg, padding: 24, borderTopLeftRadius: 16, borderTopRightRadius: 16 }}>
          <Text style={{ fontSize: 20, fontWeight: 'bold', color: colors.textPrimary, marginBottom: 16 }}>Filtrar por</Text>
          {['all', 'income', 'expense', 'daily', 'savings', 'credit'].map((f) => (
            <Pressable key={f} onPress={() => onSelect(f as FilterType)} style={{ paddingVertical: 12, borderBottomWidth: 1, borderBottomColor: colors.border }}>
              <Text style={{ fontSize: 16, color: colors.textPrimary }}>{f}</Text>
            </Pressable>
          ))}
        </View>
      </Pressable>
    </Modal>
  );
};
