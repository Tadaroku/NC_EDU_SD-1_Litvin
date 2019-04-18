package com.netcracker.edu.fapi.service;

import com.netcracker.edu.fapi.models.Car;

import java.util.List;

public interface CarService {

    List<Car> findAll();

    Car save(Car car);

    void delete(Long id);

    Car findById(Long id);
}
