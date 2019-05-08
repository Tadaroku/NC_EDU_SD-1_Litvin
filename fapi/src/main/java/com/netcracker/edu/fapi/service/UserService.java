package com.netcracker.edu.fapi.service;

import com.netcracker.edu.fapi.models.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {

    User findByUsername(String username);
    List<User> findAll();
    User save(User user);
    User deleteUser(Long id);
    User findByPhoneNumber(String phoneNumber);
}
