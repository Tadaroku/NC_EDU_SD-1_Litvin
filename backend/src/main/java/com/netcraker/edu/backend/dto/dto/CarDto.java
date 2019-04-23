package com.netcraker.edu.backend.dto.dto;

import java.util.Objects;

public class CarDto extends BaseDto {

    private String status;
    private int yearOfIssue;
    private double mileage;
    private String provider;
    private String color;
    private String engineType;
    private String transmission;
    private boolean isActive;

    public CarDto() {
    }

    public CarDto(long id, String status, int yearOfIssue, double mileage, String provider, String color, String engineType, String transmission, boolean isActive) {
        super(id);
        this.status = status;
        this.yearOfIssue = yearOfIssue;
        this.mileage = mileage;
        this.provider = provider;
        this.color = color;
        this.engineType = engineType;
        this.transmission = transmission;
        this.isActive = isActive;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarDto carDto = (CarDto) o;
        return yearOfIssue == carDto.yearOfIssue &&
                Double.compare(carDto.mileage, mileage) == 0 &&
                isActive == carDto.isActive &&
                Objects.equals(status, carDto.status) &&
                Objects.equals(provider, carDto.provider) &&
                Objects.equals(color, carDto.color) &&
                Objects.equals(engineType, carDto.engineType) &&
                Objects.equals(transmission, carDto.transmission);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, yearOfIssue, mileage, provider, color, engineType, transmission, isActive);
    }

    @Override
    public String toString() {
        return "CarDto{" +
                "status='" + status + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                ", mileage=" + mileage +
                ", provider='" + provider + '\'' +
                ", color='" + color + '\'' +
                ", engineType='" + engineType + '\'' +
                ", transmission='" + transmission + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
