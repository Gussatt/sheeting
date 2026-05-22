import { renderHook, act } from '@testing-library/react';
import { describe, it, expect, vi, beforeEach, afterEach } from 'vitest';
import { useLongPress } from './useLongPress';

describe('useLongPress', () => {
  beforeEach(() => {
    vi.useFakeTimers();
  });

  afterEach(() => {
    vi.useRealTimers();
  });

  it('calls onClick if released before 500ms', () => {
    const onClick = vi.fn();
    const onLongPress = vi.fn();
    const { result } = renderHook(() => useLongPress(onClick, onLongPress));

    act(() => {
      result.current.onMouseDown();
    });

    act(() => {
      vi.advanceTimersByTime(200);
      result.current.onMouseUp();
    });

    expect(onClick).toHaveBeenCalledTimes(1);
    expect(onLongPress).not.toHaveBeenCalled();
  });

  it('calls onLongPress if held for 500ms', () => {
    const onClick = vi.fn();
    const onLongPress = vi.fn();
    const { result } = renderHook(() => useLongPress(onClick, onLongPress));

    act(() => {
      result.current.onMouseDown();
    });

    act(() => {
      vi.advanceTimersByTime(501);
    });

    expect(onLongPress).toHaveBeenCalledTimes(1);
    expect(onClick).not.toHaveBeenCalled();
    
    // Check that releasing after long press doesn't trigger onClick
    act(() => {
      result.current.onMouseUp();
    });
    expect(onClick).not.toHaveBeenCalled();
  });
  
  it('clears timer on mouse leave', () => {
    const onClick = vi.fn();
    const onLongPress = vi.fn();
    const { result } = renderHook(() => useLongPress(onClick, onLongPress));

    act(() => {
      result.current.onMouseDown();
    });

    act(() => {
      vi.advanceTimersByTime(200);
      result.current.onMouseLeave();
    });

    act(() => {
      vi.advanceTimersByTime(400);
    });

    expect(onLongPress).not.toHaveBeenCalled();
    expect(onClick).not.toHaveBeenCalled();
  });

  it('clears timer on touch move', () => {
    const onClick = vi.fn();
    const onLongPress = vi.fn();
    const { result } = renderHook(() => useLongPress(onClick, onLongPress));

    act(() => {
      result.current.onTouchStart();
    });

    act(() => {
      vi.advanceTimersByTime(200);
      result.current.onTouchMove();
    });

    act(() => {
      vi.advanceTimersByTime(400);
    });

    expect(onLongPress).not.toHaveBeenCalled();
    expect(onClick).not.toHaveBeenCalled();
  });

  it('works with touch events', () => {
    const onClick = vi.fn();
    const onLongPress = vi.fn();
    const { result } = renderHook(() => useLongPress(onClick, onLongPress));

    act(() => {
      result.current.onTouchStart();
    });

    act(() => {
      vi.advanceTimersByTime(501);
    });

    expect(onLongPress).toHaveBeenCalledTimes(1);

    act(() => {
      result.current.onTouchEnd();
    });
    expect(onClick).not.toHaveBeenCalled();
  });
});
