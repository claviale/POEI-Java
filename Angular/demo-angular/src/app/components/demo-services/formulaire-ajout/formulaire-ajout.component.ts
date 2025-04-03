import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { VelosService } from '../../../services/velos.service';

@Component({
  selector: 'app-formulaire-ajout',
  imports: [FormsModule],
  templateUrl: './formulaire-ajout.component.html',
  styleUrl: './formulaire-ajout.component.css'
})
export class FormulaireAjoutComponent {
  type = "";
  vitesses = 6;
  nb_roues = 2;
  electrique = true;

  constructor(private service : VelosService) {}

  enregistrer() {
    this.service.ajouterVelo({
      "type": this.type,
      "vitesses": this.vitesses,
      "nb_roues": this.nb_roues,
      "electrique": this.electrique
    });
    this.type = "";
    this.vitesses = 6;
    this.nb_roues = 2;
    this.electrique = true;
  }
}
