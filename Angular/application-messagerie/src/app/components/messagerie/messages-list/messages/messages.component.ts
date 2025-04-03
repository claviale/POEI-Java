import { CommonModule } from '@angular/common';
import { Component, Input, OnInit } from '@angular/core';
import { Message } from '../../../../interfaces/message';


@Component({
  selector: 'app-messages',
  imports: [CommonModule],
  templateUrl: './messages.component.html',
  styleUrl: './messages.component.css'
})
export class MessagesComponent implements OnInit {
  @Input()
  message ?: Message;
  is_author = false;

  ngOnInit(): void {
    let username = sessionStorage.getItem("user");
    if (username) {
      if (username == this.message?.author) {
        this.is_author = true;
      }
    }
  }
}
