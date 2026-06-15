# Phase 1, Spec 2: Migrate Database Layer to Expo SQLite

**Goal:** Swap out Web PGLite for Native Expo SQLite while keeping the query interface intact.

**Files to Touch:**
- Modify: `src/db/db.ts`
- Keep: `src/db/expo-sqlite-db.ts`
- Delete: `src/db/pglite-db.ts`

**Step 1: Update the DB Abstraction**
- Change the export in `db.ts` to `export * from './expo-sqlite-db';`.

**Step 2: Fix `expo-sqlite-db.ts` Imports and Types**
- Validate `import * as SQLite from 'expo-sqlite';`.
- Verify `openDatabaseSync` / `openDatabaseAsync` matches current SDK 51 API.

**Step 3: Remove PGLite**
- Run `npm uninstall @electric-sql/pglite`
- Run `git rm src/db/pglite-db.ts`

**Step 4: Verify**
- Temporarily import `db` in `app/_layout.tsx` and run `db.init()` to ensure no runtime crash on start.

**Step 5: Commit**
- `git add src/db/ package.json`
- `git commit -m "refactor: swap pglite for expo-sqlite as primary database"`
