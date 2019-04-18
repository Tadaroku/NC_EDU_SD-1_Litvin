package com.netcracker.edu.fapi.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Car {

    private long id;
    private String status;
    private String engineType;
    private double mileage;
    private String transmission;
    private boolean condition = true;
    private String color;
    private String provider;
    private int yearOfIssue;

    public Car() {
    }

    public Car(long id, String status, String engineType, double mileage, String transmission, boolean condition, String color, String provider, int yearOfIssue) {
        this.id = id;
        this.status = status;
        this.engineType = engineType;
        this.mileage = mileage;
        this.transmission = transmission;
        this.condition = condition;
        this.color = color;
        this.provider = provider;
        this.yearOfIssue = yearOfIssue;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
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

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", status='" + status + '\'' +
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
