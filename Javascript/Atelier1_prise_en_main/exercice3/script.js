let countries = ["France", "Japon", "Togo", "Suède", "Brésil"];

let list_elem = document.getElementById("list");

countries.forEach(country => {
    let newRow = document.createElement("tr");
    newRow.innerHTML = country;
    list_elem.appendChild(newRow);
})


