import { useState, useEffect } from 'react';
import { useNavigate, useParams, useSearchParams } from 'react-router-dom';
import { db, useSQL } from '../db/db';
import type { Transaction, Tag } from '../db/db';
import { ArrowLeft } from 'lucide-react';
import { TransactionForm } from '../components/Forms/TransactionForm';

export const AddTransaction = () => {
  const { id } = useParams();
  const [searchParams] = useSearchParams();
  const navigate = useNavigate();
  const tags = useSQL<Tag>('SELECT * FROM tags');
  
  const [initialData, setInitialData] = useState<Partial<Transaction> | undefined>(undefined);
  const [loading, setLoading] = useState(!!id);

  useEffect(() => {
    if (id) {
      db.query<Transaction>('SELECT * FROM transactions WHERE id = $1', [id]).then(rows => {
        if (rows.length > 0) {
          setInitialData({
            ...rows[0],
            date: new Date(rows[0].date)
          });
        }
        setLoading(false);
      });
    } else {
      // Pre-fill from query params if available
      const typeParam = searchParams.get('type');
      const dateParam = searchParams.get('date');
      
      if (typeParam || dateParam) {
        setInitialData({
          type: (typeParam as any) || 'expense',
          date: dateParam ? new Date(dateParam) : new Date(),
          amount: 0,
          description: '',
          tagId: '',
          isRecurring: false
        });
      }
    }
  }, [id, searchParams]);

  const handleSubmit = async (data: Partial<Transaction>) => {
    if (!data.type) return;

    const amount = Number(data.amount) || 0;
    const params = [
      amount,
      data.type,
      data.date instanceof Date ? data.date.toISOString() : data.date,
      data.description || '',
      data.tagId || null,
      data.isRecurring || false,
      data.recurringFrequency || null,
      data.recurringIndefinite ?? true,
      data.recurringCount || null
    ];

    if (id) {
      await db.exec(
        `UPDATE transactions 
         SET amount = $1, type = $2, date = $3, description = $4, tag_id = $5, is_recurring = $6, 
             recurring_frequency = $7, recurring_indefinite = $8, recurring_count = $9 
         WHERE id = $10`,
        [...params, id]
      );
    } else {
      await db.exec(
        `INSERT INTO transactions (id, amount, type, date, description, tag_id, is_recurring, 
                                 recurring_frequency, recurring_indefinite, recurring_count) 
         VALUES ($1, $2, $3, $4, $5, $6, $7, $8, $9, $10)`,
        [crypto.randomUUID(), ...params]
      );
    }

    navigate('/');
  };

  const handleDelete = async () => {
    if (id && confirm('Deseja realmente excluir esta transação?')) {
      await db.exec('DELETE FROM transactions WHERE id = $1', [id]);
      navigate('/');
    }
  };

  if (loading) return <div style={{ padding: '2rem', textAlign: 'center' }}>Carregando...</div>;

  return (
    <div className="add-transaction-page" style={{ padding: '1rem' }}>
      <header style={{ display: 'flex', alignItems: 'center', padding: '1rem 0', gap: '1rem' }}>
        <button 
          onClick={() => navigate(-1)} 
          style={{ background: 'none', border: 'none', cursor: 'pointer', color: 'var(--color-text-primary)', display: 'flex', alignItems: 'center' }}
        >
          <ArrowLeft size={24} />
        </button>
        <h1 style={{ fontSize: '1.25rem', margin: 0, color: 'var(--color-text-primary)' }}>
          {id ? 'Editar Transação' : 'Nova Transação'}
        </h1>
      </header>

      <TransactionForm 
        initialData={initialData} 
        tags={tags} 
        onSubmit={handleSubmit} 
        onDelete={id ? handleDelete : undefined}
      />
    </div>
  );
};
