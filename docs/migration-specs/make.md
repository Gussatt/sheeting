# Multi-Agent Orchestration Guide: React Native Migration

Welcome. You are migrating Sheeting from a Web app (React 19 + Vite + PGLite) to a Native app (Expo + Expo Router + Expo SQLite).

This migration is divided into strict, executable specifications designed to be handled by one or more agents.

## Execution Rules

- Use the `subagent-driven-development` or `dispatching-parallel-agents` skill to organize the work.
- **Phase 1 and Phase 2 MUST be executed sequentially.** They modify core project infrastructure.
- **Phase 3 CAN be executed in parallel.** The individual screens are largely independent once the router and theme are established.

## Phase 1: Core Setup

> **Agent Task:** Open `docs/migration-specs/phase1-setup/` and execute the specs in order.

1. `01-expo-init.md`: Bootstraps the Expo app over the existing Vite structure.
2. `02-db-migration.md`: Swaps the database adapter.

## Phase 2: Theme & Layout

> **Agent Task:** Open `docs/migration-specs/phase2-theme-layout/` and execute sequentially.

1. `01-theme-context.md`: Fixes the ThemeContext to use `Appearance`.
2. `02-css-to-ts.md`: Creates the core TS theme object.
3. `03-bottom-tabs.md`: Implements the basic Expo Router tab bar.

## Phase 3: Screen Porting (Parallelizable)

> **Agent Task:** You may dispatch up to 4 parallel subagents here. Each agent should take one file from `docs/migration-specs/phase3-screens/`.

- `01-ledger-screen.md`
- `02-performance-screen.md`
- `03-tags-screen.md`
- `04-menu-screen.md`

## Phase 4: Feature Completion

> **Agent Task:** Finalize all remaining functional routes and complex forms.

1. `01-add-transaction.md`: Port the main data entry system.
2. `02-horizonte.md`: Port the core projection engine UI.
3. `03-budget-calc.md`: Port calculation and setup screens.
4. `04-tag-modal.md`: Complete tag management.

Once all Phase 4 tasks are complete, the migration is 100% finished.
