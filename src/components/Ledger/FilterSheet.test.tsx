import React from 'react';
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
});
