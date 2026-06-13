import { Tabs } from 'expo-router';
import { useAppTheme } from '../../src/styles/theme';

export default function TabLayout() {
  const { colors } = useAppTheme();
  
  return (
    <Tabs screenOptions={{
      headerShown: false,
      tabBarStyle: { backgroundColor: colors.bg, borderTopColor: colors.border },
      tabBarActiveTintColor: colors.textPrimary,
      tabBarInactiveTintColor: colors.textSecondary,
    }}>
      <Tabs.Screen name="index" options={{ title: 'Saldos' }} />
      <Tabs.Screen name="performance" options={{ title: 'Totais' }} />
      <Tabs.Screen name="tags" options={{ title: 'Tags' }} />
      <Tabs.Screen name="menu" options={{ title: 'Menu' }} />
    </Tabs>
  );
}
