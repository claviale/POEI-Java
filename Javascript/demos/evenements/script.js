//Evenement standard de clic sur un bouton
//Ecriture possible
let clickmebutton_elem = document.getElementById("clickmebutton");
clickmebutton_elem.addEventListener("click", displayMessage);

//Deuxième écriture possible
document
    .getElementById("clickmebutton")
    .addEventListener("click", displayMessage);

function displayMessage() {
    alert("Coucou !");
}

 // -------------------------------------------------------------

//Evenement d'écoute des touches du clavier sur la page
window.addEventListener("keydown", moveCharacter);

function moveCharacter(event) {
    switch(event.keyCode){
        case 37 :
            console.log("Je vais vers la gauche !");
            break;
        case 38 :
            console.log("Je vais vers le haut !");
            break;
        case 39 :
            console.log("Je vais vers la droite !");
            break;
        case 40 :
            console.log("Je vais vers le bas !");
            break;
        default :
            console.log("Déplacement invalide !");
            break;
    }
}

 // -------------------------------------------------------------

 //Ecoute d'un évènement d'input
 //Première écriture
let saisie_elem = document.getElementById("saisie");
let recopie_elem = document.getElementById("recopie");

saisie_elem.addEventListener("input", actualiserRecopie);

function actualiserRecopie() {
    recopie_elem.innerHTML = saisie_elem.value;
}

//Deuxième écriture
saisie.addEventListener("input", actualiserRecopie);

function actualiserRecopie() {
    recopie.innerHTML = saisie.value;
}

  // -------------------------------------------------------------

  //Ajout et retrait d'une classe sur un élément

  choixcouleur.addEventListener("input", changerCouleur);
  function changerCouleur() {
    //Vider classlist pour refresh a la saisie
    document.body.className = "";
    //Ajouter une class au body
    document.body.classList.add(choixcouleur.value);
  }