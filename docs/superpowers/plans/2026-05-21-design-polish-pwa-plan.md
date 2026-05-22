# Sheeting Phase 4: Design Polish & PWA Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Align the UI with the original design screenshots (Dark Mode, High-Fidelity components) and setup PWA capabilities.

**Architecture:** Use CSS variables for the color palette. Refactor LedgerRow to handle multiple icons for the "Todas" view.

**Tech Stack:** React 19, CSS, Lucide Icons, Vite PWA Plugin.

---

### Task 1: Theme & Global Styles (Dark Mode)

**Files:**
- Modify: `src/index.css`
- Modify: `src/App.css`

- [ ] **Step 1: Define high-fidelity variables in index.css**
Update `:root` with exact colors from screenshots.

```css
:root {
  --color-bg: #121212;
  --color-surface: #1E1E1E;
  --color-text-primary: #FFFFFF;
  --color-text-secondary: #AAAAAA;
  --color-primary: #F97316;
  
  --status-green: #27AE60;
  --status-yellow: #F1C40F;
  --status-red: #E74C3C;
  --status-pink: #E91E63;
  --status-purple: #9B59B6;
  --status-light-green: #2ECC71;
}
```

- [ ] **Step 2: Update body and layout styles**
Ensure the app fills the viewport and has the correct background.

### Task 2: High-Fidelity Ledger Components

**Files:**
- Modify: `src/components/Ledger/LedgerRow.tsx`
- Modify: `src/components/Ledger/LedgerRow.test.tsx`

- [ ] **Step 1: Update LedgerRow for "Todas" view**
Support an array of transaction totals/types. Add the "check-in" badge.

```tsx
interface LedgerRowProps {
  day: number;
  data: { type: string; total: number }[]; // Support multiple types
  balance: number;
  isCheckedIn: boolean;
}
```

### Task 3: PWA Setup

**Files:**
- Modify: `vite.config.ts`
- Create: `public/manifest.json`

- [ ] **Step 1: Install vite-plugin-pwa**
- [ ] **Step 2: Configure manifest and service worker**
