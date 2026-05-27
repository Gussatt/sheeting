import { render, screen } from '@testing-library/react';
import { describe, it, expect } from 'vitest';
import { Layout } from './Layout';
import { MemoryRouter } from 'react-router-dom';
import { ThemeProvider } from '../../context/ThemeContext';

describe('Layout', () => {
  it('renders children and bottom navigation', () => {
    render(
      <ThemeProvider>
        <MemoryRouter>
          <Layout>
            <div data-testid="child">Content</div>
          </Layout>
        </MemoryRouter>
      </ThemeProvider>
    );
    
    expect(screen.getByTestId('child')).toBeInTheDocument();
    expect(screen.getByText(/Saldos/i)).toBeInTheDocument();
    expect(screen.getByText(/Totais/i)).toBeInTheDocument();
  });
});
