package com.netcracker.edu.fapi.service.impl;

import com.netcracker.edu.fapi.models.Rent;
import com.netcracker.edu.fapi.service.RentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class RentServiceImpl implements RentService {

    @Value("${backend.server.url}")
    private String backendServerUrl;

    @Override
    public List<Rent> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        Rent[] rentsResponse = restTemplate.getForObject(backendServerUrl + "/api/v1/rents", Rent[].class);
        return rentsResponse == null ? Collections.emptyList() : Arrays.asList(rentsResponse);
    }

    @Override
    public Rent save(Rent rent) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForEntity(backendServerUrl + "/api/v1/rents", rent, Rent.class).getBody();
    }

    @Override
    public void delete(Long id) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete(backendServerUrl + "/api/v1/rents/" + id);
    }

    @Override
    public Rent findById(Long id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(backendServerUrl + "/api/v1/rents/" + id, Rent.class);
    }
}
