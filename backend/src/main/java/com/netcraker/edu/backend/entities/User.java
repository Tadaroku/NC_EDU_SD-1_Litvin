package com.netcraker.edu.backend.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class User extends BaseEntity {

    public User() {
    }

    public User(int id) {
        super(id);
    }

    public User(int id, String email, String password, Info info, Set<Role> roles, Set<Rent> rents) {
        super(id);
        this.email = email;
        this.password = password;
        this.info = info;
        this.roles = roles;
        this.rents = rents;
    }

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @OneToOne(cascade = CascadeType.ALL)
    private Info info;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "role_to_user", joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Rent> rents = new HashSet<>();

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public Set<Rent> getRents() {
        return rents;
    }

    public void setRents(Set<Rent> rents) {
        this.rents = rents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(email, user.email) &&
                Objects.equals(password, user.password) &&
                Objects.equals(info, user.info) &&
                Objects.equals(roles, user.roles) &&
                Objects.equals(rents, user.rents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, password, info, roles, rents);
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", info=" + info +
                ", roles=" + roles +
                ", rents=" + rents +
                '}';
    }
}
