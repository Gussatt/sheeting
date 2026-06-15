import React, { useState, useEffect } from 'react';
import { 
  View, Text, StyleSheet, Pressable, TextInput, Modal, ScrollView, Platform
} from 'react-native';
import { Image } from 'expo-image';
import { 
  ChevronDown, X, Pencil, RotateCw, Square, Plus, Minus
} from 'lucide-react-native';
import type { Transaction, Tag } from '../../db/db';
import { format } from 'date-fns';
import DateTimePicker from '@react-native-community/datetimepicker';
import { useAppTheme } from '../../styles/theme';

type TransactionType = 'income' | 'expense' | 'daily' | 'savings' | 'credit';

interface Props {
  initialData?: Partial<Transaction>;
  tags: Tag[];
  onSubmit: (data: Partial<Transaction>) => void;
  onDelete?: () => void;
}

const entradasIcon = require('../../assets/icons/entradas.svg');
const saidasIcon = require('../../assets/icons/saidas.svg');
const diarioIcon = require('../../assets/icons/diario.svg');
const economiaIcon = require('../../assets/icons/economia.svg');
const cartaoIcon = require('../../assets/icons/cartao.svg');

const TYPE_OPTIONS: { type: TransactionType; label: string; icon: any; color: string }[] = [
  { type: 'income', label: 'Entrada', icon: entradasIcon, color: '#27AE60' },
  { type: 'expense', label: 'Saída', icon: saidasIcon, color: '#E74C3C' },
  { type: 'daily', label: 'Diário', icon: diarioIcon, color: '#FFFFFF' },
  { type: 'savings', label: 'Economia', icon: economiaIcon, color: '#F1C40F' },
  { type: 'credit', label: 'Gasto com Cartão', icon: cartaoIcon, color: '#9B59B6' },
];

const ModalHeader = ({ title, onClose }: { title: string, onClose: () => void }) => {
  const { colors } = useAppTheme();
  return (
    <View style={styles.modalHeader}>
      <Text style={[styles.modalTitle, { color: colors.textPrimary }]}>{title}</Text>
      <Pressable onPress={onClose} style={styles.modalCloseBtn}>
        <X size={24} color={colors.textPrimary} />
      </Pressable>
    </View>
  );
};

export const TransactionForm: React.FC<Props> = ({ initialData, tags, onSubmit, onDelete }) => {
  const { colors, isDark } = useAppTheme();
  const [formData, setFormData] = useState<Partial<Transaction>>({
    type: 'expense',
    amount: 0,
    description: '',
    date: new Date().toISOString(), // Keeping it ISO string matching web version
    isRecurring: false,
    recurringFrequency: 'monthly',
    recurringIndefinite: true,
    recurringCount: 2,
    tagId: '',
    ...initialData
  });

  const [activeModal, setActiveModal] = useState<'type' | 'date' | 'repeat' | 'tags' | 'until' | null>(null);
  
  // Date tracking for picker
  const [pickerDate, setPickerDate] = useState(initialData?.date ? new Date(initialData.date as string) : new Date());

  const handleSubmit = () => {
    onSubmit({ ...formData, date: pickerDate.toISOString() });
  };

  const formatAmount = (val: number) => {
    return val.toLocaleString('pt-BR', {
      minimumFractionDigits: 2,
      maximumFractionDigits: 2,
    });
  };

  const handleAmountChange = (text: string) => {
    const cleanValue = text.replace(/\D/g, '');
    const numericValue = parseInt(cleanValue || '0', 10) / 100;
    setFormData({ ...formData, amount: numericValue });
  };

  const selectedType = TYPE_OPTIONS.find(opt => opt.type === formData.type) || TYPE_OPTIONS[1];

  const getRepeatLabel = () => {
    if (!formData.isRecurring) return 'Não repete';
    const freq = formData.recurringFrequency === 'monthly' ? 'mês' : formData.recurringFrequency === 'weekly' ? 'semana' : 'dia';
    return `Repete todo ${freq}`;
  };

  const getUntilLabel = () => {
    if (formData.recurringIndefinite) return 'A perder de vista';
    return `Repetições: ${formData.recurringCount}`;
  };

  const getTagName = () => {
    if (!formData.tagId) return 'Tags';
    const tag = tags.find(t => t.id === formData.tagId);
    return tag ? tag.name : 'Tags';
  };

  return (
    <View style={[styles.container, { backgroundColor: colors.bg }]}>
      <ScrollView contentContainerStyle={styles.scrollContent}>
        {/* Amount Header */}
        <View style={styles.amountHeader}>
          <View style={styles.amountRow}>
            <Text style={[styles.currency, { color: colors.textPrimary }]}>R$</Text>
            <TextInput
              autoFocus
              keyboardType="numeric"
              value={formatAmount(formData.amount || 0)}
              onChangeText={handleAmountChange}
              style={[
                styles.amountInput, 
                { color: formData.amount === 0 ? colors.textSecondary : colors.textPrimary }
              ]}
            />
          </View>
          <Pressable onPress={() => setFormData({ ...formData, amount: 0 })} style={styles.clearBtn}>
            <X size={32} color={colors.textSecondary} />
          </Pressable>
        </View>

        {/* Form List */}
        <View style={styles.formList}>
          {/* Type */}
          <Pressable 
            onPress={() => setActiveModal('type')}
            style={[styles.row, { borderBottomColor: colors.border }]}
          >
            <View style={[styles.iconCircle, { backgroundColor: colors.surface }]}>
              <Image source={selectedType.icon} style={{ width: 24, height: 24 }} contentFit="contain" />
            </View>
            <Text style={[styles.rowLabel, { color: colors.textPrimary }]}>{selectedType.label}</Text>
            <ChevronDown size={20} color={colors.textSecondary} />
          </Pressable>

          {/* Description */}
          <View style={[styles.row, { borderBottomColor: colors.border }]}>
            <Pencil size={24} color={colors.textSecondary} />
            <TextInput 
              placeholder="Descrição"
              placeholderTextColor={colors.textSecondary}
              value={formData.description}
              onChangeText={text => setFormData({ ...formData, description: text })}
              style={[styles.input, { color: colors.textPrimary }]}
            />
          </View>

          {/* Date */}
          <Pressable 
            onPress={() => setActiveModal('date')}
            style={[styles.row, { borderBottomColor: colors.border }]}
          >
            <Image source={diarioIcon} style={{ width: 24, height: 24 }} contentFit="contain" />
            <Text style={[styles.rowLabel, { color: colors.textPrimary }]}>Data</Text>
            <Text style={[styles.rowValue, { color: colors.textSecondary }]}>
              {format(pickerDate, 'dd/MM/yyyy')}
            </Text>
            <ChevronDown size={20} color={colors.textSecondary} />
          </Pressable>

          {/* Repetition */}
          <Pressable 
            onPress={() => setActiveModal('repeat')}
            style={[styles.row, { borderBottomColor: colors.border }]}
          >
            <RotateCw size={24} color={colors.textSecondary} />
            <Text style={[styles.rowLabel, { color: colors.textPrimary }]}>{getRepeatLabel()}</Text>
            <ChevronDown size={20} color={colors.textSecondary} />
          </Pressable>

          {/* Repetition Details */}
          {formData.isRecurring && (
            <View style={[styles.recurrenceRow, { borderBottomColor: colors.border }]}>
              <Pressable 
                onPress={() => setActiveModal('until')}
                style={styles.recurrenceLeft}
              >
                <Text style={[styles.rowLabel, { color: colors.textPrimary }]}>{getUntilLabel()}</Text>
                <ChevronDown size={20} color={colors.textSecondary} />
              </Pressable>
              {!formData.recurringIndefinite && (
                <View style={[styles.counter, { borderLeftColor: colors.border }]}>
                  <Pressable onPress={() => setFormData({ ...formData, recurringCount: Math.max(2, (formData.recurringCount || 2) - 1) })}>
                    <Minus size={20} color={colors.textSecondary} />
                  </Pressable>
                  <Text style={[styles.counterText, { color: colors.textPrimary }]}>{formData.recurringCount}</Text>
                  <Pressable onPress={() => setFormData({ ...formData, recurringCount: (formData.recurringCount || 2) + 1 })}>
                    <Plus size={20} color={colors.textPrimary} />
                  </Pressable>
                </View>
              )}
            </View>
          )}

          {/* Tags */}
          <Pressable 
            onPress={() => setActiveModal('tags')}
            style={[styles.row, { borderBottomColor: colors.border }]}
          >
            <Square size={24} color={colors.textSecondary} />
            <Text style={[styles.rowLabel, { color: colors.textPrimary }]}>{getTagName()}</Text>
            <ChevronDown size={20} color={colors.textSecondary} />
          </Pressable>
        </View>

        {/* Footer CTA */}
        <View style={styles.footer}>
          <Pressable 
            onPress={handleSubmit}
            style={[styles.submitBtn, { backgroundColor: colors.primary }]}
          >
            <Text style={[styles.submitText, { color: isDark ? '#000' : '#fff' }]}>
              {initialData?.id ? 'Salvar' : `Adicionar ${selectedType.label.toLowerCase()}`}
            </Text>
          </Pressable>
          {onDelete && (
            <Pressable onPress={onDelete} style={styles.deleteBtn}>
              <Text style={styles.deleteText}>Excluir</Text>
            </Pressable>
          )}
        </View>
      </ScrollView>

      {/* MODALS */}
      
      {/* Type Modal */}
      <Modal visible={activeModal === 'type'} transparent animationType="slide">
        <Pressable style={styles.modalOverlay} onPress={() => setActiveModal(null)}>
          <View style={[styles.modalSheet, { backgroundColor: colors.bg }]}>
            <ModalHeader title="Tipo" onClose={() => setActiveModal(null)} />
            {TYPE_OPTIONS.map(opt => (
              <Pressable 
                key={opt.type} 
                style={styles.modalOption}
                onPress={() => {
                  setFormData({ ...formData, type: opt.type });
                  setActiveModal(null);
                }}
              >
                <Image source={opt.icon} style={{ width: 24, height: 24 }} contentFit="contain" />
                <Text style={[styles.modalOptionText, { color: colors.textPrimary }]}>{opt.label}</Text>
              </Pressable>
            ))}
          </View>
        </Pressable>
      </Modal>

      {/* Date Picker */}
      {activeModal === 'date' && (
        <DateTimePicker
          value={pickerDate}
          mode="date"
          display="default"
          onChange={(event, date) => {
            if (Platform.OS === 'android') {
              setActiveModal(null);
            }
            if (date) setPickerDate(date);
          }}
        />
      )}
      {activeModal === 'date' && Platform.OS === 'ios' && (
        <View style={{ backgroundColor: colors.surface, padding: 16 }}>
           <Pressable onPress={() => setActiveModal(null)}><Text style={{ color: colors.primary, fontWeight: 'bold', textAlign: 'right' }}>Concluído</Text></Pressable>
        </View>
      )}

      {/* Repeat Modal */}
      <Modal visible={activeModal === 'repeat'} transparent animationType="slide">
        <Pressable style={styles.modalOverlay} onPress={() => setActiveModal(null)}>
          <View style={[styles.modalSheet, { backgroundColor: colors.bg }]}>
            <ModalHeader title="Repetir" onClose={() => setActiveModal(null)} />
            {[
              { freq: 'monthly', label: 'Todo mês' },
              { freq: 'weekly', label: 'Toda semana' },
              { freq: 'daily', label: 'Todo dia' },
              { freq: 'none', label: 'Não repetir' }
            ].map(opt => (
              <Pressable 
                key={opt.freq} 
                style={styles.modalOption}
                onPress={() => {
                  if (opt.freq === 'none') setFormData({ ...formData, isRecurring: false });
                  else setFormData({ ...formData, isRecurring: true, recurringFrequency: opt.freq as any });
                  setActiveModal(null);
                }}
              >
                <Text style={[styles.modalOptionText, { color: colors.textPrimary }]}>{opt.label}</Text>
              </Pressable>
            ))}
          </View>
        </Pressable>
      </Modal>

    </View>
  );
};

const styles = StyleSheet.create({
  container: { flex: 1 },
  scrollContent: { padding: 20 },
  amountHeader: {
    flexDirection: 'row',
    justifyContent: 'space-between',
    alignItems: 'center',
    paddingVertical: 32,
  },
  amountRow: {
    flexDirection: 'row',
    alignItems: 'baseline',
    gap: 8,
    flex: 1,
  },
  currency: {
    fontSize: 24,
    fontWeight: 'bold',
  },
  amountInput: {
    fontSize: 48,
    fontWeight: 'bold',
    padding: 0,
    flex: 1,
  },
  clearBtn: { padding: 4 },
  formList: { gap: 4 },
  row: {
    flexDirection: 'row',
    alignItems: 'center',
    gap: 16,
    paddingVertical: 20,
    borderBottomWidth: 1,
  },
  iconCircle: {
    width: 32,
    height: 32,
    borderRadius: 16,
    alignItems: 'center',
    justifyContent: 'center',
  },
  rowLabel: {
    fontSize: 18,
    fontWeight: '500',
    flex: 1,
  },
  rowValue: {
    fontSize: 18,
    fontWeight: '500',
  },
  input: {
    fontSize: 18,
    fontWeight: '500',
    flex: 1,
  },
  recurrenceRow: {
    flexDirection: 'row',
    borderBottomWidth: 1,
  },
  recurrenceLeft: {
    flexDirection: 'row',
    alignItems: 'center',
    paddingVertical: 20,
    paddingLeft: 40,
    flex: 1,
    gap: 8,
  },
  counter: {
    flexDirection: 'row',
    alignItems: 'center',
    gap: 20,
    paddingHorizontal: 20,
    borderLeftWidth: 1,
  },
  counterText: {
    fontSize: 18,
    fontWeight: 'bold',
  },
  footer: {
    paddingVertical: 40,
  },
  submitBtn: {
    width: '100%',
    padding: 20,
    borderRadius: 40,
    alignItems: 'center',
  },
  submitText: {
    fontSize: 20,
    fontWeight: 'bold',
  },
  deleteBtn: {
    width: '100%',
    padding: 16,
    marginTop: 16,
    alignItems: 'center',
  },
  deleteText: {
    color: '#E74C3C',
    fontSize: 18,
    fontWeight: '500',
  },
  modalOverlay: {
    flex: 1,
    backgroundColor: 'rgba(0,0,0,0.5)',
    justifyContent: 'flex-end',
  },
  modalSheet: {
    borderTopLeftRadius: 20,
    borderTopRightRadius: 20,
    padding: 20,
    paddingBottom: 40,
  },
  modalHeader: {
    flexDirection: 'row',
    justifyContent: 'space-between',
    alignItems: 'center',
    marginBottom: 24,
  },
  modalTitle: {
    fontSize: 20,
    fontWeight: 'bold',
  },
  modalCloseBtn: { padding: 4 },
  modalOption: {
    flexDirection: 'row',
    alignItems: 'center',
    gap: 16,
    paddingVertical: 16,
  },
  modalOptionText: {
    fontSize: 18,
  }
});
