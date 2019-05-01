package com.netcracker.edu.fapi.service.impl;

import com.netcracker.edu.fapi.models.Model;
import com.netcracker.edu.fapi.service.ModelService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class ModelServiceImpl implements ModelService {

    @Value("${backend.server.url}")
    private String backendServerUrl;

    @Override
    public List<Model> findAll() {
        RestTemplate restTemplate = new RestTemplate();
        Model[] modelsResponce = restTemplate.getForObject(backendServerUrl + "/api/v1/models", Model[].class);
        return modelsResponce == null ? Collections.emptyList() : Arrays.asList(modelsResponce);
    }

    @Override
    public Model save(Model model) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForEntity(backendServerUrl + "/api/v1/models", model, Model.class).getBody();
    }

    @Override
    public void delete(Long id) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete(backendServerUrl + "/api/v1/models/" + id);
    }

    @Override
    public Model findById(Long id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(backendServerUrl + "/api/v1/models/" + id, Model.class);
    }
}
