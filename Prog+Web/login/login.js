function login() {
    const login = document.getElementById('usuario').value;
    const senha = document.getElementById('senha').value;

    fetch("http://localhost:8080/auth", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify({login, senha})
    })
        .then(res => {
            if (!res.ok) throw new Error("Login Inválido!");
            return res.json()
        })
        .then(data => {
            localStorage.setItem("token", data.token);
            alert("Login efetuado com sucesso!");
            window.location.href = "../pessoas/lista.html"
        })
        .catch(err => alert(err));
}