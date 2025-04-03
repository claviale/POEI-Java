import { Component } from '@angular/core';
import { User } from '../../interfaces/user';
import { UsersService } from '../../services/users.service';
import { Router } from '@angular/router';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-inscription',
  imports: [FormsModule],
  templateUrl: './inscription.component.html',
  styleUrl: './inscription.component.css'
})
export class InscriptionComponent {
  username = "";
  password = "";


  constructor(
    private usersService: UsersService,
    private router: Router
  ) {}

  inscrire() {
    this.usersService.addUser({
      "username" : this.username,
      "password" : this.password
    });
    this.router.navigate(["/accueil"])
   
  }
  
}
