
let button_elem = document.getElementById("movingbutton");
button_elem.addEventListener("mouseover", movePosition);

function movePosition() {
    button_elem.style.top = Math.floor(Math.random() * window.innerWidth) + "px";
    button_elem.style.left = Math.floor(Math.random() * window.innerHeight) + "px";
// - button_elem.offsetHeight
}