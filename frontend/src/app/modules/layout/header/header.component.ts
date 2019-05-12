import { Component, OnInit } from '@angular/core';
import {AuthenticationService} from "../../../services/authentication.service";

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html'

})
export class HeaderComponent implements OnInit {

  isLogged: boolean = false;
  
  constructor(private authenticationService: AuthenticationService) { }

  ngOnInit() {

    const token = this.authenticationService.tokenValue;
    if (token) {
        this.isLogged = true;  
    }   
    
  }

  public logOut(){    
    this.authenticationService.logout(); 
    this.isLogged = false;  
    location.reload(true);
  }
}
