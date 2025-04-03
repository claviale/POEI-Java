import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { KebabCasePipe } from "../../pipes/kebab-case.pipe";

@Component({
  selector: 'app-directives',
  imports: [CommonModule, FormsModule, KebabCasePipe],
  templateUrl: './directives.component.html',
  styleUrl: './directives.component.css'
})
export class DirectivesComponent {
  valeur : number = 0;
  background : string = "white";
  radius : number = 0;
  fruits = [
    "pomme",
    "banane",
    "fraise"
  ];

  villes = [
    {nom : "St Herblain", code_postal: "44800"},
    {nom : "Nantes", code_postal: "44000"},
    {nom : "Marseille", code_postal: "13000"}
  ];

  villesToString() {
    return this.villes.map(v => '${v.nom} (${v.code_postal})');
  }

  bonhomme = {
    nom : "toto",
    prenom: "tata",
    date_naissance: new Date(),
    argent_de_poche: 10
  };

  saisie = "";
  date_format = "dd/MM/yyyy";

}
