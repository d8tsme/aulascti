//calcular imc

function calcIMC(peso, altura){
    return (peso/altura**2)
}
imc = calcIMC(92, 1.86);
console.log(imc)
if (imc < 18.5) console.log("Abaixo do peso");
else if (imc >= 18.5 && imc < 25) console.log("Peso normal");
else if (imc >= 25 && imc < 30) console.log("Sobrepeso");
else if (imc >= 30 && imc < 40) console.log("Obesidade");
else console.log("Obesidade Grave");
