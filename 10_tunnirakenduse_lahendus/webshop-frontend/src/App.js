import { Route, Routes } from 'react-router-dom';  // Link  peab olema koos import
import './App.css';
import Navbar from './components/Navbar';
import Add from './pages/Add';
import Cart from './pages/Cart';
import Home from './pages/Home';
import Maintain from './pages/Maintain';
// a ---> div   kõik anchorid divisioniks
// <Link> kõigile ümber

// rohelised suure tähega kõigile import!
function App() {
  return (
    <div className="App">
        <Navbar />
        <Routes>
          {/* localhost:3000/       Home component return sisu */}
          <Route path="" element={ <Home /> } />
           {/* localhost:3000/lisa     Add component return sisu */}
          <Route path="lisa" element={ <Add /> } />
          <Route path="halda" element={ <Maintain /> } />
          <Route path="ostukorv" element={ <Cart /> } />
      </Routes>
    </div>
  );
}

export default App;
