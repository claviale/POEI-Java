
const URL_WS = "http://localhost:8080/TPPostIt/api/post-its/";

let container = document.getElementById("container");
let addButton = document.getElementById("addPostIt");

let titre_input = document.getElementById("titre");
let contenu_input = document.getElementById("contenu");
let couleur_input = document.getElementById("couleur");

addButton.addEventListener("submit", addPostIt);


function fetchPostIts() {
    fetch(URL_WS)
        .then(response => response.json())
        .then(json => displayAllPostIts(json));
}

function displayAllPostIts(json) {
    json.forEach(displayOnePostIt);
}
   

function displayOnePostIt(postIt) {
        let note = document.createElement("div");
        note.style.backgroundColor = `${postIt.couleur}`;
        
        let titre = document.createElement("input");
        titre.type = "text";
        titre.value = postIt.titre;

       let contenu = document.createElement("textarea");
       contenu.value = postIt.contenu;

       let dateCreation = document.createElement("input");
       dateCreation.value = postIt.dateCreation;

       let dateModification = document.createElement("input");
       dateModification.value = postIt.dateModification;
       
       let editButton = document.createElement("button");
       editButton.value = "Modifier";

    /*container.innerHTML +=  
    `<div id= ${postIt.id}>
        <input type="text" id="titre" value=" ${postIt.id} : ${postIt.titre}">
        <textarea id="contenu">${postIt.contenu}</textarea>
        <input type="text" id="dateCreation" value="Crée le : ${postIt.dateCreation}">
        <input type="text" id="dateModification" value="Modifié le : ${postIt.dateModification}">
        <button onclick="editPostIt(${postIt.id})">Modifier</button>
        <button id="delete" value="${postIt.id}">Supprimer</button>
    </div>`;*/
        note.appendChild(titre);
        note.appendChild(dateCreation);
        note.appendChild(contenu);
        note.appendChild(dateModification);
        note.appendChild(editButton);
        container.appendChild(note);
}
    

function addPostIt(event) {
    event.preventDefault();
    
  

    fetch(URL_WS, {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify({
            titre: titre_input.value,
            contenu: contenu_input.value,
            couleur: couleur_input.value
        })
    })
    .then(response => response.json()) 
    .then(json => displayOnePostIt(json));
}



function editPostIt(id) {
   
    console.log(id);
}

fetchPostIts();