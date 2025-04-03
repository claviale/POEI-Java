// Déclaration de variable avec type explicite
var phrase = "Et là je vais pouvoir mettre ma phrase.";
// Déclaration de variable avec inférence de type (TS déduit le type de la variable)
var salutations = "Salut tout le monde!";
// Déclaration de variable à la mode JS (n'importe quel type)
var nimportequoi = "Truc";
nimportequoi = 5;
var age_du_capitaine = 42;
var capitaine_bourre = false;
var age = 71;
age = "douze";
// Les tableaux 
var prenoms = [
    "Mickael",
    "Maud",
    "Quentin"
];
var prenoms_bis = [
    "Clara",
    "Valentin",
    "Jean"
];
// Les fonctions
function unptitnom() {
    console.log("Coucou le monde!");
}
function saluer(prenom) {
    console.log("Coucou " + prenom);
    console.log("Salut ".concat(prenom));
}
function somme(nb1, nb2) {
    return nb1 + nb2;
}
unptitnom();
saluer("Thierry");
saluer("Abdel");
var resultat = somme(8, 12);
console.log(resultat);
