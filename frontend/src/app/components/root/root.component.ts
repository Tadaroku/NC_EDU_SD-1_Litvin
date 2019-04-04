import { Component, OnInit } from "@angular/core";
import { CarService } from "../../services/car.service";

@Component({
  selector: "app-root",
  templateUrl: "./root.component.html",
  styleUrls: ["./root.component.css"]
})
export class RootComponent implements OnInit {
  public cars;
  constructor(private carservice: CarService) {}

  ngOnInit() {
    this.getCars();
  }

  getCars() {
    this.carservice.getCars().subscribe(
      data => {
        this.cars = data;
      },
      err => console.log(err),
      () => console.log("cars loaded")
    );
  }
}
