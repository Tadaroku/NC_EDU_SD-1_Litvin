package com.netcraker.edu.backend.controller;

import com.netcraker.edu.backend.entities.Car;
import com.netcraker.edu.backend.service.interfaces.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/car")
public class CarController {

    private CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
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

    @RequestMapping(value = "/findYear/{yearOfIssue}", method = RequestMethod.GET)
    public ResponseEntity<List<Car>> getCarByYearOfIssue(@PathVariable(name = "yearOfIssue") int yearOfIssue) {
        List<Car> cars = carService.findByYearOfIssue(yearOfIssue);
        return new ResponseEntity<>(cars, HttpStatus.ACCEPTED);
    }

    @RequestMapping(value = "/findColor/{color}", method = RequestMethod.GET)
    public ResponseEntity<List<Car>> getCarByColor(@PathVariable(name = "color") String color) {
        List<Car> cars = carService.findByColor(color);
        return new ResponseEntity<>(cars, HttpStatus.ACCEPTED);
    }

    @RequestMapping(value = "/find", method = RequestMethod.GET)
    public ResponseEntity<List<Car>> getCarByMileage(@RequestParam(name = "before") double startingMileage, @RequestParam(name = "after") double finalMileage) {
        List<Car> cars = carService.findByMileageBetween(startingMileage, finalMileage);
        return new ResponseEntity<>(cars, HttpStatus.ACCEPTED);
    }

    @RequestMapping(value = "/findProvider/{provider}", method = RequestMethod.GET)
    public ResponseEntity<List<Car>> getCarByProvider(@PathVariable(name = "provider") String provider) {
        List<Car> cars = carService.findByProvider(provider);
        return new ResponseEntity<>(cars, HttpStatus.ACCEPTED);
    }

    @RequestMapping(value = "/findEngineType/{engineType}", method = RequestMethod.GET)
    public ResponseEntity<List<Car>> getCarByEngineType(@PathVariable(name = "engineType") String engineType) {
        List<Car> cars = carService.findByEngineType(engineType);
        return new ResponseEntity<>(cars, HttpStatus.ACCEPTED);
    }

    @RequestMapping(value = "/findTransmission/{transmission}", method = RequestMethod.GET)
    public ResponseEntity<List<Car>> getCarByTransmission(@PathVariable(name = "transmission") String transmission) {
        List<Car> cars = carService.findByTransmission(transmission);
        return new ResponseEntity<>(cars, HttpStatus.ACCEPTED);
    }

    @SuppressWarnings("Duplicates")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Car> getCarById(@PathVariable(name = "id") Long id) {
        Optional<Car> car = carService.findById(id);
        if (!car.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(car.get());
    }
}