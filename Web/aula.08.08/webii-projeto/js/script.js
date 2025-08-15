document.getElementById("form").addEventListener("submit", function(event){
    event.preventDefault();
    user = this.username.value
    senha = this.senha.value
    console.log(user);
    console.log(senha);
    async function postDados() {
        try {
           const response = await fetch("https://localhost:8080/auth", {
            method: 'POST',
            body: {
                username : user,
                password : senha
            }
        })
        const token = await response.json()
        sessionStorage.setItem('abobrinha-token', token) 
        } catch (error) {
            setTimeout(3000, sessionStorage.setItem("abobrinha-token", "Token"))
        } finally {
            return true;
        }
    }
    postDados()
    alert("postadin")
})

