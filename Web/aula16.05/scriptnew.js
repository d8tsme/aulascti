document.querySelector('input[type=submit]').addEventListener('click', function() {
    const user = "Admin"
    const pwd = "adm123"
    const iUser = document.getElementById("user").value
    const iPwd = document.getElementById("pwd").value
    if(iUser == user && iPwd == pwd){
        window.location.href = 'home.html';
    } else {
        alert("User or Password incorrect!!!!")
    }
})