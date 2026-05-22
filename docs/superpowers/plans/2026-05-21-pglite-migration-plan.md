# PGLite Migration Implementation Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Refactor `src/db/db.ts` to use PGLite with persistence, reactivity, and camelCase mapping.

**Architecture:** Singleton `DB` class wrapping PGLite with `live` extension. Lazy initialization with `schema.sql`.

**Tech Stack:** React 19, TypeScript, @electric-sql/pglite, Vite.

---

### Task 1: Mapping Utilities

**Files:**
- Modify: `src/db/db.ts`

- [ ] **Step 1: Implement snakeToCamel and camelToSnake utilities**

```typescript
const toCamel = (str: string) => str.replace(/([-_][a-z])/g, (group) => group.toUpperCase().replace('-', '').replace('_', ''));
const toSnake = (str: string) => str.replace(/[A-Z]/g, (letter) => `_${letter.toLowerCase()}`);

export function mapKeys<T>(obj: any, mapper: (s: string) => string): T {
  if (Array.isArray(obj)) return obj.map(v => mapKeys(v, mapper)) as any;
  if (obj !== null && typeof obj === 'object' && obj.constructor === Object) {
    return Object.keys(obj).reduce((acc, key) => ({
      ...acc,
      [mapper(key)]: mapKeys(obj[key], mapper)
    }), {}) as T;
  }
  return obj;
}
```

- [ ] **Step 2: Commit utilities**

```bash
git add src/db/db.ts
git commit -m "db: add mapping utilities"
```

### Task 2: PGLite Initialization and Core Methods

**Files:**
- Modify: `src/db/db.ts`
- Modify: `src/db/schema.sql` (if needed, but we read it)

- [ ] **Step 1: Implement DB class and singleton**

```typescript
import { PGlite } from '@electric-sql/pglite';
import { live } from '@electric-sql/pglite/live';
import schemaSql from './schema.sql?raw';

class DB {
  private pg: PGlite | null = null;
  private initPromise: Promise<void> | null = null;

  async init() {
    if (this.initPromise) return this.initPromise;
    this.initPromise = (async () => {
      this.pg = await PGlite.create({
        dataDir: 'idb://sheeting-db',
        extensions: { live }
      });
      await this.pg.exec(schemaSql);
    })();
    return this.initPromise;
  }

  async query<T>(sql: string, params?: any[]): Promise<T[]> {
    await this.init();
    const res = await this.pg!.query(sql, params);
    return mapKeys<T[]>(res.rows, toCamel);
  }

  async exec(sql: string, params?: any[]): Promise<void> {
    await this.init();
    await this.pg!.query(sql, params);
  }

  get instance() { return this.pg; }
}

export const db = new DB();
```

- [ ] **Step 2: Commit core implementation**

```bash
git add src/db/db.ts
git commit -m "db: implement PGLite core"
```

### Task 3: useSQL Hook

**Files:**
- Modify: `src/db/db.ts`

- [ ] **Step 1: Implement useSQL hook**

```typescript
import { useState, useEffect } from 'react';

export function useSQL<T>(query: string, params?: any[]): T[] {
  const [results, setResults] = useState<T[]>([]);

  useEffect(() => {
    let unsub: (() => void) | undefined;
    const paramsStr = JSON.stringify(params);

    (async () => {
      await db.init();
      const ret = await db.instance!.live.query<any>(query, params || [], (res) => {
        setResults(mapKeys<T[]>(res.rows, toCamel));
      });
      unsub = ret.unsubscribe;
    })();

    return () => { if (unsub) unsub(); };
  }, [query, paramsStr]);

  return results;
}
```

- [ ] **Step 2: Commit hook**

```bash
git add src/db/db.ts
git commit -m "db: add useSQL hook"
```

### Task 4: Compatibility Layer (Optional but Recommended)

**Files:**
- Modify: `src/db/db.ts`

- [ ] **Step 1: Add legacy wrappers to db object**

```typescript
// Add these to the DB class or as properties on the db singleton
// Example:
// transactions: {
//   add: (tx: Transaction) => db.exec('INSERT INTO transactions (...) VALUES (...)', ...),
//   toArray: () => db.query<Transaction>('SELECT * FROM transactions'),
// }
```

- [ ] **Step 2: Commit compatibility layer**

### Task 5: Testing and Verification

**Files:**
- Modify: `src/db/db.test.ts`

- [ ] **Step 1: Update tests to use new query/exec API**

- [ ] **Step 2: Run tests**

Run: `npm test src/db/db.test.ts`

- [ ] **Step 3: Final Commit**
