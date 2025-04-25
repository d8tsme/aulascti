function Produto(nome, preco, emEstoque) {
    this.nome = nome
    this.preco = preco
    this.emEstoque = emEstoque 
    this.mostrarDescricao = function(){
        if(this.emEstoque) console.log("O produto %s custa R$%d e está disponível para compra.", nome, preco)
        else console.log("O produto %s custa R$%d e não está disponível para compra.", nome, preco)
    }
    

}

let camisa = new Produto("Camisa", 90.00, true)
camisa.mostrarDescricao()