
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
    note.classList.add("postit", "form-group", "col-lg-2", "col-md-3", "col-5", "p-4", "border", "mx-1");
        
    let titre = document.createElement("input");
    titre.type = "text";
    titre.value = postIt.titre;
    titre.classList.add("form-control", "text-center");

    let contenu = document.createElement("textarea");
    contenu.value = postIt.contenu;
    contenu.classList.add("form-control","text-center");

    let date = document.createElement("p");
    date.classList.add("date", "small", "mt-2");
    if (postIt.dateCreation) {
        date.innerHTML += `Créé le ${postIt.dateCreation[2]}/${postIt.dateCreation[1]}/${postIt.dateCreation[0]}`;
    }
    if (postIt.dateModification) {
        date.innerHTML += ` - modifié le ${postIt.dateModification[2]}/${postIt.dateModification[1]}/${postIt.dateModification[0]}`;
    }
    
    let delete_button = document.createElement("p");
    delete_button.innerHTML = "&#10006;";
    delete_button.classList.add("delete-button")
    delete_button.addEventListener("click", () => deletePostit(postIt.id, note));
    
    let update_button = document.createElement("button");
    update_button.classList.add("update-button");
    update_button.classList.add("hidden");
    update_button.innerHTML = "Modifier";

    titre.addEventListener("input", () => update_button.classList.remove("hidden"));
    contenu.addEventListener("input", () => update_button.classList.remove("hidden"));

    update_button.addEventListener("click", () => savePostit(postIt.id, titre.value, contenu.value, update_button, date));

    note.appendChild(delete_button);
    note.appendChild(titre);
    note.appendChild(contenu);
    note.appendChild(date);
    note.appendChild(update_button);

    container.prepend(note);
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
    .then(json => {
        addButton.reset();
        displayOnePostIt(json)}
    );
}


function savePostit(id, titre, contenu, button, date_p) {
    fetch(URL_WS + id, {
        method: "PUT",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify({
            titre: titre,
            contenu: contenu
        })
    })
    .then(response => response.json())
    .then(postit => {
        button.classList.add("confirm");
        setTimeout(() => {
            button.classList.remove("confirm");
            button.classList.add("hidden")
            date.innerHTML = `Créé le ${postit.dateCreation[2]}/${postit.dateCreation[1]}/${postit.dateCreation[0]}`;
            date_p.innerHTML += ` - modifié le ${postit.dateModification[2]}/${postit.dateModification[1]}/${postit.dateModification[0]}`;
        }, 800);
    });
}

function deletePostit(id, div) {
    fetch(URL_WS + id, {
        method: "DELETE"
    })
    .then(_ => container.removeChild(div));
}

fetchPostIts();