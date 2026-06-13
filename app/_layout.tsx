// app/_layout.tsx
import { Stack } from 'expo-router';
import { ThemeProvider } from '../src/context/ThemeContext'; // Assuming we adjust this later

export default function RootLayout() {
  return (
    <ThemeProvider>
      <Stack screenOptions={{ headerShown: false }} />
    </ThemeProvider>
  );
}
