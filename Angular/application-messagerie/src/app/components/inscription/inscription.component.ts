import { Component } from '@angular/core';
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
  username: string = "";
  password: string = "";

  constructor(
    private usersService: UsersService,
    private router: Router
  ) {}

  
  inscrire() {
    this.usersService.add_user({
      "username" : this.username,
      "password" : this.password
    }).subscribe(response => {
      this.router.navigate(["/accueil"]);
    }) ;
  }
}
