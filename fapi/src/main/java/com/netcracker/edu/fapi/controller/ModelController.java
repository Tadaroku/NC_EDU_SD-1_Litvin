package com.netcracker.edu.fapi.controller;

import com.netcracker.edu.fapi.models.Car;
import com.netcracker.edu.fapi.models.Model;
import com.netcracker.edu.fapi.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/model")
public class ModelController {

    @Autowired
    private ModelService modelService;

    @GetMapping
    public List<Model> getAllModels() {
        return modelService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Model saveModel(@RequestBody Model model) {
        return modelService.save(model);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteModelById(@PathVariable(name = "id") Long id) {
        modelService.delete(id);
    }

    @SuppressWarnings("Duplicates")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Model> getModelById(@PathVariable(name = "id") Long id) {
        return ResponseEntity.ok(modelService.findById(id));
    }
}
