package com.netcraker.edu.backend.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Role extends BaseEntity{

    public Role() {
    }

    public Role(int id) {
        super(id);
    }

    @Column
    private String role_name;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "roles")
    private Set<User> users = new HashSet<>();

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role role = (Role) o;
        return Objects.equals(role_name, role.role_name) &&
                Objects.equals(users, role.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(role_name, users);
    }

    @Override
    public String toString() {
        return "Role{" +
                "role_name='" + role_name + '\'' +
                ", users=" + users +
                '}';
    }
}
