## Goal
Implement Phase 1 (Project Setup & Foundation) of the Sheeting App. This includes installing required dependencies (Vitest, React Testing Library, Dexie.js), setting up the local-first database adapter using TDD, and establishing the global CSS design system (tokens, basic layout structure).

## Assumptions
* The Vite React TypeScript environment is already initialized.
* Dexie.js will be used as the IndexedDB wrapper for local-first storage.
* The team prefers pure CSS variables over Tailwind (as per GEMINI.md defaults) for full customizability.
* TDD is strictly enforced (Red-Green-Refactor).

## Plan
1. Setup Testing Infrastructure
   - Files: `package.json`, `vite.config.ts`, `src/setupTests.ts`
   - Change: Install `vitest`, `@testing-library/react`, `@testing-library/jest-dom`, `jsdom`. Configure Vite to use Vitest and include `setupTests.ts`.
   - Verify: Run `npm run test` and see 0 passing/failing (successfully runs without crashing).

2. Implement Dexie Database Adapter (TDD)
   - Files: `src/db/db.test.ts`, `src/db/db.ts`
   - Change: Write a unit test `db.test.ts` verifying that we can add and retrieve a `Transaction` from the DB using Dexie memory storage or mock. Implement the `db.ts` file extending `Dexie`.
   - Verify: Run `npm run test` to see the `db.test.ts` pass (Red -> Green).

3. Create Global CSS Variables and Design System Tokens
   - Files: `src/index.css`
   - Change: Define CSS variables for dark/light themes (colors, spacing, typography). Add basic CSS resets and base body styling.
   - Verify: Start dev server `npm run dev` and visually inspect the base HTML for applied background/foreground colors.

4. Scaffold Core Layout Component
   - Files: `src/components/Layout/Layout.tsx`, `src/components/Layout/Layout.test.tsx`, `src/App.tsx`
   - Change: Write a test verifying `Layout` renders children. Implement `Layout.tsx` with a CSS Grid structure. Update `App.tsx` to wrap the app in `Layout`.
   - Verify: `npm run test` passes. `npm run dev` shows the updated layout on the screen.

## Risks & mitigations
* **IndexedDB Testing:** Dexie interacts with the browser's IndexedDB, which can be tricky in Node.js test environments.
  * *Mitigation:* Use `fake-indexeddb` to polyfill IndexedDB in our Vitest setup.
* **Scope Creep:** Focusing too much on styling the layout before functionality.
  * *Mitigation:* Stick strictly to defining variables and a barebones grid layout for now.

## Rollback plan
* If testing setup breaks the build, `git checkout -- vite.config.ts package.json` and reset `npm install`.
* If `fake-indexeddb` causes issues with Dexie tests, mock Dexie entirely.
