import React from 'react';
import { useParams, useNavigate } from 'react-router-dom';

export const CategoryDetail = () => {
  const { id } = useParams();
  const navigate = useNavigate();
  
  return (
    <div>
      <button onClick={() => navigate('/')} style={{ marginBottom: '1rem' }}>&larr; Voltar</button>
      <h1 style={{ textTransform: 'capitalize' }}>Detalhes: {id}</h1>
      <div style={{ background: 'var(--color-surface)', padding: '1rem', borderRadius: '8px' }}>
        <p>Visualização detalhada para {id} será renderizada aqui.</p>
      </div>
    </div>
  );
};
