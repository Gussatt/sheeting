# React Native (Expo) Migration Implementation Plan

> **For Gemini:** REQUIRED SUB-SKILL: Use superpowers:executing-plans to implement this plan task-by-task.

**Goal:** Migrate the Sheeting web application (React 19 + Vite) to a native mobile application using React Native and Expo, maintaining the local-first architecture and high-fidelity design.

**Architecture:** We will adopt Expo Router for file-based routing. The data layer will transition from Web PGLite to Expo SQLite, maintaining the SQL query patterns. Web primitives (`div`, `span`, `img`, CSS) will be replaced with React Native primitives (`View`, `Text`, `Image`, `StyleSheet`).

**Tech Stack:** React Native, Expo, Expo Router, Expo SQLite, date-fns, lucide-react-native.

---

### Task 1: Initialize Expo Project & Clean Web Setup

**Files:**

- Create/Modify: `package.json`
- Create: `app.json`
- Create: `app/_layout.tsx`
- Delete: `vite.config.ts`, `index.html`, `src/main.tsx`

**Step 1: Install Expo CLI and Core Dependencies**
Run: `npx create-expo-app@latest . -t blank-typescript --yes`
(Note: If prompted about overwriting, force overwrite `package.json` but keep `src/` intact).
Install additional deps: `npx expo install expo-sqlite expo-router react-native-safe-area-context react-native-screens lucide-react-native`

**Step 2: Configure `app.json` and Entry Point**
Ensure `package.json` main is `"main": "expo-router/entry"`.
Create `app.json` if missing, setting name to "Sheeting".

**Step 3: Create Root Layout**

```tsx
// app/_layout.tsx
import { Stack } from 'expo-router';
import { ThemeProvider } from '../src/context/ThemeContext'; // Assuming we adjust this later

export default function RootLayout() {
  return (
    <ThemeProvider>
      <Stack screenOptions={{ headerShown: false }} />
    </ThemeProvider>
  );
}
```

**Step 4: Verify App Starts**
Run: `npx expo start --clear`
Expected: Metro bundler starts without errors.

**Step 5: Commit**

```bash
git add package.json app.json app/
git rm vite.config.ts index.html src/main.tsx
git commit -m "chore: initialize expo project and configure router"
```

---

### Task 2: Migrate Database Layer to Expo SQLite

**Files:**

- Modify: `src/db/db.ts`
- Keep: `src/db/expo-sqlite-db.ts`
- Delete: `src/db/pglite-db.ts`

**Step 1: Update the DB Abstraction**
Change the export in `db.ts` to point to the Expo SQLite implementation.

```typescript
// src/db/db.ts
export * from './expo-sqlite-db';
```

**Step 2: Fix `expo-sqlite-db.ts` Imports and Types**
Ensure `import * as SQLite from 'expo-sqlite';` is correct for the current Expo version (SDK 51+ uses `openDatabaseSync` / `openDatabaseAsync`).
Modify the `init` method if needed to ensure the schema is executed synchronously or awaited properly on app startup.

**Step 3: Test DB Initialization (Manual or via a simple App.tsx mock)**
_Since web Vitest won't run Expo Native modules easily without heavy mocking, we rely on manual app start verification for this specific task._

**Step 4: Remove PGLite**
Run: `npm uninstall @electric-sql/pglite`
Run: `git rm src/db/pglite-db.ts`

**Step 5: Commit**

```bash
git add src/db/ package.json
git commit -m "refactor: swap pglite for expo-sqlite as primary database"
```

---

### Task 3: Migrate ThemeContext to React Native

**Files:**

- Modify: `src/context/ThemeContext.tsx`

**Step 1: Replace DOM operations with React Native `Appearance`**
Remove `document.body.classList` logic.

```tsx
// src/context/ThemeContext.tsx
import React, { createContext, useContext, useState, useEffect } from 'react';
import { Appearance, ColorSchemeName } from 'react-native';

type Theme = 'light' | 'dark';

interface ThemeContextType {
  theme: Theme;
  toggleTheme: () => void;
}

const ThemeContext = createContext<ThemeContextType | undefined>(undefined);

export const ThemeProvider: React.FC<{ children: React.ReactNode; initialTheme?: Theme }> = ({
  children,
  initialTheme,
}) => {
  const systemTheme = Appearance.getColorScheme();
  const [theme, setTheme] = useState<Theme>(initialTheme || systemTheme || 'dark');

  const toggleTheme = () => {
    setTheme((prev) => (prev === 'dark' ? 'light' : 'dark'));
  };

  return <ThemeContext.Provider value={{ theme, toggleTheme }}>{children}</ThemeContext.Provider>;
};

export const useTheme = () => {
  const context = useContext(ThemeContext);
  if (context === undefined) throw new Error('useTheme must be used within a ThemeProvider');
  return context;
};
```

**Step 2: Commit**

```bash
git add src/context/ThemeContext.tsx
git commit -m "refactor: adapt ThemeContext for react native Appearance API"
```

---

### Task 4: Port Global CSS Variables to a TypeScript Theme Object

**Files:**

- Create: `src/styles/theme.ts`
- Delete: `src/index.css`, `src/App.css`

**Step 1: Create the Theme Object**

```typescript
// src/styles/theme.ts
export const colors = {
  light: {
    bg: '#ffffff',
    surface: '#f5f5f5',
    textPrimary: '#1a1a1a',
    textSecondary: '#666666',
    border: '#e0e0e0',
    primary: '#1a1a1a',
  },
  dark: {
    bg: '#1a1a1a',
    surface: '#2a2a2a',
    textPrimary: '#ffffff',
    textSecondary: '#a0a0a0',
    border: '#333333',
    primary: '#ffffff',
  },
  status: {
    green: '#27AE60',
    yellow: '#F1C40F',
    red: '#E74C3C',
    pink: '#E91E63',
    purple: '#9B59B6',
    lightGreen: '#2ECC71',
  },
};
```

**Step 2: Create a `useAppTheme` hook**
To make styling easier inside components:

```typescript
import { useTheme } from '../context/ThemeContext';
import { colors } from './theme';

export const useAppTheme = () => {
  const { theme } = useTheme();
  return {
    colors: { ...colors[theme], ...colors.status },
    isDark: theme === 'dark',
  };
};
```

**Step 3: Commit**

```bash
git add src/styles/
git rm src/index.css src/App.css
git commit -m "feat: translate css variables into typed TS theme object"
```

---

### Task 5: Port Layout and Bottom Navigation

**Files:**

- Create: `app/(tabs)/_layout.tsx`
- Create: `app/(tabs)/index.tsx` (Ledger placeholder)
- Create: `app/(tabs)/performance.tsx` (Totals placeholder)
- Create: `app/(tabs)/tags.tsx` (Tags placeholder)
- Create: `app/(tabs)/menu.tsx` (Menu placeholder)
- Delete: `src/components/Layout/Layout.tsx`

**Step 1: Setup Expo Router Tabs**
Implement `Tabs` from `expo-router` using custom icons in `app/(tabs)/_layout.tsx`.

```tsx
// app/(tabs)/_layout.tsx
import { Tabs } from 'expo-router';
import { useAppTheme } from '../../src/styles/theme';
import { View, Image, StyleSheet } from 'react-native';
// Note: Requires adapting SVG usage or converting to PNGs for standard Image component
// Or using react-native-svg

export default function TabLayout() {
  const { colors } = useAppTheme();

  return (
    <Tabs
      screenOptions={{
        headerShown: false,
        tabBarStyle: { backgroundColor: colors.bg, borderTopColor: colors.border },
        tabBarActiveTintColor: colors.textPrimary,
        tabBarInactiveTintColor: colors.textSecondary,
      }}
    >
      <Tabs.Screen name="index" options={{ title: 'Saldos' }} />
      <Tabs.Screen name="performance" options={{ title: 'Totais' }} />
      <Tabs.Screen name="tags" options={{ title: 'Tags' }} />
      <Tabs.Screen name="menu" options={{ title: 'Menu' }} />
    </Tabs>
  );
}
```

**Step 2: Verify Navigation**
Run `npx expo start`. Ensure the bottom tab bar appears and navigates between the blank placeholders.

**Step 3: Commit**

```bash
git add app/
git rm src/components/Layout/Layout.tsx src/components/Layout/Layout.test.tsx
git commit -m "feat: implement expo router bottom tabs"
```

_(Note: The subsequent tasks would involve porting each specific page (Ledger, Performance, Tags) by rewriting `div`/`span` to `<View>`/`<Text>` and converting inline styles to `StyleSheet.create`. Because this is a massive undertaking, we will execute it page-by-page in the execution phase.)_
