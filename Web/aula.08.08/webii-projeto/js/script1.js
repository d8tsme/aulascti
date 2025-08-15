async function buscaDados() {
            let token = 'eghjhytreh.refgzetryuytdetfu.wesdfshetrgh'
            localStorage.setItem('jwt-token', token)
            const response = await fetch("https://localhost:8080/satelites/listar", {
                method: 'GET',
                headers: {
                        "Authorization":"Bearer " + localStorage.getItem('jwt-token')
                }
            });
            console.log("Antes do JSON");
            console.log(response);
            const dados = await response.json();
            console.log("Depois do JSON");
            console.log(dados);
            
            let table = document.getElementById("tabela");
            for(i = 0; i<= 10; i++){
                table.innerHTML = "<tr>" + "<td>" + dados[i] + "</td>" + "</tr>"
            }
        }

document.getElementById("botao").addEventListener("click", buscaDados())