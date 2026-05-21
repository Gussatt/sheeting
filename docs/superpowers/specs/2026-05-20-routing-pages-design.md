# Sheeting Routing & Pages Design

## Goal
Establish the application routing and page skeletons for the "Sheeting" personal finance web application, incorporating the specific page functions and navigation elements requested by the user.

## Architecture
- **Router:** `react-router-dom` using `<BrowserRouter>`.
- **Layout Integration:** The `Layout` component will provide a bottom navigation bar for mobile-first interaction and a top app bar that might house the global dropdown navigation.

## Route Structure
Based on the required features:

1.  **`/` (Root / Sheet Visualization):** The main dashboard displaying a sheet-like visualization combining:
    *   Diário (Daily budget based on 'previsão de diário')
    *   Cartão (Credit Card expenses)
    *   Saídas (Recurring expenses/outflows)
    *   Entradas (Earnings/inflows)
    *   Economias (Savings)
    *   *Navigation:* A dropdown will be available (in the header or top of the page) to navigate to specific detailed pages for each of these 5 categories.

2.  **Specific Category Pages (accessible via Dropdown):**
    *   `/category/diario`
    *   `/category/cartao`
    *   `/category/saidas`
    *   `/category/entradas`
    *   `/category/economias`

3.  **`/performance` (Totais/Performance):** A page showing performance metrics, money saved, cost of living, and average daily cost (as seen in IMG_7083).

4.  **`/balances` (Saldos):** A page showing current account balances (e.g., Wallet, Nubank) (as seen in IMG_7081).

5.  **`/daily-calculation` (Calculo de diário):** A page to calculate and set the daily budget limits based on categories (as seen in IMG_7085).

6.  **Bottom Navigation Bar (Global):**
    We will map the primary routes to the bottom navigation for quick access, likely:
    - Sheet/Home (`/`)
    - Balances (`/balances`)
    - New Transaction (`+` button)
    - Performance (`/performance`)
    - Daily Calculation (`/daily-calculation`)

## Page Skeletons
For each route, a dedicated React component will be created.
- Each skeleton will contain a distinct header.
- The Root page will feature the dropdown component to switch between the specific views (Diário, Cartão, etc.).

## Testing Strategy
- Unit tests for the routing setup to verify correct components render for paths.
- Layout tests to verify the bottom navigation and dropdown structure.

## Dependencies
- `react-router-dom`
- `lucide-react` (for icons)
