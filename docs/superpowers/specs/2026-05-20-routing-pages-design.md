# Sheeting Routing & Pages Design

## Goal
Establish the application routing and page skeletons for the "Sheeting" personal finance web application, enabling parallel development of UI components and domain logic. This builds upon the foundational layout to provide a complete, navigable shell.

## Architecture
- **Router:** `react-router-dom` for declarative client-side routing.
- **Provider Placement:** `BrowserRouter` will wrap the application at the root level (`main.tsx` or `App.tsx`).
- **Layout Integration:** The router will render page components inside the main content area of the `Layout` component. The `Layout` component's sidebar will be updated to use `NavLink` elements for navigation.

## Route Structure
The application will feature the following core routes, mapping to the key features of the application:
1.  **`/` (Dashboard):** The home screen providing an overview of finances, summary widgets, and recent activity.
2.  **`/transactions`:** A dedicated view for listing, filtering, and managing all income and expense records.
3.  **`/budgets`:** A view to create, monitor, and manage spending limits for different categories.
4.  **`/goals`:** A view for tracking long-term savings goals and their current progress.
5.  **`/settings`:** Application configuration, tag management, theme toggles, and data export/import capabilities.

## Page Skeletons
For each route, a dedicated React component (e.g., `src/pages/Dashboard/Dashboard.tsx`) will be created. 
- Each skeleton will contain a distinct header identifying the page.
- Each skeleton will render a small set of static mock data (e.g., an array of 2-3 hardcoded transactions or budgets) displayed in a basic structural format (lists or simple tables). This proves the routing works and provides immediate visual context before the actual UI components and Dexie database are integrated.

## Testing Strategy
- Unit tests for the routing setup will verify that navigating to a specific path renders the correct page component.
- The `Layout` component tests will be updated to mock or provide a `MemoryRouter` context since it will now use `NavLink` components.

## Dependencies
- `react-router-dom` (requires installation)
