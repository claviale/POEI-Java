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
  users: string[] = [];



  constructor(private service : UsersService) {
    service.get_users().subscribe(result => {
      this.users = result;
    });
  }

}
