import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { PokemonWrapper } from '../interfaces/pokemon-wrapper';

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  constructor(private client : HttpClient) { }

  get_data() {
    console.log("Chargement des données auprès de l'API");
    
    return this.client.get<PokemonWrapper>("https://pokeapi.co/api/v2/pokemon/")
  }

}
