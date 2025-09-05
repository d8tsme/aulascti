const token = localStorage.getItem('token');
if (!token) {
    window.location.href = "login/login.html";
}

function listarPessoas() {
    fetch("http://localhost:8080/pessoas/listar", {
        headers: { "Authorization": "Bearer " + token }
    })
        .then(res => res.json())
        .then(data => {
            const lista = document.getElementById('lista');
            lista.innerHTML = '';
            data.forEach(p => {
                const li = document.createElement('li');
                li.textContent = `${p.id} - ${p.nome} - ${p.cpf}`;
                lista.appendChild(li);
            });
        })
        .catch(err => alert(err));
}

function logout(){
    localStorage.removeItem("token");
    window.location.href = "login/login.html";
}

listarPessoas();