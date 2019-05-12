
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NotFoundComponent } from './404/not-found.component';
import { HomeComponent } from './home/home.component';
import {LoginComponent} from "./login/login.component";
import { ReactiveFormsModule } from '@angular/forms';
import { UserService } from 'src/app/services/user.service';
import { AuthenticationService } from 'src/app/services/authentication.service';
import { HeaderComponent } from './header/header.component';
import { UserModule } from '../user/user.module';
import { TabsModule } from 'ngx-bootstrap';

@NgModule({
  declarations: [
    NotFoundComponent,
    HomeComponent,
    LoginComponent,
    HeaderComponent,
  ],
  imports: [
    CommonModule,
    ReactiveFormsModule,
    UserModule,
    TabsModule.forRoot()
  ],
  exports:[HeaderComponent, LoginComponent, HomeComponent],
  providers: [UserService, AuthenticationService]

})
export class LayoutModule { }
