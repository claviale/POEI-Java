import { Component } from '@angular/core';
import { ApiService } from '../../services/api.service';
import { PokemonWrapper } from '../../interfaces/pokemon-wrapper';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-api',
  imports: [CommonModule],
  templateUrl: './api.component.html',
  styleUrl: './api.component.css'
})
export class ApiComponent {
  data ?: PokemonWrapper;

  constructor(private service: ApiService) {
  console.log("Début du chargement des données.");

    service.get_data().subscribe(result => {
      console.log("Affectation des données.");
      
      this.data = result;
    });

    console.log("????");
    
  }
}