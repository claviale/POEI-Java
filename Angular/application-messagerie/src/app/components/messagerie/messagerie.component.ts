import { Component } from '@angular/core';
import { UsersComponent } from './users/users.component';
import { FormComponent } from './form/form.component';
import { MessagesListComponent } from './messages-list/messages-list.component';

@Component({
  selector: 'app-messagerie',
  imports: [UsersComponent, FormComponent, MessagesListComponent],
  templateUrl: './messagerie.component.html',
  styleUrl: './messagerie.component.css'
})
export class MessagerieComponent {

}
