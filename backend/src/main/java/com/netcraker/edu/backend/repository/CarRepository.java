package com.netcraker.edu.backend.repository;

import com.netcraker.edu.backend.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> findByYearOfIssue(int yearOfIssue);

    List<Car> findByColor(String color);

    List<Car> findByProvider(String provider);

    List<Car> findByMileageBetween(double startingMileage, double finalMileage);

    List<Car> findByEngineType(String engineType);

    List<Car> findByTransmission(String transmission);
}
