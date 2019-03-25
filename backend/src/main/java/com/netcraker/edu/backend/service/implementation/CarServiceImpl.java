package com.netcraker.edu.backend.service.implementation;

import com.netcraker.edu.backend.entities.Car;
import com.netcraker.edu.backend.repository.CarRepository;
import com.netcraker.edu.backend.service.interfaces.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public void delete(long id) {
        carRepository.deleteById(id);
    }
}
