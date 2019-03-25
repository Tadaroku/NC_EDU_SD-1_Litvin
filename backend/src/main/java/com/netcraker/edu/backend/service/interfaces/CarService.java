package com.netcraker.edu.backend.service.interfaces;

import com.netcraker.edu.backend.entities.Car;

import java.util.List;

public interface CarService {

    List<Car> findAll();

    Car save(Car car);

    Car findByYearOfIssue(String year_of_issue);

    void delete(long id);
}
