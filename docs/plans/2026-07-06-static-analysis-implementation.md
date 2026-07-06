# Static Analysis Implementation Plan

> **For Gemini:** REQUIRED SUB-SKILL: Use superpowers:executing-plans to implement this plan task-by-task.

**Goal:** Establish static analysis and formatting using the official Expo baseline with Prettier and Husky.

**Architecture:** Use `eslint-config-expo` paired with Prettier. Integrate via standard NPM scripts and Git hooks to automatically lint and format code before committing.

**Tech Stack:** ESLint, Prettier, Husky, lint-staged

---

### Task 1: Install Dependencies

**Files:**

- Modify: `package.json`

**Step 1: Install tools**

Run: `npm install --save-dev eslint prettier eslint-config-expo eslint-config-prettier eslint-plugin-prettier husky lint-staged`
Expected: PASS

**Step 2: Initialize Husky**

Run: `npx husky init`
Expected: PASS (Creates `.husky/` directory and `.husky/pre-commit` script)

**Step 3: Commit**

```bash
git add package.json package-lock.json .husky/
git commit -m "build: install static analysis dependencies and initialize husky"
```

### Task 2: Configure ESLint and Prettier

**Files:**

- Create: `eslint.config.js`
- Create: `.prettierrc`
- Create: `.eslintignore`
- Create: `.prettierignore`

**Step 1: Write `.prettierrc`**

```json
{
  "singleQuote": true,
  "trailingComma": "all",
  "tabWidth": 2,
  "printWidth": 100
}
```

**Step 2: Write `eslint.config.js`**

```javascript
module.exports = {
  extends: ['expo', 'prettier'],
  plugins: ['prettier'],
  rules: {
    'prettier/prettier': 'error',
  },
};
```

**Step 3: Write Ignore Files**

For `.eslintignore`:

```text
node_modules/
.expo/
dist/
android/
ios/
```

For `.prettierignore`:

```text
node_modules/
.expo/
dist/
android/
ios/
```

**Step 4: Commit**

```bash
git add .prettierrc eslint.config.js .eslintignore .prettierignore
git commit -m "chore: configure eslint and prettier"
```

### Task 3: Setup NPM Scripts and Lint-Staged

**Files:**

- Modify: `package.json`
- Modify: `.husky/pre-commit`

**Step 1: Add NPM scripts to `package.json`**

Update the `scripts` section to include:

```json
"lint": "eslint .",
"lint:fix": "eslint . --fix",
"format": "prettier --write ."
```

Add `lint-staged` configuration to the root of `package.json`:

```json
"lint-staged": {
  "*.{js,jsx,ts,tsx}": [
    "eslint --fix",
    "prettier --write"
  ],
  "*.{json,md}": [
    "prettier --write"
  ]
}
```

**Step 2: Update `.husky/pre-commit`**

Replace the contents with:

```sh
npx lint-staged
```

**Step 3: Verify setup by formatting existing files**

Run: `npm run format`
Expected: PASS (It will format existing files)

**Step 4: Commit**

```bash
git add package.json .husky/pre-commit
# also add all files that were formatted
git add .
git commit -m "chore: add linting scripts and configure lint-staged"
```

### Task 4: Editor Integration

**Files:**

- Create: `.vscode/settings.json`

**Step 1: Create VS Code Settings**

```json
{
  "editor.formatOnSave": true,
  "editor.defaultFormatter": "esbenp.prettier-vscode",
  "editor.codeActionsOnSave": {
    "source.fixAll.eslint": "explicit"
  }
}
```

**Step 2: Commit**

```bash
git add .vscode/settings.json
git commit -m "chore: add vscode formatting settings"
```
