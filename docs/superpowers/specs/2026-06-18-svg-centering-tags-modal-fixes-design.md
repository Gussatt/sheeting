# SVG Centering + Tags Modal Fixes Design

**Date:** 2026-06-18
**Status:** Design approved, ready for implementation

## Problem 1: SVG Icons Not Centered

Four icons (`cartao`, `diario`, `diario_totais`, `economia`) use `<text>` elements with `dominant-baseline="central"` and `text-anchor="middle"`. react-native-svg renders `<text>` unreliably — `dominant-baseline` is often ignored, causing letters (e.g. the "D" in diario) to appear shifted upward rather than vertically centered.

## Fix 1: Convert Text to Path

Replace each `<text>` element with a `<path>` element containing the actual glyph outline from Arial Black at font-size 42, translated to visually center within the SVG viewBox.

**Path generation method:**
- Used `opentype.js` to load `/System/Library/Fonts/Supplemental/Arial Black.ttf`
- Extracted glyph paths for C, D, E at font-size 42
- Computed each glyph's bounding box center
- Translated path coordinates so glyph center aligns with the icon's visual center (35,35 for 70x70 icons; 56,50 for diario_totais at 112x100)

**Files modified:**
- `src/assets/icons/cartao.svg` — `<text>C</text>` → `<path>` (fill #FFFFFF on #9B59B6 circle)
- `src/assets/icons/diario.svg` — `<text>D</text>` → `<path>` (fill #FFFFFF on #FF5CAC circle)
- `src/assets/icons/diario_totais.svg` — `<text>D</text>` → `<path>` (fill #D13473, no circle)
- `src/assets/icons/economia.svg` — `<text>E</text>` → `<path>` (fill #FFFFFF on #F1C40F circle)

The `<circle>` elements and viewBox attributes remain unchanged. Only the `<text>` element is replaced by `<path>`.

## Problem 2: Missing Tags Addition Modal

`app/(tabs)/tags.tsx` has `isModalOpen` state and calls `setIsModalOpen(true)` on the `+` button (line 94) and on tag row press (line 122), but never renders the `TagEditorModal` component. The modal is not imported. Clicking `+` or a tag does nothing visible.

## Fix 2: Wire TagEditorModal into tags.tsx

Import `TagEditorModal` from `../../src/components/Forms/TagEditorModal` and render it at the bottom of the `TagsScreen` JSX.

**Props:**
- `isOpen={isModalOpen}`
- `onClose={() => setIsModalOpen(false)}`
- `onSave={() => {}}` — no-op; `useSQL` auto-refreshes via `dbEvents`
- `tag={selectedTag}` — undefined for create, tag object for edit

**No new state needed** — `isModalOpen` and `selectedTag` already exist and are correctly set.

**File modified:** `app/(tabs)/tags.tsx` — add import + render `<TagEditorModal />` before closing `</View>`

## Verification

- `npx tsc --noEmit` passes
- `npm test` passes (existing 9 autoTag tests unaffected)
- Manual: on device/simulator, verify D/C/E letters are centered in their circles; verify `+` button on Tags screen opens the create-tag modal
