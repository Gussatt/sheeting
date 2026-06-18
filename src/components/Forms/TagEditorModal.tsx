import React, { useState, useEffect } from 'react';
import { View, Text, StyleSheet, Pressable, TextInput, Modal, ScrollView, Alert } from 'react-native';
import { X, ChevronDown, Check } from 'lucide-react-native';
import { db } from '../../db/db';
import type { Tag } from '../../db/db';
import { useAppTheme } from '../../styles/theme';
import * as Crypto from 'expo-crypto';

interface Props {
  isOpen: boolean;
  onClose: () => void;
  onSave: () => void;
  tag?: Tag;
}

const TAG_COLORS = [
  { name: 'Cinza', color: '#E0E0E0' },
  { name: 'Azul', color: '#D1E9FF' },
  { name: 'Amarelo', color: '#FFF9C4' },
  { name: 'Verde', color: '#B9F6CA' },
  { name: 'Vermelho', color: '#FFCDD2' },
  { name: 'Roxo', color: '#E1BEE7' },
  { name: 'Rosa', color: '#F8BBD0' },
  { name: 'Marrom', color: '#D7CCC8' },
];

const Toggle = ({ active, onChange }: { active: boolean, onChange: (val: boolean) => void }) => {
  const { colors } = useAppTheme();
  return (
    <Pressable 
      onPress={() => onChange(!active)}
      style={[styles.toggleContainer, { backgroundColor: colors.surface, borderColor: colors.border }]}
    >
      <View style={[
        styles.toggleBtn, 
        !active && { backgroundColor: colors.bg, shadowOpacity: 0.1 },
      ]}>
        <Text style={{ 
          color: !active ? colors.textPrimary : colors.textSecondary,
          fontWeight: !active ? 'bold' : 'normal',
          fontSize: 13
        }}>
          Ignorar
        </Text>
      </View>
      <View style={[
        styles.toggleBtn, 
        active && { backgroundColor: colors.primary },
      ]}>
        <Text style={{ 
          color: active ? colors.bg : colors.textSecondary,
          fontWeight: active ? 'bold' : 'normal',
          fontSize: 13
        }}>
          Calcular
        </Text>
      </View>
    </Pressable>
  );
};

export const TagEditorModal: React.FC<Props> = ({ isOpen, onClose, onSave, tag }) => {
  const { colors } = useAppTheme();
  const [name, setName] = useState('');
  const [selectedColor, setSelectedColor] = useState(TAG_COLORS[0].color);
  const [isAdvancedOpen, setIsAdvancedOpen] = useState(false);
  
  const [calcSaldos, setCalcSaldos] = useState(true);
  const [calcPerformance, setCalcPerformance] = useState(true);
  const [calcEconomizado, setCalcEconomizado] = useState(true);
  const [calcCustoVida, setCalcCustoVida] = useState(true);
  const [calcDiarioMedio, setCalcDiarioMedio] = useState(true);
  const [keywords, setKeywords] = useState<string[]>([]);
  const [keywordInput, setKeywordInput] = useState('');

  useEffect(() => {
    if (isOpen) {
      setName(tag?.name || '');
      setSelectedColor(tag?.color || TAG_COLORS[0].color);
      setIsAdvancedOpen(false);
      setCalcSaldos(tag?.calcSaldos ?? true);
      setCalcPerformance(tag?.calcPerformance ?? true);
      setCalcEconomizado(tag?.calcEconomizado ?? true);
      setCalcCustoVida(tag?.calcCustoVida ?? true);
      setCalcDiarioMedio(tag?.calcDiarioMedio ?? true);
      setKeywords([]);
      if (tag) {
        db.query<{ keyword: string }>(
          'SELECT keyword FROM tag_keywords WHERE tag_id = ?',
          [tag.id]
        ).then(rows => setKeywords(rows.map(r => r.keyword)));
      }
    }
  }, [isOpen, tag]);

  if (!isOpen) return null;

  const addKeyword = (text: string) => {
    const trimmed = text.trim().toLowerCase();
    if (!trimmed || keywords.includes(trimmed)) return;
    setKeywords(prev => [...prev, trimmed]);
  };

  const removeKeyword = (keyword: string) => {
    setKeywords(prev => prev.filter(k => k !== keyword));
  };

  const handleSave = async () => {
    if (!name) return;

    try {
      let tagId = tag?.id;
      if (tag) {
        await db.exec(
          `UPDATE tags SET name = ?, color = ?, calc_saldos = ?, calc_performance = ?,
                  calc_economizado = ?, calc_custo_vida = ?, calc_diario_medio = ?
           WHERE id = ?`,
          [name, selectedColor, calcSaldos, calcPerformance, calcEconomizado, calcCustoVida, calcDiarioMedio, tag.id]
        );
      } else {
        tagId = Crypto.randomUUID();
        await db.exec(
          `INSERT INTO tags (id, name, color, calc_saldos, calc_performance, calc_economizado,
                           calc_custo_vida, calc_diario_medio)
           VALUES (?, ?, ?, ?, ?, ?, ?, ?)`,
          [tagId, name, selectedColor, calcSaldos, calcPerformance, calcEconomizado, calcCustoVida, calcDiarioMedio]
        );
      }

      const existing = await db.query<{ keyword: string }>(
        'SELECT keyword FROM tag_keywords WHERE tag_id = ?',
        [tagId!]
      );
      const existingKeywords = existing.map(r => r.keyword);
      const toDelete = existingKeywords.filter(k => !keywords.includes(k));
      const toAdd = keywords.filter(k => !existingKeywords.includes(k));

      for (const kw of toDelete) {
        await db.exec('DELETE FROM tag_keywords WHERE tag_id = ? AND keyword = ?', [tagId!, kw]);
      }
      for (const kw of toAdd) {
        await db.exec(
          'INSERT INTO tag_keywords (id, tag_id, keyword) VALUES (?, ?, ?)',
          [Crypto.randomUUID(), tagId!, kw]
        );
      }

      onSave();
      onClose();
    } catch (error) {
      console.error('Failed to save tag:', error);
      Alert.alert('Erro', 'Erro ao salvar tag.');
    }
  };

  const handleDelete = () => {
    if (!tag) return;
    Alert.alert(
      'Confirmação',
      `Excluir a tag "${tag.name}"? As transações vinculadas ficarão sem tag.`,
      [
        { text: 'Cancelar', style: 'cancel' },
        { 
          text: 'Excluir', 
          style: 'destructive',
          onPress: async () => {
            try {
              await db.exec('DELETE FROM tags WHERE id = ?', [tag.id]);
              await db.exec('UPDATE transactions SET tag_id = NULL WHERE tag_id = ?', [tag.id]);
              onSave();
              onClose();
            } catch (error) {
              console.error('Failed to delete tag:', error);
              Alert.alert('Erro', 'Erro ao excluir tag.');
            }
          }
        }
      ]
    );
  };


  return (
    <Modal visible={isOpen} transparent animationType="slide" onRequestClose={onClose}>
      <Pressable style={styles.overlay} onPress={onClose}>
        <View style={[styles.sheet, { backgroundColor: colors.bg }]} onStartShouldSetResponder={() => true}>
          <View style={[styles.header, { borderBottomColor: colors.border }]}>
            <Text style={[styles.title, { color: colors.textPrimary }]}>{tag ? 'Editar tag' : 'Criar tag'}</Text>
            <Pressable onPress={onClose} style={styles.closeBtn}>
              <X size={28} color={colors.textPrimary} />
            </Pressable>
          </View>

          <ScrollView style={styles.content}>
            <View style={styles.section}>
              <Text style={[styles.label, { color: colors.textSecondary }]}>Nome</Text>
              <TextInput 
                value={name}
                onChangeText={setName}
                placeholder="Ex: Alimentação"
                placeholderTextColor={colors.textSecondary}
                style={[styles.input, { color: colors.textPrimary, borderBottomColor: colors.border }]}
              />
            </View>

            <View style={styles.section}>
              <Text style={[styles.labelBold, { color: colors.textPrimary }]}>Cor de fundo</Text>
              <View style={styles.colorGrid}>
                {TAG_COLORS.map((c) => (
                  <Pressable
                    key={c.color}
                    onPress={() => setSelectedColor(c.color)}
                    style={[
                      styles.colorBtn, 
                      { backgroundColor: c.color },
                      selectedColor === c.color && { borderWidth: 2, borderColor: colors.textPrimary }
                    ]}
                  >
                    <Text style={styles.colorName}>{c.name}</Text>
                    {selectedColor === c.color && <Check size={18} color="#1a1a1a" />}
                  </Pressable>
                ))}
              </View>
            </View>

            <View style={styles.section}>
              <Text style={[styles.labelBold, { color: colors.textPrimary }]}>Palavras-chave</Text>
              <Text style={[styles.label, { color: colors.textSecondary, marginBottom: 12 }]}>
                A transação recebe esta tag automaticamente quando a descrição contém uma das palavras-chave.
              </Text>
              <View style={styles.keywordInputRow}>
                <TextInput
                  value={keywordInput}
                  onChangeText={setKeywordInput}
                  placeholder="Adicionar palavra-chave"
                  placeholderTextColor={colors.textSecondary}
                  style={[styles.input, { color: colors.textPrimary, borderBottomColor: colors.border, flex: 1 }]}
                  onSubmitEditing={() => { addKeyword(keywordInput); setKeywordInput(''); }}
                />
                <Pressable
                  onPress={() => { addKeyword(keywordInput); setKeywordInput(''); }}
                  style={[styles.addKeywordBtn, { borderColor: colors.border }]}
                >
                  <Text style={[styles.addKeywordText, { color: colors.textPrimary }]}>+</Text>
                </Pressable>
              </View>
              {keywords.length > 0 && (
                <View style={styles.chipsRow}>
                  {keywords.map(kw => (
                    <View key={kw} style={[styles.chip, { backgroundColor: colors.surface, borderColor: colors.border }]}>
                      <Text style={[styles.chipText, { color: colors.textPrimary }]}>{kw}</Text>
                      <Pressable onPress={() => removeKeyword(kw)} style={styles.chipX}>
                        <X size={14} color={colors.textSecondary} />
                      </Pressable>
                    </View>
                  ))}
                </View>
              )}
            </View>

            <View style={[styles.advancedSection, { borderTopColor: colors.border }]}>
              <Pressable 
                onPress={() => setIsAdvancedOpen(!isAdvancedOpen)}
                style={styles.advancedHeader}
              >
                <View style={styles.advancedTextCol}>
                  <Text style={[styles.advancedTitle, { color: colors.textPrimary }]}>Configurações avançadas</Text>
                  <Text style={[styles.advancedDesc, { color: colors.textSecondary }]}>Defina em quais partes do app as movimentações com essa tag serão calculadas.</Text>
                </View>
                <ChevronDown size={24} color={colors.textPrimary} style={{ transform: [{ rotate: isAdvancedOpen ? '180deg' : '0deg' }] }} />
              </Pressable>

              {isAdvancedOpen && (
                <View style={styles.togglesList}>
                  <View style={styles.toggleRow}>
                    <Text style={[styles.toggleLabel, { color: colors.textPrimary }]}>Saldos</Text>
                    <Toggle active={calcSaldos} onChange={setCalcSaldos} />
                  </View>
                  <View style={styles.toggleRow}>
                    <Text style={[styles.toggleLabel, { color: colors.textPrimary }]}>Performance</Text>
                    <Toggle active={calcPerformance} onChange={setCalcPerformance} />
                  </View>
                  <View style={styles.toggleRow}>
                    <Text style={[styles.toggleLabel, { color: colors.textPrimary }]}>Economizado</Text>
                    <Toggle active={calcEconomizado} onChange={setCalcEconomizado} />
                  </View>
                  <View style={styles.toggleRow}>
                    <Text style={[styles.toggleLabel, { color: colors.textPrimary }]}>Custo de vida</Text>
                    <Toggle active={calcCustoVida} onChange={setCalcCustoVida} />
                  </View>
                  <View style={styles.toggleRow}>
                    <Text style={[styles.toggleLabel, { color: colors.textPrimary }]}>Diário médio</Text>
                    <Toggle active={calcDiarioMedio} onChange={setCalcDiarioMedio} />
                  </View>
                </View>
              )}
            </View>
          </ScrollView>

          <View style={[styles.footer, { borderTopColor: colors.border }]}>
            <Pressable 
              onPress={handleSave}
              style={[styles.saveBtn, { backgroundColor: colors.textPrimary }]}
            >
              <Text style={[styles.saveText, { color: colors.bg }]}>
                {tag ? 'Salvar' : 'Criar'}
              </Text>
            </Pressable>
            {tag && (
              <Pressable 
                onPress={handleDelete}
                style={[styles.deleteBtn, { borderColor: colors.red }]}
              >
                <Text style={[styles.deleteText, { color: colors.red }]}>Excluir</Text>
              </Pressable>
            )}
          </View>
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
    height: '90%',
    borderTopLeftRadius: 20,
    borderTopRightRadius: 20,
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
  closeBtn: { padding: 4 },
  content: {
    padding: 24,
  },
  section: {
    marginBottom: 24,
  },
  label: {
    fontSize: 14,
    marginBottom: 8,
  },
  input: {
    fontSize: 20,
    paddingVertical: 12,
    borderBottomWidth: 1,
  },
  keywordInputRow: {
    flexDirection: 'row',
    alignItems: 'center',
    gap: 8,
  },
  addKeywordBtn: {
    width: 40,
    height: 40,
    borderRadius: 20,
    alignItems: 'center',
    justifyContent: 'center',
    borderWidth: 1,
  },
  addKeywordText: {
    fontSize: 24,
    fontWeight: '300',
  },
  chipsRow: {
    flexDirection: 'row',
    flexWrap: 'wrap',
    gap: 8,
    marginTop: 16,
  },
  chip: {
    flexDirection: 'row',
    alignItems: 'center',
    gap: 6,
    paddingVertical: 6,
    paddingHorizontal: 12,
    borderRadius: 16,
    borderWidth: 1,
  },
  chipText: {
    fontSize: 14,
    fontWeight: '500',
  },
  chipX: {
    padding: 2,
  },
  labelBold: {
    fontWeight: 'bold',
    fontSize: 18,
    marginBottom: 20,
  },
  colorGrid: {
    flexDirection: 'row',
    flexWrap: 'wrap',
    gap: 12,
  },
  colorBtn: {
    height: 50,
    width: '48%',
    borderRadius: 12,
    flexDirection: 'row',
    alignItems: 'center',
    justifyContent: 'space-between',
    paddingHorizontal: 16,
  },
  colorName: {
    fontSize: 16,
    fontWeight: '600',
    color: '#1a1a1a',
  },
  advancedSection: {
    marginTop: 24,
    paddingTop: 24,
    borderTopWidth: 1,
  },
  advancedHeader: {
    flexDirection: 'row',
    justifyContent: 'space-between',
    alignItems: 'center',
  },
  advancedTextCol: {
    flex: 1,
    gap: 4,
    paddingRight: 16,
  },
  advancedTitle: {
    fontWeight: 'bold',
    fontSize: 18,
  },
  advancedDesc: {
    fontSize: 14,
  },
  togglesList: {
    gap: 16,
    marginTop: 24,
  },
  toggleRow: {
    flexDirection: 'row',
    justifyContent: 'space-between',
    alignItems: 'center',
  },
  toggleLabel: {
    fontWeight: '500',
    fontSize: 16,
  },
  toggleContainer: {
    flexDirection: 'row',
    borderRadius: 20,
    padding: 4,
    width: 140,
    borderWidth: 1,
  },
  toggleBtn: {
    flex: 1,
    paddingVertical: 6,
    alignItems: 'center',
    borderRadius: 16,
  },
  footer: {
    padding: 24,
    borderTopWidth: 1,
  },
  saveBtn: {
    width: '100%',
    padding: 20,
    borderRadius: 40,
    alignItems: 'center',
  },
  saveText: {
    fontSize: 18,
    fontWeight: 'bold',
  },
  deleteBtn: {
    width: '100%',
    padding: 16,
    marginTop: 16,
    borderRadius: 40,
    borderWidth: 1,
    alignItems: 'center',
  },
  deleteText: {
    fontSize: 18,
    fontWeight: 'bold',
  }
});
