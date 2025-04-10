import { Component } from '@angular/core';
import { Message } from '../../../interfaces/message';
import { MessagesService } from '../../../services/messages.service';
import { CommonModule } from '@angular/common';
import { MessagesComponent } from './messages/messages.component';


@Component({
  selector: 'app-messages-list',
  imports: [CommonModule, MessagesComponent],
  templateUrl: './messages-list.component.html',
  styleUrl: './messages-list.component.css'
})
export class MessagesListComponent {
  messages : Message[] = [];

  constructor(private service : MessagesService) {
    service.get_messages().subscribe(response => {
      this.messages = response;
    });
  }
}
