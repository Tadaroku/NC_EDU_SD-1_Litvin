package com.netcraker.edu.backend.controller;

import com.netcraker.edu.backend.entities.Model;
import com.netcraker.edu.backend.service.interfaces.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/model")
public class ModelController {

    private ModelService modelService;

    @Autowired
    public ModelController(ModelService modelService) {
        this.modelService = modelService;
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Model> getAllModels() {
        return modelService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Model saveModel(@RequestBody Model model) {
        return modelService.save(model);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteModel(@PathVariable(name = "id") Long id) {
        modelService.delete(id);
    }

    @RequestMapping(value = "/find/{brand}", method = RequestMethod.GET)
    public ResponseEntity<List<Model>> getModelByBrand(@PathVariable(name = "brand") String brand) {
        List<Model> models = modelService.findByBrand(brand);
        return new ResponseEntity<>(models, HttpStatus.ACCEPTED);
    }
}
