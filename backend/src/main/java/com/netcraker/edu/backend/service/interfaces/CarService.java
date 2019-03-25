package com.netcraker.edu.backend.service.interfaces;

import com.netcraker.edu.backend.entities.Car;

import java.util.List;

public interface CarService {

    List<Car> findAll();

    Car save(Car car);

    void delete(long id);
}
