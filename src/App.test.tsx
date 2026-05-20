import { render, screen } from '@testing-library/react';
import { describe, it, expect } from 'vitest';
import App from './App';

describe('App', () => {
  it('renders the SheetView as the default route', () => {
    render(<App />);
    expect(screen.getAllByText('Planilha')[0]).toBeInTheDocument();
    expect(screen.getByText('Visão Geral')).toBeInTheDocument();
  });
});
