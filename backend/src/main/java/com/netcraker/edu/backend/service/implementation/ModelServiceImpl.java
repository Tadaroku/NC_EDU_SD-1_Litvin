package com.netcraker.edu.backend.service.implementation;

import com.netcraker.edu.backend.entities.Model;
import com.netcraker.edu.backend.repository.ModelRepository;
import com.netcraker.edu.backend.service.interfaces.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ModelServiceImpl implements ModelService {

    @Autowired
    private ModelRepository modelRepository;

    @Override
    public List<Model> findAll() {
        return modelRepository.findAll();
    }

    @Override
    public Model save(Model model) {
        return modelRepository.save(model);
    }

    @Override
    public void delete(Long id) {
        modelRepository.deleteById(id);
    }

    @Override
    public List<Model> findByBrand(String brand) {
        return modelRepository.findByBrand(brand);
    }

    @Override
    public Optional<Model> findById(Long id) {
        return modelRepository.findById(id);
    }
}
