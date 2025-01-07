// Créer un bouton qui affiche une blague random
let container_elem = document.getElementById("container");
let randomBtn_elem = document.getElementById("randomBtn");

createButtons();

randomBtn_elem.addEventListener("click", randomJoke);

function randomJoke() {
    fetch("https://api.chucknorris.io/jokes/random")
    .then(response => response.json())
    .then(json => displayJoke(json));
}
    
function displayJoke(joke) {
    container_elem.textContent = joke.value;
}

// Créer les boutons selon les catégories des blagues

function createButtons() {
    fetch("https://api.chucknorris.io/jokes/categories")
    .then(response => response.json())
    .then(json => displayCategoriesBtns(json));
}

function displayCategoriesBtns(categories) {
    let div_elem = document.createElement("div");
    document.body.appendChild(div_elem);

    categories.forEach(category => {
        let btn_elem = document.createElement("button");
        btn_elem.textContent = category;

        btn_elem.addEventListener("click", () => fetchJokeByCategory(category));

        div_elem.appendChild(btn_elem);
    })
}

// Afficher une blague quand on clique sur la catégorie correspondante

function fetchJokeByCategory(category) {
        fetch(`https://api.chucknorris.io/jokes/random?category=${category}`)
        .then(response => response.json())
        .then(json => displayJoke(json));
}

