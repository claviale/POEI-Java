
let number1_elem = document.getElementById("number1");
let number2_elem = document.getElementById("number2");
let total_elem = document.getElementById("total");


number1_elem.addEventListener("input", somme);
number2_elem.addEventListener("input", somme);

function somme() {
    
    if (number1_elem.value === "") {
        total_elem.innerHTML = number2_elem.value;
    } else if  (number2_elem.value === ""){
        total_elem.innerHTML = number1_elem.value;
    } else {
        total_elem.innerHTML = parseInt(number1_elem.value) + parseInt(number2_elem.value);
    }

}

