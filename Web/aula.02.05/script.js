function novoAluno(nome, idade, descricao, aspiracao){
    this.nome = nome;
    this.idade = idade;
    this.descricao = descricao;
    this.aspiracao = aspiracao;
    this.ficha = function(){
        return this.nome + ", "+ this.idade
    }
    this.apresentar = function(){
        return this.descricao + "\n Aspiração: " + this.aspiracao
    }
}

var paragrafos = document.getElementsByTagName("p")
var titulos = document.getElementsByTagName("h1")

let pessoas = [
    new novoAluno("Skrillex", 17, "Sou mega super genial e ovo música!", "A Complexa Existência do Existir"),
    new novoAluno("Ava", 18, "Meu nome se dá pelo Arthur Valezio Alves. Sou molier.", "homens ruivos"),
    new novoAluno("Thaindia", 61, "Estou em dúvidas entre amazona, índia e negra. Me ajude a decidir!", "Espelhos e armas de fogo."),
    new novoAluno("Simões", 16, "Serei tudo, em vários lugares, e talvez ao mesmo tempo.", "Life in a Dreamhouse"), 
]

let index = 0

const button = document.getElementsByTagName("button")
button[0].onclick = function(){
    console.log(paragrafos);
    console.log(titulos);
    for(const paragrafo of paragrafos){
        paragrafo.textContent = pessoas[index].apresentar()
    }
    for(const titulo of titulos){
        titulo.textContent = pessoas[index].ficha()
    }
    index = (index + 1) % 4
}