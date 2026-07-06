# Static Analysis & Formatting Design

**Date**: 2026-07-06
**Topic**: Establishing Mobile Standards for Sheeting

## Context

Sheeting recently migrated from a web-based React/Vite application to a native mobile app using React Native and Expo. However, it currently lacks core static analysis and code formatting standards, which are critical for maintaining code quality, preventing silly bugs, and ensuring consistency as the project scales.

## Selected Approach

We have opted for the **Official Expo Standard**, relying on `eslint-config-expo` and Prettier to provide a solid, officially-supported linting baseline with minimal friction.

## Architecture & Configuration

### Dependencies

The following development dependencies will be added:

- `eslint` & `prettier`
- `eslint-config-expo`
- `eslint-config-prettier`
- `eslint-plugin-prettier`
- `husky` & `lint-staged`

### Configuration Files

- **`eslint.config.js`** (or `.eslintrc.js`): Configured to extend `expo` and `prettier`.
- **`.prettierrc`**: Base styling configuration (e.g., single quotes, trailing commas).
- **`.eslintignore` & `.prettierignore`**: Exclusion rules for build folders (`node_modules`, `dist`, `.expo`, `ios`, `android`).

## Automation & Workflow

### Package Scripts

- `npm run lint`: Analyzes the codebase.
- `npm run lint:fix`: Automatically resolves fixable ESLint issues.
- `npm run format`: Formats all files using Prettier.

### Git Hooks

- **Husky** will be used to intercept pre-commit hooks.
- **lint-staged** will run formatting and linting specifically on staged files before they can be committed. This guarantees the repository remains clean without requiring full-project scans on every commit.

### Editor Integration

- A `.vscode/settings.json` file will be created/updated to enable `editor.formatOnSave` relying on Prettier, and to surface ESLint warnings directly inside the IDE.
