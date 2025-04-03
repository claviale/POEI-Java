import { Injectable } from '@angular/core';
import { User } from '../interfaces/user';

@Injectable({
  providedIn: 'root'
})
export class UsersService {
  private users : User[] = [];

  constructor() { }

  getUsers() {
    return this.users;
  }

  addUser(user : User) {
    const userExists = this.users.some(existingUser => existingUser.username == user.username);
    if (!userExists) {
      this.users.unshift(user);
    }
  }

  checkUser(user : User) {
    return this.users.some(u =>
      u.username == user.username
      && u.password == user.password
    );
  }

}
