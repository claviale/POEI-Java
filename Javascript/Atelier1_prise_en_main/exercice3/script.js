let countries = ["France", "Japon", "Togo", "Suède", "Brésil"];

let list_elem = document.getElementById("list");

countries.forEach(country => {
    let newRow = document.createElement("tr");
    newRow.innerHTML = country;
    list_elem.appendChild(newRow);
})

// Correction (ajouter un td dans les tr pour respecter les tableaux)
let content = ["France", "Japon", "Togo", "Suède", "Brésil"];

let container = document.getElementById("list");

content.forEach(country => {
    let tr_elem = document.createElement("tr");
    let td_elem = document.createElement("tr");
    td_elem.innerHTML = country;
    tr_elem.appendChild(td_elem);
    container.appendChild(tr_elem);
})