function valorFinal(valor){
    if(valor>100) desconto = (valor*0.1)
    if(valor>200) desconto = (valor*0.15)
    if(valor>300) desconto = (valor*0.2)
    if(desconto>100) desconto = 100
    console.log("Valor final: " + (valor-desconto) + "\n Desconto: " + desconto)
}

valorFinal(320)