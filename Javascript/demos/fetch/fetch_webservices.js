fetch("https://geo.api.gouv.fr/communes")
    .then(response => response.json())
    .then(json => displayJson(json));

function displayJson(communes) {
    let ul_elem = document.createElement("ul");
    document.body.appendChild(ul_elem);

    communes.forEach(commune => {
        let li_elem = document.createElement("li");
        li_elem.textContent = `${commune.nom} (${commune.population} habitants)`;

        ul_elem.appendChild(li_elem);
    })
}

// Affiche exemple "L'Abergement-Clémenciat (832 habitants)"