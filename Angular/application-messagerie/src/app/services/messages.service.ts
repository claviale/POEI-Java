import { Injectable } from '@angular/core';
import { Message } from '../interfaces/message';

@Injectable({
  providedIn: 'root'
})
export class MessagesService {
  private messages : Message[] = [];

  constructor() { }

  getMessages() {
    return this.messages;
  }
  
  addMessage(message : Message) {
    this.messages.push(message);
  }

}
