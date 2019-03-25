package com.netcraker.edu.backend.controller;

import com.netcraker.edu.backend.entities.User;
import com.netcraker.edu.backend.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")

public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/find/{email}", method = RequestMethod.GET)
    public ResponseEntity<User> getUserByEmail(@PathVariable(name = "email") String email) {
        User user = userService.findByEmail(email);
        return ResponseEntity.ok(user);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<User> getAllUsers() {
        return userService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public User saveUser(@RequestBody User user) {
        return userService.save(user);
    }
}
