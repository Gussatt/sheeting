# Phase 3, Spec 2: Port Performance Screen

**Goal:** Convert the Totais (Performance) view to Native.

**Files to Touch:**

- Modify: `app/(tabs)/performance.tsx`
- Reference: `src/pages/Performance.tsx`

**Step 1: Translate Primitives**

- Replace `div` with `View`, `span` with `Text`.
- Replace `onClick` with `Pressable` or `TouchableOpacity` + `onPress`.

**Step 2: Inline Styles to StyleSheet**

- Extract inline web styles and generic classes into `StyleSheet.create`.
- Use `useAppTheme` hook to pull colors.

**Step 3: Test and Commit**

- Run app, verify charts/metrics render.
- `git add app/`
- `git commit -m "feat: migrate performance screen to react native"`
