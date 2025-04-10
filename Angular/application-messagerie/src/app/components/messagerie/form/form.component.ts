import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { MessagesService } from '../../../services/messages.service';

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
  ) {}

  ajouter() {
    let username = sessionStorage.getItem("user");

    if (username) {
      this.messageService.add_message({
        "author": username,
        "content": this.content
      }).subscribe();    
      this.content = "";
    }
  }
}
