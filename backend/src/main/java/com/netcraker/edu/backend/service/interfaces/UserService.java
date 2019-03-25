package com.netcraker.edu.backend.service.interfaces;


import com.netcraker.edu.backend.entities.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User findByEmail(String email);

    User save(User user);

    void delete(long id);
}
