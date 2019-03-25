package com.netcraker.edu.backend.controller;

import com.netcraker.edu.backend.entities.Car;
import com.netcraker.edu.backend.service.interfaces.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/car")
public class CarController {

    private CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Car> getAllCars() {
        return carService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Car saveCar(@RequestBody Car car) {
        return carService.save(car);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteCar(@PathVariable(name = "id") Long id) {
        carService.delete(id);
    }
}
