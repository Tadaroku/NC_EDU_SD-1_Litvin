package com.netcracker.edu.fapi.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Model {

    private long id;
    private String modelName;
    private String brand;
    private String description;

    public Model() {
    }

    public Model(long id, String modelName, String brand, String description) {
        this.id = id;
        this.modelName = modelName;
        this.brand = brand;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Model{" +
                "id=" + id +
                ", modelName='" + modelName + '\'' +
                ", brand='" + brand + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
