let change_elem = document.getElementById('change');
let box_elem = document.getElementById('box');

change_elem.addEventListener("click", changeColor);

function changeColor() {
    box_elem.style.backgroundColor = getRandomColor();
}

function getRandomColor() {
    let letters = '0123456789ABCDEF';
    let color = '#';
    for (let i = 0; i < 6; i++) {
        color += letters[Math.floor(Math.random() * 16)];
    }
    return color;
}