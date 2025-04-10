import { Injectable } from '@angular/core';
import { User } from '../interfaces/user';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UsersService {
  private BASE_URL = "http://localhost/";

  constructor(private client : HttpClient) { }

  get_users() {
    return this.client.get<string[]>(this.BASE_URL + "users");
  }

  add_user(user : User) {
    const headers = new HttpHeaders({'Content-Type' : 'application/json'});
    return this.client.post<User>(this.BASE_URL + "users", user, {headers});
  }

  check_user(user : User) {
    const headers = new HttpHeaders({'Content-Type' : 'application/json'});
    return this.client.post<User>(this.BASE_URL + "check-users", user, {headers})
  }

}
