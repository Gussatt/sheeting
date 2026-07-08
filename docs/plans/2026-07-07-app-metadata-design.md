# App Configuration & Metadata Design

**Date**: 2026-07-07
**Topic**: App Configuration and Metadata Standard for Sheeting

## Context
Sheeting's app configuration (`app.json`) is currently using default template values (`"temp-expo"`). To prepare the app for standard mobile testing, local builds, and potential distribution, we need to apply consistent branding, configure bundle identifiers/package names, and link the newly generated blue "S" app icon.

## Selected Approach
1. **Naming & Identifiers**: Standardize the app name to `Sheeting`, the slug to `sheeting`, and the bundle/package identifiers to `com.gussatt.sheeting`.
2. **Assets**: Use the newly generated blue app logo (stylized "S" on a blue background with a growth arrow) as the primary app icon.
3. **Android Adaptive & iOS Icons**: Integrate the primary icon with matching adaptive background colors.
4. **Splash Screen**: Set a centered splash screen using the icon on a solid `#0078f0` blue background.

## Configuration Details (`app.json`)

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

## Automation & Setup Steps
- Copy `assets/icon.png` (our generated branding logo) to `assets/favicon.png` and `assets/splash.png`.
- Update `app.json` with the validated metadata configurations.
- Verify the build configuration by checking the configuration file validity.
