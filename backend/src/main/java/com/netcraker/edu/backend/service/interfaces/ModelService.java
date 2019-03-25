package com.netcraker.edu.backend.service.interfaces;

import com.netcraker.edu.backend.entities.Model;

import java.util.List;

public interface ModelService {

    List<Model> findAll();

    Model save(Model model);

    Model findByModelName (String model_name);

    void delete(long id);
}
