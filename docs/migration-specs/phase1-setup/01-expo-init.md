# Phase 1, Spec 1: Initialize Expo Project & Clean Web Setup

**Goal:** Transform the Vite/React project into an Expo React Native project.

**Files to Touch:**
- Modify/Create: `package.json`
- Create: `app.json`
- Create: `app/_layout.tsx`
- Delete: `vite.config.ts`, `index.html`, `src/main.tsx`

**Step 1: Install Expo CLI and Core Dependencies**
- Run `npx create-expo-app@latest . -t blank-typescript --yes`
- Ignore overwriting warnings if they occur.
- Run `npx expo install expo-sqlite expo-router react-native-safe-area-context react-native-screens lucide-react-native`

**Step 2: Configure `app.json` and Entry Point**
- Edit `package.json` to set `"main": "expo-router/entry"`.
- Create `app.json` (set name to "Sheeting").

**Step 3: Create Root Layout**
- Create `app/_layout.tsx` with a basic `expo-router` Stack configuration.
- Wire up a stub `ThemeProvider` or import existing one if it won't crash.

**Step 4: Verify App Starts**
- Run `npx expo start --clear`
- Ensure Metro bundler starts without errors.

**Step 5: Commit**
- `git add package.json app.json app/`
- `git rm vite.config.ts index.html src/main.tsx`
- `git commit -m "chore: initialize expo project and configure router"`
