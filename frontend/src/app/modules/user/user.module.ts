import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ReactiveFormsModule, FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { PaginationModule } from 'ngx-bootstrap/pagination';




@NgModule({
  declarations: [
    ],
  imports: [
    CommonModule,
    ReactiveFormsModule,   
    FormsModule,
    BrowserModule,
    RouterModule,  
    HttpClientModule,
    PaginationModule.forRoot(),   
  ],
  exports: [],
  entryComponents:[]
})
export class UserModule { }
