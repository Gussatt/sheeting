import React, { useState } from 'react';
import { Tabs } from 'expo-router';
import { View, Pressable, StyleSheet } from 'react-native';
import { Image } from 'expo-image';
import { useAppTheme } from '../../src/styles/theme';
import { TransactionTypeModal } from '../../src/components/Forms/TransactionTypeModal';

const ledgerIcon = require('../../src/assets/icons/ledger.svg');
const totaisIcon = require('../../src/assets/icons/totais.svg');
const totaisNightIcon = require('../../src/assets/icons/totais_night.svg');
const tagsIcon = require('../../src/assets/icons/tags.svg');
const tagsNightIcon = require('../../src/assets/icons/tags_night.svg');
const navegacaoIcon = require('../../src/assets/icons/navegacao.svg');
const navegacaoNightIcon = require('../../src/assets/icons/navegacao_night.svg');
const adicaoIcon = require('../../src/assets/icons/adicao.svg');
const adicaoNightIcon = require('../../src/assets/icons/adicao_night.svg');

export default function TabLayout() {
  const { colors, isDark } = useAppTheme();
  const [isModalOpen, setIsModalOpen] = useState(false);
  
  return (
    <>
      <Tabs screenOptions={{
        headerShown: false,
        tabBarStyle: { 
          backgroundColor: colors.bg, 
          borderTopColor: colors.border,
          height: 70,
          paddingBottom: 10
        },
        tabBarActiveTintColor: colors.textPrimary,
        tabBarInactiveTintColor: colors.textSecondary,
      }}>
        <Tabs.Screen 
          name="index" 
          options={{ 
            title: 'Saldos',
            tabBarIcon: ({ color, size }) => (
              <Image source={ledgerIcon} style={{ width: size, height: size }} tintColor={color as string} contentFit="contain" />
            )
          }} 
        />
        <Tabs.Screen 
          name="performance" 
          options={{ 
            title: 'Totais',
            tabBarIcon: ({ color, size }) => (
              <Image source={isDark ? totaisNightIcon : totaisIcon} style={{ width: size, height: size }} contentFit="contain" />
            )
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
                  <Image source={isDark ? adicaoNightIcon : adicaoIcon} style={{ width: 32, height: 32 }} contentFit="contain" />
                </Pressable>
              </View>
            )
          }} 
        />

        <Tabs.Screen 
          name="tags" 
          options={{ 
            title: 'Tags',
            tabBarIcon: ({ color, size }) => (
              <Image source={isDark ? tagsNightIcon : tagsIcon} style={{ width: size, height: size }} contentFit="contain" />
            )
          }} 
        />
        <Tabs.Screen 
          name="menu" 
          options={{ 
            title: 'Menu',
            tabBarIcon: ({ color, size }) => (
              <Image source={isDark ? navegacaoNightIcon : navegacaoIcon} style={{ width: size, height: size }} contentFit="contain" />
            )
          }} 
        />
      </Tabs>

      <TransactionTypeModal 
        isOpen={isModalOpen} 
        onClose={() => setIsModalOpen(false)} 
      />
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
  }
});
