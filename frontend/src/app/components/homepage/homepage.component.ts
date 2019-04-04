import { Component, OnInit } from "@angular/core";
import { CarService } from "../../services/car.service";
import { FormGroup, FormControl, Validators } from "@angular/forms";
import { Observable } from "../../../../node_modules/rxjs";

@Component({
  selector: "app-homepage",
  templateUrl: "./homepage.component.html",
  styleUrls: ["./homepage.component.css"]
})
export class HomepageComponent implements OnInit {
  models: string[] = [
    " Maruti Suzuki Alto 800",
    " Renault Kwid, Hyundai Grand i10",
    "Maruti Suzuki Ciaz"
  ];
  carform: FormGroup;
  validmessage: string = "";
  constructor(private carservice: CarService) {}
  submitRegistration() {
    if (this.carform.valid) {
      this.validmessage = "Your Car Rental Registration has been submitted";
      this.carservice.createcarregistration(this.carform.value).subscribe(
        data => {
          this.carform.reset();
          return true;
        },
        error => {
          return Observable.throw(error);
        }
      );
    } else {
      this.validmessage = "Please fill out the form before registration";
    }
  }
  ngOnInit() {
    this.carform = new FormGroup({
      name: new FormControl("", Validators.required),
      email: new FormControl("", Validators.required),
      phone: new FormControl("", Validators.required),
      model: new FormControl("", Validators.required),
      serialNumber: new FormControl("", Validators.required),
      rentalDate: new FormControl("", Validators.required),
      rentalPrice: new FormControl("", Validators.required),
      deliveryDate: new FormControl("", Validators.required),
      contact: new FormControl()
    });
  }
}
