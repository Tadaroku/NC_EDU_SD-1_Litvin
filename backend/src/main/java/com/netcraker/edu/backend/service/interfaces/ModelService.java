package com.netcraker.edu.backend.service.interfaces;

import com.netcraker.edu.backend.entities.Model;

import java.util.List;
import java.util.Optional;

public interface ModelService {

    List<Model> findAll();

    Model save(Model model);

    void delete(Long id);

    List<Model> findByBrand(String brand);

    Optional<Model> findById(Long id);
}
