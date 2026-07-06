# Contributing to Sheeting

We're glad you're interested in helping out! To maintain the quality and consistency of the project, please follow these guidelines.

## 🎨 Styling Standards

Sheeting uses a mobile-first, high-fidelity design. Always use the standardized CSS variables for status colors and theme elements.

### Status Colors

- `--status-green`: #27AE60 (Healthy balance >= R$ 100,00)
- `--status-yellow`: #F1C40F (Warning balance < 100)
- `--status-red`: #E74C3C (Negative balance)
- `--status-pink`: #E91E63
- `--status-purple`: #9B59B6
- `--status-light-green`: #2ECC71

### Layout Mandates

- **Bottom Navigation:** The main navigation bar must always be 70px in height and pinned to the bottom.
- **FAB:** The central (+) Floating Action Button should be a white circular button.

## 🧪 Testing Mandates

A change is not complete until it has been verified with tests.

- **Coverage:** Aim for >90% coverage on all business logic and UI components.
- **Framework:** Use **Vitest** + **React Testing Library**.
- **Commands:**
  - `npm test`: Run all tests.
  - `npm run coverage`: Check test coverage.

## 🛠 Coding Standards

- **TypeScript:** Use strict typing. Prefer `import type` for interfaces.
- **Local-First:** Never add calls to external APIs without a clear reason and a local-first fallback. All data persistence must go through `db.ts`.
- **Components:** Keep components surgical. Extract complex logic into custom hooks (see `src/hooks/useTransaction.ts` as an example).

## 🚀 Workflow

1.  **Fork** the repository and create your feature branch.
2.  **Verify** existing functionality by running `npm run lint` and `npm test`.
3.  **Implement** your changes following the styling and coding standards.
4.  **Add Tests** for your new functionality.
5.  **Build** the project with `npm run build` to ensure PWA assets are generated correctly.
6.  **Submit a PR** with a clear description of your changes.

Thank you for contributing!
