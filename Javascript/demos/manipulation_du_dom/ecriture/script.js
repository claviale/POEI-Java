//Mettre un délai d'affichage pour voir le comportement
setTimeout(() => {

//Créer un élément
let nouvel_element = document.createElement("p");

    //Affiche les balises en tant que texte
    nouvel_element.innerText = "<b>Salut tout le monde !</b>";

    //N'affiche pas les balises
    nouvel_element.innerHTML = "<b>Salut tout le monde !</b>";

    //Ajoute un enfant au body (donc en dernier)
    document.body.appendChild(nouvel_element);

//Modifier un élement
let salutations_elem = document.getElementById("salutations");

    //Utilisation du prompt
    let prenom = prompt("Salut, comment tu t'appelles?")

    salutations_elem.innerHTML = `Salut c'est ${prenom} !`;

    //Utilisation du message d'alerte
    alert("Fin du chargement");

    //Utilisation du confirm
    if(confirm("Avez-vous terminé?")) {
        alert("Yay c'est fini !");
    } else {
        alert("Tant pis pour toi, mon programme ne prévoit rien d'autre!")
    }

}, 5000);
