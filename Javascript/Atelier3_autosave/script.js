let content_elem = document.getElementById("content");
let container_elem = document.getElementById("container");

let interval_text = setInterval(addText, 10000);

function addText() {
    let note_content_elem = document.createElement("p");
    note_content_elem.textContent = content_elem.value;

    container_elem.appendChild(note_content_elem);
    
}