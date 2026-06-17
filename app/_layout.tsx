// app/_layout.tsx
import { Stack } from 'expo-router';
import { ThemeProvider } from '../src/context/ThemeContext'; // Assuming we adjust this later
import { Platform, UIManager } from 'react-native';
import { SafeAreaProvider } from 'react-native-safe-area-context';

if (Platform.OS === 'android' && UIManager.setLayoutAnimationEnabledExperimental) {
  UIManager.setLayoutAnimationEnabledExperimental(true);
}

export default function RootLayout() {
  return (
    <SafeAreaProvider>
      <ThemeProvider>
        <Stack screenOptions={{ headerShown: false }} />
      </ThemeProvider>
    </SafeAreaProvider>
  );
}
