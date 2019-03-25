package com.netcraker.edu.backend.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Rent extends BaseEntity {

    public Rent() {
    }

    public Rent(long id) {
        super(id);
    }

    @Column(nullable = false)
    private LocalDate start_date;

    @Column(nullable = false)
    private LocalDate end_date;

    @Column(nullable = false)
    private double price;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "rent", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Car> cars = new HashSet<>();

    public LocalDate getStart_date() {
        return start_date;
    }

    public void setStart_date(LocalDate start_date) {
        this.start_date = start_date;
    }

    public LocalDate getEnd_date() {
        return end_date;
    }

    public void setEnd_date(LocalDate end_date) {
        this.end_date = end_date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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
        Rent rent = (Rent) o;
        return Double.compare(rent.price, price) == 0 &&
                Objects.equals(start_date, rent.start_date) &&
                Objects.equals(end_date, rent.end_date) &&
                Objects.equals(user, rent.user) &&
                Objects.equals(cars, rent.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), start_date, end_date, price, user, cars);
    }

    @Override
    public String toString() {
        return "Rent{" +
                "start_date=" + start_date +
                ", end_date=" + end_date +
                ", price=" + price +
                ", user=" + user +
                ", cars=" + cars +
                '}';
    }
}
