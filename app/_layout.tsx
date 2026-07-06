// app/_layout.tsx
import { Stack } from 'expo-router';
import { ThemeProvider } from '../src/context/ThemeContext';
import { LanguageProvider } from '../src/context/LanguageContext';
import { Platform, UIManager } from 'react-native';
import { SafeAreaProvider } from 'react-native-safe-area-context';

if (Platform.OS === 'android' && UIManager.setLayoutAnimationEnabledExperimental) {
  UIManager.setLayoutAnimationEnabledExperimental(true);
}

export default function RootLayout() {
  return (
    <SafeAreaProvider>
      <LanguageProvider>
        <ThemeProvider>
          <Stack screenOptions={{ headerShown: false }}>
            <Stack.Screen name="(tabs)" />
            <Stack.Screen
              name="transactions"
              options={{
                animation: 'slide_from_left',
              }}
            />
            <Stack.Screen
              name="add"
              options={{
                animation: 'slide_from_bottom',
              }}
            />
            <Stack.Screen
              name="add-budget-category"
              options={{
                animation: 'slide_from_bottom',
              }}
            />
            <Stack.Screen
              name="horizonte"
              options={{
                animation: 'slide_from_right',
              }}
            />
            <Stack.Screen
              name="diario-medio"
              options={{
                animation: 'slide_from_right',
              }}
            />
            <Stack.Screen
              name="daily-calculation"
              options={{
                animation: 'slide_from_right',
              }}
            />
          </Stack>
        </ThemeProvider>
      </LanguageProvider>
    </SafeAreaProvider>
  );
}
