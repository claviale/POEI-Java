import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { MessagesService } from '../../../services/messages.service';
import { User } from '../../../interfaces/user';
import { UsersService } from '../../../services/users.service';

@Component({
  selector: 'app-form',
  imports: [FormsModule],
  templateUrl: './form.component.html',
  styleUrl: './form.component.css'
})
export class FormComponent {
  content = "";

  constructor(
    private messageService : MessagesService,
    private usersService : UsersService
  ) {}

  ajouter() {
    let username = sessionStorage.getItem("user");

    if (username) {
      this.messageService.addMessage({
        "author": username,
        "date": new Date(),
        "content": this.content
      });    
      this.content = "";
    }
  }
}
