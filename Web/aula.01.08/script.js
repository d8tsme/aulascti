let nome = document.getElementById('nome').value;
let dataNasc = new Date(document.getElementById('dataNasc').value);
let agora = new Date()

let proximoAniversario = new Date(agora.getFullYear(), dataNasc.getFullYear())    
let botao = document.getElementById('salvar')
botao = addEventListener('click', alertClique())

function alertClique(){
    event.preventDefault()
    alert("Olá `$name`,")
}
