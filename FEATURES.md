# Implemented Features - Sheeting

This document tracks the features implemented in the Sheeting web application, providing a reference for functionality and technical implementation.

## 1. Core Financial Ledger (Saldos)
The main interface for day-to-day financial tracking.
- **Dynamic Month Navigation:** Users can navigate between months using previous/next controls.
- **Daily Aggregation:** Automatically sums all transactions (Incomes vs Expenses) for each day of the month.
- **Running Balance:** Calculates a month-local running balance to show cumulative financial status.
- **Type Filtering:** A "Mostrar" filter bottom sheet allows isolating specific transaction types (Entradas, Saídas, Diários, Economias, Cartão).
- **Status Coloring:** 
    - **Green:** Healthy balance (>= R$ 100,00).
    - **Yellow:** Warning/Low balance (0 <= balance < 100).
    - **Red:** Negative/Overdrawn balance (< 0).

## 2. Daily Calculation System (Previsão de diário)
A module for planning daily allowances based on monthly category budgets.
- **Category Management:** Full CRUD for monthly budget categories (e.g., Comida, Lazer).
- **Real-time Math:** Automatically calculates total monthly amount and resulting daily allowance.
- **Flexible Divisors:** Supports dividing by 28, 30, or 31 days to account for month length.
- **Persistence:** Categories are stored locally in Dexie.

## 3. Financial Horizon (Horizonte)
A multi-month projection grid based on current data and future allowances.
- **Projection Engine:** Utility that forecasts daily balances 4 months into the future.
- **Heat-map Grid:** A scrollable grid visualization where months are columns and days are rows.
- **Color Coding:** Uses standardized status colors to provide a visual health check of future dates.

## 4. Transaction Management
A global entry point for recording financial movements.
- **Multi-type Support:** Record Entradas, Saídas, Diários, Economias, and Gastos com cartão.
- **Rich Metadata:** Supports amount, description, date selection, category tagging, and recurring status.
- **Automated Routing:** Redirects to the Ledger view after successful save.

## 5. Architecture & UI Patterns
- **Local-first Data:** All data persists in IndexedDB via **Dexie.js**. No cloud backend required.
- **Responsive Layout:** Mobile-first design with a persistent bottom navigation bar and sticky headers.
- **Progressive Web App (PWA):** Offline support, manifest file, and installable as a standalone app.
- **Standardized Styling:** Uses CSS variables for high-fidelity dark mode matching the original design.
- **Robustness:** Strict TypeScript implementation with extensive unit testing (20+ tests).
- **Iconography:** High-quality UI using **Lucide React**.

## 6. Technical Stack Reference
- **Framework:** React 19 + Vite
- **Database:** Dexie.js
- **PWA:** vite-plugin-pwa
- **Date Handling:** date-fns
- **Icons:** lucide-react
- **Testing:** Vitest + React Testing Library
