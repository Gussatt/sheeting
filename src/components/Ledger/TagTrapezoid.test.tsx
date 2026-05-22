import { render } from '@testing-library/react';
import { describe, it, expect } from 'vitest';
import { TagTrapezoid } from './TagTrapezoid';

describe('TagTrapezoid', () => {
  it('renders with correct color', () => {
    const { container } = render(<TagTrapezoid color="#ff0000" />);
    const div = container.firstChild as HTMLElement;
    // JSDOM might return #ff0000 or rgb(255, 0, 0)
    const color = div.style.backgroundColor;
    expect(color === 'rgb(255, 0, 0)' || color === '#ff0000' || color === 'red').toBe(true);
  });

  it('applies clip-path style', () => {
    const { container } = render(<TagTrapezoid color="#ff0000" />);
    const div = container.firstChild as HTMLElement;
    expect(div.style.clipPath).toContain('polygon');
  });
});
