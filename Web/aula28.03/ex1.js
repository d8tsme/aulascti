let eprimo = false
let num = 7;
for(let i = 2; i < (num/2) +1; i++){
    if(num % i == 0) {
        eprimo = true;
    }
}

if(!eprimo && num > 1){
    console.log("é primo!")
} else {
    console.log("não é primo!")
}