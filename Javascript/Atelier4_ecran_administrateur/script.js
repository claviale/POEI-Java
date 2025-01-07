let utilisateurs = [
    {"nom" : "Skywalker", "prenom" : "Luke", "camp" : "Jedi"},
    {"nom" : "Skywalker", "prenom" : "Anakin", "camp" : "Jedi (?)"},
    {"nom" : "Jin", "prenom" : "Qui Gon", "camp" : "Jedi"},
    {"nom" : "Palpatine", "prenom" : "Chancelier", "camp" : "Sith"},
    {"nom" : "Maul", "prenom" : "Dark", "camp" : "Sith"},
    {"nom" : "Tano", "prenom" : "Ahsoka", "camp" : "Gris"},
]

let table_elem;
let table_head_elem;
let table_body_elem;

let keys = [];
if (utilisateurs.length > 0) {
    let premier_utilisateur = utilisateurs[0];
    keys = Object.keys(premier_utilisateur);
    afficherTableau();
}

function afficherTableau() {
    table_elem = document.createElement("table");
    table_head_elem = document.createElement("thead");
    table_body_elem = document.createElement("tbody");
    
    keys.forEach(key => {
        let th_elem = document.createElement("th");
        th_elem.innerHTML = key;

        let div_elem = document.createElement("div");
        div_elem.classList.add("sorter");
        div_elem.innerHTML = " &darr;&uarr;";
        div_elem.addEventListener("click", () => trier(key));

        th_elem.appendChild(div_elem);

        table_head_elem.appendChild(th_elem);
    });

    utilisateurs.forEach(utilisateur => {
        ajouterLigne(utilisateur);
    });

    table_elem.appendChild(table_head_elem);
    table_elem.appendChild(table_body_elem);
    document.body.prepend(table_elem);
}

function ajouterLigne(utilisateur) {
    let tr_elem = document.createElement("tr");
    keys.forEach(key => {
        tr_elem.insertCell().innerHTML = utilisateur[key];
    });
    table_body_elem.appendChild(tr_elem);
}

/*
    // Alternative à la ligne "tr_elem.insertCell().innerHTML = utilisateur[key];"
    let td_elem = document.createElement("td");
    // ecriture dynamique pour consulter la valeur associée à "key" dans "utilisateur".
    td_elem.textContent = utilisateur[key];

    tr_elem.appendChild(td_elem);
*/


let add_button = document.getElementById("add");

add_button.addEventListener("click", ajouterUtilisateur);

function ajouterUtilisateur() {
    let input_elems = document.querySelectorAll("input");
    let utilisateurAAjouter = {
        "nom" : input_elems[0].value,
        "prenom" : input_elems[1].value,
        "camp" : input_elems[2].value
    };
    utilisateurs.push(utilisateurAAjouter);
    ajouterLigne(utilisateurAAjouter);
}

function trier(toto) {
    utilisateurs.sort((u1, u2) => {
        if (isNaN(u1[toto]))
            return u1[toto].localeCompare(u2[toto]);
        else
            return u1[toto] - u2[toto];    
    });
    document.body.removeChild(table_elem);

    afficherTableau();
}

/* ------------------- Form add row before correction ------------------------

let create_elem = document.getElementById("create");
let lastname_elem = document.getElementById("lastname");
let firstname_elem = document.getElementById("firstname");
let camp_elem = document.getElementById("camp");

create_elem.addEventListener("click", addRow);

function addRow() {
    let table_elem = document.querySelector("table");
    let new_Row = table_elem.insertRow(-1);
    let cell_lastname = new_Row.insertCell(0);
    let cell_firstname = new_Row.insertCell(1);
    let cell_camp = new_Row.insertCell(2);
    cell_lastname.innerHTML = lastname_elem.value;
    cell_firstname.innerHTML = firstname_elem.value;
    cell_camp.innerHTML = camp_elem.value;
}

// -------- Sort by name and firstname before correction --------

document.addEventListener("DOMContentLoaded", function() {
    let test = document.querySelectorAll("th")[0].addEventListener("click", function() {
      sortTable(0);
    });
    console.log(test);
});

//document.getElementById("itemHeader").addEventListener("click", sortTable(1));
//document.getElementById("itemHeader").addEventListener("click", sortTable(2));

function sortTable(columnIndex) {
    let table = document.querySelector("table");
    let trs = table.rows;
    
    Array.from(trs)
         .sort((a, b) => a.cells[columnIndex].textContent - b.cells[columnIndex].textContent)
         .forEach(tr => table.appendChild(tr));
}
*/