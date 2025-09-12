import Titulo from "./Titulo";
import Input from "./Input";
import Botao from "./Botao";

function App() {
  return (
    <div>
      <Titulo titulo={"Lista de Presença"}/>
      <Input/>
      <Botao nome={"Adicionar"}/>
    </div>
  );
}

export default App;
