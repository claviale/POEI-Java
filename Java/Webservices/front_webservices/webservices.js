const URL_WS = "http://localhost:8080/DemoWebservices/api/crayons/";

let container = document.getElementById("container");
let addForm = document.getElementById("addCrayon");

addForm.addEventListener("submit", addCrayon);

function fetchCrayons() {
    fetch(URL_WS)
        .then(response => response.json())
        .then(json => displayAllCrayons(json));
}

function displayAllCrayons(json) {
    json.forEach(displayOneCrayon);
}

function displayOneCrayon(crayon) {
    let p = document.createElement("p");
    p.innerHTML =  `${crayon.type} ${crayon.couleur}`;
    container.appendChild(p);
}

function addCrayon(event) {
    event.preventDefault();
    
    let type_input = document.getElementById("type").value;
    let couleur_input = document.getElementById("couleur").value;

    fetch(URL_WS, {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify({
            type: type_input,
            couleur: couleur_input
        })
    })
    .then(response => response.json()) 
    .then(json => displayOneCrayon(json));
}

fetchCrayons();