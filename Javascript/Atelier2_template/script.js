let title_elem = document.getElementById("title");
let content_elem = document.getElementById("content");
let color_elem = document.getElementById("color");
let submit_button = document.getElementById("submit");
let container_elem = document.getElementById("container");
let template_elem = document.getElementById("note_template");

submit_button.addEventListener("click", addNote);

function addNote(event) {
    //Annule le comportement de base du submit
    event.preventDefault();

    //Création d'une copie du template
    let note_elem = document.importNode(template_elem.content, true);
    let note_title_elem = note_elem.querySelector("h2");
    let note_p_elems = note_elem.querySelectorAll("p");

    note_elem.children[0].style.backgroundColor = color_elem.value;
    note_elem.children[0].classList.add("note");
    note_title_elem.textContent = title_elem.value;
    note_p_elems[0].textContent = content_elem.value;
    note_p_elems[1].innerHTML = "&#10005;"
    note_p_elems[1].classList.add("close");

    note_p_elems[1].addEventListener("click", deleteNote);

    container_elem.appendChild(note_elem);
}

function deleteNote(event) {
    if(confirm("Confirmer la suppression?")) {
        container_elem.removeChild(event.target.parentElement);
    }
}