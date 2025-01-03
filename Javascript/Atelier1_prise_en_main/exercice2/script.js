
let button_elem = document.getElementById("movingbutton");
button_elem.addEventListener("mouseover", movePosition);

function movePosition() {

    let spaceWidth = window.innerWidth - button_elem.offsetWidth;
    let spaceHeight = window.innerHeight - button_elem.offsetHeight;

    let i = Math.floor(Math.random() * spaceWidth) + 1 ;
    let j = Math.floor(Math.random() * spaceHeight) + 1 ;

    button_elem.style.top = i + "px";
    button_elem.style.left = j + "px";
    
    //Le button dépasse parfois du screen
}