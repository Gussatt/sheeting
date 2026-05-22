# Sheeting Phase 5: CRUD Operations & Forms Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Implement full CRUD for transactions with a high-fidelity form and editing capabilities.

**Architecture:** Use a single form component for Add/Edit. Pass existing transaction data as state for editing.

**Tech Stack:** React 19, Dexie, React Router.

---

### Task 1: High-Fidelity Transaction Form

**Files:**
- Modify: `src/pages/AddTransaction.tsx`
- Create: `src/components/Forms/TransactionForm.tsx`

- [ ] **Step 1: Create reusable TransactionForm**
Support all types (Entrada, Saída, etc.) with correct icons and colors.
- [ ] **Step 2: Add validation**
Prevent saving without amount or type.

### Task 2: Edit & Delete Functionality

**Files:**
- Modify: `src/pages/SheetView.tsx`
- Modify: `src/db/db.ts`

- [ ] **Step 1: Add onClick to LedgerRow to navigate to Edit**
- [ ] **Step 2: Implement updateTransaction in db.ts**
- [ ] **Step 3: Add Delete button in Edit view**
