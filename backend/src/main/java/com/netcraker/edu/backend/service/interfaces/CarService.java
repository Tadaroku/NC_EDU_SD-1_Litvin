package com.netcraker.edu.backend.service.interfaces;

import com.netcraker.edu.backend.entities.Car;

import java.util.List;

public interface CarService {

    List<Car> findAll();

    Car save(Car car);

    void delete(long id);

    List<Car> findByYearOfIssue(int yearOfIssue);

    List<Car> findByColor(String color);

    List<Car> findByProvider(String provider);

    List<Car> findByMileageBetween(double startingMileage, double finalMileage);

    List<Car> findByEngineType(String engineType);

    List<Car> findByTransmission(String transmission);
}
