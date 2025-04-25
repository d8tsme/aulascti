let personagem = {
    nome: "Eleven",
    idade: 14,
    habilidade: "Telecinese",
    status: "Ativa no Mundo Invertido",
    sobre: function(){
        console.log("%s tem %d anos, possui a habilidade de %s e está %s.",this.nome,this.idade,this.habilidade,this.status)
    }
}

personagem.sobre()
personagem.status = "De volta ao mundo Invertido"
personagem.sobre()