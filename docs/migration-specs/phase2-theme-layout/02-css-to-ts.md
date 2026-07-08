# Phase 2, Spec 2: Port Global CSS to TypeScript Theme Object

**Goal:** Replace `index.css` variables with a strongly-typed TypeScript object accessible via hooks.

**Files to Touch:**

- Create: `src/styles/theme.ts`
- Delete: `src/index.css`, `src/App.css`

**Step 1: Create the Theme Object**

- Map CSS variables (e.g. `--color-bg`, `--status-green`) into a `colors` object in `theme.ts`.
- Ensure both light and dark variations exist.

**Step 2: Create a `useAppTheme` hook**

- Combine `ThemeContext` with the `theme.ts` objects to return the active palette.

**Step 3: Clean up Web CSS**

- Delete `src/index.css` and `src/App.css`.
- Remove their imports from `main.tsx` or `App.tsx`.

**Step 4: Commit**

- `git add src/styles/`
- `git rm src/index.css src/App.css`
- `git commit -m "feat: translate css variables into typed TS theme object"`
