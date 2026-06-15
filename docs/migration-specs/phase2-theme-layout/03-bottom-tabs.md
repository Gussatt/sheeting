# Phase 2, Spec 3: Port Bottom Navigation (Expo Router)

**Goal:** Replace the web Layout wrapper with Expo Router Tabs.

**Files to Touch:**
- Create: `app/(tabs)/_layout.tsx`
- Create placeholder screens: `app/(tabs)/index.tsx`, `performance.tsx`, `tags.tsx`, `menu.tsx`
- Delete: `src/components/Layout/Layout.tsx`

**Step 1: Setup Expo Router Tabs**
- Use `Tabs` from `expo-router`.
- Apply `useAppTheme` for tab bar coloring.

**Step 2: Create Screen Placeholders**
- Create basic `<View><Text>Screen Name</Text></View>` components for each tab to satisfy the router.

**Step 3: Delete Web Layout**
- Delete `Layout.tsx` and `Layout.test.tsx`.

**Step 4: Verify Navigation**
- Run `npx expo start`.
- Ensure tabs work and colors adapt to the system theme.

**Step 5: Commit**
- `git add app/`
- `git rm src/components/Layout/Layout.tsx src/components/Layout/Layout.test.tsx`
- `git commit -m "feat: implement expo router bottom tabs"`
