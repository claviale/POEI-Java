let foreground_elem = document.getElementById("foreground");
let run_elem = document.getElementById("run");

run_elem.addEventListener("click", run);

function run() {
    run_elem.removeEventListener("click", run);
    loadData(updateProgress);
}

//Affiche la progression
function updateProgress(progress) {
    foreground_elem.style.width = `${progress}%`;

    if(progress === 100){ 
        run_elem.addEventListener("click", run);
    }

}

//Charge les données
function loadData(callback) {
    let cpt = 0;

    let idInterval = setInterval(() => {
        cpt++;
        console.log("Chargement des données");
        callback(cpt);

        if (cpt === 100){
            clearInterval(idInterval);
        }
    }, 50);
}