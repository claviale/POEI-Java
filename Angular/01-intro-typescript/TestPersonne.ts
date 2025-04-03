import { Personne } from "./Personne";

let capitaine = new Personne("Régist", "Aberbache", new Date(2005, 5, 18), 198);
let toto = new Personne("Toto", "Tata");

console.log(capitaine.nom);
console.log(capitaine.date_naissance?.getFullYear());

console.log(toto.nom);
console.log(toto.date_naissance?.getFullYear());

