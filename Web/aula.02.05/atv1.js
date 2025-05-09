function somaArray (){
    let array = document.getElementById("arry").value
    let soma = 0
    for (let index = 0; index < array.length; index++){
        soma = soma + array[index]
    }
    const resp = document.getElementsByTagName("p")
    resp[0].textContent = ("Resultado: " + soma)
}

const button = document.getElementsByName("button")
button[0].onclick = somaArray
