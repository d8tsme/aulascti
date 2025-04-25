const Calculadora = {
    somar: function(n1,n2){
        return n1+n2
    },
    subtrair: function(n1,n2){
        return n1-n2
    },
    multiplicar: function(n1,n2){
        return n1*n2
    },
    dividir: function(n1,n2){
        if (n2 == 0){
            console.log("Não é possível dividir por 0!")
        } else {
            return n1/n2
        }
    }
}

Calculadora.dividir(9,3)