import { NgModule } from "@angular/core";
import { CommonModule } from "@angular/common";
import { RootComponent } from "./components/root/root.component";
import { Routes, RouterModule } from "@angular/router";
import { HomepageComponent } from "./components/homepage/homepage.component";
import { ViewRegistrationComponent } from "./components/view-registration/view-registration.component";
import { CallbackComponent } from "./components/callback/callback.component";
import { AutoGuard } from "./services/auth.guard";

const routes: Routes = [
  { path: "root", component: RootComponent, canActivate: [AutoGuard] },
  { path: "", component: HomepageComponent },
  {
    path: "root/view/:id",
    component: ViewRegistrationComponent,
    canActivate: [AutoGuard]
  },
  { path: "callback", component: CallbackComponent }
];
@NgModule({
  imports: [CommonModule, RouterModule.forRoot(routes)],
  exports: [RouterModule],
  declarations: []
})
export class AppRoutingModule {}
