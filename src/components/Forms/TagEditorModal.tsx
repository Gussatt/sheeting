import React, { useState } from 'react';
import { X, ChevronDown, Check } from 'lucide-react';
import { db, type Tag } from '../../db/db';

interface Props {
  isOpen: boolean;
  onClose: () => void;
  onSave: () => void;
  tag?: Tag; // If provided, we are editing
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

export const TagEditorModal: React.FC<Props> = ({ isOpen, onClose, onSave, tag }) => {
  const [name, setName] = useState(tag?.name || '');
  const [selectedColor, setSelectedColor] = useState(tag?.color || TAG_COLORS[0].color);
  const [isAdvancedOpen, setIsAdvancedOpen] = useState(false);
  
  const [calcSaldos, setCalcSaldos] = useState(tag?.calcSaldos ?? true);
  const [calcPerformance, setCalcPerformance] = useState(tag?.calcPerformance ?? true);
  const [calcEconomizado, setCalcEconomizado] = useState(tag?.calcEconomizado ?? true);
  const [calcCustoVida, setCalcCustoVida] = useState(tag?.calcCustoVida ?? true);
  const [calcDiarioMedio, setCalcDiarioMedio] = useState(tag?.calcDiarioMedio ?? true);

  if (!isOpen) return null;

  const handleSave = async () => {
    if (!name) return;

    if (tag) {
      await db.exec(
        `UPDATE tags SET name = $1, color = $2, calc_saldos = $3, calc_performance = $4, 
                calc_economizado = $5, calc_custo_vida = $6, calc_diario_medio = $7 
         WHERE id = $8`,
        [name, selectedColor, calcSaldos, calcPerformance, calcEconomizado, calcCustoVida, calcDiarioMedio, tag.id]
      );
    } else {
      await db.exec(
        `INSERT INTO tags (id, name, color, calc_saldos, calc_performance, calc_economizado, 
                         calc_custo_vida, calc_diario_medio) 
         VALUES ($1, $2, $3, $4, $5, $6, $7, $8)`,
        [crypto.randomUUID(), name, selectedColor, calcSaldos, calcPerformance, calcEconomizado, calcCustoVida, calcDiarioMedio]
      );
    }
    onSave();
    onClose();
  };

  const handleDelete = async () => {
    if (!tag) return;
    if (confirm(`Excluir a tag "${tag.name}"? As transações vinculadas ficarão sem tag.`)) {
      await db.exec('DELETE FROM tags WHERE id = $1', [tag.id]);
      await db.exec('UPDATE transactions SET tag_id = NULL WHERE tag_id = $1', [tag.id]);
      onSave();
      onClose();
    }
  };

  const Toggle = ({ active, onChange }: { active: boolean, onChange: (val: boolean) => void }) => (
    <div 
      onClick={() => onChange(!active)}
      style={{ 
        display: 'flex', 
        backgroundColor: '#eee', 
        borderRadius: '20px', 
        padding: '4px', 
        width: '140px',
        cursor: 'pointer' 
      }}
    >
      <div style={{ 
        flex: 1, 
        padding: '6px', 
        textAlign: 'center', 
        fontSize: '0.85rem', 
        borderRadius: '16px', 
        backgroundColor: !active ? 'white' : 'transparent',
        boxShadow: !active ? '0 2px 4px rgba(0,0,0,0.1)' : 'none',
        color: !active ? '#1a1a1a' : '#666',
        fontWeight: !active ? 'bold' : 'normal'
      }}>
        Ignorar
      </div>
      <div style={{ 
        flex: 1, 
        padding: '6px', 
        textAlign: 'center', 
        fontSize: '0.85rem', 
        borderRadius: '16px', 
        backgroundColor: active ? 'var(--color-primary)' : 'transparent',
        color: active ? 'white' : '#666',
        fontWeight: active ? 'bold' : 'normal'
      }}>
        Calcular
      </div>
    </div>
  );

  return (
    <div className="overlay" style={{ backgroundColor: 'rgba(0,0,0,0.7)', zIndex: 2000 }}>
      <div className="filter-sheet" style={{ 
        height: '90vh', 
        backgroundColor: 'white', 
        color: '#1a1a1a', 
        display: 'flex', 
        flexDirection: 'column',
        padding: 0
      }}>
        <header style={{ 
          display: 'flex', 
          justifyContent: 'space-between', 
          alignItems: 'center', 
          padding: '1.25rem 1.5rem',
          borderBottom: '1px solid #eee'
        }}>
          <h2 style={{ margin: 0, fontSize: '1.5rem', fontWeight: 'bold' }}>{tag ? 'Editar tag' : 'Criar tag'}</h2>
          <button onClick={onClose} style={{ background: 'none', border: 'none', color: '#1a1a1a', cursor: 'pointer' }}>
            <X size={28} />
          </button>
        </header>

        <div style={{ flex: 1, overflowY: 'auto', padding: '1.5rem' }}>
          <div style={{ marginBottom: '2rem' }}>
            <label style={{ display: 'block', color: '#666', fontSize: '0.9rem', marginBottom: '0.5rem' }}>Nome</label>
            <input 
              type="text"
              value={name}
              onChange={e => setName(e.target.value)}
              placeholder="Ex: Alimentação"
              style={{ 
                width: '100%', 
                border: 'none', 
                borderBottom: '1px solid #eee', 
                fontSize: '1.3rem', 
                padding: '0.5rem 0',
                outline: 'none',
                color: '#1a1a1a'
              }}
            />
          </div>

          <div style={{ marginBottom: '1.5rem' }}>
            <label style={{ display: 'block', fontWeight: 'bold', fontSize: '1.1rem', marginBottom: '1.25rem' }}>Cor de fundo</label>
            <div style={{ display: 'grid', gridTemplateColumns: '1fr 1fr', gap: '12px' }}>
              {TAG_COLORS.map((c) => (
                <button
                  key={c.color}
                  onClick={() => setSelectedColor(c.color)}
                  style={{
                    height: '50px',
                    borderRadius: '12px',
                    backgroundColor: c.color,
                    border: selectedColor === c.color ? '2px solid #1a1a1a' : 'none',
                    display: 'flex',
                    alignItems: 'center',
                    padding: '0 1rem',
                    fontSize: '1rem',
                    fontWeight: '600',
                    color: '#1a1a1a',
                    cursor: 'pointer',
                    justifyContent: 'space-between'
                  }}
                >
                  {c.name}
                  {selectedColor === c.color && <Check size={18} />}
                </button>
              ))}
            </div>
          </div>

          <div style={{ marginTop: '2.5rem', borderTop: '1px solid #eee', paddingTop: '1.5rem' }}>
            <div 
              onClick={() => setIsAdvancedOpen(!isAdvancedOpen)}
              style={{ display: 'flex', justifyContent: 'space-between', alignItems: 'center', cursor: 'pointer' }}
            >
              <div style={{ display: 'flex', flexDirection: 'column', gap: '4px' }}>
                <span style={{ fontWeight: 'bold', fontSize: '1.1rem' }}>Configurações avançadas</span>
                <span style={{ fontSize: '0.85rem', color: '#666' }}>Defina em quais partes do app as movimentações com essa tag serão calculadas.</span>
              </div>
              <ChevronDown size={24} style={{ transform: isAdvancedOpen ? 'rotate(180deg)' : 'none', transition: 'transform 0.2s' }} />
            </div>

            {isAdvancedOpen && (
              <div style={{ display: 'flex', flexDirection: 'column', gap: '1rem', marginTop: '1.5rem' }}>
                <div style={{ display: 'flex', justifyContent: 'space-between', alignItems: 'center' }}>
                  <span style={{ fontWeight: '500' }}>Saldos</span>
                  <Toggle active={calcSaldos} onChange={setCalcSaldos} />
                </div>
                <div style={{ display: 'flex', justifyContent: 'space-between', alignItems: 'center' }}>
                  <span style={{ fontWeight: '500' }}>Performance</span>
                  <Toggle active={calcPerformance} onChange={setCalcPerformance} />
                </div>
                <div style={{ display: 'flex', justifyContent: 'space-between', alignItems: 'center' }}>
                  <span style={{ fontWeight: '500' }}>Economizado</span>
                  <Toggle active={calcEconomizado} onChange={setCalcEconomizado} />
                </div>
                <div style={{ display: 'flex', justifyContent: 'space-between', alignItems: 'center' }}>
                  <span style={{ fontWeight: '500' }}>Custo de vida</span>
                  <Toggle active={calcCustoVida} onChange={setCalcCustoVida} />
                </div>
                <div style={{ display: 'flex', justifyContent: 'space-between', alignItems: 'center' }}>
                  <span style={{ fontWeight: '500' }}>Diário médio</span>
                  <Toggle active={calcDiarioMedio} onChange={setCalcDiarioMedio} />
                </div>
              </div>
            )}
          </div>
        </div>

        <div style={{ padding: '1.5rem', borderTop: '1px solid #eee' }}>
          <button 
            onClick={handleSave}
            style={{ 
              width: '100%', 
              padding: '1.25rem', 
              borderRadius: '40px', 
              border: 'none', 
              backgroundColor: '#1a1a1a', 
              color: 'white', 
              fontSize: '1.2rem', 
              fontWeight: 'bold', 
              cursor: 'pointer' 
            }}
          >
            {tag ? 'Salvar' : 'Criar'}
          </button>
          {tag && (
            <button 
              onClick={handleDelete}
              style={{ 
                width: '100%', 
                padding: '1rem', 
                marginTop: '1rem',
                borderRadius: '40px', 
                border: '1px solid #E74C3C', 
                backgroundColor: 'transparent', 
                color: '#E74C3C', 
                fontSize: '1.1rem', 
                fontWeight: 'bold', 
                cursor: 'pointer' 
              }}
            >
              Excluir
            </button>
          )}
        </div>
      </div>
    </div>
  );
};
