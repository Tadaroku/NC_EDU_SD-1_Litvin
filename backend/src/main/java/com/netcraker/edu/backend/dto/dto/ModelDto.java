package com.netcraker.edu.backend.dto.dto;

import java.util.Objects;

public class ModelDto extends BaseDto {

    private String brand;
    private String modelName;
    private String description;

    public ModelDto() {
    }

    public ModelDto(long id, String brand, String modelName, String description) {
        super(id);
        this.brand = brand;
        this.modelName = modelName;
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ModelDto modelDto = (ModelDto) o;
        return Objects.equals(brand, modelDto.brand) &&
                Objects.equals(modelName, modelDto.modelName) &&
                Objects.equals(description, modelDto.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, modelName, description);
    }

    @Override
    public String toString() {
        return "ModelDto{" +
                "brand='" + brand + '\'' +
                ", modelName='" + modelName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
