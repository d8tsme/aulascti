var URL = "https://jsonplaceholder.typicode.com";
document.addEventListener('DOMContentLoaded', async function() {
     let users = await getUsers();
     loadCards(users);
})

async function getUsers(){
    const response = await fetch(URL + "/users");
    return await response.json(); 
}
function loadCards(users){
    let mainDiv = document.querySelector("#main");
    users.forEach(user => {
        mainDiv.innerHTML += `
            <div class="card" id ="${user.id}">
            <h2>${user.name}</h2>
            <h3>${user.username}</h3>
            <h4>${user.email}</h4>
            </div>
            `
    });
}

let cards = document.querySelectorAll('div.card');
cards.forEach(cars => {
    cards.addEventListener('click', function(){
        location.href = '/posts.html?userId=' + this.id;
    })
})
