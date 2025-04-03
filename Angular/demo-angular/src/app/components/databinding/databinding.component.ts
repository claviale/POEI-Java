import { Component, DoCheck, OnChanges, OnInit, SimpleChanges } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-databinding',
  imports: [FormsModule],
  templateUrl: './databinding.component.html',
  styleUrl: './databinding.component.css'
})
export class DatabindingComponent implements DoCheck /*implements OnInit*/{
  title = "databinding";
  largeur = 10;
  hauteur = 10;
  message ?: string;
  password = "";
  choix = "rouge";

  /*
  ngOnInit(): void {
    setInterval(() => {
      this.title += "a";
      this.largeur++;
    }, 1000);;
  }
  */

  ngDoCheck(): void {
    if (this.password.length < 10) {
      this.message = "Le mot de passe doit faire au moins 10 caractères";
    } else {
      this.message = "OK";
    }
  }

  coucou() {
    console.log("Hello there");
    this.title = "";
  }
}
