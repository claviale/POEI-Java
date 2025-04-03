import { Component, OnInit } from '@angular/core';
import { Velo } from '../../interfaces/velo';
import { ActivatedRoute, Router } from '@angular/router';
import { VelosService } from '../../services/velos.service';

@Component({
  selector: 'app-recepteur-route',
  imports: [],
  templateUrl: './recepteur-route.component.html',
  styleUrl: './recepteur-route.component.css'
})
export class RecepteurRouteComponent implements OnInit {
  id ?: number;
  velo ?: Velo;

  constructor(
    private route : ActivatedRoute,
    private service : VelosService,
    private router : Router
  ) {}


  ngOnInit(): void {
    //Je m'abonne aux paramètres de la route = je déclenche la fonction flechée entre () à chaque fois que les param changent
    this.route.paramMap.subscribe(params => {
      let id_param = params.get("id");
      if (id_param) {
        this.id = Number.parseInt(id_param)
        this.velo = this.service.getVelos()[this.id];
      }
    })
  }

  previous() {
    this.router.navigate(['/recepteur', this.id != undefined ? this.id - 1 : 0]);
  }

  next() {
    this.router.navigate(['/recepteur', this.id != undefined ? this.id + 1 : 0]);
  }

}
