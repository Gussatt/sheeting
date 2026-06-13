import React from 'react';
import { View, Text } from 'react-native';

export const StatusDots = () => {
  return (
    <View style={{ flexDirection: 'row', gap: 2 }}>
      <View style={{ width: 4, height: 4, borderRadius: 2, backgroundColor: '#888' }} />
      <View style={{ width: 4, height: 4, borderRadius: 2, backgroundColor: '#888' }} />
      <View style={{ width: 4, height: 4, borderRadius: 2, backgroundColor: '#888' }} />
    </View>
  );
};
