# App Internationalization Implementation Plan

> **For Gemini:** REQUIRED SUB-SKILL: Use superpowers:executing-plans to implement this plan task-by-task.

**Goal:** Implement a lightweight, dependency-free Context-based translation system to toggle between Portuguese and English, and translate the app's components.

**Architecture:** We will create a `translations.ts` dictionary and a `LanguageContext.tsx` that exposes a `useLanguage` hook. This hook will provide the current language, a setter, and a `t` function for key resolution.

**Tech Stack:** React Context, React Native AsyncStorage.

---

### Task 1: Create Translation Dictionary

**Files:**
- Create: `src/context/translations.ts`

**Step 1: Write minimal dictionary**

```typescript
export type Language = 'pt' | 'en';

export const translations = {
  pt: {
    'menu.title': 'Menu',
    'menu.language': 'Idioma',
    'menu.language.pt': 'Português',
    'menu.language.en': 'Inglês',
    'menu.logout': 'Sair',
    // We will expand this as we translate components
  },
  en: {
    'menu.title': 'Menu',
    'menu.language': 'Language',
    'menu.language.pt': 'Portuguese',
    'menu.language.en': 'English',
    'menu.logout': 'Logout',
  }
};
```

**Step 2: Commit**

```bash
git add src/context/translations.ts
git commit -m "feat: add initial translations dictionary"
```

### Task 2: Create LanguageContext

**Files:**
- Create: `src/context/LanguageContext.tsx`
- Modify: `app/_layout.tsx`

**Step 1: Write LanguageContext**

```tsx
import React, { createContext, useContext, useState, useEffect } from 'react';
import AsyncStorage from '@react-native-async-storage/async-storage';
import { translations, type Language } from './translations';

type LanguageContextType = {
  language: Language;
  setLanguage: (lang: Language) => void;
  t: (key: string) => string;
};

const LanguageContext = createContext<LanguageContextType | undefined>(undefined);

export function LanguageProvider({ children }: { children: React.ReactNode }) {
  const [language, setLanguageState] = useState<Language>('pt');

  useEffect(() => {
    AsyncStorage.getItem('@app_language').then((saved) => {
      if (saved === 'pt' || saved === 'en') {
        setLanguageState(saved);
      }
    });
  }, []);

  const setLanguage = (lang: Language) => {
    setLanguageState(lang);
    AsyncStorage.setItem('@app_language', lang);
  };

  const t = (key: string) => {
    // Basic flat key resolution. We can cast as keyof typeof translations.pt later if needed.
    return (translations[language] as Record<string, string>)[key] || key;
  };

  return (
    <LanguageContext.Provider value={{ language, setLanguage, t }}>
      {children}
    </LanguageContext.Provider>
  );
}

export function useLanguage() {
  const context = useContext(LanguageContext);
  if (context === undefined) {
    throw new Error('useLanguage must be used within a LanguageProvider');
  }
  return context;
}
```

**Step 2: Wrap App with LanguageProvider in `app/_layout.tsx`**

```tsx
// Inside app/_layout.tsx
// Add import: import { LanguageProvider } from '../src/context/LanguageContext';
// Wrap <ThemeProvider> inside <LanguageProvider>
```

**Step 3: Run app build (typescript check)**

Run: `npx tsc --noEmit`
Expected: PASS

**Step 4: Commit**

```bash
git add src/context/LanguageContext.tsx app/_layout.tsx
git commit -m "feat: create LanguageContext and wrap app"
```

### Task 3: Update Menu to Include Language Toggle

**Files:**
- Modify: `app/(tabs)/menu.tsx`

**Step 1: Add language toggle UI**

```tsx
// Add useLanguage hook inside Menu component
const { language, setLanguage, t } = useLanguage();

// Add a language toggle row to the settings list
{
  icon: <Globe size={24} color={colors.textSecondary} />,
  label: t('menu.language'),
  onPress: () => {
    setLanguage(language === 'pt' ? 'en' : 'pt');
  },
  value: language === 'pt' ? t('menu.language.pt') : t('menu.language.en')
}
```

**Step 2: Run typescript check**

Run: `npx tsc --noEmit`
Expected: PASS

**Step 3: Commit**

```bash
git add app/(tabs)/menu.tsx
git commit -m "feat: add language toggle to menu"
```

### Task 4: Translate Main Components

**Files:**
- Modify: `app/(tabs)/index.tsx`
- Modify: `app/(tabs)/tags.tsx`
- Modify: `app/transactions.tsx`
- Modify: `app/add.tsx`
- Modify: `src/context/translations.ts` (to add keys)

**Step 1: Add keys to translations.ts**

Add keys for Ledger, Transactions, Tags, and Add Transaction screens.

**Step 2: Apply translations to components**

Import and use `useLanguage()` and `t()` in each file.

**Step 3: Run typescript check**

Run: `npx tsc --noEmit`
Expected: PASS

**Step 4: Commit**

```bash
git add app/ src/context/translations.ts
git commit -m "feat: translate main components"
```
