# App Configuration & Metadata Implementation Plan

> **For Gemini:** REQUIRED SUB-SKILL: Use superpowers:executing-plans to implement this plan task-by-task.

**Goal:** Configure branding, metadata, and assets for Sheeting app standardizing it in `app.json`.

**Architecture:** Use generated blue app icon as primary icon, splash screen centered image, and web favicon. Set bundle identifier/package to `com.gussatt.sheeting` and slug to `sheeting`.

**Tech Stack:** Expo, Git

---

### Task 1: Setup Asset Files

**Files:**

- Create: `assets/favicon.png`
- Create: `assets/splash.png`

**Step 1: Copy main launcher icon to favicon**

Run: `cp assets/icon.png assets/favicon.png`
Expected: PASS

**Step 2: Copy main launcher icon to splash**

Run: `cp assets/icon.png assets/splash.png`
Expected: PASS

**Step 3: Commit**

```bash
git add assets/favicon.png assets/splash.png
git commit -m "build: generate favicon and splash screen from new icon"
```

### Task 2: Configure `app.json`

**Files:**

- Modify: `app.json`

**Step 1: Update app details**

Replace the contents of `app.json` with the following:

```json
{
  "expo": {
    "name": "Sheeting",
    "slug": "sheeting",
    "version": "1.0.0",
    "orientation": "portrait",
    "icon": "./assets/icon.png",
    "userInterfaceStyle": "dark",
    "splash": {
      "image": "./assets/splash.png",
      "resizeMode": "contain",
      "backgroundColor": "#0078f0"
    },
    "ios": {
      "supportsTablet": true,
      "bundleIdentifier": "com.gussatt.sheeting"
    },
    "android": {
      "package": "com.gussatt.sheeting",
      "adaptiveIcon": {
        "foregroundImage": "./assets/icon.png",
        "backgroundColor": "#0078f0"
      },
      "predictiveBackGestureEnabled": true
    },
    "web": {
      "favicon": "./assets/favicon.png"
    }
  }
}
```

**Step 2: Commit**

```bash
git add app.json
git commit -m "chore: configure app name, slug, bundle identifiers and branding"
```
