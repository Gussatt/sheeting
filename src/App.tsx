import { BrowserRouter, Routes, Route, useLocation } from 'react-router-dom';
import { AnimatePresence, motion } from 'framer-motion';
import { Layout } from './components/Layout/Layout';
import { SheetView } from './pages/SheetView';
import { CategoryDetail } from './pages/CategoryDetail';
import { Balances } from './pages/Balances';
import { Performance } from './pages/Performance';
import { Horizonte } from './pages/Horizonte';
import { DailyCalculation } from './pages/DailyCalculation';
import { AddTransaction } from './pages/AddTransaction';
import { Tags } from './pages/Tags';
import { Menu } from './pages/Menu';

const pageVariants = {
  initial: (pathname: string) => {
    if (pathname === '/add' || pathname.startsWith('/edit')) return { y: '100%' };
    if (pathname === '/performance') return { x: '100%' };
    return { opacity: 0 };
  },
  animate: { opacity: 1, x: 0, y: 0 },
  exit: (pathname: string) => {
    if (pathname === '/add' || pathname.startsWith('/edit')) return { y: '100%' };
    if (pathname === '/performance') return { x: '100%' };
    return { opacity: 0 };
  },
};

const AnimatedRoutes = () => {
  const location = useLocation();

  return (
    <AnimatePresence mode="wait" custom={location.pathname}>
      <Routes location={location} key={location.pathname}>
        <Route 
          path="/" 
          element={
            <motion.div custom={location.pathname} variants={pageVariants} initial="initial" animate="animate" exit="exit" transition={{ duration: 0.3 }}>
              <SheetView />
            </motion.div>
          } 
        />
        <Route 
          path="/category/:id" 
          element={
            <motion.div custom={location.pathname} variants={pageVariants} initial="initial" animate="animate" exit="exit" transition={{ duration: 0.3 }}>
              <CategoryDetail />
            </motion.div>
          } 
        />
        <Route 
          path="/category" 
          element={
            <motion.div custom={location.pathname} variants={pageVariants} initial="initial" animate="animate" exit="exit" transition={{ duration: 0.3 }}>
              <Tags />
            </motion.div>
          } 
        />
        <Route 
          path="/balances" 
          element={
            <motion.div custom={location.pathname} variants={pageVariants} initial="initial" animate="animate" exit="exit" transition={{ duration: 0.3 }}>
              <Balances />
            </motion.div>
          } 
        />
        <Route 
          path="/performance" 
          element={
            <motion.div custom={location.pathname} variants={pageVariants} initial="initial" animate="animate" exit="exit" transition={{ duration: 0.3 }}>
              <Performance />
            </motion.div>
          } 
        />
        <Route 
          path="/horizonte" 
          element={
            <motion.div custom={location.pathname} variants={pageVariants} initial="initial" animate="animate" exit="exit" transition={{ duration: 0.3 }}>
              <Horizonte />
            </motion.div>
          } 
        />
        <Route 
          path="/daily-calculation" 
          element={
            <motion.div custom={location.pathname} variants={pageVariants} initial="initial" animate="animate" exit="exit" transition={{ duration: 0.3 }}>
              <DailyCalculation />
            </motion.div>
          } 
        />
        <Route 
          path="/add" 
          element={
            <motion.div custom={location.pathname} variants={pageVariants} initial="initial" animate="animate" exit="exit" transition={{ type: 'spring', damping: 25, stiffness: 200 }}>
              <AddTransaction />
            </motion.div>
          } 
        />
        <Route 
          path="/edit/:id" 
          element={
            <motion.div custom={location.pathname} variants={pageVariants} initial="initial" animate="animate" exit="exit" transition={{ type: 'spring', damping: 25, stiffness: 200 }}>
              <AddTransaction />
            </motion.div>
          } 
        />
        <Route 
          path="/menu" 
          element={
            <motion.div custom={location.pathname} variants={pageVariants} initial="initial" animate="animate" exit="exit" transition={{ duration: 0.3 }}>
              <Menu />
            </motion.div>
          } 
        />
      </Routes>
    </AnimatePresence>
  );
};

import { ThemeProvider } from './context/ThemeContext';

function App() {
  return (
    <ThemeProvider>
      <BrowserRouter>
        <Layout>
          <AnimatedRoutes />
        </Layout>
      </BrowserRouter>
    </ThemeProvider>
  );
}

export default App;
