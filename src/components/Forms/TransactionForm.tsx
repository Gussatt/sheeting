import React, { useState, useEffect, useMemo, useCallback } from 'react';
import {
  View, Text, StyleSheet, Pressable, TextInput, Modal, ScrollView, LayoutAnimation
} from 'react-native';
import {
  ChevronDown, X, Pencil, RotateCw, Square, Plus, Minus, ChevronLeft, ChevronRight, Calendar
} from 'lucide-react-native';
import type { Transaction, Tag } from '../../db/db';
import { format, subMonths, addMonths, startOfMonth, endOfMonth, eachDayOfInterval, isSameDay } from 'date-fns';
import { ptBR } from 'date-fns/locale/pt-BR';
import { useAppTheme } from '../../styles/theme';
import { AppIcon, AppIconName } from '../AppIcon';

type TransactionType = 'income' | 'expense' | 'daily' | 'savings' | 'credit';

interface Props {
  initialData?: Partial<Transaction>;
  tags: Tag[];
  onSubmit: (data: Partial<Transaction>) => void;
  onDelete?: () => void;
}

const TYPE_OPTIONS: { type: TransactionType; label: string; iconName: AppIconName; color: string }[] = [
  { type: 'income', label: 'Entrada', iconName: 'entradas', color: '#27AE60' },
  { type: 'expense', label: 'Saída', iconName: 'saidas', color: '#E74C3C' },
  { type: 'daily', label: 'Diário', iconName: 'diario', color: '#FFFFFF' },
  { type: 'savings', label: 'Economia', iconName: 'economia', color: '#F1C40F' },
  { type: 'credit', label: 'Gasto com Cartão', iconName: 'cartao', color: '#9B59B6' },
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

const DayCell = React.memo(({ date, isSelected, isToday, isDark, colors, onPress }: any) => {
  return (
    <Pressable
      onPress={() => onPress(date)}
      style={[
        styles.dayCell,
        isSelected && { backgroundColor: colors.primary },
      ]}
    >
      <Text
        style={[
          styles.dayText,
          { color: colors.textPrimary },
          isSelected && { color: isDark ? '#000' : '#fff', fontWeight: 'bold' },
          !isSelected && isToday && { color: colors.primary, fontWeight: 'bold' },
        ]}
      >
        {format(date, 'd')}
      </Text>
    </Pressable>
  );
});

const CalendarModal = React.memo(({
  visible,
  onClose,
  pickerDate,
  onSelect
}: {
  visible: boolean,
  onClose: () => void,
  pickerDate: Date,
  onSelect: (date: Date) => void
}) => {
  const { colors, isDark } = useAppTheme();
  const [currentMonth, setCurrentMonth] = useState(new Date(pickerDate));

  useEffect(() => {
    if (visible) setCurrentMonth(new Date(pickerDate));
  }, [visible, pickerDate]);

  const daysInMonth = useMemo(() => {
    const start = startOfMonth(currentMonth);
    const end = endOfMonth(currentMonth);
    return eachDayOfInterval({ start, end });
  }, [currentMonth]);

  const paddingDays = useMemo(() => {
    const startDay = startOfMonth(currentMonth).getDay();
    return Array(startDay).fill(null);
  }, [currentMonth]);

  const weekDays = useMemo(() => ['D', 'S', 'T', 'Q', 'Q', 'S', 'S'], []);

  return (
    <Modal visible={visible} transparent animationType="slide">
      <Pressable style={styles.modalOverlay} onPress={onClose}>
        <View style={[styles.modalSheet, { backgroundColor: colors.bg }]} onStartShouldSetResponder={() => true}>
          <ModalHeader title="Data" onClose={onClose} />

          <View style={styles.calendarHeader}>
            <Pressable onPress={() => setCurrentMonth(subMonths(currentMonth, 1))} style={styles.chevronBtn}>
              <ChevronLeft size={24} color={colors.textPrimary} />
            </Pressable>
            <Text style={[styles.calendarMonth, { color: colors.textPrimary }]}>
              {format(currentMonth, 'MMMM yyyy', { locale: ptBR })}
            </Text>
            <Pressable onPress={() => setCurrentMonth(addMonths(currentMonth, 1))} style={styles.chevronBtn}>
              <ChevronRight size={24} color={colors.textPrimary} />
            </Pressable>
          </View>

          <View style={styles.weekDays}>
            {weekDays.map((day, i) => (
              <Text key={i} style={[styles.weekDay, { color: colors.textSecondary }]}>{day}</Text>
            ))}
          </View>

          <View style={styles.daysGrid}>
            {paddingDays.map((_, i) => (
              <View key={`pad-${i}`} style={styles.dayCell} />
            ))}
            {daysInMonth.map((date) => (
              <DayCell
                key={date.toISOString()}
                date={date}
                isSelected={isSameDay(date, pickerDate)}
                isToday={isSameDay(date, new Date())}
                isDark={isDark}
                colors={colors}
                onPress={onSelect}
              />
            ))}
          </View>
        </View>
      </Pressable>
    </Modal>
  );
});

export const TransactionForm: React.FC<Props> = ({ initialData, tags, onSubmit, onDelete }) => {
  const { colors, isDark } = useAppTheme();
  const [formData, setFormData] = useState<Partial<Transaction>>({
    type: 'expense',
    amount: 0,
    description: '',
    date: new Date().toISOString(),
    isRecurring: false,
    recurringFrequency: 'monthly',
    recurringIndefinite: true,
    recurringCount: 2,
    tagId: '',
    ...initialData
  });

  const [activeModal, setActiveModal] = useState<'type' | 'date' | 'repeat' | 'tags' | 'until' | null>(null);
  const [pickerDate, setPickerDate] = useState(initialData?.date ? new Date(initialData.date as string) : new Date());

  const handleSubmit = useCallback(() => {
    onSubmit({ ...formData, date: pickerDate.toISOString() });
  }, [formData, pickerDate, onSubmit]);

  const handleAmountChange = useCallback((text: string) => {
    const cleanValue = text.replace(/\D/g, '');
    const numericValue = parseInt(cleanValue || '0', 10) / 100;
    setFormData(prev => ({ ...prev, amount: numericValue }));
  }, []);

  const formatAmount = (val: number) => {
    return val.toLocaleString('pt-BR', { minimumFractionDigits: 2, maximumFractionDigits: 2 });
  };

  const selectedType = useMemo(() => TYPE_OPTIONS.find(opt => opt.type === formData.type) || TYPE_OPTIONS[1], [formData.type]);

  const repeatLabel = useMemo(() => {
    if (!formData.isRecurring) return 'Não repete';
    const freq = formData.recurringFrequency === 'monthly' ? 'mês' : formData.recurringFrequency === 'weekly' ? 'semana' : 'dia';
    return `Repete todo ${freq}`;
  }, [formData.isRecurring, formData.recurringFrequency]);

  const untilLabel = useMemo(() => {
    if (formData.recurringIndefinite) return 'A perder de vista';
    return `Repetições: ${formData.recurringCount}`;
  }, [formData.recurringIndefinite, formData.recurringCount]);

  const tagName = useMemo(() => {
    if (!formData.tagId) return 'Tags';
    const tag = tags.find(t => t.id === formData.tagId);
    return tag ? tag.name : 'Tags';
  }, [formData.tagId, tags]);

  const handleDateSelect = useCallback((date: Date) => {
    setPickerDate(date);
    setActiveModal(null);
  }, []);

  return (
    <View style={[styles.container, { backgroundColor: colors.bg }]}>
      <ScrollView contentContainerStyle={styles.scrollContent} keyboardShouldPersistTaps="handled">
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
          <Pressable onPress={() => setFormData(prev => ({ ...prev, amount: 0 }))} style={styles.clearBtn}>
            <X size={32} color={colors.textSecondary} />
          </Pressable>
        </View>

        <View style={styles.formList}>
          <Pressable
            onPress={() => {
              LayoutAnimation.configureNext(LayoutAnimation.Presets.easeInEaseOut);
              setActiveModal('type');
            }}
            style={[styles.row, { borderBottomColor: colors.border }]}
          >
            <View style={[styles.iconCircle, { backgroundColor: colors.surface }]}>
              <AppIcon name={selectedType.iconName} size={24} />
            </View>
            <Text style={[styles.rowLabel, { color: colors.textPrimary }]}>{selectedType.label}</Text>
            <ChevronDown size={20} color={colors.textSecondary} />
          </Pressable>

          <View style={[styles.row, { borderBottomColor: colors.border }]}>
            <Pencil size={24} color={colors.textSecondary} />
            <TextInput
              placeholder="Descrição"
              placeholderTextColor={colors.textSecondary}
              value={formData.description}
              onChangeText={text => setFormData(prev => ({ ...prev, description: text }))}
              style={[styles.input, { color: colors.textPrimary }]}
            />
          </View>

          <Pressable
            onPress={() => {
              LayoutAnimation.configureNext(LayoutAnimation.Presets.easeInEaseOut);
              setActiveModal('date');
            }}
            style={[styles.row, { borderBottomColor: colors.border }]}
          >
            <Calendar size={24} color={colors.textSecondary} />
            <Text style={[styles.rowLabel, { color: colors.textPrimary }]}>Data</Text>
            <Text style={[styles.rowValue, { color: colors.textSecondary }]}>{format(pickerDate, 'dd/MM/yyyy')}</Text>
            <ChevronDown size={20} color={colors.textSecondary} />
          </Pressable>

          <Pressable
            onPress={() => {
              LayoutAnimation.configureNext(LayoutAnimation.Presets.easeInEaseOut);
              setActiveModal('repeat');
            }}
            style={[styles.row, { borderBottomColor: colors.border }]}
          >
            <RotateCw size={24} color={colors.textSecondary} />
            <Text style={[styles.rowLabel, { color: colors.textPrimary }]}>{repeatLabel}</Text>
            <ChevronDown size={20} color={colors.textSecondary} />
          </Pressable>

          {formData.isRecurring && (
            <View style={[styles.recurrenceRow, { borderBottomColor: colors.border }]}>
              <Pressable
                onPress={() => {
                  LayoutAnimation.configureNext(LayoutAnimation.Presets.easeInEaseOut);
                  setActiveModal('until');
                }}
                style={styles.recurrenceLeft}
              >
                <Text style={[styles.rowLabel, { color: colors.textPrimary }]}>{untilLabel}</Text>
                <ChevronDown size={20} color={colors.textSecondary} />
              </Pressable>
              {!formData.recurringIndefinite && (
                <View style={[styles.counter, { borderLeftColor: colors.border }]}>
                  <Pressable onPress={() => {
                    LayoutAnimation.configureNext(LayoutAnimation.Presets.easeInEaseOut);
                    setFormData(prev => ({ ...prev, recurringCount: Math.max(2, (prev.recurringCount || 2) - 1) }));
                  }}>
                    <Minus size={20} color={colors.textSecondary} />
                  </Pressable>
                  <Text style={[styles.counterText, { color: colors.textPrimary }]}>{formData.recurringCount}</Text>
                  <Pressable onPress={() => {
                    LayoutAnimation.configureNext(LayoutAnimation.Presets.easeInEaseOut);
                    setFormData(prev => ({ ...prev, recurringCount: (prev.recurringCount || 2) + 1 }));
                  }}>
                    <Plus size={20} color={colors.textPrimary} />
                  </Pressable>
                </View>
              )}
            </View>
          )}

          <Pressable
            onPress={() => {
              LayoutAnimation.configureNext(LayoutAnimation.Presets.easeInEaseOut);
              setActiveModal('tags');
            }}
            style={[styles.row, { borderBottomColor: colors.border }]}
          >
            <Square size={24} color={colors.textSecondary} />
            <Text style={[styles.rowLabel, { color: colors.textPrimary }]}>{tagName}</Text>
            <ChevronDown size={20} color={colors.textSecondary} />
          </Pressable>
        </View>

        <View style={styles.footer}>
          <Pressable onPress={handleSubmit} style={[styles.submitBtn, { backgroundColor: colors.primary }]}>
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
      <Modal visible={activeModal === 'type'} transparent animationType="slide">
        <Pressable style={styles.modalOverlay} onPress={() => setActiveModal(null)}>
          <View style={[styles.modalSheet, { backgroundColor: colors.bg }]}>
            <ModalHeader title="Mudar para" onClose={() => setActiveModal(null)} />
            {TYPE_OPTIONS.map(opt => (
              <Pressable key={opt.type} style={styles.modalOption} onPress={() => { setFormData(prev => ({ ...prev, type: opt.type })); setActiveModal(null); }}>
                <AppIcon name={opt.iconName} size={24} />
                <Text style={[styles.modalOptionText, { color: colors.textPrimary }]}>{opt.label}</Text>
              </Pressable>
            ))}
          </View>
        </Pressable>
      </Modal>

      <CalendarModal
        visible={activeModal === 'date'}
        onClose={() => setActiveModal(null)}
        pickerDate={pickerDate}
        onSelect={handleDateSelect}
      />

      <Modal visible={activeModal === 'repeat'} transparent animationType="slide">
        <Pressable style={styles.modalOverlay} onPress={() => setActiveModal(null)}>
          <View style={[styles.modalSheet, { backgroundColor: colors.bg }]}>
            <ModalHeader title="Repetir" onClose={() => setActiveModal(null)} />
            {[{ freq: 'monthly', label: 'Todo mês' }, { freq: 'weekly', label: 'Toda semana' }, { freq: 'daily', label: 'Todo dia' }, { freq: 'none', label: 'Não repetir' }].map(opt => (
              <Pressable key={opt.freq} style={styles.modalOption} onPress={() => {
                if (opt.freq === 'none') setFormData(prev => ({ ...prev, isRecurring: false }));
                else setFormData(prev => ({ ...prev, isRecurring: true, recurringFrequency: opt.freq as any }));
                setActiveModal(null);
              }}>
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
  amountHeader: { flexDirection: 'row', justifyContent: 'space-between', alignItems: 'center', paddingVertical: 32 },
  amountRow: { flexDirection: 'row', alignItems: 'baseline', gap: 8, flex: 1 },
  currency: { fontSize: 24, fontWeight: 'bold' },
  amountInput: { fontSize: 48, fontWeight: 'bold', padding: 0, flex: 1 },
  clearBtn: { padding: 4 },
  formList: { gap: 4 },
  row: { flexDirection: 'row', alignItems: 'center', gap: 16, paddingVertical: 20, borderBottomWidth: 1 },
  iconCircle: { width: 32, height: 32, borderRadius: 16, alignItems: 'center', justifyContent: 'center' },
  rowLabel: { fontSize: 18, fontWeight: '500', flex: 1 },
  rowValue: { fontSize: 18, fontWeight: '500' },
  input: { fontSize: 18, fontWeight: '500', flex: 1 },
  recurrenceRow: { flexDirection: 'row', borderBottomWidth: 1 },
  recurrenceLeft: { flexDirection: 'row', alignItems: 'center', paddingVertical: 20, paddingLeft: 40, flex: 1, gap: 8 },
  counter: { flexDirection: 'row', alignItems: 'center', gap: 20, paddingHorizontal: 20, borderLeftWidth: 1 },
  counterText: { fontSize: 18, fontWeight: 'bold' },
  footer: { paddingVertical: 40 },
  submitBtn: { width: '100%', padding: 20, borderRadius: 40, alignItems: 'center' },
  submitText: { fontSize: 20, fontWeight: 'bold' },
  deleteBtn: { width: '100%', padding: 16, marginTop: 16, alignItems: 'center' },
  deleteText: { color: '#E74C3C', fontSize: 18, fontWeight: '500' },
  modalOverlay: { flex: 1, backgroundColor: 'rgba(0,0,0,0.5)', justifyContent: 'flex-end' },
  modalSheet: { borderTopLeftRadius: 20, borderTopRightRadius: 20, padding: 20, paddingBottom: 40 },
  modalHeader: { flexDirection: 'row', justifyContent: 'space-between', alignItems: 'center', marginBottom: 24 },
  modalTitle: { fontSize: 20, fontWeight: 'bold' },
  modalCloseBtn: { padding: 4 },
  modalOption: { flexDirection: 'row', alignItems: 'center', gap: 16, paddingVertical: 16 },
  modalOptionText: { fontSize: 18 },
  calendarHeader: { flexDirection: 'row', justifyContent: 'space-between', alignItems: 'center', marginBottom: 16 },
  chevronBtn: { padding: 8 },
  calendarMonth: { fontSize: 18, fontWeight: 'bold', textTransform: 'capitalize' },
  weekDays: { flexDirection: 'row', marginBottom: 8 },
  weekDay: { flex: 1, textAlign: 'center', fontWeight: '600' },
  daysGrid: { flexDirection: 'row', flexWrap: 'wrap' },
  dayCell: { width: `${100 / 7}%`, aspectRatio: 1, justifyContent: 'center', alignItems: 'center', borderRadius: 20 },
  dayText: { fontSize: 16 }
});
