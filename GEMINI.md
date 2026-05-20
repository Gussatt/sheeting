# Project Overview: Sheeting

**Sheeting** is a web-based application built for "cloning sheet finances." 

Notably, the project contains a `jadx_asset` directory with decompiled Android app resources (from an app called "App do Breno"). It'll be a scaffold to create a clone of it, not copying the code, but the features.

## Tech Stack
- **Framework:** React 19
- **Language:** TypeScript
- **Bundler:** Vite
- **Styling:** CSS (Standard)
- **Linter:** ESLint (Flat Config)

## Building and Running

This project uses `npm` (or your preferred Node.js package manager) for scripting and dependency management.

- **Start Development Server:**
  ```bash
  npm run dev
  ```
  *(Starts the Vite dev server with Hot Module Replacement)*

- **Build for Production:**
  ```bash
  npm run build
  ```
  *(Runs the TypeScript compiler `tsc -b` and then Vite build)*

- **Preview Production Build:**
  ```bash
  npm run preview
  ```
  *(Serves the built application locally for testing)*

- **Linting:**
  ```bash
  npm run lint
  ```
  *(Runs ESLint across the codebase)*

## Development Conventions

- **Component Structure:** Components are written as functional components using React Hooks (`useState`, etc.).
- **File Extensions:** Use `.tsx` for React components and `.ts` for standard TypeScript logic.
- **Entry Point:** The application entry point is `src/main.tsx` and the main component is `src/App.tsx`.
- **Linting & Code Quality:** ESLint is configured to enforce recommended JavaScript and TypeScript rules, as well as React Hook dependencies (`eslint-plugin-react-hooks`) and Fast Refresh compatibility (`eslint-plugin-react-refresh`).
- **Assets:** Static assets like images and SVGs are stored in the `src/assets/` directory (for bundled assets) or the `public/` directory (for static serving).
- **Reference Material:** The `jadx_asset/` directory contains read-only reference files. When implementing features, check these files to understand the original app's data structures or configurations (e.g., Firebase, Measurement APIs), but keep the web implementation strictly within the `src/` directory using modern web standards.

## Business model
- The original app acts as a sheet app that allows predictability for your finances.
- The app is used for personal finance management, allowing users to track their income and expenses, as well as set budgets and financial goals.
- This app should be a local-first app, meaning that all the data should be stored locally on the user's device.

## UI
- The app should have a modern and clean UI, with a focus on user experience.
- The UI should be responsive and work on all devices.
- The UI should be easy to navigate and understand.

## Features
- The app should have all the features of the original app, including:
    - Income and expense tracking
    - Budget management
    - Financial goal setting
    - Data visualization
    - Future income prediction
    - Recurring transactions
    - Savings and debts tracking
    - Sheet cells colors rules based on values

## Code Style

- Use functional components with hooks for state management.
