# Sheeting Foundation Design & Spec

## Goal
Establish the foundational infrastructure for the "Sheeting" personal finance web application. This includes setting up a robust local-first database adapter using IndexedDB, configuring a strict TDD environment (Vitest + React Testing Library), and establishing a scalable CSS design system without external utility libraries like Tailwind.

## Constraints
* **Framework:** React 19 with Vite.
* **Architecture:** Strictly local-first. No backend or external cloud database for user data.
* **Testing:** Strict TDD methodology (Red-Green-Refactor) must be supported.
* **Styling:** Standard/Vanilla CSS with CSS variables, specifically avoiding Tailwind to ensure maximum custom styling flexibility as required.

## Known Context
* The Vite scaffolding for React + TypeScript is already present.
* The application is cloning features from "App do Breno," requiring offline data persistence for transactions, tags, goals, and recurring entries.

## Risks
* **Testing IndexedDB:** Testing IndexedDB (Dexie) in a Node.js `jsdom` environment often fails or hangs because there is no native browser DB.
* **Scope Creep:** Setting up too much UI boilerplate before the data layer is proven.

## Options
1. **Option A (Standard Context + LocalStorage):** Use standard `localStorage` with React Context. 
   * *Trade-offs:* Very easy to test, but limits querying capability and storage size for a complex finance app.
2. **Option B (Dexie.js + fake-indexeddb):** Use Dexie as a wrapper around IndexedDB and polyfill the test environment with `fake-indexeddb`.
   * *Trade-offs:* Requires more setup and specific test environment configuration, but provides robust relational queries needed for transactions and tags.

## Recommendation
**Option B** is highly recommended. A finance tracking app requires complex queries (e.g., "get all expenses for tag X in month Y"). `localStorage` is insufficient for this. Dexie + `fake-indexeddb` solves the testing risks.

## Acceptance Criteria
1. `npm run test` executes Vitest successfully.
2. The Database adapter (`db.ts`) can be imported and tested in memory without throwing IndexedDB errors.
3. Global CSS variables (tokens) are active and applied to a foundational `Layout` component that renders a basic sidebar/main content grid.
