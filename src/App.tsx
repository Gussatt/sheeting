import { BrowserRouter, Routes, Route } from 'react-router-dom';
import { Layout } from './components/Layout/Layout';
import { SheetView } from './pages/SheetView';
import { CategoryDetail } from './pages/CategoryDetail';
import { Balances } from './pages/Balances';
import { Performance } from './pages/Performance';
import { DailyCalculation } from './pages/DailyCalculation';

function App() {
  return (
    <BrowserRouter>
      <Layout>
        <Routes>
          <Route path="/" element={<SheetView />} />
          <Route path="/category/:id" element={<CategoryDetail />} />
          <Route path="/balances" element={<Balances />} />
          <Route path="/performance" element={<Performance />} />
          <Route path="/daily-calculation" element={<DailyCalculation />} />
        </Routes>
      </Layout>
    </BrowserRouter>
  );
}

export default App;
