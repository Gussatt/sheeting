import { render, screen } from '@testing-library/react';
import { describe, it, expect } from 'vitest';
import { Layout } from './Layout';
import { MemoryRouter } from 'react-router-dom';

describe('Layout', () => {
  it('renders children and bottom navigation', () => {
    render(
      <MemoryRouter>
        <Layout>
          <div data-testid="test-child">Child Content</div>
        </Layout>
      </MemoryRouter>
    );

    expect(screen.getByTestId('test-child')).toBeInTheDocument();
    expect(screen.getByText('Saldos')).toBeInTheDocument();
    expect(screen.getByText('Totais')).toBeInTheDocument();
    expect(screen.getByText('Tags')).toBeInTheDocument();
    expect(screen.getByText('Menu')).toBeInTheDocument();
  });
});
