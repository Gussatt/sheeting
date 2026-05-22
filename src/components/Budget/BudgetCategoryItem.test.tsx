import { render, screen, fireEvent } from '@testing-library/react';
import { describe, it, expect, vi } from 'vitest';
import { BudgetCategoryItem } from './BudgetCategoryItem';

describe('BudgetCategoryItem', () => {
  it('renders category details and handles delete on click', () => {
    const onDelete = vi.fn();
    render(<BudgetCategoryItem name="Comida" amount={200} onDelete={onDelete} />);
    
    expect(screen.getByText('Comida')).toBeInTheDocument();
    expect(screen.getByText('R$ 200,00')).toBeInTheDocument();
    
    // Simulate window.confirm
    vi.spyOn(window, 'confirm').mockReturnValue(true);
    
    fireEvent.click(screen.getByText('Comida'));
    expect(onDelete).toHaveBeenCalled();
  });
});
