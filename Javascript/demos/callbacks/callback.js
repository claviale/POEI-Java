console.log("Début du traitement.");

traitementLong(() => console.log("Salut à tous!"));

console.log("Fin du traitement");

//Utilisation du callback pour permettre ensuite de faire derrière ce qu'on veut (ex Salut a tous)
function traitementLong(callback) {
        console.log("Début du traitement très long");
        
        setTimeout(() => {
        console.log("Fin du traitement très long")
        callback();
   
    }, 5000);
    console.log("?");
}

/*  Affiche :
Début du traitement.
Début du traitement très long
?
Fin du traitement
Fin du traitement très long
Salut à tous!
*/

// C'est un callback car traitement long
setTimeout(() => {
    console.log("pouet");
}, timeout);