function atendimento(nome, opcao){
    switch(opcao){
        case 1:
            console.log("Olá %s, você escolheu Falar com Vendas", nome)
            break
        case 2:
            console.log("Olá %s, você escolheu Suporte Técnico", nome)
            break
        case 3:
            console.log("Olá %s, você escolheu Falar com Financeiro", nome)
            break
        default:
            console.log("Opção inválida")
    }
}

atendimento("Julius", 2)