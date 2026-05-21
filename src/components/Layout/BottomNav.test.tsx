// src/components/Layout/BottomNav.test.tsx
import React from 'react';
import { render, screen } from '@testing-library/react';
import { describe, it, expect } from 'vitest';
import { MemoryRouter } from 'react-router-dom';
import { BottomNav } from './BottomNav';

describe('BottomNav', () => {
  it('renders all 5 main navigation buttons', () => {
    render(
      <MemoryRouter>
        <BottomNav />
      </MemoryRouter>
    );
    expect(screen.getByText('Saldos')).toBeDefined();
    expect(screen.getByText('Totais')).toBeDefined();
    expect(screen.getByText('+')).toBeDefined();
    expect(screen.getByText('Tags')).toBeDefined();
    expect(screen.getByText('Menu')).toBeDefined();
  });
});
