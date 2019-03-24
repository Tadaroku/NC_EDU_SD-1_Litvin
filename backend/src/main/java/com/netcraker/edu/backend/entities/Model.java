package com.netcraker.edu.backend.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Model extends BaseEntity {

    public Model() {
    }

    public Model(int id) {
        super(id);
    }

    @Column(nullable = false)
    private String model_name;

    @Column(nullable = false)
    private String brand;

    @Column(nullable = false)
    private String description;

    public String getModel_name() {
        return model_name;
    }

    public void setModel_name(String model_name) {
        this.model_name = model_name;
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
}
