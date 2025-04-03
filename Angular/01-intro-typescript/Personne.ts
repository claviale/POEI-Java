export class Personne {
    /*
    public prenom: string;
    public nom: string;
    public date_naissance: Date;
    public taille: number;

    constructor(prenom: string, nom: string, date_naissance: Date, taille: number) {
        this.prenom = prenom;
        this.nom = nom;
        this.date_naissance = date_naissance;
        this.taille = taille;
    }*/

    // Equivalent à :
    constructor(
        public prenom: string, 
        public nom: string, 
        public date_naissance?: Date, //:? pour dire que c'est facultatif
        public taille?: number){}

}