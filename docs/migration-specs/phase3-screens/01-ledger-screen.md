# Phase 3, Spec 1: Port Ledger Screen

**Goal:** Convert the Ledger (Saldos) view from Web (`div`, CSS) to Native (`View`, `Text`, `StyleSheet`).

**Files to Touch:**
- Modify: `app/(tabs)/index.tsx` (or whatever the router points to)
- Reference: `src/pages/SheetView.tsx`

**Step 1: Translate Primitives**
- Replace `div` with `View`, `span`/`p`/`h1` with `Text`.
- Replace `onClick` with `Pressable` or `TouchableOpacity` + `onPress`.

**Step 2: Inline Styles to StyleSheet**
- Extract inline web styles and generic classes into `StyleSheet.create`.
- Use `useAppTheme` hook to pull colors instead of `var(--color-...)`.

**Step 3: Test and Commit**
- Run app, verify data loads (via `useSQL`) and displays natively.
- `git add app/`
- `git commit -m "feat: migrate ledger screen to react native"`