import { View, Text, StyleSheet } from 'react-native';
import { useAppTheme } from '../../src/styles/theme';

export default function PerformanceScreen() {
  const { colors } = useAppTheme();
  return (
    <View style={[styles.container, { backgroundColor: colors.bg }]}>
      <Text style={{ color: colors.textPrimary }}>Totais (Performance) Placeholder</Text>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
});
