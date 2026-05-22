# Design Doc: PGLite Migration for Sheeting

**Status:** Approved
**Date:** 2026-05-21

## Goals
- Replace Dexie (IndexedDB) with PGLite (WASM Postgres).
- Provide a reactive API for the UI.
- Maintain compatibility with existing TypeScript interfaces (camelCase).
- Ensure data persistence using IndexedDB.

## Architecture
- **Database Engine:** PGLite with `live` extension.
- **Persistence:** `idb://sheeting-db`.
- **Initialization:** Lazy initialization on first access. Executes `schema.sql` once.
- **Mapping:** Automatic snake_case (DB) to camelCase (TS) conversion for query results.

## API Specification

### `db` object
- `query<T>(sql: string, params?: any[]): Promise<T[]>`
  Executes a SQL query and returns results with camelCase keys.
- `exec(sql: string, params?: any[]): Promise<void>`
  Executes a SQL command (INSERT/UPDATE/DELETE).

### `useSQL<T>(query: string, params?: any[]): T[]`
- Reactive hook using `pg.live.query`.
- Automatically maps results to camelCase.
- Updates on any database change that affects the query results.

## Interface Mapping
- `transactions`: `tag_id` -> `tagId`, `is_recurring` -> `isRecurring`.
- `budget_categories`: `monthly_amount` -> `monthlyAmount`.

## Implementation Strategy
1.  Define mapping utilities.
2.  Implement `DB` class with lazy initialization.
3.  Implement `useSQL` hook.
4.  Update `src/db/db.ts` with new implementation.
5.  Update `src/db/db.test.ts` to verify the new API.
