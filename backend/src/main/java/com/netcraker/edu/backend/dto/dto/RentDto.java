package com.netcraker.edu.backend.dto.dto;

import java.util.Objects;

public class RentDto extends BaseDto{

    private String startDate;
    private String endDate;
    private double price;

    public RentDto() {
    }

    public RentDto(long id, String startDate, String endDate, double price) {
        super(id);
        this.startDate = startDate;
        this.endDate = endDate;
        this.price = price;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RentDto rentDto = (RentDto) o;
        return Double.compare(rentDto.price, price) == 0 &&
                Objects.equals(startDate, rentDto.startDate) &&
                Objects.equals(endDate, rentDto.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startDate, endDate, price);
    }

    @Override
    public String toString() {
        return "RentDto{" +
                "startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", price=" + price +
                '}';
    }
}
