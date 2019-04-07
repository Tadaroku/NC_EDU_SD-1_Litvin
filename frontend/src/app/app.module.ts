import { BrowserModule } from "@angular/platform-browser";
import { NgModule } from "@angular/core";
import "rxjs";
import { AppComponent } from "./app.component";
import { CarService } from "./services/car.service";
import { HttpClientModule } from "@angular/common/http";
import { RootComponent } from "./components/root/root.component";
import { AppRoutingModule } from ".//app-routing.module";
import { ReactiveFormsModule } from "@angular/forms";
import { HomepageComponent } from "./components/homepage/homepage.component";
import { ViewRegistrationComponent } from "./components/view-registration/view-registration.component";
import { CallbackComponent } from "./components/callback/callback.component";
import { AuthService } from "./services/auth.service";
import { AutoGuard } from "./services/auth.guard";
@NgModule({
  declarations: [
    AppComponent,
    RootComponent,
    HomepageComponent,
    ViewRegistrationComponent,
    CallbackComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    ReactiveFormsModule
  ],
  providers: [CarService, AuthService, AutoGuard],
  bootstrap: [AppComponent]
})
export class AppModule {}
