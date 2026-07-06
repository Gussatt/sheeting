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
