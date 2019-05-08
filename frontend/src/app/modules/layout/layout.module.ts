import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
// import { NotFoundComponent } from './not-found/not-found.component';
// import { HomeComponent } from './home/home.component';
// import { TaskModule } from '../task/task.module';
import {LoginComponent} from "./components/login/login.component";
import { ReactiveFormsModule } from '@angular/forms';
import { UserService } from 'src/app/services/user.service';
import { AuthenticationService } from 'src/app/services/authentication.service';
// import { AdminComponent } from './admin/admin.component';
// import { HeaderComponent } from './header/header.component';
import { UserModule } from '../user/user.module';
// import { FooterComponent } from './footer/footer.component';

import { TabsModule } from 'ngx-bootstrap';

@NgModule({
  declarations: [
    LoginComponent,
    ],
  imports: [
    CommonModule,

    ReactiveFormsModule,
    UserModule,
    TabsModule.forRoot()
  ],
  exports:[ LoginComponent],
  providers: [UserService, AuthenticationService]

})
export class LayoutModule { }
