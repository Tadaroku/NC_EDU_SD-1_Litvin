import { Component, OnInit } from "@angular/core";
import { CarService } from "../../services/car.service";
import { ActivatedRoute } from "../../../../node_modules/@angular/router";

@Component({
  selector: "app-view-registration",
  templateUrl: "./view-registration.component.html",
  styleUrls: ["./view-registration.component.css"]
})
export class ViewRegistrationComponent implements OnInit {
  constructor(private carservice: CarService, private route: ActivatedRoute) {}
  public CarReg;

  getCarReg(id: number) {
    this.carservice.getCar(id).subscribe(
      data => {
        this.CarReg = data;
      },
      err => console.log(err),
      () => console.log("Cars loaded")
    );
  }
  ngOnInit() {
    this.getCarReg(this.route.snapshot.params.id);
  }
}
