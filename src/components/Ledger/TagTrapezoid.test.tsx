import { describe, it, expect } from 'vitest';
import { render } from '@testing-library/react';
import { TagTrapezoid } from './TagTrapezoid';

describe('TagTrapezoid', () => {
  it('renders an svg with the correct color fill', () => {
    const { container } = render(<TagTrapezoid color="#ff0000" />);
    const svg = container.querySelector('svg');
    expect(svg).toBeInTheDocument();
    expect(svg?.getAttribute('fill')).toBe('#ff0000');
  });

  it('calculates width based on the size prop', () => {
    const { container } = render(<TagTrapezoid color="#ff0000" size={20} />);
    const svg = container.querySelector('svg');
    // 20 * 1.16 = 23.2
    expect(svg?.getAttribute('width')).toBe('23.2');
    expect(svg?.getAttribute('height')).toBe('20');
  });
});
