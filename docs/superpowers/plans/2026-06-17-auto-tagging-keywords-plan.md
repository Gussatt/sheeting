# Auto-Tagging by Description Keywords Implementation Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Auto-assign an existing tag to a new transaction when its description contains a keyword from that tag's keyword list.

**Architecture:** New `tag_keywords` table stores per-tag keywords. `TagEditorModal` manages chips (add/remove). A pure helper `findMatchingTagId` does substring matching. `useTransaction.saveTransaction` calls it at save time, only when `tagId` is empty.

**Tech Stack:** Expo SDK 56, React Native 0.85, expo-sqlite, TypeScript 6 strict, Vitest (to be added)

## Global Constraints

- **TypeScript strict mode** — `npx tsc --noEmit` must pass after every task.
- **SQLite parameter style** — `db.query`/`db.exec` accept `?` placeholders (the `convertSql` helper rewrites `$N` to `?`, but new code should use `?` directly for clarity).
- **Boolean storage** — SQLite stores booleans as INTEGER 0/1; the `mapKeys` path converts known fields. New boolean columns need explicit mapping in `query` if surfaced to UI.
- **DB reactivity** — `db.exec` triggers `dbEvents.next()`, which re-runs all `useSQL` hooks. No manual refresh needed after writes.
- **No comments in code** unless explicitly requested by the user (per opencode conventions).
- **Portuguese UI strings** — labels and helper text in pt-BR (matches existing app).
- **`expo-crypto`** — use `Crypto.randomUUID()` for new ids (already used in `TagEditorModal`).
- **Existing test deps** — `@testing-library/jest-dom`, `@testing-library/dom`, `@testing-library/user-event` are installed; `vitest` is NOT installed and must be added.

**Spec reference:** `docs/superpowers/specs/2026-06-17-auto-tagging-keywords-design.md`

---

## File Structure

| Action | Path | Responsibility |
|--------|------|----------------|
| Create | `src/utils/autoTag.ts` | Pure matching function + `KeywordEntry` interface |
| Create | `src/utils/autoTag.test.ts` | Unit tests for the pure matching function |
| Modify | `src/db/expo-sqlite-db.ts` | Add `tag_keywords` table, `PRAGMA foreign_keys`, `keywords?` field on `Tag` |
| Modify | `src/components/Forms/TagEditorModal.tsx` | Add "Palavras-chave" section with chip add/remove UI + persistence |
| Modify | `src/hooks/useTransaction.ts` | Call `findMatchingTagId` at save time when `tagId` is empty |
| Modify | `package.json` | Add `vitest` dev dependency, `"test"` script |

---

### Task 1: Add Vitest infrastructure

**Files:**
- Modify: `package.json` (scripts + devDependencies)
- Test: `src/utils/autoTag.test.ts` (smoke test to prove vitest runs)

**Interfaces:**
- Produces: `npm test` command that runs `vitest run` over the repo

- [ ] **Step 1: Install vitest as a dev dependency**

Run:
```bash
npm install --save-dev vitest
```

Expected: `vitest` added to `devDependencies` in `package.json`, `node_modules/vitest` exists.

- [ ] **Step 2: Add the test script to package.json**

Modify `package.json` `scripts` block to add the `test` key. The full scripts block becomes:

```json
"scripts": {
  "start": "expo start",
  "android": "expo start --android",
  "ios": "expo start --ios",
  "web": "expo start --web",
  "test": "vitest run"
}
```

- [ ] **Step 3: Write a smoke test to prove vitest runs**

Create `src/utils/autoTag.test.ts` with a placeholder test (the real tests come in Task 3):

```ts
import { describe, it, expect } from 'vitest';

describe('vitest smoke test', () => {
  it('runs', () => {
    expect(1 + 1).toBe(2);
  });
});
```

- [ ] **Step 4: Run the test to verify vitest works**

Run: `npm test`
Expected: PASS, 1 test. Output includes `Test Files 1 passed (1)`.

If `@testing-library/jest-dom/vitest` import in `src/setupTests.ts` causes errors, create `vitest.config.ts` at the repo root with:

```ts
import { defineConfig } from 'vitest/config';

export default defineConfig({
  test: {
    setupFiles: ['./src/setupTests.ts'],
  },
});
```

Only add `vitest.config.ts` if the smoke test fails without it.

- [ ] **Step 5: Typecheck**

Run: `npx tsc --noEmit`
Expected: exit 0, no errors.

- [ ] **Step 6: Commit**

```bash
git add package.json package-lock.json src/utils/autoTag.test.ts vitest.config.ts
git commit -m "chore: add vitest test infrastructure and smoke test"
```

(Only add `vitest.config.ts` to the commit if you created it in Step 4.)

---

### Task 2: Add `tag_keywords` table and extend `Tag` interface

**Files:**
- Modify: `src/db/expo-sqlite-db.ts:76-118` (schema block inside `init()`), `src/db/expo-sqlite-db.ts:26-36` (`Tag` interface)

**Interfaces:**
- Produces: `Tag.keywords?: string[]` field on the `Tag` interface; `tag_keywords` table available for queries by later tasks.

- [ ] **Step 1: Add `keywords` field to the `Tag` interface**

Modify the `Tag` interface in `src/db/expo-sqlite-db.ts` (lines 26-36). Add `keywords?: string[];` as the last field:

```ts
export interface Tag {
  id: string;
  userId: string;
  name: string;
  color: string;
  calcSaldos: boolean;
  calcPerformance: boolean;
  calcEconomizado: boolean;
  calcCustoVida: boolean;
  calcDiarioMedio: boolean;
  keywords?: string[];
}
```

- [ ] **Step 2: Add `PRAGMA foreign_keys = ON;` and the `tag_keywords` table to the schema**

In `src/db/expo-sqlite-db.ts`, inside the `init()` method's `this.db.execAsync(\`...\`)` template string (lines 76-118), add `PRAGMA foreign_keys = ON;` after `PRAGMA journal_mode = WAL;` and append the new table + indexes after the `daily_status` table. The full schema block becomes:

```sql
PRAGMA journal_mode = WAL;
PRAGMA foreign_keys = ON;

CREATE TABLE IF NOT EXISTS transactions (
  id TEXT PRIMARY KEY,
  amount REAL NOT NULL,
  type TEXT NOT NULL,
  date TEXT NOT NULL,
  description TEXT,
  tag_id TEXT,
  is_recurring INTEGER DEFAULT 0,
  recurring_frequency TEXT,
  recurring_indefinite INTEGER DEFAULT 1,
  recurring_count INTEGER
);

CREATE TABLE IF NOT EXISTS budget_categories (
  id TEXT PRIMARY KEY,
  name TEXT NOT NULL,
  monthly_amount REAL NOT NULL
);

CREATE TABLE IF NOT EXISTS tags (
  id TEXT PRIMARY KEY,
  name TEXT NOT NULL,
  color TEXT,
  calc_saldos INTEGER DEFAULT 1,
  calc_performance INTEGER DEFAULT 1,
  calc_economizado INTEGER DEFAULT 1,
  calc_custo_vida INTEGER DEFAULT 1,
  calc_diario_medio INTEGER DEFAULT 1
);

CREATE TABLE IF NOT EXISTS config (
  key TEXT PRIMARY KEY,
  value TEXT
);

CREATE TABLE IF NOT EXISTS daily_status (
  date TEXT PRIMARY KEY,
  is_checked INTEGER DEFAULT 0
);

CREATE TABLE IF NOT EXISTS tag_keywords (
  id TEXT PRIMARY KEY,
  tag_id TEXT NOT NULL,
  keyword TEXT NOT NULL,
  FOREIGN KEY (tag_id) REFERENCES tags(id) ON DELETE CASCADE
);

CREATE INDEX IF NOT EXISTS idx_tag_keywords_tag_id ON tag_keywords(tag_id);
CREATE INDEX IF NOT EXISTS idx_tag_keywords_keyword ON tag_keywords(keyword);
```

- [ ] **Step 3: Typecheck**

Run: `npx tsc --noEmit`
Expected: exit 0, no errors.

- [ ] **Step 4: Run existing tests**

Run: `npm test`
Expected: smoke test still passes (1 test).

- [ ] **Step 5: Commit**

```bash
git add src/db/expo-sqlite-db.ts
git commit -m "feat: add tag_keywords table and keywords field on Tag interface"
```

---

### Task 3: Implement and test the pure matching helper

**Files:**
- Create: `src/utils/autoTag.ts`
- Modify: `src/utils/autoTag.test.ts` (replace smoke test with real tests)

**Interfaces:**
- Produces: `KeywordEntry` interface, `findMatchingTagId(description: string, keywords: KeywordEntry[]): string | null`
- Consumes: nothing (pure function)

- [ ] **Step 1: Write the failing tests**

Replace the contents of `src/utils/autoTag.test.ts` with:

```ts
import { describe, it, expect } from 'vitest';
import { findMatchingTagId, type KeywordEntry } from './autoTag';

describe('findMatchingTagId', () => {
  it('returns null when description is empty', () => {
    expect(findMatchingTagId('', [{ tagId: 't1', keyword: 'uber' }])).toBeNull();
  });

  it('returns null when keywords list is empty', () => {
    expect(findMatchingTagId('uber ride', [])).toBeNull();
  });

  it('returns the tagId on exact match', () => {
    const keywords: KeywordEntry[] = [{ tagId: 't1', keyword: 'uber' }];
    expect(findMatchingTagId('uber', keywords)).toBe('t1');
  });

  it('matches case-insensitively (desc upper, keyword lower)', () => {
    const keywords: KeywordEntry[] = [{ tagId: 't1', keyword: 'uber' }];
    expect(findMatchingTagId('UBER', keywords)).toBe('t1');
  });

  it('matches case-insensitively (desc lower, keyword upper)', () => {
    const keywords: KeywordEntry[] = [{ tagId: 't1', keyword: 'UBER' }];
    expect(findMatchingTagId('uber', keywords)).toBe('t1');
  });

  it('matches as substring', () => {
    const keywords: KeywordEntry[] = [{ tagId: 't1', keyword: 'uber' }];
    expect(findMatchingTagId('uber ride home', keywords)).toBe('t1');
  });

  it('returns the first matching tag when multiple tags match', () => {
    const keywords: KeywordEntry[] = [
      { tagId: 't-alpha', keyword: 'alpha' },
      { tagId: 't-beta', keyword: 'beta' },
    ];
    const desc = 'alpha and beta both appear';
    expect(findMatchingTagId(desc, keywords)).toBe('t-alpha');
  });

  it('returns null when no keyword matches', () => {
    const keywords: KeywordEntry[] = [{ tagId: 't1', keyword: 'uber' }];
    expect(findMatchingTagId('padaria', keywords)).toBeNull();
  });

  it('skips keywords whose tag is absent from the input', () => {
    const keywords: KeywordEntry[] = [
      { tagId: 't2', keyword: 'metro' },
      { tagId: 't1', keyword: 'uber' },
    ];
    expect(findMatchingTagId('bus ticket', keywords)).toBeNull();
  });
});
```

- [ ] **Step 2: Run the tests to verify they fail**

Run: `npm test`
Expected: FAIL with error resolving `./autoTag` (module not found).

- [ ] **Step 3: Implement the pure helper**

Create `src/utils/autoTag.ts`:

```ts
export interface KeywordEntry {
  tagId: string;
  keyword: string;
}

export function findMatchingTagId(
  description: string,
  keywords: KeywordEntry[]
): string | null {
  const lower = description.toLowerCase();
  for (const entry of keywords) {
    if (lower.includes(entry.keyword.toLowerCase())) {
      return entry.tagId;
    }
  }
  return null;
}
```

- [ ] **Step 4: Run the tests to verify they pass**

Run: `npm test`
Expected: PASS, all 9 tests.

- [ ] **Step 5: Typecheck**

Run: `npx tsc --noEmit`
Expected: exit 0.

- [ ] **Step 6: Commit**

```bash
git add src/utils/autoTag.ts src/utils/autoTag.test.ts
git commit -m "feat: add pure findMatchingTagId helper with unit tests"
```

---

### Task 4: Wire auto-tagging into `useTransaction.saveTransaction`

**Files:**
- Modify: `src/hooks/useTransaction.ts:1-4` (imports), `src/hooks/useTransaction.ts:52-91` (`saveTransaction` body)

**Interfaces:**
- Consumes: `findMatchingTagId` from `src/utils/autoTag.ts`, `db.query` from `../db/db`
- Produces: `saveTransaction` now auto-assigns `tagId` when empty and a keyword matches

- [ ] **Step 1: Add the import**

At the top of `src/hooks/useTransaction.ts`, after the existing `import type { Transaction } from '../db/db';` line, add:

```ts
import { findMatchingTagId } from '../utils/autoTag';
```

- [ ] **Step 2: Insert the auto-assignment block at the start of `saveTransaction`**

In `src/hooks/useTransaction.ts`, the `saveTransaction` function currently begins:

```ts
const saveTransaction = async (data: Partial<Transaction>) => {
  if (!data.type) return;

  const amount = Number(data.amount) || 0;
```

Replace with:

```ts
const saveTransaction = async (data: Partial<Transaction>) => {
  if (!data.type) return;

  if (!data.tagId) {
    const description = (data.description || '').toLowerCase();
    if (description) {
      const keywords = await db.query<{ tagId: string; keyword: string }>(
        `SELECT tag_keywords.tag_id AS tag_id, keyword
         FROM tag_keywords
         JOIN tags ON tag_keywords.tag_id = tags.id
         ORDER BY tags.name ASC`
      );
      const matchId = findMatchingTagId(description, keywords);
      if (matchId) data.tagId = matchId;
    }
  }

  const amount = Number(data.amount) || 0;
```

Leave the rest of `saveTransaction` (date handling, params, INSERT/UPDATE) unchanged.

- [ ] **Step 3: Run existing tests**

Run: `npm test`
Expected: PASS, all 9 tests (autoTag suite unaffected by hook change).

- [ ] **Step 4: Typecheck**

Run: `npx tsc --noEmit`
Expected: exit 0.

- [ ] **Step 5: Commit**

```bash
git add src/hooks/useTransaction.ts
git commit -m "feat: auto-assign tag in useTransaction when tagId is empty"
```

---

### Task 5: Add keyword chips UI to `TagEditorModal`

**Files:**
- Modify: `src/components/Forms/TagEditorModal.tsx:1-7` (imports), `:62-115` (component state + `handleSave`), `:144-248` (JSX), `:250-386` (styles)

**Interfaces:**
- Consumes: `db.query`/`db.exec` from `../../db/db`, `Crypto.randomUUID` from `expo-crypto`, `X` icon from `lucide-react-native` (already imported)
- Produces: a "Palavras-chave" section in the tag editor that persists keyword rows to `tag_keywords`

- [ ] **Step 1: Add `keywords` state and load existing keywords**

In `src/components/Forms/TagEditorModal.tsx`, add a `keywords` state alongside the existing state declarations (after `calcDiarioMedio`, around line 72):

```ts
const [keywords, setKeywords] = useState<string[]>([]);
```

Extend the existing `useEffect` that loads tag data on open (lines 74-85) to also fetch keywords. Replace the existing effect with:

```ts
useEffect(() => {
  if (isOpen) {
    setName(tag?.name || '');
    setSelectedColor(tag?.color || TAG_COLORS[0].color);
    setIsAdvancedOpen(false);
    setCalcSaldos(tag?.calcSaldos ?? true);
    setCalcPerformance(tag?.calcPerformance ?? true);
    setCalcEconomizado(tag?.calcEconomizado ?? true);
    setCalcCustoVida(tag?.calcCustoVida ?? true);
    setCalcDiarioMedio(tag?.calcDiarioMedio ?? true);
    setKeywords([]);
    if (tag) {
      db.query<{ keyword: string }>(
        'SELECT keyword FROM tag_keywords WHERE tag_id = ?',
        [tag.id]
      ).then(rows => setKeywords(rows.map(r => r.keyword)));
    }
  }
}, [isOpen, tag]);
```

- [ ] **Step 2: Add `addKeyword` and `removeKeyword` handlers**

Add these functions after the `useEffect` (before `if (!isOpen) return null;`):

```ts
const addKeyword = (text: string) => {
  const trimmed = text.trim().toLowerCase();
  if (!trimmed || keywords.includes(trimmed)) return;
  setKeywords(prev => [...prev, trimmed]);
};

const removeKeyword = (keyword: string) => {
  setKeywords(prev => prev.filter(k => k !== keyword));
};
```

Also add a state for the input value, next to the `keywords` state:

```ts
const [keywordInput, setKeywordInput] = useState('');
```

- [ ] **Step 3: Persist keywords in `handleSave`**

In `src/components/Forms/TagEditorModal.tsx`, the `handleSave` function (lines 89-115) currently builds the INSERT/UPDATE for the tag row and calls `onSave(); onClose();`. Replace it with a version that also syncs keywords. The new `handleSave`:

```ts
const handleSave = async () => {
  if (!name) return;

  try {
    let tagId = tag?.id;
    if (tag) {
      await db.exec(
        `UPDATE tags SET name = ?, color = ?, calc_saldos = ?, calc_performance = ?,
                calc_economizado = ?, calc_custo_vida = ?, calc_diario_medio = ?
         WHERE id = ?`,
        [name, selectedColor, calcSaldos, calcPerformance, calcEconomizado, calcCustoVida, calcDiarioMedio, tag.id]
      );
    } else {
      tagId = Crypto.randomUUID();
      await db.exec(
        `INSERT INTO tags (id, name, color, calc_saldos, calc_performance, calc_economizado,
                         calc_custo_vida, calc_diario_medio)
         VALUES (?, ?, ?, ?, ?, ?, ?, ?)`,
        [tagId, name, selectedColor, calcSaldos, calcPerformance, calcEconomizado, calcCustoVida, calcDiarioMedio]
      );
    }

    const existing = await db.query<{ keyword: string }>(
      'SELECT keyword FROM tag_keywords WHERE tag_id = ?',
      [tagId!]
    );
    const existingKeywords = existing.map(r => r.keyword);
    const toDelete = existingKeywords.filter(k => !keywords.includes(k));
    const toAdd = keywords.filter(k => !existingKeywords.includes(k));

    for (const kw of toDelete) {
      await db.exec('DELETE FROM tag_keywords WHERE tag_id = ? AND keyword = ?', [tagId!, kw]);
    }
    for (const kw of toAdd) {
      await db.exec(
        'INSERT INTO tag_keywords (id, tag_id, keyword) VALUES (?, ?, ?)',
        [Crypto.randomUUID(), tagId!, kw]
      );
    }

    onSave();
    onClose();
  } catch (error) {
    console.error('Failed to save tag:', error);
    Alert.alert('Erro', 'Erro ao salvar tag.');
  }
};
```

- [ ] **Step 4: Add the "Palavras-chave" section JSX**

In the JSX, insert the new section after the color-grid `View` (which ends around line 185) and before the "Configurações avançadas" section (the `advancedSection` View starting around line 187). Insert:

```tsx
<View style={styles.section}>
  <Text style={[styles.labelBold, { color: colors.textPrimary }]}>Palavras-chave</Text>
  <Text style={[styles.label, { color: colors.textSecondary, marginBottom: 12 }]}>
    A transação recebe esta tag automaticamente quando a descrição contém uma das palavras-chave.
  </Text>
  <View style={styles.keywordInputRow}>
    <TextInput
      value={keywordInput}
      onChangeText={setKeywordInput}
      placeholder="Adicionar palavra-chave"
      placeholderTextColor={colors.textSecondary}
      style={[styles.input, { color: colors.textPrimary, borderBottomColor: colors.border, flex: 1 }]}
      onSubmitEditing={() => { addKeyword(keywordInput); setKeywordInput(''); }}
    />
    <Pressable
      onPress={() => { addKeyword(keywordInput); setKeywordInput(''); }}
      style={[styles.addKeywordBtn, { borderColor: colors.border }]}
    >
      <Text style={[styles.addKeywordText, { color: colors.textPrimary }]}>+</Text>
    </Pressable>
  </View>
  {keywords.length > 0 && (
    <View style={styles.chipsRow}>
      {keywords.map(kw => (
        <View key={kw} style={[styles.chip, { backgroundColor: colors.surface, borderColor: colors.border }]}>
          <Text style={[styles.chipText, { color: colors.textPrimary }]}>{kw}</Text>
          <Pressable onPress={() => removeKeyword(kw)} style={styles.chipX}>
            <X size={14} color={colors.textSecondary} />
          </Pressable>
        </View>
      ))}
    </View>
  )}
</View>
```

- [ ] **Step 5: Add the matching styles**

In the `StyleSheet.create` block at the bottom of `src/components/Forms/TagEditorModal.tsx`, add these styles (anywhere inside the object, e.g. after the `input` style):

```ts
keywordInputRow: {
  flexDirection: 'row',
  alignItems: 'center',
  gap: 8,
},
addKeywordBtn: {
  width: 40,
  height: 40,
  borderRadius: 20,
  alignItems: 'center',
  justifyContent: 'center',
  borderWidth: 1,
},
addKeywordText: {
  fontSize: 24,
  fontWeight: '300',
},
chipsRow: {
  flexDirection: 'row',
  flexWrap: 'wrap',
  gap: 8,
  marginTop: 16,
},
chip: {
  flexDirection: 'row',
  alignItems: 'center',
  gap: 6,
  paddingVertical: 6,
  paddingHorizontal: 12,
  borderRadius: 16,
  borderWidth: 1,
},
chipText: {
  fontSize: 14,
  fontWeight: '500',
},
chipX: {
  padding: 2,
},
```

(The `addKeywordBtn` border color is applied inline via `[styles.addKeywordBtn, { borderColor: colors.border }]` in the JSX so it respects the theme.)

- [ ] **Step 6: Run existing tests**

Run: `npm test`
Expected: PASS, all 9 autoTag tests (TagEditorModal is not unit-tested; this is a manual-verification component).

- [ ] **Step 7: Typecheck**

Run: `npx tsc --noEmit`
Expected: exit 0.

- [ ] **Step 8: Commit**

```bash
git add src/components/Forms/TagEditorModal.tsx
git commit -m "feat: add keyword chips UI and persistence to TagEditorModal"
```

---

### Task 6: Final verification and manual test notes

**Files:** none modified

- [ ] **Step 1: Run the full test suite**

Run: `npm test`
Expected: all tests pass (9 autoTag tests + smoke test removed in Task 3 replacement).

- [ ] **Step 2: Typecheck**

Run: `npx tsc --noEmit`
Expected: exit 0.

- [ ] **Step 3: Manual verification checklist (for the human)**

On a device or simulator:
1. Create a tag named "Transporte" with color blue. Add keyword "uber". Save.
2. Reopen "Transporte" — confirm "uber" chip appears.
3. Add another keyword "99". Save. Reopen — both chips present.
4. Remove "uber" via the X icon. Save. Reopen — only "99" remains.
5. Add a new transaction with description "uber ride" and do NOT pick a tag. Save.
6. Open the transaction — it should have the "Transporte" tag auto-assigned.
7. Add a transaction with description "uber ride" and manually pick a different tag. Save. The manual tag should win, not "Transporte".
8. Add a transaction with description "padaria" and no tag. Save. It should remain untagged.
9. Delete the "Transporte" tag. Confirm `tag_keywords` rows for that tag are gone (cascade delete).

- [ ] **Step 4: Commit final state if any cleanup needed**

If all verification passes, no commit needed. If cleanup was made, commit with:

```bash
git add -A
git commit -m "chore: final cleanup after auto-tagging verification"
```
