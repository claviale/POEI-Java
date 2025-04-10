import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router, RouterModule } from '@angular/router';
import { UsersService } from '../../services/users.service';
import { User } from '../../interfaces/user';

@Component({
  selector: 'app-accueil',
  imports: [RouterModule, FormsModule],
  templateUrl: './accueil.component.html',
  styleUrl: './accueil.component.css'
})
export class AccueilComponent {
  message = "";
  username: string ="";
  password: string = "";
 

  constructor(
    private usersService: UsersService,
    private router: Router
  ) {}

  
  connecter() {
    this.usersService.check_user({
      "username" : this.username,
      "password" : this.password
    }).subscribe({
      next : response => {
        sessionStorage.setItem("user", this.username);
        this.router.navigate(["/messagerie"]);
      },
      error: err => {
        this.message = err.error;
      }
    });
  }
}
