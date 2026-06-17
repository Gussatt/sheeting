# UI Polish and Fidelity Restoration Design

**Date:** 2026-06-17
**Goal:** Fix app height issues on mobile devices, restore original SVG icons from the PWA, and fix UI alignments (specifically Ledger balances and Performance screen fidelity).

## 1. App Height (Safe Area Integration)
- **Problem:** Content overlaps the top status bar / notch on mobile devices due to the lack of safe area handling in the new Expo router setup.
- **Solution:** 
  - Wrap the root layout (`app/_layout.tsx`) in a `<SafeAreaProvider>` from `react-native-safe-area-context`.
  - Avoid `<SafeAreaView>` to prevent bottom-tab double-padding.
  - Utilize the `useSafeAreaInsets` hook to manually apply `paddingTop: insets.top` to the top-most wrapper or header view in screens like `index.tsx`, `performance.tsx`, and `tags.tsx`.

## 2. Restoring Original SVGs
- **Problem:** Current icons in `src/assets/icons` are inconsistent with the original PWA (different line weights, shapes, or missing intrinsic sizing).
- **Solution:**
  - Audit `src/assets/icons/`.
  - Replace non-compliant SVGs with the exact original SVGs found in `assets/extracted_svgs/` or `assets/imported_assets/` (which serve as the source-of-truth).
  - Ensure any SVG color overrides use the newly integrated `react-native-svg-transformer` architecture seamlessly.

## 3. Balance Alignment (Ledger)
- **Problem:** Balances in the transaction list are not aligning properly vertically.
- **Solution:**
  - Update `src/components/Ledger/LedgerRow.tsx` and the column headers in `app/(tabs)/index.tsx`.
  - Enforce strict Flexbox rules: use `alignItems: 'flex-end'` and `textAlign: 'right'` for the balance column.
  - Adjust column flex proportions (e.g., `flex: 1` for the description/center column, and fixed minimum widths for the date and balance columns) to prevent shifting based on content length.

## 4. Performance / Totals Fidelity
- **Problem:** The Performance tab lost visual fidelity compared to the original high-fidelity web app.
- **Solution:**
  - Polish the `MetricItem` component in `app/(tabs)/performance.tsx`.
  - Refine the Progress Bar (`progressTrack` and `progressFill`) to match the exact height and border-radius of the PWA.
  - Correct typography (font sizes, font weights) for metric labels and secondary values.
  - Adjust vertical and horizontal padding to restore the correct density.
  - Standardize the inline math symbols (+, -, =) to match the original muted styles and layout.
