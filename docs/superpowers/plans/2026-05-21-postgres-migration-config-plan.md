# Postgres Migration & Configuration Modules Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Migrate the local database from Dexie to **PGLite** (WASM PostgreSQL) and implement the Configuration modules.

**Architecture:** 
- Replace Dexie with `@electric-sql/pglite` for a true PostgreSQL experience in the browser.
- Create a `db` singleton with SQL schema definitions.
- Implement the "Menu" page with Profile and Data Management.

**Tech Stack:** React 19, PGLite, TypeScript, date-fns.

---

### Task 1: Database Migration to PGLite

**Files:**
- Modify: `package.json`
- Create: `src/db/schema.sql`
- Modify: `src/db/db.ts`

- [ ] **Step 1: Install PGLite**
Run: `npm install @electric-sql/pglite`

- [ ] **Step 2: Create SQL Schema**
```sql
-- src/db/schema.sql
CREATE TABLE IF NOT EXISTS transactions (
  id UUID PRIMARY KEY,
  amount DECIMAL(12, 2) NOT NULL,
  type TEXT NOT NULL CHECK (type IN ('income', 'expense', 'daily', 'savings', 'credit')),
  date TIMESTAMP WITH TIME ZONE NOT NULL,
  description TEXT,
  tag_id TEXT,
  is_recurring BOOLEAN DEFAULT FALSE
);

CREATE TABLE IF NOT EXISTS budget_categories (
  id UUID PRIMARY KEY,
  name TEXT NOT NULL,
  monthly_amount DECIMAL(12, 2) NOT NULL
);

CREATE TABLE IF NOT EXISTS tags (
  id UUID PRIMARY KEY,
  name TEXT NOT NULL,
  color TEXT
);

CREATE TABLE IF NOT EXISTS config (
  key TEXT PRIMARY KEY,
  value TEXT
);
```

- [ ] **Step 3: Update db.ts for PGLite**
Implement a wrapper to execute SQL and provide reactive hooks (or simple event-based refresh).

### Task 2: Configuration (Menu) Module

**Files:**
- Modify: `src/pages/Menu.tsx`
- Create: `src/components/Menu/SettingsItem.tsx`

- [ ] **Step 1: Implement Profile Section**
Display user name and subscription status (mocked or from `config` table).

- [ ] **Step 2: Implement Data Management**
- "Zerar minha conta": `DELETE FROM transactions; DELETE FROM budget_categories;`
- "Exportar dados": Download SQL or JSON.

### Task 3: Transaction CRUD Update

**Files:**
- Modify: `src/pages/AddTransaction.tsx`
- Modify: `src/pages/SheetView.tsx`

- [ ] **Step 1: Refactor queries to SQL**
Replace `db.transactions.add(...)` with `INSERT INTO transactions...`.
Replace `useLiveQuery` with a PGLite subscription.
