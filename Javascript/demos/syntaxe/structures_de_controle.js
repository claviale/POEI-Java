for (let i = 0; i < 10; i++) {
    if (i % 2 === 0){
        console.log(`${i} est pair`);
    } else {
        console.log(`${i} est impair`);
    } 
}

// Utilisation d'une méthode pour string
let texte = "lorem ipsum";
console.log(texte.substring(3, 8)); // Affiche em ip

if (isNaN("bonjour")) {
    console.log("bonjour n'est pas un nombre");
}

console.log(10/0); // Affiche Infinity
console.log(typeof(Infinity)); // Affiche number

let ageAsStr = "32";
let age = parseInt(ageAsStr);
console.log(age + 1); // Affiche bien 33 et pas 321