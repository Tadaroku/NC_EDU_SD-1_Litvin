package com.netcraker.edu.backend.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.netcraker.edu.backend.entities.enums.Status;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Car extends BaseEntity {

    public Car() {
    }

    public Car(long id) {
        super(id);
    }

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status;

    @Column(name = "engine_type", nullable = false)
    private String engineType;

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

    @Column(name = "year_of_issue", nullable = false)
    private int yearOfIssue;

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

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
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

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    @JsonIgnore
    public Rent getRent() {
        return rent;
    }

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    @JsonIgnore
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
                yearOfIssue == car.yearOfIssue &&
                status == car.status &&
                Objects.equals(engineType, car.engineType) &&
                Objects.equals(transmission, car.transmission) &&
                Objects.equals(color, car.color) &&
                Objects.equals(provider, car.provider);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), status, engineType, mileage, transmission, condition, color, provider, yearOfIssue);
    }

    @Override
    public String toString() {
        return "Car{" +
                "status=" + status +
                ", engineType='" + engineType + '\'' +
                ", mileage=" + mileage +
                ", transmission='" + transmission + '\'' +
                ", condition=" + condition +
                ", color='" + color + '\'' +
                ", provider='" + provider + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                '}';
    }
}
