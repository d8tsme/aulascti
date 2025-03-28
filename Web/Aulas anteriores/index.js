function calcular(){
    let inp1 = document.getElementById('um').value, inp2 = document.getElementById('dois').value;
    inp1 = parseFloat(inp1);
    inp2 = parseFloat(inp2);
    let op1;
    let operacao = document.getElementById('select').value;
    if (operacao == 1 ) {
        op1 = inp1 + inp2;
    } else if (operacao == 2) {
        op1 = inp1 - inp2;
    } else if (operacao == 3) {
        op1 = inp1 / inp2;
    } else if (operacao == 4) {
        op1 = inp1 * inp2;
    } else if (operacao == 5){
        op1 = inp1**inp2;
    }

    document.getElementById('out').textContent = "Resultado: " + op1;

}

function divisiveis(){
    let inp3 = document.getElementById('tres').value, inp4 = document.getElementById('quatro').value, inp5 = document.getElementById('cinco').value;
    inp3 = parseFloat(inp3);
    inp4 = parseFloat(inp4);
    inp5 = parseFloat(inp5);

    let divis = []

    for(i = inp5; i <= inp4; i++) {
        if (i % inp3 == 0) {
            divis.push(i);
        }
    }
    document.getElementById('out1').textContent = divis.join(', ');
}



