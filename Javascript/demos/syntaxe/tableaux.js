// exemple d'un tableau avec des prenoms
let prenoms = ["Abdel", "Mickael", "Nadege", "Clara"];

// Ajoute un prénom à la fin du tableau
prenoms.push("Valentin");

//Remplace le prénom en position 2 (Nadège)
prenoms[2] = "Clément";
console.log(prenoms);

//Ajoute Nadège en position 9, et affiche "4 empty items" avant
prenoms[9] = "Nadège";
console.log(prenoms);

//Syntaxe du forEach en JS
prenoms.forEach(prenom => {
    console.log(prenom);
});

for(let prenom of prenoms) {
    console.log(prenom);
}

