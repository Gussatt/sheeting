import React, { useState } from 'react';
import { Tabs } from 'expo-router';
import { View, Pressable, StyleSheet } from 'react-native';
import { useAppTheme } from '../../src/styles/theme';
import { TransactionTypeModal } from '../../src/components/Forms/TransactionTypeModal';
import { AppIcon } from '../../src/components/AppIcon';
import { Plus, Menu as MenuIcon } from 'lucide-react-native';

export default function TabLayout() {
  const { colors, isDark } = useAppTheme();
  const [isModalOpen, setIsModalOpen] = useState(false);

  return (
    <>
      <Tabs
        screenOptions={{
          headerShown: false,
          tabBarStyle: {
            backgroundColor: colors.bg,
            borderTopColor: colors.border,
            height: 70,
            paddingBottom: 10,
          },
          tabBarActiveTintColor: colors.textPrimary,
          tabBarInactiveTintColor: colors.textSecondary,
        }}
      >
        <Tabs.Screen
          name="index"
          options={{
            title: 'Saldos',
            tabBarIcon: ({ color }) => <AppIcon name="ledger" size={26} color={color as string} />,
          }}
        />
        <Tabs.Screen
          name="performance"
          options={{
            title: 'Totais',
            tabBarIcon: ({ color }) => (
              <AppIcon name="totais" size={26} color={color as string} forceTheme="light" />
            ),
          }}
        />

        <Tabs.Screen
          name="fab-placeholder"
          options={{
            title: '',
            tabBarButton: () => (
              <View style={styles.fabContainer}>
                <Pressable
                  onPress={() => setIsModalOpen(true)}
                  style={[styles.fab, { backgroundColor: isDark ? '#fff' : '#000' }]}
                >
                  <Plus size={36} color={isDark ? '#000' : '#fff'} />
                </Pressable>
              </View>
            ),
          }}
        />

        <Tabs.Screen
          name="tags"
          options={{
            title: 'Tags',
            tabBarIcon: ({ color }) => (
              <AppIcon name="tags" size={26} color={color as string} forceTheme="light" />
            ),
          }}
        />
        <Tabs.Screen
          name="menu"
          options={{
            title: 'Menu',
            tabBarIcon: ({ color }) => <MenuIcon size={26} color={color as string} />,
          }}
        />
      </Tabs>

      <TransactionTypeModal isOpen={isModalOpen} onClose={() => setIsModalOpen(false)} />
    </>
  );
}

const styles = StyleSheet.create({
  fabContainer: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
    marginTop: -30, // Raise FAB
  },
  fab: {
    width: 60,
    height: 60,
    borderRadius: 30,
    alignItems: 'center',
    justifyContent: 'center',
    shadowColor: '#000',
    shadowOffset: { width: 0, height: 4 },
    shadowOpacity: 0.3,
    shadowRadius: 4,
    elevation: 8,
  },
});
