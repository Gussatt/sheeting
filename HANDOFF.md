# Session Handoff — June 18, 2026

## Project State
**Sheeting** is a high-fidelity financial tracking app (App do Breno clone) built with **Expo React Native + SQLite**. Originally a React+Vite+PWA web app, it was fully migrated to React Native and is now an Expo-managed project.

**⚠️ All documentation files are stale.** README.md, ARCHITECTURE.md, AGENTS.md, and GEMINI.md still describe the old React+Vite+Dexie web stack. The actual stack is:

| Aspect | Actual (current) | Docs say |
|--------|-----------------|----------|
| Framework | Expo Router + React Native 0.85 | React 19 + Vite |
| Database | expo-sqlite | Dexie / PGLite |
| Routing | File-based (expo-router) | — |
| Platform | iOS/Android/Web (RN) | Web PWA only |
| Icons | react-native-svg (inline SVGs) | Lucide React |

**Recommendation:** Update AGENTS.md and GEMINI.md to match the real stack before the next feature session.

---

## Recent Commits (15 ahead of origin/main, NOT pushed)

| Commit | Description |
|--------|-------------|
| `fd471aa` | Transactions page with slide animations + safe area on all pages |
| `b2178f5` | Fix `calculateDailyBudget` call in performance.tsx (wrong args) |
| `1bba6eb` | SVG letter icon centering via text-to-path + wire TagEditorModal into tags screen |
| `4ebbd66` | Design spec for SVG centering + tags modal fixes |
| `43484f7` | Final review fixes (setupTests wiring, dead field, write batching) |
| `39ce3ed` | Keyword chips UI and persistence in TagEditorModal |
| `6fe5555` | Auto-assign tag in useTransaction when tagId is empty |
| `1691c8b` | Pure `findMatchingTagId` helper + unit tests |
| `fec309e` | `tag_keywords` table + keywords field on Tag interface |
| `b0923a9` | Vitest test infrastructure + smoke test |
| `97bf869` | Auto-tagging implementation plan |
| `491cc8d` | Auto-tagging design spec |
| `6282059` | UI polish: safe area, original SVGs, ledger alignment, performance fidelity |
| `71dc13c` | SVG architecture + UI polish base (Part 1) |
| `9d66928` | Ignore `.worktrees/` and `.expo/`, remove orphaned submodule |

---

## Uncommitted Work in Progress

Working tree has **15 modified files + 4 untracked files**:

**Code changes in progress:**
- **`app/(tabs)/index.tsx`** — Replacing `StatusDots` with `HorizonteGridButton` on the ledger screen, computing `futureBalances` for the horizonte quick-preview
- **`app/(tabs)/performance.tsx`** — Same `HorizonteGridButton` replacement, computing `futureBalances` from net balance minus daily planned
- **`src/components/Ledger/HorizonteGridButton.tsx`** *(new)* — New component to replace StatusDots with a proper horizonte preview grid
- **`src/components/Ledger/HorizonteCell.tsx`** — Minor tweaks
- **`src/components/Ledger/LedgerRow.tsx`** — Minor tweaks
- **`src/components/Forms/TransactionTypeModal.tsx`** — Minor addition
- **`src/components/Ledger/FilterSheet.tsx`** — Minor tweak

**SVG fixes in progress:**
- `adicao.svg` / `adicao_night.svg` — viewBox optimized (was 320x160, now 112 32 96 96)
- `tags.svg` / `tags_night.svg` — Replaced with lucide icon path
- `totais.svg` / `totais_night.svg` — Adjusted paths
- New untracked: `horizonte_alt.svg` / `horizonte_alt_night.svg`

**Config/docs changes in progress:**
- `AGENTS.md` — Being rewritten to match current stack (partial update, not yet reflecting RN reality)
- `HANDOFF.md` — This file
- `metro.config.js` — SVG transformer config adjustment

**Pending (untracked):**
- `app/(tabs)/fab-placeholder.tsx` — New FAB placeholder for add transaction

---

## Architecture (Actual)

### Routing (Expo Router file-based)
```
app/
  _layout.tsx              — Root layout (SafeAreaProvider + tabs)
  (tabs)/
    _layout.tsx            — Bottom tab navigator (4 tabs)
    index.tsx              — Ledger / Saldos (home)
    performance.tsx        — Totais / Performance
    tags.tsx               — Tags management
    menu.tsx               — Settings / Menu
  add.tsx                   — Add transaction
  add-budget-category.tsx   — Budget category form
  daily-calculation.tsx     — Daily calculation
  diario-medio.tsx          — Average daily calculator
  horizonte.tsx             — Multi-month projection grid
  transactions.tsx          — Transactions list filtered by type+date
```

### Data Layer
- **Database:** expo-sqlite (SQLite via `expo-sqlite`)
- **Access:** Custom `useSQL` hook wrapping expo-sqlite with reactive subscriptions
- **Schema:** Defined in `src/db/expo-sqlite-db.ts`
- **Key tables:** `transactions`, `categories`, `tags`, `tag_keywords`, `daily_status`

### Key Source Directories
```
src/
  assets/icons/         — Inline SVG icon components
  components/
    Forms/              — Transaction form, modals, tag editor
    Ledger/             — LedgerRow, FilterSheet, TypeIcon, HorizonteGridButton
  context/              — ThemeContext
  db/                   — Database connection + schema
  hooks/                — useTransaction, useFilteredTransactions
  styles/               — Theme tokens, CSS
  utils/                — Projection engine, helpers
```

---

## Key Features Delivered
- ✅ Full Expo React Native migration (from web PWA)
- ✅ Multi-month projection grid (Horizonte) with heat-map
- ✅ Daily calculation with budget categories
- ✅ Transaction management (CRUD + filtering by type/date)
- ✅ Auto-tagging by description keywords (via `tag_keywords` table)
- ✅ Keyword chips UI in TagEditorModal
- ✅ SVG icon system with dark/light variants
- ✅ Safe area + status bar integration on all screens
- ✅ Vitest test infrastructure + unit tests for pure logic
- ✅ Slide animations on transactions page

---

## Known Issues

1. **`wa-sqlite.wasm` web bundling issue** — Long-standing, unrelated to this work
2. **AGENTS.md mismatches actual stack** — Still says React+Vite+Dexie, should say Expo+RN+SQLite
3. **README.md and ARCHITECTURE.md are stale** — Still describe web PWA architecture
4. **Tests only cover pure utility functions** — No component tests (needs React Native Testing Library setup)
5. **15 commits unpushed** — `main` is ahead of `origin/main` by 15 commits

---

## Ready for Next Session

The most impactful next steps would be:
1. **Commit the pending work** (HorizonteGridButton replacement, SVG fixes, AGENTS.md update)
2. **Push 15 unpushed commits + new commits** to `origin/main`
3. **Update stale docs** (AGENTS.md, GEMINI.md, README.md, ARCHITECTURE.md) to match actual Expo+RN stack
4. **Visual verification on a device** — none of the recent UI work has been visually confirmed
