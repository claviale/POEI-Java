import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { User } from '../../../interfaces/user';
import { UsersService } from '../../../services/users.service';

@Component({
  selector: 'app-users',
  imports: [CommonModule],
  templateUrl: './users.component.html',
  styleUrl: './users.component.css'
})

export class UsersComponent {
  title = "Utilisateur·ice·s"
  users : User[];

  constructor(private service : UsersService) {
    this.users = service.getUsers();
  }

}
