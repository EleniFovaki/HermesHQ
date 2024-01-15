import './App.css';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Login from "./pages/Login";
import Signup from "./pages/Signup";
import Home from "./pages/Home";

// function Home() {
//   return (
//     <div style={{ padding: 20 }}>
//       <h2>Home View</h2>
//       <p>Lorem ipsum dolor sit amet, consectetur adip.</p>
//     </div>
//   );
// }

function App() {
  return (
    <Router>
      <Routes>
        <Route path="/Home" element={<Home />} />
        <Route path="/" index element={<Login />} />
        <Route path="signup" element={<Signup />} />
      </Routes>
    </Router>
  );
}

export default App;
