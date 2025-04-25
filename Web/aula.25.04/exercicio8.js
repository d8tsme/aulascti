saldo = 1000
opcaof = undefined
while (opcaof != "sair"){
    opcao = prompt("Deseja sacar, depositar, ver saldo ou sair? ", undefined)
    if (opcao == "sacar"){
        valor = prompt("Quanto deseja sacar?", null)
        if (valor > saldo) {
            console.log("Você não tem essa quantia.")
        } else {
            saldo -= valor
        }
    } else if (opcao == "depositar"){
        valor = prompt("Quanto deseja depositar?", null)
        saldo += valor
    } else if (opcao == "ver saldo"){
        console.log("Seu saldo atual é " + saldo)
    } else if(opcao == "sair"){
        console.log("Encerrando sessão...")
        opcaof = opcao
    } else {
        console.log("Operação inválida!")
    }
}
