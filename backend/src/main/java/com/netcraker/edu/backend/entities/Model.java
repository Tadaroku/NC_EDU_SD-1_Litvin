package com.netcraker.edu.backend.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Model extends BaseEntity {

    public Model() {
    }

    public Model(long id) {
        super(id);
    }

    @Column(name = "model_name", nullable = false)
    private String modelName;

    @Column(nullable = false)
    private String brand;

    @Column(nullable = false)
    private String description;

    @OneToMany(mappedBy = "model", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Car> cars = new HashSet<>();

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

    public Set<Car> getCars() {
        return cars;
    }

    public void setCars(Set<Car> cars) {
        this.cars = cars;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Model model = (Model) o;
        return Objects.equals(modelName, model.modelName) &&
                Objects.equals(brand, model.brand) &&
                Objects.equals(description, model.description) &&
                Objects.equals(cars, model.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), modelName, brand, description, cars);
    }

    @Override
    public String toString() {
        return "Model{" +
                "modelName='" + modelName + '\'' +
                ", brand='" + brand + '\'' +
                ", description='" + description + '\'' +
                ", cars=" + cars +
                '}';
    }
}
