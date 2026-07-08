import React from 'react';
import { View, Text, StyleSheet, Pressable, Alert, ScrollView } from 'react-native';
import { useRouter, useLocalSearchParams } from 'expo-router';
import { useSQL } from '../src/db/db';
import type { Tag, Transaction } from '../src/db/db';
import { ArrowLeft } from 'lucide-react-native';
import { TransactionForm } from '../src/components/Forms/TransactionForm';
import { useTransaction } from '../src/hooks/useTransaction';
import { useAppTheme } from '../src/styles/theme';
import { useSafeAreaInsets } from 'react-native-safe-area-context';

export default function AddTransactionScreen() {
  const router = useRouter();
  const { id, type, date } = useLocalSearchParams();
  const { colors } = useAppTheme();
  const insets = useSafeAreaInsets();

  const tags = useSQL<Tag>('SELECT * FROM tags');

  const { initialData, loading, saveTransaction, deleteTransaction } = useTransaction(
    id as string,
    type as string,
    date as string,
  );

  const handleSubmit = async (data: Partial<Transaction>) => {
    try {
      await saveTransaction(data);
      router.back();
    } catch (error) {
      console.error('Failed to save transaction:', error);
      Alert.alert('Erro', 'Erro ao salvar transação.');
    }
  };

  const handleDelete = () => {
    if (id) {
      Alert.alert('Confirmação', 'Deseja realmente excluir esta transação?', [
        { text: 'Cancelar', style: 'cancel' },
        {
          text: 'Excluir',
          style: 'destructive',
          onPress: async () => {
            try {
              await deleteTransaction();
              router.back();
            } catch (error) {
              console.error('Failed to delete transaction:', error);
              Alert.alert('Erro', 'Erro ao excluir transação.');
            }
          },
        },
      ]);
    }
  };

  if (loading) {
    return (
      <View
        style={[
          styles.container,
          { backgroundColor: colors.bg, justifyContent: 'center', alignItems: 'center' },
        ]}
      >
        <Text style={{ color: colors.textPrimary }}>Carregando...</Text>
      </View>
    );
  }

  return (
    <View style={[styles.container, { backgroundColor: colors.bg, paddingTop: insets.top }]}>
      <View style={styles.header}>
        <Pressable onPress={() => router.back()} style={styles.backBtn}>
          <ArrowLeft size={24} color={colors.textPrimary} />
        </Pressable>
        <Text style={[styles.title, { color: colors.textPrimary }]}>
          {id ? 'Editar Transação' : 'Nova Transação'}
        </Text>
      </View>

      <TransactionForm
        initialData={initialData}
        tags={tags}
        onSubmit={handleSubmit}
        onDelete={id ? handleDelete : undefined}
      />
    </View>
  );
}

const styles = StyleSheet.create({
  container: { flex: 1 },
  header: {
    flexDirection: 'row',
    alignItems: 'center',
    paddingHorizontal: 20,
    paddingVertical: 16,
    gap: 16,
  },
  backBtn: { padding: 4 },
  title: {
    fontSize: 22,
    fontWeight: 'bold',
  },
});
