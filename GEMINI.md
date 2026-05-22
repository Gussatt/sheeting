# Project Overview: Sheeting

**Sheeting** is a local-first web application designed to provide financial predictability through daily budget tracking and multi-month projections. It is a high-fidelity clone of the "App do Breno" design.

## Tech Stack
- **Framework:** React 19 + Vite
- **Language:** TypeScript (Strict: `verbatimModuleSyntax`, `noUnusedLocals`)
- **Database:** Dexie.js (IndexedDB)
- **Styling:** Mobile-first Standard CSS + CSS Variables
- **PWA:** vite-plugin-pwa (standalone mode)
- **Icons:** Lucide React
- **Dates:** date-fns

## Building and Running
- **Start Dev Server:** `npm run dev`
- **Build:** `npm run build` (Generates production build + PWA assets)
- **Preview:** `npm run preview`
- **Lint:** `npm run lint`
- **Test:** `npm test` (Uses Vitest)

## Engineering Mandates

### 1. Local-First & PWA
- All financial data MUST stay on the user's device.
- Maintain PWA compatibility (offline access, standalone display).
- Use `db.ts` (Dexie) for all persistence.
- Use `useLiveQuery` from `dexie-react-hooks` for reactive UI.

### 2. High-Fidelity Styling
- **Theme:** Default to the high-fidelity Dark Mode palette.
- **Colors:** Use the standardized status color variables strictly:
  - `--status-green`: #27AE60
  - `--status-yellow`: #F1C40F
  - `--status-red`: #E74C3C
  - `--status-pink`: #E91E63
  - `--status-purple`: #9B59B6
  - `--status-light-green`: #2ECC71
- **Layout:** Follow the mobile-first bottom-nav pattern (70px height).
- **Navigation:** Central FAB (+) must be styled as a white circular button.

### 3. Logic & CRUD
- **Add/Edit:** Use the `TransactionForm` component for both operations.
- **Projections:** Use the `calculateProjection` utility for all forecasting.
- **Aggregation:** Ledger view must support grouped transaction types in the "Todas" view.

### 4. Development Standards
- **Types:** Use `import type` for all TypeScript interfaces.
- **Testing:** Maintain >90% coverage for logic and UI components.
- **References:** Always refer to `assets/` screenshots for design decisions.

## Features Reference
See [FEATURES.md](./FEATURES.md) for a detailed breakdown of implemented modules.

## Memory & Context
Internal implementation details and historical context are maintained in the private memory directory: `/home/gussatt/.gemini/tmp/sheeting/memory/`.
- `MEMORY.md`: Main index.
- `features.md`: Original asset analysis.
