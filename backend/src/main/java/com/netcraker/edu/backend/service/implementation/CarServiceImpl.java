package com.netcraker.edu.backend.service.implementation;

import com.netcraker.edu.backend.entities.Car;
import com.netcraker.edu.backend.repository.CarRepository;
import com.netcraker.edu.backend.service.interfaces.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepository carRepository;

    @Override

    public List<Car> findAll() {
        return carRepository.findAll();
    }

    @Override
    public Car save(Car car) {
        return carRepository.save(car);
    }

    @Override
    public void delete(Long id) {
        carRepository.deleteById(id);
    }

    @Override
    public List<Car> findByYearOfIssue(int yearOfIssue) {
        return carRepository.findByYearOfIssue(yearOfIssue);
    }

    @Override
    public List<Car> findByColor(String color) {
        return carRepository.findByColor(color);
    }

    @Override
    public List<Car> findByProvider(String provider) {
        return carRepository.findByProvider(provider);
    }

    @Override
    public List<Car> findByMileageBetween(double startingMileage, double finalMileage) {
        return carRepository.findByMileageBetween(startingMileage, finalMileage);
    }

    @Override
    public List<Car> findByEngineType(String engineType) {
        return carRepository.findByEngineType(engineType);
    }

    @Override
    public List<Car> findByTransmission(String transmission) {
        return carRepository.findByTransmission(transmission);
    }

    @Override
    public Optional<Car> findById(Long id) {
        return carRepository.findById(id);
    }
}
