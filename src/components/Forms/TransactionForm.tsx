import React, { useState, useEffect } from 'react';
import { 
  ArrowDownLeft, ArrowUpRight, CirclePlay, Landmark, CreditCard, 
  ChevronDown, X, Pencil, Calendar, RotateCw, Square, Plus, Minus
} from 'lucide-react';
import type { Transaction, Tag } from '../../db/db';
import { format, startOfMonth, eachDayOfInterval, endOfMonth, isSameDay, addMonths, subMonths } from 'date-fns';
import { ptBR } from 'date-fns/locale';

type TransactionType = 'income' | 'expense' | 'daily' | 'savings' | 'credit';

interface Props {
  initialData?: Partial<Transaction>;
  tags: Tag[];
  onSubmit: (data: Partial<Transaction>) => void;
  onDelete?: () => void;
}

const TYPE_OPTIONS: { type: TransactionType; label: string; icon: any; color: string; letter: string }[] = [
  { type: 'income', label: 'Entrada', icon: ArrowDownLeft, color: 'var(--status-green)', letter: 'E' },
  { type: 'expense', label: 'Saída', icon: ArrowUpRight, color: 'var(--status-red)', letter: 'S' },
  { type: 'daily', label: 'Diário', icon: CirclePlay, color: 'var(--status-pink)', letter: 'D' },
  { type: 'savings', label: 'Economia', icon: Landmark, color: 'var(--status-light-green)', letter: 'E' },
  { type: 'credit', label: 'Gasto com Cartão', icon: CreditCard, color: 'var(--status-purple)', letter: 'C' },
];

export const TransactionForm: React.FC<Props> = ({ initialData, tags, onSubmit, onDelete }) => {
  const [formData, setFormData] = useState<Partial<Transaction>>({
    type: 'expense',
    amount: 0,
    description: '',
    date: new Date(),
    isRecurring: false,
    recurringFrequency: 'monthly',
    recurringIndefinite: true,
    recurringCount: 2,
    tagId: '',
    ...initialData
  });

  const [activeModal, setActiveModal] = useState<'type' | 'date' | 'repeat' | 'tags' | 'until' | null>(null);
  const [calendarMonth, setCalendarMonth] = useState(new Date(formData.date || new Date()));

  useEffect(() => {
    if (initialData) {
      setFormData(prev => ({
        ...prev,
        ...initialData,
        date: initialData.date ? new Date(initialData.date as any) : prev.date
      }));
    }
  }, [initialData]);

  const handleSubmit = (e: React.FormEvent) => {
    e.preventDefault();
    onSubmit(formData);
  };

  const formatAmount = (val: number) => {
    return val.toLocaleString('pt-BR', {
      minimumFractionDigits: 2,
      maximumFractionDigits: 2,
    });
  };

  const handleAmountChange = (e: React.ChangeEvent<HTMLInputElement>) => {
    const cleanValue = e.target.value.replace(/\D/g, '');
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

  // Calendar Helpers
  const days = eachDayOfInterval({
    start: startOfMonth(calendarMonth),
    end: endOfMonth(calendarMonth)
  });
  const firstDayOfMonth = startOfMonth(calendarMonth).getDay();
  const paddingDays = Array.from({ length: firstDayOfMonth }).map(() => null);

  const ModalHeader = ({ title, onClose }: { title: string, onClose: () => void }) => (
    <div style={{ display: 'flex', justifyContent: 'space-between', alignItems: 'center', marginBottom: '1.5rem' }}>
      <h3 style={{ margin: 0, fontSize: '1.5rem', fontWeight: 'bold' }}>{title}</h3>
      <button onClick={onClose} style={{ background: 'none', border: 'none', color: 'white', cursor: 'pointer' }}>
        <X size={24} />
      </button>
    </div>
  );

  return (
    <div style={{ display: 'flex', flexDirection: 'column', height: '100%', padding: '0 1rem' }}>
      {/* Amount Header */}
      <div style={{ 
        display: 'flex', 
        justifyContent: 'space-between', 
        alignItems: 'center', 
        padding: '2rem 0',
        position: 'relative'
      }}>
        <div style={{ display: 'flex', alignItems: 'baseline', gap: '0.5rem' }}>
          <span style={{ fontSize: '2rem', fontWeight: 'bold' }}>R$</span>
          <div style={{ position: 'relative', display: 'flex', alignItems: 'center' }}>
            <input 
              autoFocus
              inputMode="numeric"
              value={formatAmount(formData.amount || 0)}
              onChange={handleAmountChange}
              style={{ 
                background: 'none', 
                border: 'none', 
                color: formData.amount === 0 ? 'var(--color-text-secondary)' : 'var(--color-text-primary)', 
                fontSize: '3.5rem', 
                fontWeight: 'bold',
                outline: 'none',
                width: '100%',
                caretColor: 'transparent'
              }}
            />
            <div style={{ 
              position: 'absolute', 
              right: '-4px', 
              width: '2px', 
              height: '80%', 
              backgroundColor: 'var(--color-primary)',
              opacity: 0.8
            }} />
          </div>
        </div>
        <button 
          onClick={() => setFormData({ ...formData, amount: 0 })}
          style={{ background: 'none', border: 'none', color: 'var(--color-text-secondary)', cursor: 'pointer' }}
        >
          <X size={32} />
        </button>
      </div>

      {/* Form List */}
      <div style={{ display: 'flex', flexDirection: 'column', gap: '0.5rem', flex: 1 }}>
        {/* Type */}
        <button 
          onClick={() => setActiveModal('type')}
          style={{ 
            display: 'flex', alignItems: 'center', gap: '1rem', padding: '1.25rem 0', 
            background: 'none', border: 'none', borderBottom: '1px solid var(--color-border)', color: 'var(--color-text-primary)', cursor: 'pointer'
          }}
        >
          <div style={{ 
            width: '32px', height: '32px', borderRadius: '50%', backgroundColor: selectedType.color, 
            display: 'flex', alignItems: 'center', justifyContent: 'center', fontWeight: 'bold', fontSize: '1rem', color: 'white'
          }}>
            {selectedType.letter}
          </div>
          <span style={{ fontSize: '1.2rem', fontWeight: '500', flex: 1, textAlign: 'left' }}>{selectedType.label}</span>
          <ChevronDown size={20} color="var(--color-text-secondary)" />
        </button>

        {/* Description */}
        <div style={{ display: 'flex', alignItems: 'center', gap: '1rem', padding: '1.25rem 0', borderBottom: '1px solid var(--color-border)' }}>
          <Pencil size={24} color="var(--color-text-secondary)" />
          <input 
            type="text"
            placeholder="Descrição"
            value={formData.description}
            onChange={e => setFormData({ ...formData, description: e.target.value })}
            style={{ 
              background: 'none', border: 'none', color: 'var(--color-text-primary)', fontSize: '1.2rem', fontWeight: '500', 
              outline: 'none', flex: 1, padding: 0
            }}
          />
        </div>

        {/* Date */}
        <button 
          onClick={() => setActiveModal('date')}
          style={{ 
            display: 'flex', alignItems: 'center', gap: '1rem', padding: '1.25rem 0', 
            background: 'none', border: 'none', borderBottom: '1px solid var(--color-border)', color: 'var(--color-text-primary)', cursor: 'pointer'
          }}
        >
          <Calendar size={24} color="var(--color-text-secondary)" />
          <span style={{ fontSize: '1.2rem', fontWeight: '500', flex: 1, textAlign: 'left' }}>Data</span>
          <span style={{ fontSize: '1.2rem', fontWeight: '500', color: 'var(--color-text-secondary)' }}>
            {format(formData.date || new Date(), 'dd/MM/yyyy')}
          </span>
          <ChevronDown size={20} color="var(--color-text-secondary)" />
        </button>

        {/* Repetition */}
        <button 
          onClick={() => setActiveModal('repeat')}
          style={{ 
            display: 'flex', alignItems: 'center', gap: '1rem', padding: '1.25rem 0', 
            background: 'none', border: 'none', borderBottom: '1px solid var(--color-border)', color: 'var(--color-text-primary)', cursor: 'pointer'
          }}
        >
          <RotateCw size={24} color="var(--color-text-secondary)" />
          <span style={{ fontSize: '1.2rem', fontWeight: '500', flex: 1, textAlign: 'left' }}>{getRepeatLabel()}</span>
          <ChevronDown size={20} color="var(--color-text-secondary)" />
        </button>

        {/* Repetition Options (A perder de vista / Counter) */}
        {formData.isRecurring && (
          <div style={{ display: 'flex', borderBottom: '1px solid var(--color-border)' }}>
            <button 
              onClick={() => setActiveModal('until')}
              style={{ 
                display: 'flex', alignItems: 'center', gap: '1rem', padding: '1.25rem 0', flex: 1,
                background: 'none', border: 'none', color: 'var(--color-text-primary)', cursor: 'pointer'
              }}
            >
              <RotateCw size={24} color="var(--color-text-secondary)" style={{ opacity: 0 }} />
              <span style={{ fontSize: '1.2rem', fontWeight: '500', flex: 1, textAlign: 'left' }}>{getUntilLabel()}</span>
              <ChevronDown size={20} color="var(--color-text-secondary)" />
            </button>
            {!formData.recurringIndefinite && (
              <div style={{ display: 'flex', alignItems: 'center', gap: '1.5rem', padding: '0 1rem', borderLeft: '1px solid var(--color-border)' }}>
                <button 
                  onClick={() => setFormData({ ...formData, recurringCount: Math.max(2, (formData.recurringCount || 2) - 1) })}
                  style={{ background: 'none', border: 'none', color: 'var(--color-text-secondary)', cursor: 'pointer' }}
                >
                  <Minus size={20} />
                </button>
                <span style={{ fontSize: '1.2rem', fontWeight: 'bold' }}>{formData.recurringCount}</span>
                <button 
                  onClick={() => setFormData({ ...formData, recurringCount: (formData.recurringCount || 2) + 1 })}
                  style={{ background: 'none', border: 'none', color: 'var(--color-text-primary)', cursor: 'pointer' }}
                >
                  <Plus size={20} />
                </button>
              </div>
            )}
          </div>
        )}

        {/* Tags */}
        <button 
          onClick={() => setActiveModal('tags')}
          style={{ 
            display: 'flex', alignItems: 'center', gap: '1rem', padding: '1.25rem 0', 
            background: 'none', border: 'none', borderBottom: '1px solid var(--color-border)', color: 'var(--color-text-primary)', cursor: 'pointer'
          }}
        >
          <Square size={24} color="var(--color-text-secondary)" />
          <span style={{ fontSize: '1.2rem', fontWeight: '500', flex: 1, textAlign: 'left' }}>{getTagName()}</span>
          <ChevronDown size={20} color="var(--color-text-secondary)" />
        </button>
      </div>

      {/* Footer CTA */}
      <div style={{ padding: '2rem 0' }}>
        <button 
          onClick={handleSubmit}
          style={{ 
            width: '100%', padding: '1.25rem', borderRadius: '40px', border: 'none', 
            backgroundColor: selectedType.color, color: 'white', fontSize: '1.3rem', fontWeight: 'bold', cursor: 'pointer'
          }}
        >
          {initialData?.id ? 'Salvar' : `Adicionar ${selectedType.label.toLowerCase()}`}
        </button>
        {onDelete && (
          <button 
            onClick={onDelete}
            style={{ 
              width: '100%', padding: '1rem', marginTop: '1rem', background: 'none', border: 'none', 
              color: 'var(--status-red)', fontSize: '1.1rem', fontWeight: '500', cursor: 'pointer'
            }}
          >
            Excluir
          </button>
        )}
      </div>

      {/* MODALS */}
      {activeModal && (
        <>
          <div className="overlay" onClick={() => setActiveModal(null)} />
          <div className="filter-sheet" style={{ maxHeight: '80vh', overflowY: 'auto' }}>
            {/* TYPE MODAL */}
            {activeModal === 'type' && (
              <>
                <ModalHeader title="Tipo de Transação" onClose={() => setActiveModal(null)} />
                <div style={{ display: 'flex', flexDirection: 'column', gap: '0.5rem' }}>
                  {TYPE_OPTIONS.map((opt) => (
                    <button
                      key={opt.type}
                      onClick={() => {
                        setFormData({ ...formData, type: opt.type });
                        setActiveModal(null);
                      }}
                      style={{
                        display: 'flex', alignItems: 'center', gap: '1.25rem', padding: '1.25rem', 
                        border: 'none', borderRadius: '12px', background: formData.type === opt.type ? 'var(--color-bg)' : 'transparent', 
                        color: 'white', cursor: 'pointer', textAlign: 'left'
                      }}
                    >
                      <div style={{ 
                        width: '32px', height: '32px', borderRadius: '50%', backgroundColor: opt.color, 
                        display: 'flex', alignItems: 'center', justifyContent: 'center', fontWeight: 'bold' 
                      }}>
                        {opt.letter}
                      </div>
                      <span style={{ fontSize: '1.2rem', fontWeight: formData.type === opt.type ? 'bold' : 'normal' }}>{opt.label}</span>
                    </button>
                  ))}
                </div>
              </>
            )}

            {/* DATE MODAL */}
            {activeModal === 'date' && (
              <>
                <div style={{ display: 'flex', justifyContent: 'space-between', alignItems: 'center', marginBottom: '1.5rem' }}>
                  <h3 style={{ margin: 0, fontSize: '1.25rem', fontWeight: '600' }}>
                    {format(calendarMonth, 'MMMM de yyyy', { locale: ptBR })}
                  </h3>
                  <div style={{ display: 'flex', alignItems: 'center', gap: '1.5rem' }}>
                    <button onClick={() => setCalendarMonth(subMonths(calendarMonth, 1))} style={{ background: 'none', border: 'none', color: 'white' }}>
                      <ChevronDown size={20} style={{ transform: 'rotate(90deg)' }} />
                    </button>
                    <button onClick={() => setCalendarMonth(addMonths(calendarMonth, 1))} style={{ background: 'none', border: 'none', color: 'white' }}>
                      <ChevronDown size={20} style={{ transform: 'rotate(-90deg)' }} />
                    </button>
                  </div>
                </div>
                <div style={{ display: 'grid', gridTemplateColumns: 'repeat(7, 1fr)', gap: '8px', textAlign: 'center' }}>
                  {['dom', 'seg', 'ter', 'qua', 'qui', 'sex', 'sáb'].map(d => (
                    <span key={d} style={{ fontSize: '0.8rem', color: 'rgba(255,255,255,0.4)', marginBottom: '8px' }}>{d}.</span>
                  ))}
                  {paddingDays.map((_, i) => <div key={`pad-${i}`} />)}
                  {days.map(d => (
                    <button
                      key={d.toISOString()}
                      onClick={() => {
                        setFormData({ ...formData, date: d });
                        setActiveModal(null);
                      }}
                      style={{
                        padding: '12px 0', border: 'none', background: isSameDay(d, formData.date || new Date()) ? 'var(--color-text-primary)' : 'transparent',
                        color: isSameDay(d, formData.date || new Date()) ? 'black' : 'white', borderRadius: '50%', cursor: 'pointer', fontSize: '1.1rem',
                        fontWeight: isSameDay(d, formData.date || new Date()) ? 'bold' : 'normal', position: 'relative'
                      }}
                    >
                      {d.getDate()}
                      {isSameDay(d, new Date()) && !isSameDay(d, formData.date || new Date()) && (
                        <div style={{ position: 'absolute', bottom: '6px', left: '50%', transform: 'translateX(-50%)', width: '4px', height: '4px', background: 'var(--color-primary)', borderRadius: '50%' }} />
                      )}
                    </button>
                  ))}
                </div>
                <button 
                  onClick={() => setActiveModal(null)}
                  style={{ 
                    width: '100%', padding: '1rem', marginTop: '2rem', borderRadius: '40px', border: 'none', 
                    backgroundColor: 'white', color: 'black', fontWeight: 'bold', fontSize: '1.1rem' 
                  }}
                >
                  Salvar
                </button>
              </>
            )}

            {/* REPEAT MODAL */}
            {activeModal === 'repeat' && (
              <>
                <ModalHeader title="Repetir" onClose={() => setActiveModal(null)} />
                <div style={{ display: 'flex', flexDirection: 'column', gap: '1.5rem' }}>
                  {[
                    { freq: 'monthly', label: 'Todo mês' },
                    { freq: 'weekly', label: 'Toda semana' },
                    { freq: 'daily', label: 'Todo dia' },
                    { freq: 'none', label: 'Não repetir' }
                  ].map((opt) => (
                    <button
                      key={opt.freq}
                      onClick={() => {
                        if (opt.freq === 'none') {
                          setFormData({ ...formData, isRecurring: false });
                        } else {
                          setFormData({ ...formData, isRecurring: true, recurringFrequency: opt.freq as any });
                        }
                        setActiveModal(null);
                      }}
                      style={{
                        display: 'flex', alignItems: 'center', padding: '0.5rem 0', 
                        border: 'none', background: 'transparent', color: 'white', cursor: 'pointer', fontSize: '1.25rem', fontWeight: '500'
                      }}
                    >
                      {opt.label}
                    </button>
                  ))}
                </div>
              </>
            )}

            {/* UNTIL MODAL */}
            {activeModal === 'until' && (
              <>
                <ModalHeader title="Até quando" onClose={() => setActiveModal(null)} />
                <div style={{ display: 'flex', flexDirection: 'column', gap: '2rem', padding: '1rem 0' }}>
                  <button
                    onClick={() => {
                      setFormData({ ...formData, recurringIndefinite: true });
                      setActiveModal(null);
                    }}
                    style={{
                      display: 'flex', alignItems: 'center', border: 'none', background: 'transparent', color: 'white', cursor: 'pointer', fontSize: '1.25rem', fontWeight: '500'
                    }}
                  >
                    A perder de vista
                  </button>
                  <button
                    onClick={() => {
                      setFormData({ ...formData, recurringIndefinite: false });
                      setActiveModal(null);
                    }}
                    style={{
                      display: 'flex', alignItems: 'center', border: 'none', background: 'transparent', color: 'white', cursor: 'pointer', fontSize: '1.25rem', fontWeight: '500'
                    }}
                  >
                    Definir número de vezes
                  </button>
                </div>
              </>
            )}

            {/* TAGS MODAL */}
            {activeModal === 'tags' && (
              <>
                <div style={{ display: 'flex', justifyContent: 'space-between', alignItems: 'center', marginBottom: '1.5rem' }}>
                  <h3 style={{ margin: 0, fontSize: '1.5rem', fontWeight: 'bold' }}>Tags</h3>
                  <div style={{ display: 'flex', gap: '1rem' }}>
                    <button style={{ background: 'none', border: 'none', color: 'white' }}><Plus size={24} /></button>
                    <button onClick={() => setActiveModal(null)} style={{ background: 'none', border: 'none', color: 'white' }}><X size={24} /></button>
                  </div>
                </div>
                <div style={{ marginBottom: '1.5rem', position: 'relative' }}>
                  <Pencil size={20} color="rgba(255,255,255,0.4)" style={{ position: 'absolute', left: '1rem', top: '50%', transform: 'translateY(-50%)' }} />
                  <input 
                    type="text" 
                    placeholder="Filtrar tags"
                    style={{ width: '100%', padding: '1rem 1rem 1rem 3rem', borderRadius: '12px', border: 'none', background: 'var(--color-bg)', color: 'white', boxSizing: 'border-box' }}
                  />
                </div>
                <div style={{ display: 'flex', flexDirection: 'column', gap: '0.5rem' }}>
                  <button
                    onClick={() => { setFormData({ ...formData, tagId: '' }); setActiveModal(null); }}
                    style={{ display: 'flex', alignItems: 'center', justifyContent: 'space-between', padding: '1rem', border: 'none', background: formData.tagId === '' ? 'var(--color-bg)' : 'transparent', color: 'white', borderRadius: '12px' }}
                  >
                    <span>Sem Tag</span>
                    <input type="checkbox" checked={formData.tagId === ''} readOnly style={{ width: '20px', height: '20px' }} />
                  </button>
                  {tags.map(tag => (
                    <button
                      key={tag.id}
                      onClick={() => { setFormData({ ...formData, tagId: tag.id }); setActiveModal(null); }}
                      style={{ display: 'flex', alignItems: 'center', justifyContent: 'space-between', padding: '1rem', border: 'none', background: formData.tagId === tag.id ? 'var(--color-bg)' : 'transparent', color: 'white', borderRadius: '12px' }}
                    >
                      <div style={{ display: 'flex', alignItems: 'center', gap: '1rem' }}>
                        <div style={{ width: '16px', height: '16px', borderRadius: '4px', backgroundColor: tag.color || 'var(--color-text-secondary)' }} />
                        <span>{tag.name}</span>
                      </div>
                      <input type="checkbox" checked={formData.tagId === tag.id} readOnly style={{ width: '20px', height: '20px' }} />
                    </button>
                  ))}
                </div>
                <button 
                  onClick={() => setActiveModal(null)}
                  style={{ 
                    width: '100%', padding: '1rem', marginTop: '2rem', borderRadius: '40px', border: 'none', 
                    backgroundColor: 'white', color: 'black', fontWeight: 'bold', fontSize: '1.1rem' 
                  }}
                >
                  Salvar
                </button>
              </>
            )}
          </div>
        </>
      )}
    </div>
  );
};
