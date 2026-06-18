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
