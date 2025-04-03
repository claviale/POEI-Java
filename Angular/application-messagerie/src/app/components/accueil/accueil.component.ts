import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router, RouterModule } from '@angular/router';
import { UsersService } from '../../services/users.service';

@Component({
  selector: 'app-accueil',
  imports: [RouterModule, FormsModule],
  templateUrl: './accueil.component.html',
  styleUrl: './accueil.component.css'
})
export class AccueilComponent {
  username = "";
  password = "";
  message = "";

  constructor(
    private usersService: UsersService,
    private router: Router
  ) {}

  connecter() {
    if (this.usersService.checkUser({
      "username" : this.username,
      "password" : this.password
    })) {
      sessionStorage.setItem("user", this.username);
      this.router.navigate(["/messagerie"]);
    } else {
      this.message = "Identifiant ou mot de passe incorrect !";
    }
  }
}
