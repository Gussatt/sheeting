import React, { useState } from 'react';
import { View, Text, StyleSheet, Pressable, TextInput } from 'react-native';
import { useRouter } from 'expo-router';
import { db } from '../src/db/db';
import { X, Pencil } from 'lucide-react-native';
import { useAppTheme } from '../src/styles/theme';
import { useSafeAreaInsets } from 'react-native-safe-area-context';
import * as Crypto from 'expo-crypto';

export default function AddBudgetCategoryScreen() {
  const router = useRouter();
  const { colors } = useAppTheme();
  const insets = useSafeAreaInsets();
  const [amount, setAmount] = useState(0);
  const [description, setDescription] = useState('');

  const handleSave = async () => {
    if (amount <= 0 || !description) return;

    const id = Crypto.randomUUID();
    await db.exec('INSERT INTO budget_categories (id, name, monthly_amount) VALUES (?, ?, ?)', [
      id,
      description,
      amount,
    ]);
    router.back();
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
    setAmount(numericValue);
  };

  const isComplete = amount > 0 && description.length > 0;

  return (
    <View style={[styles.container, { backgroundColor: colors.bg, paddingTop: insets.top }]}>
      {/* Header */}
      <View style={styles.header}>
        <View style={styles.amountRow}>
          <Text style={[styles.currency, { color: colors.textPrimary }]}>R$</Text>
          <TextInput
            autoFocus
            keyboardType="numeric"
            value={formatAmount(amount)}
            onChangeText={handleAmountChange}
            style={[
              styles.amountInput,
              { color: amount === 0 ? colors.textSecondary : colors.textPrimary },
            ]}
          />
        </View>
        <Pressable onPress={() => router.back()} style={styles.closeBtn}>
          <X size={32} color={colors.textPrimary} />
        </Pressable>
      </View>

      {/* Description Field */}
      <View style={styles.descContainer}>
        <View style={[styles.descRow, { borderBottomColor: colors.border }]}>
          <Pencil size={24} color={colors.textSecondary} />
          <TextInput
            placeholder="Descrição"
            placeholderTextColor={colors.textSecondary}
            value={description}
            onChangeText={setDescription}
            style={[styles.descInput, { color: colors.textPrimary }]}
          />
        </View>
      </View>

      <View style={{ flex: 1 }} />

      {/* CTA Button */}
      <View style={styles.footer}>
        <Pressable
          onPress={handleSave}
          disabled={!isComplete}
          style={[
            styles.submitBtn,
            { backgroundColor: isComplete ? colors.textPrimary : colors.surface },
          ]}
        >
          <Text
            style={[styles.submitText, { color: isComplete ? colors.bg : colors.textSecondary }]}
          >
            Adicionar gasto mensal
          </Text>
        </Pressable>
      </View>
    </View>
  );
}

const styles = StyleSheet.create({
  container: { flex: 1 },
  header: {
    flexDirection: 'row',
    justifyContent: 'space-between',
    alignItems: 'center',
    padding: 32,
  },
  amountRow: {
    flexDirection: 'row',
    alignItems: 'baseline',
    gap: 8,
    flex: 1,
  },
  currency: {
    fontSize: 32,
    fontWeight: 'bold',
  },
  amountInput: {
    fontSize: 48,
    fontWeight: 'bold',
    padding: 0,
    flex: 1,
  },
  closeBtn: { padding: 4 },
  descContainer: {
    paddingHorizontal: 24,
    paddingBottom: 32,
  },
  descRow: {
    flexDirection: 'row',
    alignItems: 'center',
    gap: 16,
    paddingVertical: 20,
    borderBottomWidth: 1,
  },
  descInput: {
    fontSize: 22,
    fontWeight: '500',
    flex: 1,
    padding: 0,
  },
  footer: {
    padding: 24,
    paddingBottom: 40,
  },
  submitBtn: {
    width: '100%',
    padding: 20,
    borderRadius: 40,
    alignItems: 'center',
  },
  submitText: {
    fontSize: 18,
    fontWeight: 'bold',
  },
});
