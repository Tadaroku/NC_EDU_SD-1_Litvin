package com.netcraker.edu.backend.service.interfaces;


import com.netcraker.edu.backend.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> findAll();
    User findByLogin(String login);
    User save(User user);
    void delete(Long id);
    User findByPhoneNumber(String phoneNumber);

    Optional<User> findById(Long id);
}
