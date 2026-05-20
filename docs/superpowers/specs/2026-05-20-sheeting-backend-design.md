# Sheeting Backend & Data Layer Design Spec

## Goal
Migrate from a local-first (Dexie) architecture to a traditional client-server architecture. This will enable the future transition of the application into a mobile app by centralizing data in a PostgreSQL database via a decoupled Node.js API.

## Architecture & Monorepo Structure

The repository will be structured to support both frontend and backend side-by-side:
- `/src`: The existing Vite + React frontend.
- `/backend`: A new Node.js + Express API.
- `/docker-compose.yml`: Local PostgreSQL database instance.

## Backend Tech Stack
- **Runtime:** Node.js
- **Framework:** Express with TypeScript
- **ORM:** Prisma
- **Database:** PostgreSQL

### Database Schema (Prisma)
The `schema.prisma` will define the following models:
- **User:** `id`, `email`, `createdAt`
- **Tag:** `id`, `name`, `color`, `userId`
- **Budget:** `id`, `tagId`, `limitAmount`, `month`, `year`, `userId`
- **Goal:** `id`, `name`, `targetAmount`, `currentAmount`, `deadlineDate`, `color`, `userId`
- **Transaction:** `id`, `amount`, `type`, `date`, `tagId`, `isRecurring`, `recurringFrequency`, `description`, `userId`, `createdAt`

## Frontend Data Fetching (React Query)
The frontend will transition away from Dexie (`dexie-react-hooks`) and adopt **TanStack Query (React Query)** to handle remote data fetching, caching, and state synchronization.

### API Hooks Structure
Instead of direct DB calls, the frontend will use custom hooks (e.g., `src/hooks/api/useTransactions.ts`) that wrap `useQuery` and `useMutation` to interact with the Express API via `fetch` or `axios`.

## Testing
- **Backend:** Vitest + Supertest for API integration tests.
- **Frontend:** Remove Dexie/IndexedDB mocks and implement MSW (Mock Service Worker) to intercept and mock API calls during frontend TDD.
