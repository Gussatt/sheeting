# System Architecture: Sheeting

This document provides a technical overview of Sheeting's architecture, data flow, and core modules.

## 1. Design Philosophy

Sheeting is built as a **Local-First** application. This means:

- **Privacy:** Financial data never leaves the user's device.
- **Offline Capability:** The app is fully functional without an internet connection (via PWA and IndexedDB).
- **Speed:** Instant UI responses as data is accessed from local storage.

## 2. Core Stack

- **React 19:** Utilizing modern hooks and functional components.
- **PGLite:** An in-browser PostgreSQL database for fully local data persistence with SQL support.
- **Vite:** High-performance build tool and dev server.

## 3. Directory Structure

- `src/db/`: Database schema (schema.sql), abstraction logic (`db.ts`), and PGLite connection (`pglite-db.ts`).
- `src/hooks/`: Custom React hooks for business logic and data access (e.g., `useTransaction`).
- `src/pages/`: Main view components (Ledger, Horizonte, DailyCalculation).
- `src/components/`: Reusable UI components organized by module (Budget, Ledger, Forms).
- `src/utils/`: Pure logic functions (e.g., `projection.ts` for the forecast engine).

## 4. Data Layer (Local-First)

The database (`src/db/db.ts`) uses PGLite to manage local relational tables:

- `transactions`: Stores every financial movement (amount, type, date, tags).
- `categories`: Stores budget categories for the daily calculation system.
- `tags`: Stores user-defined tags for grouping transactions.

### Reactivity

We use the custom `useSQL` hook (built on top of `@electric-sql/pglite/live`) to ensure the UI updates automatically whenever the underlying database changes.

## 5. Projection Engine

The "Horizonte" feature relies on the `calculateProjection` utility (`src/utils/projection.ts`).

- **Input:** Current balances, pending transactions, and future budget category allowances.
- **Logic:** Iteratively calculates the daily balance for the next 4 months.
- **Output:** A grid of status-colored days representing financial health.

## 6. Styling System

Sheeting uses standard CSS with a heavy reliance on **CSS Variables**. This allows for:

- Consistent status colors (Green/Yellow/Red).
- Mobile-first responsiveness.
- Easy theme switching (Dark mode by default).

Key variables can be found in `src/index.css`.
