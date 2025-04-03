import { Injectable } from '@angular/core';
import { Velo } from '../interfaces/velo';

@Injectable({
  providedIn: 'root'
})
export class VelosService {
  private velos : Velo[] = [
    {type: "VTT", vitesses: 6, electrique: false, nb_roues: 2},
    {type: "VTC", vitesses: 6, electrique: false, nb_roues: 2},
    {type: "Longtail", vitesses: 9, electrique: true, nb_roues: 2},
    {type: "Vélo Cargo", vitesses: 8, electrique: true, nb_roues: 2},
    {type: "Gamibe", vitesses: 1, electrique: false, nb_roues: 4},
  ];

  constructor() { }

  getVelos() {
    return this.velos;
  }

  ajouterVelo(velo : Velo) {
    this.velos.push(velo);
  }

}
