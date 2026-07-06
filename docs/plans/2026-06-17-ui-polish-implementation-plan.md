# Sheeting - UI Polish Implementation Plan

**Date:** 2026-06-17
**Status:** In Progress
**Context:** This plan combines the architectural foundation laid in the recent session with the proposed UI polish and fidelity restoration designs.

---

## Part 1: Previous Session Handoff (Completed Base)

During the previous session, we addressed critical UI and architectural issues related to SVG rendering and application polish:

### 1. Architectural Shift for SVGs

- **Issue Resolved:** SVGs were previously rendered using `expo-image`, causing native image loaders to drop `<text>` tags (making icons like 'Diário' and 'Cartão' appear blank), fail on SVGs missing explicit dimensions, and improperly resolve `currentColor` strokes.
- **Solution Implemented:** Integrated `react-native-svg-transformer` to render SVGs natively as React components instead of static images.
  - Installed `react-native-svg-transformer`.
  - Created `metro.config.js` to configure the bundler.
  - Added `src/declarations.d.ts` for TypeScript support.
  - Refactored `src/components/AppIcon.tsx` to map and render imported SVG components dynamically, safely passing `width`, `height`, and `color` props.

### 2. UI Polish & Fixes

- **Tab Bar (Bottom Nav):**
  - Updated the tabs layout (`app/(tabs)/_layout.tsx`) to correctly pass the active/inactive `color` prop to the `AppIcon` components.
  - Replaced the incorrect 'Menu' tab icon (`config`) with the proper `navegacao` icon.
- **Filter Modal (`Filtrar por`):**
  - Refactored `src/components/Ledger/FilterSheet.tsx`.
  - Localized filter options from English IDs to Portuguese labels (e.g., 'all' -> 'Todas', 'income' -> 'Entradas').
  - Mapped each filter option to its respective SVG icon (`filtro`, `entradas`, `saidas`, `diario`, `economia`, `cartao`) for a richer user experience.

---

## Part 2: Next Steps (Design for Implementation)

**Goal:** Build upon the new SVG architecture to fix app height issues on mobile devices, restore the remaining original SVG icons from the PWA, and fix UI alignments (specifically Ledger balances and Performance screen fidelity).

### Step 1: App Height (Safe Area Integration)

- **Problem:** Content overlaps the top status bar / notch on mobile devices due to the lack of safe area handling in the new Expo router setup.
- **Action Items:**
  1. Wrap the root layout (`app/_layout.tsx`) in a `<SafeAreaProvider>` from `react-native-safe-area-context`.
  2. Avoid `<SafeAreaView>` to prevent bottom-tab double-padding.
  3. Utilize the `useSafeAreaInsets` hook to manually apply `paddingTop: insets.top` to the top-most wrapper or header view in screens like `index.tsx`, `performance.tsx`, and `tags.tsx`.

### Step 2: Restoring Original SVGs

- **Problem:** Current icons in `src/assets/icons` are inconsistent with the original PWA (different line weights, shapes, or missing intrinsic sizing).
- **Action Items:**
  1. Audit `src/assets/icons/`.
  2. Replace non-compliant SVGs with the exact original SVGs found in `assets/extracted_svgs/` or `assets/imported_assets/` (which serve as the source-of-truth).
  3. Ensure any SVG color overrides use the newly integrated `react-native-svg-transformer` architecture seamlessly.

### Step 3: Balance Alignment (Ledger)

- **Problem:** Balances in the transaction list are not aligning properly vertically.
- **Action Items:**
  1. Update `src/components/Ledger/LedgerRow.tsx` and the column headers in `app/(tabs)/index.tsx`.
  2. Enforce strict Flexbox rules: use `alignItems: 'flex-end'` and `textAlign: 'right'` for the balance column.
  3. Adjust column flex proportions (e.g., `flex: 1` for the description/center column, and fixed minimum widths for the date and balance columns) to prevent shifting based on content length.

### Step 4: Performance / Totals Fidelity

- **Problem:** The Performance tab lost visual fidelity compared to the original high-fidelity web app.
- **Action Items:**
  1. Polish the `MetricItem` component in `app/(tabs)/performance.tsx`.
  2. Refine the Progress Bar (`progressTrack` and `progressFill`) to match the exact height and border-radius of the PWA.
  3. Correct typography (font sizes, font weights) for metric labels and secondary values.
  4. Adjust vertical and horizontal padding to restore the correct density.
  5. Standardize the inline math symbols (+, -, =) to match the original muted styles and layout.
