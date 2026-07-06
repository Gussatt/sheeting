# Sheeting - Financial Predictability

**Sheeting** is a high-fidelity, local-first financial tracking app (App do Breno clone) designed for predictability through projections.

## Tech Stack

- **Frontend:** React 19 + Vite + TypeScript
- **Database:** PGLite (Local PostgreSQL)
- **Styling:** Mobile-first Standard CSS + CSS Variables
- **PWA:** vite-plugin-pwa (standalone mode)

## Workspaces

- **/src** — Core implementation: Components, Hooks, Database, and Logic.
- **/docs** — Planning & Strategy: Specs, architecture decisions, and implementation plans.
- **/assets** — Visual Identity: Screenshots, icons, and design references.

## Routing

| Task                   | Go to   | Read            | Skills                                        |
| ---------------------- | ------- | --------------- | --------------------------------------------- |
| Plan or spec a feature | /docs   | CONTEXT.md      | writing-plans                                 |
| Implement or fix code  | /src    | CONTEXT.md      | test-driven-development, systematic-debugging |
| Update visual assets   | /assets | CONTEXT.md      | —                                             |
| Research architecture  | /       | ARCHITECTURE.md | codebase_investigator                         |

## Naming Conventions

- **Components:** PascalCase (e.g., `TransactionForm.tsx`)
- **Hooks:** camelCase starting with `use` (e.g., `useTransaction.ts`)
- **Utilities:** camelCase (e.g., `projection.ts`)
- **Plans/Specs:** `YYYY-MM-DD-feature-name.md`
- **Tests:** `filename.test.ts(x)`

## Engineering Mandates

1. **Local-First:** All financial data MUST stay on the user's device (Dexie/IndexedDB).
2. **High-Fidelity UI:** Strict adherence to CSS variables and mobile-first bottom-nav patterns.
3. **Verified Changes:** Every logic change requires matching tests (Vitest).
4. **PWA Compliance:** Maintain offline functionality and standalone app integrity.
