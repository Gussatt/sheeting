import React from 'react';
import { View, Text, StyleSheet, Pressable, Modal, ScrollView } from 'react-native';
import { X, ArrowDownLeft, ArrowUpRight, Calendar, PiggyBank, CreditCard } from 'lucide-react-native';
import { useRouter } from 'expo-router';
import { useAppTheme } from '../../styles/theme';

interface Props {
  isOpen: boolean;
  onClose: () => void;
}

const ADD_OPTIONS = [
  { type: 'income', label: 'Entrada', description: 'Salário, comissão, vales', icon: ArrowDownLeft, color: '#27AE60' },
  { type: 'expense', label: 'Saída', description: 'Gastos fixos, boletos, aluguel', icon: ArrowUpRight, color: '#E74C3C' },
  { type: 'daily', label: 'Diário', description: 'Gastos variáveis, compras', icon: Calendar, color: '#FFFFFF' },
  { type: 'savings', label: 'Economia', description: 'Reserva, investimento', icon: PiggyBank, color: '#F1C40F' },
  { type: 'credit', label: 'Gasto com cartão', description: 'Gastos ou total da fatura', icon: CreditCard, color: '#9B59B6' },
];

export const TransactionTypeModal: React.FC<Props> = ({ isOpen, onClose }) => {
  const router = useRouter();
  const { colors, isDark } = useAppTheme();

  return (
    <Modal
      visible={isOpen}
      transparent
      animationType="slide"
      onRequestClose={onClose}
    >
      <Pressable style={styles.overlay} onPress={onClose}>
        <View style={[styles.sheet, { backgroundColor: colors.bg }]}>
          <View style={[styles.header, { borderBottomColor: colors.border }]}>
            <Text style={[styles.title, { color: colors.textPrimary }]}>Adicionar</Text>
            <Pressable onPress={onClose} style={styles.closeBtn}>
              <X size={24} color={colors.textPrimary} />
            </Pressable>
          </View>

          <ScrollView>
            {ADD_OPTIONS.map((opt) => (
              <Pressable
                key={opt.type}
                onPress={() => {
                  router.push(`/add?type=${opt.type}`);
                  onClose();
                }}
                style={[styles.option, { borderBottomColor: colors.border }]}
              >
                <View style={[styles.iconCircle, { backgroundColor: isDark && opt.type === 'daily' ? '#fff' : 'transparent' }]}>
                  <opt.icon size={32} color={opt.type === 'daily' ? (isDark ? '#000' : colors.textPrimary) : opt.color} />
                </View>
                <View style={styles.textCol}>
                  <Text style={[styles.label, { color: colors.textPrimary }]}>{opt.label}</Text>
                  <Text style={[styles.description, { color: colors.textSecondary }]}>{opt.description}</Text>
                </View>
              </Pressable>
            ))}
          </ScrollView>
        </View>
      </Pressable>
    </Modal>
  );
};

const styles = StyleSheet.create({
  overlay: {
    flex: 1,
    backgroundColor: 'rgba(0,0,0,0.7)',
    justifyContent: 'flex-end',
  },
  sheet: {
    borderTopLeftRadius: 20,
    borderTopRightRadius: 20,
    maxHeight: '80%',
    paddingBottom: 40,
  },
  header: {
    flexDirection: 'row',
    justifyContent: 'space-between',
    alignItems: 'center',
    padding: 20,
    borderBottomWidth: 1,
  },
  title: {
    fontSize: 22,
    fontWeight: 'bold',
  },
  closeBtn: {
    padding: 4,
  },
  option: {
    flexDirection: 'row',
    alignItems: 'center',
    gap: 20,
    padding: 20,
    borderBottomWidth: 1,
  },
  iconCircle: {
    width: 48,
    height: 48,
    borderRadius: 24,
    alignItems: 'center',
    justifyContent: 'center',
  },
  textCol: {
    flexDirection: 'column',
    gap: 2,
  },
  label: {
    fontSize: 18,
    fontWeight: 'bold',
  },
  description: {
    fontSize: 14,
  }
});
