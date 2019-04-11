package com.netcraker.edu.backend.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

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

    @Column(name = "booking_history")
    private String bookingHistory;

    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private String address;

    @OneToOne
    @JoinColumn(name = "info_id")
    private User user;

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

    public String getBookingHistory() {
        return bookingHistory;
    }

    public void setBookingHistory(String bookingHistory) {
        this.bookingHistory = bookingHistory;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @JsonIgnore
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Info info = (Info) o;
        return Objects.equals(name, info.name) &&
                Objects.equals(surname, info.surname) &&
                Objects.equals(lastname, info.lastname) &&
                Objects.equals(bookingHistory, info.bookingHistory) &&
                Objects.equals(phoneNumber, info.phoneNumber) &&
                Objects.equals(address, info.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, surname, lastname, bookingHistory, phoneNumber, address);
    }

    @Override
    public String toString() {
        return "Info{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", bookingHistory='" + bookingHistory + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
