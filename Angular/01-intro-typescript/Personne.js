"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Personne = void 0;
var Personne = /** @class */ (function () {
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
    function Personne(prenom, nom, date_naissance, //:? pour dire que c'est facultatif
    taille) {
        this.prenom = prenom;
        this.nom = nom;
        this.date_naissance = date_naissance;
        this.taille = taille;
    }
    return Personne;
}());
exports.Personne = Personne;
