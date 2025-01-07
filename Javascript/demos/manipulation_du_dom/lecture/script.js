//Récupérer l'élement par son ID
let description_elem = document.getElementById("description");
// Affiche le contenu de l'élement description
console.log(description_elem.innerHTML);

//Récupérer l'élément par son sélecteur css
let description_elem_bis = document.querySelector("#description");
let description_elem_ter = document.querySelector("p");
let description_elem_quater = document.querySelectorAll("p")[0];
let description_elem_quinter = document.querySelector("html>body>p");