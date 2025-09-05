const token = localStorage.getItem('token');
if (!token) {
    window.location.href = "login/login.html";
}

function inserirPessoas() {
    const nome = document.getElementById('nome').value;
    const cpf = document.getElementById('cpf').value;

    fetch("http://localhost:8080/pessoas/inserir", {
        method: "POST",
        headers: { "Content-Type": "application.json",
            "Authorization": "Bearer " + token },
        body: JSON.stringify({ nome, cpf })
        
    })
        .then(res => {
            if (!res.ok) throw new Error("Erro ao inserir!");
            return res.json();
        })
        .then(data => {
            alert("Dados inseridos com sucesso!");
            window.location.href = "../pessoas/lista.html";
        })
        .catch(err => alert(err));
}