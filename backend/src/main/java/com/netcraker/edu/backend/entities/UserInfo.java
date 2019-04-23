package com.netcraker.edu.backend.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "info")
public class UserInfo extends BaseEntity {

    public UserInfo() {
    }

    public UserInfo(long id, String name, String surname, String lastname, String bookingHistory, String phoneNumber, String address) {
        super(id);
        this.name = name;
        this.surname = surname;
        this.lastname = lastname;
        this.bookingHistory = bookingHistory;
        this.phoneNumber = phoneNumber;
        this.address = address;
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

    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private User user;

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
        UserInfo userInfo = (UserInfo) o;
        return Objects.equals(name, userInfo.name) &&
                Objects.equals(surname, userInfo.surname) &&
                Objects.equals(lastname, userInfo.lastname) &&
                Objects.equals(bookingHistory, userInfo.bookingHistory) &&
                Objects.equals(phoneNumber, userInfo.phoneNumber) &&
                Objects.equals(address, userInfo.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, surname, lastname, bookingHistory, phoneNumber, address);
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", bookingHistory='" + bookingHistory + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
