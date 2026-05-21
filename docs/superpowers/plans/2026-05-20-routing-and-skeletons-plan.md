# Routing and Page Skeletons Implementation Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Implement client-side routing and page skeletons reflecting the required "sheet visualization", detail pages, performance, balance, and daily calculation pages.

**Architecture:** We will use `react-router-dom` with `<BrowserRouter>`. The application will feature a root layout with a bottom navigation bar for main sections, and a header dropdown on the root page to navigate between the specific category details (Diário, Cartão, Saídas, Entradas, Economias).

**Tech Stack:** React 19, react-router-dom, lucide-react (for icons), Vanilla CSS

---

### Task 1: Install Dependencies & Update Global CSS

**Files:**
- Modify: `package.json`
- Modify: `src/index.css`

- [ ] **Step 1: Install `react-router-dom` and `lucide-react`**

Run: `npm install react-router-dom lucide-react`
Expected: Installation completes.

- [ ] **Step 2: Update CSS for layout with bottom navigation**

Edit `src/index.css` to add layout classes:
```css
/* Add at the end of the file */
.layout-container {
  display: flex;
  flex-direction: column;
  height: 100vh;
}

.layout-main {
  flex: 1;
  overflow-y: auto;
  padding: 1rem;
  padding-bottom: calc(70px + env(safe-area-inset-bottom, 0px));
}

.bottom-nav {
  position: fixed;
  bottom: 0;
  left: 0;
  right: 0;
  height: 60px;
  background-color: var(--color-surface);
  border-top: 1px solid var(--color-border);
  display: flex;
  justify-content: space-around;
  align-items: center;
  padding-bottom: env(safe-area-inset-bottom, 0px);
  z-index: 1000;
}

.bottom-nav-item {
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  text-decoration: none;
  color: var(--color-text);
  opacity: 0.6;
  font-size: 0.75rem;
  gap: 0.25rem;
}

.bottom-nav-item.active {
  opacity: 1;
  color: var(--color-primary);
}
```

- [ ] **Step 3: Commit**

```bash
git add package.json package-lock.json src/index.css
git commit -m "chore: install router and update global css for mobile layout"
```

### Task 2: Create Layout Component

**Files:**
- Modify: `src/components/Layout/Layout.tsx`
- Modify: `src/components/Layout/Layout.test.tsx`

- [ ] **Step 1: Write/Update Layout Test**

Edit `src/components/Layout/Layout.test.tsx`:
```tsx
import { render, screen } from '@testing-library/react';
import { describe, it, expect } from 'vitest';
import { Layout } from './Layout';
import { MemoryRouter } from 'react-router-dom';

describe('Layout', () => {
  it('renders children and bottom navigation', () => {
    render(
      <MemoryRouter>
        <Layout>
          <div data-testid="test-child">Child Content</div>
        </Layout>
      </MemoryRouter>
    );

    expect(screen.getByTestId('test-child')).toBeInTheDocument();
    expect(screen.getByText('Planilha')).toBeInTheDocument();
    expect(screen.getByText('Saldos')).toBeInTheDocument();
    expect(screen.getByText('Desempenho')).toBeInTheDocument();
    expect(screen.getByText('Diário')).toBeInTheDocument();
  });
});
```

- [ ] **Step 2: Run test to verify it fails**

Run: `npm run test`
Expected: Layout tests fail.

- [ ] **Step 3: Refactor Layout Implementation**

Edit `src/components/Layout/Layout.tsx`:
```tsx
import React from 'react';
import { NavLink } from 'react-router-dom';
import { Grid, Wallet, Activity, Calculator } from 'lucide-react';

export const Layout = ({ children }: { children: React.ReactNode }) => {
  return (
    <div className="layout-container">
      <main className="layout-main">
        {children}
      </main>
      
      <nav className="bottom-nav">
        <NavLink to="/" className={({ isActive }) => `bottom-nav-item ${isActive ? 'active' : ''}`}>
          <Grid size={20} />
          <span>Planilha</span>
        </NavLink>
        
        <NavLink to="/balances" className={({ isActive }) => `bottom-nav-item ${isActive ? 'active' : ''}`}>
          <Wallet size={20} />
          <span>Saldos</span>
        </NavLink>

        <NavLink to="/performance" className={({ isActive }) => `bottom-nav-item ${isActive ? 'active' : ''}`}>
          <Activity size={20} />
          <span>Desempenho</span>
        </NavLink>

        <NavLink to="/daily-calculation" className={({ isActive }) => `bottom-nav-item ${isActive ? 'active' : ''}`}>
          <Calculator size={20} />
          <span>Diário</span>
        </NavLink>
      </nav>
    </div>
  );
};
```

- [ ] **Step 4: Verify test passes**

Run: `npm run test`
Expected: PASS.

- [ ] **Step 5: Commit**

```bash
git add src/components/Layout/
git commit -m "refactor: update layout for bottom navigation"
```

### Task 3: Create Page Skeletons

**Files:**
- Create: `src/pages/SheetView.tsx`
- Create: `src/pages/Balances.tsx`
- Create: `src/pages/Performance.tsx`
- Create: `src/pages/DailyCalculation.tsx`
- Create: `src/pages/CategoryDetail.tsx`

- [ ] **Step 1: Create SheetView (Root)**

Create `src/pages/SheetView.tsx`:
```tsx
import React, { useState } from 'react';
import { useNavigate } from 'react-router-dom';

export const SheetView = () => {
  const navigate = useNavigate();
  const [selectedCategory, setSelectedCategory] = useState('');

  const handleNavigation = (e: React.ChangeEvent<HTMLSelectElement>) => {
    const value = e.target.value;
    setSelectedCategory(value);
    if (value) {
      navigate(`/category/${value}`);
    }
  };

  return (
    <div>
      <div style={{ display: 'flex', justifyContent: 'space-between', alignItems: 'center', marginBottom: '1rem' }}>
        <h1>Planilha</h1>
        <select value={selectedCategory} onChange={handleNavigation} style={{ padding: '0.5rem', borderRadius: '4px' }}>
          <option value="">Detalhes...</option>
          <option value="diario">Diário</option>
          <option value="cartao">Cartão</option>
          <option value="saidas">Saídas</option>
          <option value="entradas">Entradas</option>
          <option value="economias">Economias</option>
        </select>
      </div>
      
      <div style={{ display: 'flex', flexDirection: 'column', gap: '1rem' }}>
        <div style={{ background: 'var(--color-surface)', padding: '1rem', borderRadius: '8px' }}>
          <h3>Visão Geral</h3>
          <ul>
            <li>Diário: R$ 50,00</li>
            <li>Cartão: R$ 1.200,00</li>
            <li>Saídas: R$ 800,00</li>
            <li>Entradas: R$ 5.000,00</li>
            <li>Economias: R$ 1.000,00</li>
          </ul>
        </div>
      </div>
    </div>
  );
};
```

- [ ] **Step 2: Create CategoryDetail Page**

Create `src/pages/CategoryDetail.tsx`:
```tsx
import React from 'react';
import { useParams, useNavigate } from 'react-router-dom';

export const CategoryDetail = () => {
  const { id } = useParams();
  const navigate = useNavigate();
  
  return (
    <div>
      <button onClick={() => navigate('/')} style={{ marginBottom: '1rem' }}>&larr; Voltar</button>
      <h1 style={{ textTransform: 'capitalize' }}>Detalhes: {id}</h1>
      <div style={{ background: 'var(--color-surface)', padding: '1rem', borderRadius: '8px' }}>
        <p>Visualização detalhada para {id} será renderizada aqui.</p>
      </div>
    </div>
  );
};
```

- [ ] **Step 3: Create Balances, Performance, and Daily Calculation Pages**

Create `src/pages/Balances.tsx`:
```tsx
import React from 'react';
export const Balances = () => <div><h1>Saldos</h1><p>Carteira, Bancos...</p></div>;
```

Create `src/pages/Performance.tsx`:
```tsx
import React from 'react';
export const Performance = () => <div><h1>Desempenho</h1><p>Performance, Economizado...</p></div>;
```

Create `src/pages/DailyCalculation.tsx`:
```tsx
import React from 'react';
export const DailyCalculation = () => <div><h1>Cálculo de Diário</h1><p>Previsão de diário...</p></div>;
```

- [ ] **Step 4: Commit**

```bash
git add src/pages/
git commit -m "feat: add root sheet visualization, specific category pages, and other skeletons"
```

### Task 4: Setup Router in App.tsx

**Files:**
- Modify: `src/App.test.tsx`
- Modify: `src/App.tsx`

- [ ] **Step 1: Write/Update App.test.tsx**

Edit `src/App.test.tsx`:
```tsx
import { render, screen } from '@testing-library/react';
import { describe, it, expect } from 'vitest';
import App from './App';

describe('App', () => {
  it('renders the SheetView as the default route', () => {
    render(<App />);
    expect(screen.getByText('Planilha')).toBeInTheDocument();
    expect(screen.getByText('Visão Geral')).toBeInTheDocument();
  });
});
```

- [ ] **Step 2: Run test to verify it fails**

Run: `npm run test`
Expected: Fails because routing is not setup.

- [ ] **Step 3: Setup Router in App.tsx**

Edit `src/App.tsx`:
```tsx
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import { Layout } from './components/Layout/Layout';
import { SheetView } from './pages/SheetView';
import { CategoryDetail } from './pages/CategoryDetail';
import { Balances } from './pages/Balances';
import { Performance } from './pages/Performance';
import { DailyCalculation } from './pages/DailyCalculation';

function App() {
  return (
    <BrowserRouter>
      <Layout>
        <Routes>
          <Route path="/" element={<SheetView />} />
          <Route path="/category/:id" element={<CategoryDetail />} />
          <Route path="/balances" element={<Balances />} />
          <Route path="/performance" element={<Performance />} />
          <Route path="/daily-calculation" element={<DailyCalculation />} />
        </Routes>
      </Layout>
    </BrowserRouter>
  );
}

export default App;
```

- [ ] **Step 4: Verify test passes**

Run: `npm run test`
Expected: PASS.

- [ ] **Step 5: Commit**

```bash
git add src/App.tsx src/App.test.tsx
git commit -m "feat: implement client-side routing in App.tsx"
```
