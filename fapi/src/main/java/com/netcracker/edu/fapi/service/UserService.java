package com.netcracker.edu.fapi.service;

import com.netcracker.edu.fapi.models.User;

import java.util.List;

public interface UserService {

    User findByEmail(String email);
    List<User> findAll();
    User save(User user);
    void delete(long id);
}
