package com.netcracker.edu.fapi.service;

import com.netcracker.edu.fapi.models.Model;

import java.util.List;

public interface ModelService {

    List<Model> findAll();

    Model save(Model model);

    void delete(Long id);

    Model findById(Long id);
}
