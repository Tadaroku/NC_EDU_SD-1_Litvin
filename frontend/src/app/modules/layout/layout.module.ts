import {NgModule} from "@angular/core";
import {NotFoundComponent} from "./components/404/not-found.component";
import {HomeComponent} from "./components/home/home.component";
import {HeaderModule} from "../header/header.module";
import {RouterModule} from "@angular/router";

@NgModule({
  declarations: [
    HomeComponent,
    NotFoundComponent,

  ],
  imports: [

    HeaderModule,
    RouterModule
  ],
  providers: [],
  exports: [HomeComponent, NotFoundComponent,]
})
export class LayoutModule {}
