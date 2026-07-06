# Auto-Tagging by Description Keywords

**Date:** 2026-06-17
**Status:** Design approved, ready for implementation planning

## Problem

When a user adds a transaction, they must manually select a tag every time. This is repetitive for recurring descriptions (e.g. "uber", "ifpi mensalidade", "padaria") where the same tag always applies. The app lacks any rule-based auto-assignment.

## Solution

Per-tag keyword lists. The user pre-creates a tag (e.g. "Transporte") and adds keywords to it (e.g. "uber", "99"). When a new transaction is saved with an empty tag field and a description containing a keyword, the matching tag is auto-assigned. Single `tag_id` is preserved (no multi-tag migration). First match wins. Manual selection always overrides auto-assignment.

## Scope

In scope:

- New `tag_keywords` table (relational storage)
- Keyword management UI in `TagEditorModal` (chip add/remove)
- Matching logic in `useTransaction.saveTransaction` (save-time, empty-tag-only)
- Pure helper `src/utils/autoTag.ts` + unit tests
- Minimal Vitest setup (dev dependency + npm script)

Out of scope:

- Multi-tag per transaction (junction table migration)
- Live tag suggestions while typing in `TransactionForm`
- Global rules screen (keywords live on each tag)
- Auto-creating new tags at transaction time

## Data Model

New table added to `SheetingSQLiteDB.init()` in `src/db/expo-sqlite-db.ts`:

```sql
CREATE TABLE IF NOT EXISTS tag_keywords (
  id TEXT PRIMARY KEY,
  tag_id TEXT NOT NULL,
  keyword TEXT NOT NULL,
  FOREIGN KEY (tag_id) REFERENCES tags(id) ON DELETE CASCADE
);
CREATE INDEX IF NOT EXISTS idx_tag_keywords_tag_id ON tag_keywords(tag_id);
CREATE INDEX IF NOT EXISTS idx_tag_keywords_keyword ON tag_keywords(keyword);
```

- **Cascade delete:** when a tag is deleted, its keywords are removed automatically. Requires `PRAGMA foreign_keys = ON;` added to `init()`.
- **Indexes:** `tag_id` for fast lookup of a tag's keywords; `keyword` for fast match queries at save time.
- **`Tag` interface:** add optional `keywords?: string[]` field, populated when loading a tag for editing.
- **No migration needed** for existing data — empty keywords means no auto-tagging, identical to prior behavior.

## Keyword Management UI (TagEditorModal)

Adds a "Palavras-chave" section to `src/components/Forms/TagEditorModal.tsx`, positioned above the existing "Configurações avançadas" section.

### Layout

- Section label "Palavras-chave" with helper text: "A transação recebe esta tag automaticamente quando a descrição contém uma das palavras-chave."
- A `TextInput` (placeholder "Adicionar palavra-chave") with a `+` button (or submit-on-return) to add the typed keyword.
- Below the input: a wrapping `flexWrap` row of chips. Each chip shows the keyword string + an `X` icon. Pressing X removes that keyword.

### State

- New `keywords: string[]` state, initialized from the loaded tag's keywords (empty for new tags).
- `addKeyword(text)`: trims, lowercases, dedupes (skip if already present or empty), appends.
- `removeKeyword(keyword)`: filters out the chip.

### Persistence (in `handleSave`)

- Diff the current `keywords` against the tag's original keywords.
- Delete removed keywords from `tag_keywords` by keyword value for that tag.
- Insert added keywords with new `Crypto.randomUUID()` ids.
- For new tags, insert all keywords after the tag row is created.
- Reuse the existing `dbEvents` reactivity — `useSQL` consumers auto-refresh.

### Chip styling

- `colors.surface` background, `colors.border` border, `colors.textPrimary` text. Matches existing color-grid density.
- X icon uses `colors.textSecondary`.

### Edge cases

- Keywords stored and matched case-insensitively (lowercased on insert, lowercased description on match).
- Empty list is valid — the tag never auto-assigns.

## Matching Logic (useTransaction)

Auto-assignment runs in `useTransaction.saveTransaction` (`src/hooks/useTransaction.ts`), only when `data.tagId` is empty.

### Pure helper: `src/utils/autoTag.ts`

```ts
export interface KeywordEntry {
  tagId: string;
  keyword: string;
}

export function findMatchingTagId(description: string, keywords: KeywordEntry[]): string | null {
  const lower = description.toLowerCase();
  for (const entry of keywords) {
    if (lower.includes(entry.keyword.toLowerCase())) {
      return entry.tagId;
    }
  }
  return null;
}
```

`keywords` is ordered by `tags.name ASC` by the caller, so first match wins deterministically.

### Integration in `useTransaction.saveTransaction`

```ts
if (!data.tagId) {
  const description = (data.description || '').toLowerCase();
  if (description) {
    const keywords = await db.query<{ tagId: string; keyword: string }>(
      `SELECT tag_keywords.tag_id AS tag_id, keyword 
       FROM tag_keywords 
       JOIN tags ON tag_keywords.tag_id = tags.id 
       ORDER BY tags.name ASC`,
    );
    const matchId = findMatchingTagId(description, keywords);
    if (matchId) data.tagId = matchId;
  }
}
```

### Key decisions

- **First match wins:** ordered by `tags.name ASC` for deterministic results. Renaming a tag shifts its priority.
- **Substring, case-insensitive:** "uber" matches "Uber ride" and "UBER".
- **Empty `tagId` only:** respects manual selection. Editing an existing tagged transaction is untouched.
- **Runs at save time:** no debouncing, no live UI jitter.
- **JOIN tags:** guards against orphaned keyword rows if cascade delete ever fails — only matches keywords whose tag still exists.

## Testing & Verification

### Pure helper extraction

The matching algorithm is extracted into `src/utils/autoTag.ts` as a pure function, separating I/O (db query) from logic. This makes it unit-testable without a database.

### Unit tests: `src/utils/autoTag.test.ts`

- Empty description → no match (returns null)
- Empty keywords list → no match
- Exact keyword match → returns tagId
- Case-insensitive match ("UBER" desc, "uber" keyword) → returns tagId
- Substring match ("uber ride" desc, "uber" keyword) → returns tagId
- Multiple tag matches → first by tag name order wins (caller orders the input)
- Tag with no keywords → never matched (absent from input)

### Vitest setup

The AGENTS.md mandates Vitest tests, but no test infrastructure exists in this Expo project. This feature adds the minimal setup:

- `vitest` as a dev dependency
- `"test": "vitest run"` script in `package.json`
- `src/setupTests.ts` already exists (referenced by AGENTS.md)

### Verification gate

- `npm test` passes (new Vitest suite)
- `npx tsc --noEmit` passes (existing project standard)
- Manual: create a tag with a keyword, add a transaction with that keyword in the description, confirm the tag is auto-assigned without manual selection
