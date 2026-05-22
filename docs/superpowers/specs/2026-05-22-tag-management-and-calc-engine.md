# Specification: High-Fidelity Tag Management & Calculation Engine

## 1. Overview
This project introduces a comprehensive Tag Management system and a global refactor of the application's financial calculation logic. It also includes a high-fidelity design overhaul for tag-related UI and a critical fix for theme-consistency issues in the light theme.

## 2. Goals
- **Tag CRUD:** Full ability to create, edit, and delete tags with name and color.
- **Advanced Calculations:** Tags can be toggled to "Ignore" or "Calculate" in five specific app metrics.
- **High-Fidelity UI:** Match the "App do Breno" design for tag shapes (trapezoid) and color selection.
- **Theme Consistency:** Fix hardcoded dark accents in the light theme.

## 3. Data Layer Changes
### 3.1 Database Schema (`tags` table)
Add the following columns (Boolean, default `true`):
- `calc_saldos`: Affects the daily balance running total.
- `calc_performance`: Affects the monthly Performance metric.
- `calc_economizado`: Affects the "Economizado" % metric.
- `calc_custo_vida`: Affects the "Custo de vida" metric.
- `calc_diario_medio`: Affects the "Diário médio" calculation.

### 3.2 Global Calculation Filter
A centralized utility (or hook) will be created to filter transactions.
- **Rule:** A transaction is included in a metric calculation if:
    - It has no tag.
    - OR its associated tag has the corresponding `calc_[metric]` column set to `true`.
- **Scope:** This rule applies globally across **SheetView**, **Performance**, **Horizonte**, and **DailyCalculation**.

## 4. UI/UX Design
### 4.1 Tag trapezoid Icon
- **Implementation:** CSS `clip-path: polygon(0% 0%, 75% 0%, 100% 50%, 75% 100%, 0% 100%)`.
- **Dimensions:** Consistent across LedgerRows and the Tag selection modal.

### 4.2 Tag Editor Modal (Create/Edit)
- **Colors:** A grid of 8 predefined colors:
    - Cinza: #E0E0E0
    - Azul: #D1E9FF
    - Amarelo: #FFF9C4
    - Verde: #B9F6CA
    - Vermelho: #FFCDD2
    - Roxo: #E1BEE7
    - Rosa: #F8BBD0
    - Marrom: #D7CCC8
- **Advanced Settings Section:** A collapsible accordion containing segment toggles (Ignorar / Calcular) for the 5 metrics.
- **Footer:** "Criar" or "Salvar" button + "X de 100 tags disponíveis" counter.

### 4.3 Transaction Form Integration
- **Tag Selection Modal:** Includes a "Plus" button to jump directly to the Tag Editor.
- **Visuals:** Updated tag field in the form to use the trapezoid shape.

## 5. Theme Polish
### 5.1 Weekend Backgrounds
- **Problem:** Weekend rows use dark colors even in light theme.
- **Fix:** Update `src/index.css` to define `--color-weekend-bg`.
    - **Dark:** #1A1A1A
    - **Light:** #F9FAFB
- **Audit:** Remove all hardcoded hex codes (e.g., `#1a1a1a`, `#f4f7fb`) from `.tsx` files, replacing them with CSS variables.

## 6. Test Plan
- **Logic:** Verify that toggling a tag to "Ignore" for a metric instantly updates the totals on the Performance page.
- **CRUD:** Verify that deleting a tag removes its association from all transactions (set to null).
- **Theme:** Visual verification that toggling Light/Dark mode updates the LedgerRow background without artifacts.
- **Persistence:** Verify that the 5 boolean "Advanced" settings are correctly saved to PGLite.
