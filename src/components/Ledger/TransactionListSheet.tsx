import React from 'react';
import { View, Text, Modal, Pressable } from 'react-native';
import { useAppTheme } from '../../styles/theme';

export const TransactionListSheet = ({ isOpen, onClose, initialDate, initialType }: any) => {
  const { colors } = useAppTheme();
  if (!isOpen) return null;

  return (
    <Modal visible={isOpen} transparent animationType="slide" onRequestClose={onClose}>
      <Pressable style={{ flex: 1, backgroundColor: 'rgba(0,0,0,0.5)', justifyContent: 'flex-end' }} onPress={onClose}>
        <View style={{ backgroundColor: colors.bg, padding: 24, height: '70%', borderTopLeftRadius: 16, borderTopRightRadius: 16 }}>
          <Text style={{ fontSize: 20, fontWeight: 'bold', color: colors.textPrimary }}>Transações</Text>
          <Text style={{ color: colors.textSecondary, marginTop: 8 }}>Em breve na versão nativa...</Text>
        </View>
      </Pressable>
    </Modal>
  );
};
