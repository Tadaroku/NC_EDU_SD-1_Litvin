import { Injectable } from "@angular/core";
import { HttpClient, HttpHeaders } from "@angular/common/http";
const httpOptions = {
  headers: new HttpHeaders({ "Content-type": "application/json" })
};
@Injectable()
export class CarService {
  constructor(private http: HttpClient) {}

  getCars() {
    let token = localStorage.getItem("access_token");
    return this.http.get("/server/api/b1/cars", {
      headers: new HttpHeaders().set("Authorization", "Bearer" + token)
    });
  }

  getCar(id: number) {
    let token = localStorage.getItem("access_token");
    return this.http.get("/server/api/b1/cars/" + id, {
      headers: new HttpHeaders().set("Authorization", "Bearer" + token)
    });
  }
  createcarregistration(car) {
    let body = JSON.stringify(car);
    return this.http.post("/server/api/b1/cars", body, httpOptions);
  }
}
