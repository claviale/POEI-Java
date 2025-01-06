let utilisateurs = [
    {"nom" : "Skywalker", "prenom" : "Luke", "camp" : "Jedi"},
    {"nom" : "Skywalker", "prenom" : "Anakin", "camp" : "Jedi (?)"},
    {"nom" : "Jin", "prenom" : "Qui Gon", "camp" : "Jedi"},
    {"nom" : "Palpatine", "prenom" : "Chancelier", "camp" : "Sith"},
    {"nom" : "Maul", "prenom" : "Dark", "camp" : "Sith"},
    {"nom" : "Tano", "prenom" : "Ahsoka", "camp" : "Gris"},
    ]

let table_elem = document.createElement("table");
table_elem.innerHTML = "<thead><th>Nom</th><th>Prénom</th><th>Camp</th></thead>";

utilisateurs.forEach(utilisateur => {
    let tr_elem = document.createElement("tr");
    let td_lastname = document.createElement("td");
    let td_firstname = document.createElement("td");
    let td_camp = document.createElement("td");

    td_lastname.innerHTML = utilisateur.nom;
    td_firstname.innerHTML = utilisateur.prenom;
    td_camp.innerHTML = utilisateur.camp;
    
    tr_elem.appendChild(td_lastname);
    tr_elem.appendChild(td_firstname);
    tr_elem.appendChild(td_camp);
    table_elem.appendChild(tr_elem);
})

let target = document.getElementById("target");
target.appendChild(table_elem);

// ------------------- Form add row ------------------------

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

// -------- Sort by name and firstname --------

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
