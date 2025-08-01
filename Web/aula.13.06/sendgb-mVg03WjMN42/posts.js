var URL = "https://jsonplaceholder.typicode.com";
document.addEventListener('DOMContentLoaded', async function() {
     let users = await getUsers();
     loadCards();
})

async function getUsers(){
    const response = await fetch(URL + "/users");
    return await response.json(); 
}
function loadCards(posts){
    let mainDiv = document.querySelector("#main");
    posts.forEach(post => {
        mainDiv.innerHTML += `
            <div class="card" id ="${user.id}">
            <h2>${user.name}</h2>
            <h3>${user.username}</h3>
            <h4>${user.email}</h4>
            </div>
            `
    });
}