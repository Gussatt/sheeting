import React, { useState } from 'react';
import { View, Text, StyleSheet, Pressable, Image, TextInput, ScrollView, Alert } from 'react-native';
import { useSQL, db } from '../../src/db/db';
import type { Tag, Transaction } from '../../src/db/db';
import { Search, ChevronLeft, ChevronRight, Edit2, Plus, Trash2 } from 'lucide-react-native';
import { startOfMonth, endOfMonth, isWithinInterval, format } from 'date-fns';
import { useSafeAreaInsets } from 'react-native-safe-area-context';
import { useAppTheme } from '../../src/styles/theme';
import { useTheme } from '../../src/context/ThemeContext';
import { TagTrapezoid } from '../../src/components/Ledger/TagTrapezoid';

export default function TagsScreen() {
  const { theme } = useTheme();
  const { colors, isDark } = useAppTheme();
  const insets = useSafeAreaInsets();
  const [currentDate, setCurrentDate] = useState(new Date());
  const [isModalOpen, setIsModalOpen] = useState(false);
  const [selectedTag, setSelectedTag] = useState<Tag | undefined>(undefined);
  const [isEditing, setIsEditing] = useState(false);
  const [searchQuery, setSearchQuery] = useState('');
  
  const monthStart = startOfMonth(currentDate);
  const monthEnd = endOfMonth(currentDate);

  const tags = useSQL<Tag>('SELECT * FROM tags');
  const transactions = useSQL<Transaction>('SELECT * FROM transactions');

  if (isEditing && tags.length === 0) {
    setIsEditing(false);
  }

  const currentMonthTransactions = transactions.filter(t => 
    isWithinInterval(new Date(t.date), { start: monthStart, end: monthEnd })
  );

  const getTagTotal = (tagId: string) => currentMonthTransactions
    .filter(t => t.tagId === tagId)
    .reduce((sum, t) => sum + Number(t.amount), 0);

  const changeMonth = (offset: number) => {
    const next = new Date(currentDate);
    next.setMonth(currentDate.getMonth() + offset);
    setCurrentDate(next);
  };

  const formatMonth = (date: Date) => {
    const formatted = format(date, 'MMM/yy');
    return formatted.charAt(0).toUpperCase() + formatted.slice(1);
  };

  const handleDeleteTag = (tagId: string) => {
    Alert.alert('Confirmação', 'Deseja realmente excluir esta tag?', [
      { text: 'Cancelar', style: 'cancel' },
      { text: 'Excluir', style: 'destructive', onPress: async () => {
        await db.exec('DELETE FROM tags WHERE id = ?', [tagId]);
      }}
    ]);
  };

  const filteredTags = tags.filter(t => t.name.toLowerCase().includes(searchQuery.toLowerCase()));

  return (
    <View style={[styles.container, { backgroundColor: colors.bg, paddingTop: insets.top }]}>
      <View style={[styles.header, { backgroundColor: colors.bg, borderBottomColor: colors.border }]}>
        <View style={styles.todayContainer}>
           <Text style={[styles.todayText, { color: colors.textPrimary }]}>{new Date().getDate()}</Text>
        </View>

        <View style={styles.monthSelector}>
          <Pressable onPress={() => changeMonth(-1)}>
            <ChevronLeft size={24} color={colors.textPrimary} />
          </Pressable>
          <Text style={[styles.monthText, { color: colors.textPrimary }]}>{formatMonth(currentDate)}</Text>
          <Pressable onPress={() => changeMonth(1)}>
            <ChevronRight size={24} color={colors.textPrimary} />
          </Pressable>
        </View>

        <View style={{ width: 40 }} />
      </View>

      <View style={styles.subheader}>
        <Text style={[styles.subheaderTitle, { color: colors.textPrimary }]}>Tags</Text>
        <View style={styles.actionButtons}>
          <Pressable 
            onPress={() => tags.length > 0 && setIsEditing(!isEditing)}
            style={{ opacity: tags.length > 0 ? 1 : 0.3, marginRight: 16 }}
          >
            <Edit2 size={24} color={colors.textPrimary} />
          </Pressable>
          <Pressable onPress={() => { setSelectedTag(undefined); setIsModalOpen(true); }}>
            <Plus size={24} color={colors.textPrimary} />
          </Pressable>
        </View>
      </View>

      <ScrollView contentContainerStyle={styles.content}>
        <View style={[styles.searchContainer, { backgroundColor: colors.surface, borderColor: colors.border }]}>
          <Search size={18} color={colors.textSecondary} style={styles.searchIcon} />
          <TextInput 
            style={[styles.searchInput, { color: colors.textPrimary }]}
            placeholder="Filtrar tags"
            placeholderTextColor={colors.textSecondary}
            value={searchQuery}
            onChangeText={setSearchQuery}
          />
        </View>

        <View style={styles.tagsList}>
          {filteredTags.length === 0 && (
            <Text style={[styles.emptyText, { color: colors.textSecondary }]}>Nenhuma tag encontrada.</Text>
          )}
          {filteredTags.map(tag => (
            <Pressable 
              key={tag.id} 
              onPress={() => {
                if (!isEditing) {
                  setSelectedTag(tag);
                  setIsModalOpen(true);
                }
              }}
              style={[styles.tagRow, { borderBottomColor: colors.border }]}
            >
              <View style={styles.tagInfo}>
                <TagTrapezoid color={tag.color} size={18} />
                <Text style={[styles.tagName, { color: colors.textPrimary }]}>{tag.name}</Text>
              </View>
              <View style={styles.tagActions}>
                {!isEditing && (
                  <Text style={[styles.tagAmount, { color: colors.textPrimary }]}>
                    R$ {getTagTotal(tag.id).toLocaleString('pt-BR', { minimumFractionDigits: 2 })}
                  </Text>
                )}
                {isEditing && (
                  <View style={styles.editActions}>
                    <Pressable 
                      onPress={(e) => {
                        e.stopPropagation();
                        setSelectedTag(tag);
                        setIsModalOpen(true);
                      }}
                      style={styles.actionBtn}
                    >
                      <Edit2 size={20} color={colors.textSecondary} />
                    </Pressable>
                    <Pressable 
                      onPress={(e) => {
                        e.stopPropagation();
                        handleDeleteTag(tag.id);
                      }}
                      style={styles.actionBtn}
                    >
                      <Trash2 size={20} color={colors.red} />
                    </Pressable>
                  </View>
                )}
              </View>
            </Pressable>
          ))}
        </View>
      </ScrollView>
    </View>
  );
}

const styles = StyleSheet.create({
  container: { flex: 1, paddingBottom: 80 },
  header: {
    flexDirection: 'row',
    justifyContent: 'space-between',
    alignItems: 'center',
    paddingHorizontal: 20,
    paddingVertical: 16,
    borderBottomWidth: 1,
  },
  todayContainer: {
    width: 40,
    height: 40,
    alignItems: 'center',
    justifyContent: 'center',
  },
  todayText: {
    fontSize: 12,
    fontWeight: 'bold',
  },
  monthSelector: {
    flexDirection: 'row',
    alignItems: 'center',
    gap: 16,
  },
  monthText: {
    fontSize: 22,
    fontWeight: '700',
  },
  subheader: {
    flexDirection: 'row',
    justifyContent: 'space-between',
    alignItems: 'center',
    paddingHorizontal: 20,
    paddingTop: 24,
    paddingBottom: 16,
  },
  subheaderTitle: {
    fontSize: 24,
    fontWeight: 'bold',
  },
  actionButtons: {
    flexDirection: 'row',
    alignItems: 'center',
  },
  content: {
    padding: 20,
  },
  searchContainer: {
    flexDirection: 'row',
    alignItems: 'center',
    borderWidth: 1,
    borderRadius: 12,
    paddingHorizontal: 12,
    marginBottom: 16,
  },
  searchIcon: {
    marginRight: 8,
  },
  searchInput: {
    flex: 1,
    paddingVertical: 12,
  },
  tagsList: {
    flexDirection: 'column',
  },
  emptyText: {
    textAlign: 'center',
    marginTop: 32,
  },
  tagRow: {
    flexDirection: 'row',
    justifyContent: 'space-between',
    alignItems: 'center',
    paddingVertical: 20,
    borderBottomWidth: 1,
  },
  tagInfo: {
    flexDirection: 'row',
    alignItems: 'center',
    gap: 16,
  },
  tagName: {
    fontSize: 17,
    fontWeight: '600',
  },
  tagActions: {
    flexDirection: 'row',
    alignItems: 'center',
  },
  tagAmount: {
    fontSize: 17,
    fontWeight: 'bold',
  },
  editActions: {
    flexDirection: 'row',
    alignItems: 'center',
    gap: 12,
    marginLeft: 8,
  },
  actionBtn: {
    padding: 4,
  }
});
