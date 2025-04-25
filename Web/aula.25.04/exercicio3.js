function mediaAritimetica(n1,n2,n3){
    media = (n1+n2+n3)/3
    console.log("A média entre %d, %d e %d é %d",n1,n2,n3,media)
    if(media >= 6) console.log("Aprovado")
        else console.log("Reprovado")
}

mediaAritimetica(4,8,6)