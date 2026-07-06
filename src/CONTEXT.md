# Source Workspace Context

This workspace contains the core application logic, UI components, and database schema.

## Development Patterns

- **Reactivity:** Use `useLiveQuery` from `dexie-react-hooks` for all database-driven UI.
- **Components:** Organized by domain in `/src/components/` (Budget, Ledger, Forms).
- **Hooks:** Business logic is encapsulated in custom hooks in `/src/hooks/`.
- **Database:** Dexie schema is defined in `/src/db/db.ts`.

## Standards

- **Imports:** Use `import type` for TypeScript interfaces.
- **Styling:** Use standard CSS with standardized variables from `src/index.css`.
- **Icons:** Use `Lucide React` exclusively.
- **Dates:** Use `date-fns` for all date manipulations.

## Testing Strategy

- **Framework:** Vitest + React Testing Library.
- **Coverage:** Aim for >90% coverage on hooks and utils.
- **Naming:** `filename.test.ts(x)` sibling to the implementation.
- **Mandate:** No PR/Change is complete without a passing test.

## Tech Stack Reference

- React 19 (Hooks)
- PGLite (PostgreSQL)
- Vitest (Testing)
- CSS Variables (Styling)
  est (Testing)
- CSS Variables (Styling)
