# Phase 3, Spec 3: Port Tags Screen

**Goal:** Convert the Tags management view to Native.

**Files to Touch:**

- Modify: `app/(tabs)/tags.tsx`
- Reference: `src/pages/Tags.tsx`

**Step 1: Translate Primitives**

- Replace `div` with `View`, `span` with `Text`.
- Replace `onClick` with `Pressable` or `TouchableOpacity` + `onPress`.

**Step 2: Inline Styles to StyleSheet**

- Extract inline web styles and generic classes into `StyleSheet.create`.
- Use `useAppTheme` hook to pull colors.

**Step 3: Test and Commit**

- Run app, verify tags can be clicked.
- `git add app/`
- `git commit -m "feat: migrate tags screen to react native"`
