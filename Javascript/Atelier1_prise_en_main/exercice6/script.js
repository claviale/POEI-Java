const speed = 8;

let x_position = circle.offsetLeft;
let y_position = circle.offsetTop;

window.addEventListener("keydown", move);

function move(event) {
    switch(event.keyCode) {
        case 37 :
            x_position-=speed;
            break;
        case 38 :
            y_position-=speed;
            break;
        case 39 :
            x_position+=speed;
            break;
        case 40 :
            y_position+=speed;
            break;
    }
    circle.style.left = x_position + "px";
    circle.style.top = y_position + "px";
}