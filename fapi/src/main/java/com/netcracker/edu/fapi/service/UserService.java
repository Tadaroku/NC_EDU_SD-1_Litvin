package com.netcracker.edu.fapi.service;

import com.netcracker.edu.fapi.models.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {

    User findByLogin(String login);
    List<User> findAll();
    ResponseEntity<User> save(User user);
}
