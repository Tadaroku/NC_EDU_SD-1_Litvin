package com.netcraker.edu.backend.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

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

    @OneToMany(mappedBy = "model", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Car> cars = new HashSet<>();

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
        return Objects.equals(model_name, model.model_name) &&
                Objects.equals(brand, model.brand) &&
                Objects.equals(description, model.description) &&
                Objects.equals(cars, model.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), model_name, brand, description, cars);
    }

    @Override
    public String toString() {
        return "Model{" +
                "model_name='" + model_name + '\'' +
                ", brand='" + brand + '\'' +
                ", description='" + description + '\'' +
                ", cars=" + cars +
                '}';
    }
}
