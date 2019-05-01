package com.netcracker.edu.fapi.service.impl;

import com.netcracker.edu.fapi.models.Car;
import com.netcracker.edu.fapi.service.CarService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Value("${backend.server.url}")
    private String backendServerUrl;

    @Override
    public List<Car> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        Car[] carsResponce = restTemplate.getForObject(backendServerUrl + "/api/v1/cars", Car[].class);
        return carsResponce == null ? Collections.emptyList() : Arrays.asList(carsResponce);
    }

    @Override
    public Car save(Car car) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForEntity(backendServerUrl + "/api/v1/cars", car, Car.class).getBody();
    }

    @Override
    public void delete(Long id) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete(backendServerUrl + "/api/v1/cars/" + id);
    }

    @Override
    public Car findById(Long id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(backendServerUrl + "/api/v1/cars/" + id, Car.class);
    }
}
