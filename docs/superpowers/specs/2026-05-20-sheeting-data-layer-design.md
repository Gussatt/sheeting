# Sheeting Data Layer & Hooks Design Spec

## Goal
Implement the complete local-first database schema and corresponding React hooks for the "Sheeting" application to support Transactions, Tags, Budgets, and Goals.

## Constraints
- **Local-first only:** All data strictly lives in the browser's IndexedDB via `dexie`. No external network requests.
- **Hook Strategy:** Entity-Specific CRUD Hooks using `dexie-react-hooks`.
- **Database Migrations:** Dexie version must be bumped from `1` to `2` to preserve any existing transaction data while adding the new schemas.
- **Testing:** Hooks must be verified via `@testing-library/react` using `renderHook` and our `fake-indexeddb` environment.

## Architecture

### Database Schema (Dexie V2)
The `src/db/db.ts` file will be updated with the following interfaces and Dexie stores:

1. **Tags**
   - Fields: `id` (string), `name` (string), `color` (string)
   - Store Indexes: `id`
2. **Budgets**
   - Fields: `id` (string), `tagId` (string), `limitAmount` (number), `month` (number), `year` (number)
   - Store Indexes: `id, tagId, [month+year]`
3. **Goals**
   - Fields: `id` (string), `name` (string), `targetAmount` (number), `currentAmount` (number), `deadlineDate` (Date), `color` (string)
   - Store Indexes: `id, deadlineDate`
4. **Transactions**
   - Fields: `id`, `amount`, `type` (income|expense), `date`, `tagId`, `isRecurring`, `recurringFrequency`, `description`, `debtId`
   - Store Indexes: `id, type, date, tagId, isRecurring` (unchanged)

### Entity-Specific React Hooks
We will create four distinct hook files in `src/hooks/data/`:

1. **`useTags`**
   - `tags`: Live query of all tags.
   - `addTag`, `updateTag`, `deleteTag`
2. **`useTransactions`**
   - `transactions`: Live query of transactions.
   - `addTransaction`, `updateTransaction`, `deleteTransaction`
3. **`useBudgets`**
   - `budgets`: Live query of budgets.
   - `upsertBudget`, `deleteBudget`
4. **`useGoals`**
   - `goals`: Live query of all goals.
   - `addGoal`, `updateGoal`, `deleteGoal`

### Testing Approach
Each hook will have a `<hookName>.test.tsx` file asserting the hook's ability to mutate the in-memory database and return updated data via `useLiveQuery`.

## Spec Self-Review Checklist
- **Placeholders:** None. The schema definitions are explicitly laid out.
- **Internal Consistency:** The Hook names match the DB schema.
- **Scope:** Sufficiently bound. It covers the data layer, leaving UI concerns to a separate implementation plan.
- **Ambiguity:** `[month+year]` index on Budgets requires a compound index approach in Dexie (e.g., `[month+year]`) to allow efficient lookup of budgets for a specific period.
