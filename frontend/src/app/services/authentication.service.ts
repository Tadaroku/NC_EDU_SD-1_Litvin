import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject, Observable} from 'rxjs';
import {map} from 'rxjs/operators';


import {environment} from 'src/environments/environment';
import {AuthToken} from '../modules/user/models/jwtToken';
import {JwtHelperService} from '@auth0/angular-jwt';

@Injectable({ providedIn: 'root' })
export class AuthenticationService {
  private tokenSubject: BehaviorSubject<AuthToken>;
  public token: Observable<AuthToken>;

  constructor(private http: HttpClient) {
    this.tokenSubject = new BehaviorSubject<AuthToken>(JSON.parse(localStorage.getItem('token')));
    this.token = this.tokenSubject.asObservable();
  }

  public get tokenValue(): AuthToken {
    return this.tokenSubject.value;
  }

  public get currentUsername(): string {
    const helper = new JwtHelperService();
    const decodedToken = helper.decodeToken(this.tokenSubject.value.token.toString());
    return decodedToken.sub;
  }

  public get currentUsersRole(): string {
    const helper = new JwtHelperService();
    const decodedToken = helper.decodeToken(this.tokenSubject.value.token.toString());
    return decodedToken.scopes.substring(5);
  }

  login(username: string, password: string) {
    return this.http.post<any>(`${environment.apiUrl}/api/v1/token/generate`, { username, password })
      .pipe(map(token => {

        if (token) {
          localStorage.setItem('token', JSON.stringify(token));
          this.tokenSubject.next(token);
        }

        return token;
      }));
  }

  logout() {

    localStorage.removeItem('token');
    this.tokenSubject.next(null);

  }
}
