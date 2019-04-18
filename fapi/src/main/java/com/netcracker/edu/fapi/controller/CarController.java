package com.netcracker.edu.fapi.controller;

import com.netcracker.edu.fapi.models.Car;
import com.netcracker.edu.fapi.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/car")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping
    public List<Car> getAllCars(){
        return carService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Car saveCar(@RequestBody Car car){
        return carService.save(car);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteCarById(@PathVariable(name = "id") Long id) {
        carService.delete(id);
    }

    @SuppressWarnings("Duplicates")
    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public ResponseEntity<Car> getCarById(@PathVariable(name = "id") Long id){
        return ResponseEntity.ok(carService.findById(id));
    }
}
