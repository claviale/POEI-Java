let content_elem = document.getElementById("content");
let container_elem = document.getElementById("container");

let interval_text = setInterval(addText, 10000);

function addText() {
    let note_content_elem = document.createElement("p");
    note_content_elem.textContent = content_elem.value;

    container_elem.appendChild(note_content_elem);
    
}

// Objectif bonus = détecter l'inactivité de l'utilisateur (si inactif pendant 3s, alors on coupe l'intervale)

content_elem.addEventListener("input", cutSave);

let idtimeout = 0;

function cutSave() {

    if(idtimeout !== 0) {
        clearTimeout(idtimeout);
    }

    idtimeout = setTimeout(() => {
        clearInterval(interval_text);
    }, 3000);
}