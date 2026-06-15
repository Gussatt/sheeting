# Phase 2, Spec 1: Migrate ThemeContext to React Native

**Goal:** Replace DOM-based theme switching with React Native's `Appearance` API.

**Files to Touch:**
- Modify: `src/context/ThemeContext.tsx`

**Step 1: Replace DOM logic**
- Remove any `document.body.classList` or `window.matchMedia` calls.
- Use `Appearance.getColorScheme()` from `react-native`.

**Step 2: Refactor Provider**
- Export a clean context provider that provides `theme` ('light' | 'dark') and `toggleTheme`.
- Ensure it wraps correctly around React Node children.

**Step 3: Test and Commit**
- Verify the provider wraps the `expo-router` Stack without crashing.
- `git add src/context/ThemeContext.tsx`
- `git commit -m "refactor: adapt ThemeContext for react native Appearance API"`
