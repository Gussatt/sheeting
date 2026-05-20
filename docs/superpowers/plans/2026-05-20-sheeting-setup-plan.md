# Sheeting Setup Implementation Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Establish the TDD testing infrastructure, local-first database (Dexie), and global CSS layout for the Sheeting app.

**Architecture:** We use Dexie.js for local-first IndexedDB storage. Tests run in Vitest using `fake-indexeddb` to mock the browser database environment. Layout relies on native CSS Grid and CSS variables.

**Tech Stack:** React 19, TypeScript, Vite, Vitest, React Testing Library, Dexie.js.

---

### Task 1: Setup Testing Infrastructure

**Files:**
- Modify: `package.json`
- Modify: `vite.config.ts`
- Create: `src/setupTests.ts`

- [ ] **Step 1: Write `setupTests.ts`**

```typescript
// src/setupTests.ts
import '@testing-library/jest-dom/vitest';
```

- [ ] **Step 2: Configure Vite for Testing**

Update `vite.config.ts` to include the test environment.

```typescript
// vite.config.ts
/// <reference types="vitest" />
import { defineConfig } from 'vite'
import react from '@vitejs/plugin-react'

// https://vite.dev/config/
export default defineConfig({
  plugins: [react()],
  test: {
    environment: 'jsdom',
    setupFiles: ['./src/setupTests.ts'],
    globals: true
  }
})
```

- [ ] **Step 3: Update `package.json` Test Script**

Modify the `scripts` block in `package.json` to add the vitest script.

```json
  "scripts": {
    "dev": "vite",
    "build": "tsc -b && vite build",
    "lint": "eslint .",
    "test": "vitest",
    "preview": "vite preview"
  },
```

- [ ] **Step 4: Verify test setup**

Run: `npm run test -- --passWithNoTests`
Expected: PASS (No tests found, but command exits successfully)

- [ ] **Step 5: Commit**

```bash
git add package.json vite.config.ts src/setupTests.ts
git commit -m "chore: setup vitest testing infrastructure"
```

---

### Task 2: Implement Dexie Database Adapter

**Files:**
- Create: `src/db/db.ts`
- Create: `src/db/db.test.ts`

- [ ] **Step 1: Write the failing test**

```typescript
// src/db/db.test.ts
import { describe, it, expect, beforeEach } from 'vitest';
import 'fake-indexeddb/auto';
import { db } from './db';

describe('Database Adapter', () => {
  beforeEach(async () => {
    await db.transactions.clear();
  });

  it('should successfully add and retrieve a transaction', async () => {
    const tx = {
      id: 'tx-1',
      amount: 100,
      type: 'income' as const,
      date: new Date('2026-05-20'),
      tagId: 'tag-1',
      isRecurring: false,
      description: 'Test Income'
    };

    await db.transactions.add(tx);
    const stored = await db.transactions.get('tx-1');
    expect(stored).toEqual(tx);
  });
});
```

- [ ] **Step 2: Run test to verify it fails**

Run: `npm run test -- --run`
Expected: FAIL (Cannot find module './db')

- [ ] **Step 3: Write minimal implementation**

```typescript
// src/db/db.ts
import Dexie, { Table } from 'dexie';

export interface Transaction {
  id: string;
  amount: number;
  type: 'income' | 'expense';
  date: Date;
  tagId: string;
  isRecurring: boolean;
  recurringFrequency?: 'weekly' | 'monthly' | 'yearly';
  description: string;
  debtId?: string;
}

export class SheetingDB extends Dexie {
  transactions!: Table<Transaction>;

  constructor() {
    super('SheetingDB');
    this.version(1).stores({
      transactions: 'id, type, date, tagId, isRecurring'
    });
  }
}

export const db = new SheetingDB();
```

- [ ] **Step 4: Run test to verify it passes**

Run: `npm run test -- --run`
Expected: PASS

- [ ] **Step 5: Commit**

```bash
git add src/db/db.test.ts src/db/db.ts
git commit -m "feat: implement Dexie database adapter"
```

---

### Task 3: Create Global CSS Variables and Scaffold Layout

**Files:**
- Modify: `src/index.css`
- Modify: `src/App.tsx`
- Create: `src/components/Layout/Layout.tsx`
- Create: `src/components/Layout/Layout.test.tsx`

- [ ] **Step 1: Define Global CSS Variables**

Replace contents of `src/index.css`:

```css
:root {
  --color-bg: #ffffff;
  --color-text: #1a1a1a;
  --color-primary: #f97316; /* logo_laranja from assets */
  --color-surface: #f3f4f6;
  --color-border: #e5e7eb;
}

@media (prefers-color-scheme: dark) {
  :root {
    --color-bg: #121212;
    --color-text: #e5e5e5;
    --color-surface: #1e1e1e;
    --color-border: #333333;
  }
}

body {
  margin: 0;
  font-family: 'Inter', system-ui, -apple-system, sans-serif;
  background-color: var(--color-bg);
  color: var(--color-text);
}

.layout-grid {
  display: grid;
  grid-template-columns: 250px 1fr;
  min-height: 100vh;
}

.layout-sidebar {
  background-color: var(--color-surface);
  border-right: 1px solid var(--color-border);
  padding: 1rem;
}

.layout-main {
  padding: 2rem;
}
```

- [ ] **Step 2: Write failing test for Layout Component**

```typescript
// src/components/Layout/Layout.test.tsx
import { describe, it, expect } from 'vitest';
import { render, screen } from '@testing-library/react';
import { Layout } from './Layout';

describe('Layout', () => {
  it('renders children within the main content area', () => {
    render(
      <Layout>
        <div data-testid="child">Test Content</div>
      </Layout>
    );
    expect(screen.getByTestId('child')).toBeInTheDocument();
  });
});
```

- [ ] **Step 3: Run test to verify it fails**

Run: `npm run test -- --run`
Expected: FAIL (Cannot find module './Layout')

- [ ] **Step 4: Implement Layout Component**

```typescript
// src/components/Layout/Layout.tsx
import React from 'react';

export const Layout = ({ children }: { children: React.ReactNode }) => {
  return (
    <div className="layout-grid">
      <aside className="layout-sidebar">
        <h2>Sheeting</h2>
        {/* Navigation items will go here */}
      </aside>
      <main className="layout-main">
        {children}
      </main>
    </div>
  );
};
```

- [ ] **Step 5: Integrate Layout into App**

Modify `src/App.tsx`:

```typescript
// src/App.tsx
import { Layout } from './components/Layout/Layout';

function App() {
  return (
    <Layout>
      <h1>Dashboard</h1>
    </Layout>
  );
}

export default App;
```

- [ ] **Step 6: Run tests to verify passing**

Run: `npm run test -- --run`
Expected: PASS

- [ ] **Step 7: Commit**

```bash
git add src/index.css src/App.tsx src/components/Layout/
git commit -m "feat: setup global CSS and base layout component"
```
