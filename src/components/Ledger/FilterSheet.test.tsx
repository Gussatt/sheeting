import { render, screen, fireEvent } from '@testing-library/react';
import { describe, it, expect, vi } from 'vitest';
import { FilterSheet } from './FilterSheet';

describe('FilterSheet', () => {
  it('calls onSelect with the chosen filter', () => {
    const onSelect = vi.fn();
    render(<FilterSheet isOpen={true} onSelect={onSelect} onClose={() => {}} />);
    
    fireEvent.click(screen.getByText('Entradas'));
    expect(onSelect).toHaveBeenCalledWith('income');
  });

  it('calls onSelect with "all" when Todas is clicked', () => {
    const onSelect = vi.fn();
    render(<FilterSheet isOpen={true} onSelect={onSelect} onClose={() => {}} />);
    
    fireEvent.click(screen.getByText('Todas'));
    expect(onSelect).toHaveBeenCalledWith('all');
  });

  it('calls onClose when close button is clicked', () => {
    const onClose = vi.fn();
    render(<FilterSheet isOpen={true} onSelect={() => {}} onClose={onClose} />);
    
    // The close button has an X icon and aria-label "Fechar"
    fireEvent.click(screen.getByLabelText('Fechar'));
    expect(onClose).toHaveBeenCalled();
  });
});
