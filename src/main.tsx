import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'
import App from './App'
import { ThemeProvider } from './context/ThemeContext'

const rootElement = document.getElementById('root');
if (rootElement) {
  console.log('Root element found, rendering App');
  createRoot(rootElement).render(
    <StrictMode>
      <ThemeProvider>
        <App />
      </ThemeProvider>
    </StrictMode>,
  )
} else {
  console.error('FAILED: Root element NOT found in index.html');
}
