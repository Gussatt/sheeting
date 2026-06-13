# Sheeting

Sheeting is a local-first web application designed for financial predictability. It provides daily budget tracking and multi-month projections, allowing users to maintain a clear view of their current and future financial status.

## 🚀 Key Features

- **Core Financial Ledger (Saldos):** Day-to-day financial tracking with dynamic month navigation, daily aggregation, and running balances.
- **Daily Calculation System (Previsão de diário):** Plan daily allowances based on monthly category budgets with real-time math and flexible divisors.
- **Financial Horizon (Horizonte):** A multi-month projection grid (4 months into the future) with a heat-map visualization for visual health checks.
- **Transaction Management:** Global entry point for recording all types of financial movements (Entradas, Saídas, Diários, Economias, Gastos com cartão).
- **Local-first & PWA:** All data is stored locally on your device (Dexie.js). Works offline and is installable as a standalone app.

## 🛠 Tech Stack

- **Framework:** React 19 + Vite
- **Language:** TypeScript
- **Database:** Dexie.js (IndexedDB)
- **Styling:** Mobile-first Standard CSS + CSS Variables
- **PWA:** vite-plugin-pwa
- **Icons:** Lucide React
- **Dates:** date-fns
- **Testing:** Vitest + React Testing Library

## 📦 Getting Started

### Prerequisites

- Node.js (v18 or higher)
- npm

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/sheeting.git
   cd sheeting
   ```

2. Install dependencies:
   ```bash
   npm install
   ```

3. Start the development server:
   ```bash
   npm run dev
   ```

### Building for Production

To create a production build with PWA assets:
```bash
npm run build
npm run preview
```

## 🏗 Architecture

Sheeting follows a local-first architecture using IndexedDB (via Dexie.js) for persistence. The UI is built with React 19, following a mobile-first design pattern.

For a detailed deep dive into the system design, see [ARCHITECTURE.md](./ARCHITECTURE.md).

## 🤝 Contributing

We welcome contributions! Please follow our styling standards and testing mandates.

See [CONTRIBUTING.md](./CONTRIBUTING.md) for guidelines on how to get started.

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details (or just use it freely!).
