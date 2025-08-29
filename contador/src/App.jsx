import logo from './logo.svg';
import './App.css';
import { useState } from 'react';


function App() {
  let [counter, setCounter] = useState(0)
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        {
          counter == 0
          ? <p>You have not clicked the button yet :(</p>
          : <p>You clicked {counter} times!</p>
        }
        
        <button onClick={() => setCounter(++counter)}>
          Click Here!
        </button>
      </header>
    </div>
  );
}

export default App;
