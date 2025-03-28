function calc(n1,n2,op){
    if (op==1){
        console.log(n1+n2);
    } else if (op==2) {
        console.log(n1-n2);
    } else if (op==3) {
        console.log(n1/n2);
    } else if (op==4) {
        console.log(n1*n2);
    } else if (op==5) {
        console.log(n1**(1/n2));
    } else if (op==6) {
        console.log(n1**n2);
    } else {
        console.log("Operação inválida!")
    }
}

calc(16,3,6);