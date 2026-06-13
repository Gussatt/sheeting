import React from 'react';
import { View, Text, StyleSheet, Pressable, Image, Alert, ScrollView } from 'react-native';
import { useRouter } from 'expo-router';
import { User, Database, LogOut, ChevronRight, AlertTriangle, Moon, Sun } from 'lucide-react-native';
import { useSQL, db } from '../../src/db/db';
import { useAppTheme } from '../../src/styles/theme';
import { useTheme } from '../../src/context/ThemeContext';

interface SettingItemProps {
  icon: any;
  label: string;
  value?: string;
  onClick?: () => void;
  color?: string;
}

const SettingItem = ({ icon: Icon, label, value, onClick, color }: SettingItemProps) => {
  const { colors, isDark } = useAppTheme();
  return (
    <Pressable 
      onPress={onClick}
      style={{ 
        flexDirection: 'row', 
        justifyContent: 'space-between', 
        alignItems: 'center', 
        paddingVertical: 20, 
        borderBottomWidth: 1, 
        borderBottomColor: colors.border
      }}
    >
      <View style={{ flexDirection: 'row', alignItems: 'center', gap: 16 }}>
        <Icon size={22} color={color || colors.textSecondary} />
        <View style={{ flexDirection: 'column' }}>
          <Text style={{ fontWeight: '500', color: colors.textPrimary }}>{label}</Text>
          {value ? <Text style={{ fontSize: 13, color: colors.textSecondary }}>{value}</Text> : null}
        </View>
      </View>
      <ChevronRight size={18} color={colors.textSecondary} />
    </Pressable>
  );
};

export default function MenuScreen() {
  const router = useRouter();
  const { theme, toggleTheme } = useTheme();
  const { colors, isDark } = useAppTheme();
  
  const config = useSQL<{ key: string, value: string }>('SELECT * FROM config');
  const userName = config.find(c => c.key === 'user_name')?.value || 'Usuário';
  const userPhoto = config.find(c => c.key === 'user_photo')?.value;

  const handleReset = () => {
    Alert.alert(
      'ATENÇÃO',
      'Isso apagará TODAS as suas transações e categorias. Deseja continuar?',
      [
        { text: 'Cancelar', style: 'cancel' },
        { 
          text: 'Apagar', 
          style: 'destructive',
          onPress: async () => {
            await db.exec('DELETE FROM transactions');
            await db.exec('DELETE FROM budget_categories');
            await db.exec('DELETE FROM tags');
            Alert.alert('Sucesso', 'Dados apagados com sucesso.');
            router.replace('/');
          }
        }
      ]
    );
  };

  return (
    <ScrollView style={[styles.container, { backgroundColor: colors.bg }]} contentContainerStyle={{ padding: 16 }}>

      <View style={{ paddingVertical: 24 }}>
        <Text style={[styles.headerTitle, { color: colors.textPrimary }]}>Menu</Text>
      </View>

      <View style={[styles.profileCard, { backgroundColor: colors.surface }]}>
        {userPhoto ? (
          <Image 
            source={{ uri: userPhoto }} 
            style={styles.profileImage} 
          />
        ) : (
          <View style={[styles.profileInitials, { backgroundColor: colors.primary }]}>
            <User color={isDark ? '#000' : '#fff'} size={30} />
          </View>
        )}
        <View style={{ flexDirection: 'column' }}>
          <Text style={{ fontWeight: 'bold', fontSize: 18, color: colors.textPrimary }}>{userName}</Text>
        </View>
      </View>

      <View style={styles.settingsGroup}>
        <Text style={[styles.sectionTitle, { color: colors.textSecondary }]}>Perfil</Text>
        <SettingItem icon={User} label="Editar Perfil" value="Nome, sobrenome, e-mail" />
        
        <Text style={[styles.sectionTitle, { color: colors.textSecondary, marginTop: 32 }]}>Configurações</Text>
        {/* Skipping previsaoDiarioIcon SVG import for now, using standard icon */}
        <SettingItem 
          icon={Database} 
          label="Previsão de diário" 
          onClick={() => router.push('/daily-calculation')}
        />
        <SettingItem 
          icon={isDark ? Moon : Sun} 
          label="Tema" 
          value={isDark ? 'Escuro' : 'Claro'} 
          onClick={toggleTheme}
        />

        <Text style={[styles.sectionTitle, { color: colors.textSecondary, marginTop: 32 }]}>Dados</Text>
        <SettingItem icon={Database} label="Exportar Dados" value="Backup em JSON ou CSV" />
        <SettingItem 
          icon={AlertTriangle} 
          label="Zerar minha conta" 
          value="Apagar todo o histórico" 
          color={colors.red} 
          onClick={handleReset}
        />
      </View>

      <Pressable 
        style={[styles.logoutButton, { borderColor: colors.border }]}
      >
        <LogOut size={20} color={colors.red} />
        <Text style={{ color: colors.red, fontWeight: 'bold', marginLeft: 8 }}>Sair</Text>
      </Pressable>
    </ScrollView>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
  },
  headerTitle: {
    fontSize: 20,
    fontWeight: 'bold',
  },
  profileCard: {
    borderRadius: 16,
    padding: 24,
    flexDirection: 'row',
    alignItems: 'center',
    gap: 16,
    marginBottom: 32,
  },
  profileImage: {
    width: 50,
    height: 50,
    borderRadius: 25,
  },
  profileInitials: {
    width: 50,
    height: 50,
    borderRadius: 25,
    alignItems: 'center',
    justifyContent: 'center',
  },
  settingsGroup: {
    marginBottom: 16,
  },
  sectionTitle: {
    fontSize: 13,
    textTransform: 'uppercase',
    letterSpacing: 1,
    marginBottom: 8,
  },
  logoutButton: {
    width: '100%',
    marginTop: 48,
    marginBottom: 48,
    padding: 16,
    borderRadius: 12,
    borderWidth: 1,
    flexDirection: 'row',
    alignItems: 'center',
    justifyContent: 'center',
  }
});
