let etudiant1 = {"nom" : "Redouane", "prenom" : "Abdel", "note" : [12, 14, 19]};
let etudiant2 = {"nom" : "Mugniery", "prenom" : "Jean", "note" : [18, 6, 16]};

let etudiants = [
    {"nom" : "Redouane", "prenom" : "Abdel", "note" : [12, 14, 19], "adresse" : {
        "numero" : 6,
        "voie" : "rue des acacias",
        "ville" : "Nantes"
    }},
    {"nom" : "Mugniery", "prenom" : "Jean", "note" : [18, 6, 16]}
]

etudiant2.note = 16; // attention, altère le type de "notes"

console.log(etudiant1.nom);
console.log(etudiant2);

console.log(etudiants); //affiche le tableau des étudiants
console.log(etudiants[0].adresse.ville); //affiche Nantes

// Compare le nom de a au nom de b, pour trier
etudiants = etudiants.sort((a, b) => {
    return a.nom.localeCompare(b.nom);
});

console.log(etudiants);


