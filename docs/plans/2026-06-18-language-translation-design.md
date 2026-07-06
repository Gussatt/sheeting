# App Internationalization and Menu Translation

## Overview

Implement a lightweight localization system to support switching between Portuguese (PT) and English (EN) via the app's Menu. Translate all user-facing components to use this new system.

## Architecture & Storage

- **Approach:** A custom, lightweight `LanguageContext` that avoids large external dependencies like `i18next`.
- **Translations Structure:** Create a `src/context/translations.ts` file containing a dictionary object with `pt` and `en` keys mapping to string values.
- **Context API:** Create `src/context/LanguageContext.tsx` which exports `LanguageProvider` and a `useLanguage` hook. The hook will return `{ language, setLanguage, t }` where `t(key)` resolves the localized string.
- **Persistence:** Store the selected language using `AsyncStorage` (e.g., key `'@app_language'`) so the preference is remembered across app launches. Default to 'pt'.

## Menu UI

- **Location:** Update `app/(tabs)/menu.tsx` to include a "Language / Idioma" setting.
- **Interaction:** Render a toggle or a segmented control/dropdown in the Menu list to switch between `PT` and `EN`.
- **Reactivity:** When `setLanguage` is called, the state in `LanguageContext` updates, immediately triggering a re-render of all text using the `t()` function.

## Component Translations

- **Process:** Iteratively update the main screens (Ledger, Transactions, Add Transaction, Horizonte, etc.) and components.
- **Implementation:** Replace hardcoded Portuguese strings (e.g., "Saldos", "Entradas", "Despesas") with `t('ledger.balances')`, `t('tx.income')`, etc.
- **Format:** Use nested keys or flat keys depending on what keeps `translations.ts` organized. Flat keys with prefixes (e.g. `menu.settings`, `txForm.save`) are recommended for simplicity in this lightweight approach.
