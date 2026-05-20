# Sheeting Backend & API Integration Implementation Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Scaffold a Node/Express backend with Prisma and PostgreSQL, and update the React frontend to use React Query for API data fetching.

## Phase 1: Database & Backend Scaffolding
- [ ] Create a `docker-compose.yml` in the root for a local PostgreSQL database.
- [ ] Initialize the `/backend` directory with `package.json`, `tsconfig.json`, and basic Express setup.
- [ ] Install Prisma (`prisma`, `@prisma/client`) in the backend and initialize it.
- [ ] Write the `schema.prisma` containing `User`, `Tag`, `Budget`, `Goal`, and `Transaction` models.
- [ ] Run the initial Prisma migration (`npx prisma migrate dev`) to provision the local database.

## Phase 2: Core API Routes
- [ ] Set up Express routing architecture (e.g., `/api/transactions`, `/api/tags`).
- [ ] Implement CRUD endpoints for `Tags` using Prisma.
- [ ] Implement CRUD endpoints for `Transactions` using Prisma.
- [ ] Add basic error handling middleware and CORS configuration to the Express app.
- [ ] *Testing Checkpoint:* Write basic API tests (using Vitest + Supertest) to verify the Transactions and Tags endpoints work against a test database.

## Phase 3: Frontend Data Layer Migration (React Query)
- [ ] Install `@tanstack/react-query` and `@tanstack/react-query-devtools` in the root frontend project.
- [ ] Wrap the frontend `App` inside the `QueryClientProvider` in `main.tsx`.
- [ ] Create an API utility instance (e.g., Axios instance or configured `fetch` wrapper) pointing to the local backend url (`http://localhost:3000/api`).
- [ ] Set up MSW (Mock Service Worker) in the frontend testing environment to mock the new API routes.

## Phase 4: Frontend API Hooks
- [ ] Implement `src/hooks/api/useTags.ts` wrapping `useQuery` and `useMutation` for Tag API calls.
- [ ] Implement `src/hooks/api/useTransactions.ts` wrapping `useQuery` and `useMutation` for Transaction API calls.
- [ ] Deprecate and remove the old Dexie configuration (`src/db/db.ts`) and its related tests, replacing them with the new MSW-backed tests for the React Query hooks.
- [ ] *Verification:* Ensure all frontend tests pass using the mocked API calls.
