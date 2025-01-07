let title_elem = document.getElementById("title");
let content_elem = document.getElementById("content");
let color_elem = document.getElementById("color");

let create_elem = document.getElementById("create");
let board_elem = document.getElementById("board");

create_elem.addEventListener("click", createNote);

function createNote() {
    
    if ((title_elem.value !== "") || (content_elem.value !== "")) {
        let newNote = document.createElement("div");
        let titleNote = document.createElement("h4");
        let contentNote = document.createElement("p");

        titleNote.innerHTML = title_elem.value;
        contentNote.innerText = content_elem.value;
        newNote.style.background = color_elem.value;

        board_elem.prepend(newNote);
        newNote.appendChild(titleNote);
        newNote.appendChild(contentNote);
    } else {
        alert("Veuillez renseigner du texte.")
    }
   
}
