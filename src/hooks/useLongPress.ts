import { useCallback, useRef, useState } from 'react';

export const useLongPress = (
  onClick: () => void,
  onLongPress: () => void,
  ms: number = 500
) => {
  const timerRef = useRef<ReturnType<typeof setTimeout> | null>(null);
  const [isLongPressTriggered, setIsLongPressTriggered] = useState(false);

  const start = useCallback(() => {
    setIsLongPressTriggered(false);
    timerRef.current = setTimeout(() => {
      onLongPress();
      setIsLongPressTriggered(true);
    }, ms);
  }, [onLongPress, ms]);

  const stop = useCallback(() => {
    if (timerRef.current) {
      clearTimeout(timerRef.current);
      if (!isLongPressTriggered) {
        onClick();
      }
    }
  }, [onClick, isLongPressTriggered]);

  const cancel = useCallback(() => {
    if (timerRef.current) {
      clearTimeout(timerRef.current);
    }
  }, []);

  return {
    onMouseDown: start,
    onMouseUp: stop,
    onMouseLeave: cancel,
    onTouchStart: start,
    onTouchEnd: stop,
    onTouchMove: cancel,
  };
};
