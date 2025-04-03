// Déclaration de variable avec type explicite
let phrase : string = "Et là je vais pouvoir mettre ma phrase.";

// Déclaration de variable avec inférence de type (TS déduit le type de la variable)
let salutations = "Salut tout le monde!";

// Déclaration de variable à la mode JS (n'importe quel type)
let nimportequoi : any = "Truc";
nimportequoi = 5;

let age_du_capitaine : number = 42;
let capitaine_bourre = false;

let age : string | number = 71;
age = "douze";

// Les tableaux 
let prenoms : string[] = [
    "Mickael",
    "Maud",
    "Quentin"
];

let prenoms_bis : Array<string> = [
    "Clara",
    "Valentin",
    "Jean"
];

// Les fonctions
function unptitnom() {
    console.log("Coucou le monde!");
}

function saluer(prenom : string) {
    console.log("Coucou " + prenom);
    console.log(`Salut ${prenom}`);
}

function somme(nb1: number, nb2: number): number {
    return nb1 + nb2;
}

unptitnom();
saluer("Thierry");
saluer("Abdel");
let resultat = somme(8, 12);
console.log(resultat);