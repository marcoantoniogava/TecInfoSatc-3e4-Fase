import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View } from 'react-native';
import { Gallery, Artist } from './componentes/profile';
import Profile from './componentes/profile';
import Test from './componentes/Test';

export default function App() {
  return (
    <View style={styles.containerApp}>
      <Test/>
      </View>
  );
}

const styles = StyleSheet.create({
  containerApp: {
    flex: 1,
  },
});
