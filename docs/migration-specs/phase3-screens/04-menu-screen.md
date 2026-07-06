# Phase 3, Spec 4: Port Menu Screen

**Goal:** Convert the Menu (Config) view to Native.

**Files to Touch:**

- Modify: `app/(tabs)/menu.tsx`
- Reference: `src/pages/Menu.tsx`

**Step 1: Translate Primitives**

- Replace `div` with `View`, `span`/`h1` with `Text`.
- Replace `onClick` with `Pressable` + `onPress`.

**Step 2: Inline Styles to StyleSheet**

- Extract inline web styles into `StyleSheet.create`.
- Use `useAppTheme` hook to pull colors.

**Step 3: Test and Commit**

- Run app, verify menu items appear.
- `git add app/`
- `git commit -m "feat: migrate menu screen to react native"`
