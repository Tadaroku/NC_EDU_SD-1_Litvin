package com.netcraker.edu.backend.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.util.Objects;

@Entity
public class Info extends BaseEntity {

    public Info() {
    }

    public Info(long id) {
        super(id);
    }

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String surname;

    @Column(nullable = false)
    private String lastname;

    @Column
    private String booking_history;

    @Column(nullable = false)
    private String phone_number;

    @Column(nullable = false)
    private String address;

    @OneToOne
    @JoinColumn(name = "info_id")
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getBooking_history() {
        return booking_history;
    }

    public void setBooking_history(String booking_history) {
        this.booking_history = booking_history;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Info info = (Info) o;
        return Objects.equals(user, info.user) &&
                Objects.equals(name, info.name) &&
                Objects.equals(surname, info.surname) &&
                Objects.equals(lastname, info.lastname) &&
                Objects.equals(booking_history, info.booking_history) &&
                Objects.equals(phone_number, info.phone_number) &&
                Objects.equals(address, info.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, name, surname, lastname, booking_history, phone_number, address);
    }

    @Override
    public String toString() {
        return "Info{" +
                "user=" + user +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", booking_history='" + booking_history + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
