package com.netcraker.edu.backend.entities;

import com.netcraker.edu.backend.entities.enums.Status;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Car extends BaseEntity {

    public Car() {
    }

    public Car(int id) {
        super(id);
    }

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status;

    @Column(nullable = false)
    private double mileage;

    @Column(nullable = false)
    private String transmission;

    @Column(name = "ENABLED", nullable = false)
    private boolean condition = true;

    @Column(nullable = false)
    private String color;

    @Column(nullable = false)
    private String provider;

    @ManyToOne
    @JoinColumn(name = "rent_id")
    private Rent rent;

    @ManyToOne
    @JoinColumn(name = "model_id")
    private Model model;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }


    public boolean isCondition() {
        return condition;
    }

    public void setCondition(boolean condition) {
        this.condition = condition;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public Rent getRent() {
        return rent;
    }

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return Double.compare(car.mileage, mileage) == 0 &&
                condition == car.condition &&
                status == car.status &&
                Objects.equals(transmission, car.transmission) &&
                Objects.equals(color, car.color) &&
                Objects.equals(provider, car.provider) &&
                Objects.equals(rent, car.rent) &&
                Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), status, mileage, transmission, condition, color, provider, rent, model);
    }

    @Override
    public String toString() {
        return "Car{" +
                "status=" + status +
                ", mileage=" + mileage +
                ", transmission='" + transmission + '\'' +
                ", condition=" + condition +
                ", color='" + color + '\'' +
                ", provider='" + provider + '\'' +
                ", rent=" + rent +
                ", model=" + model +
                '}';
    }
}
