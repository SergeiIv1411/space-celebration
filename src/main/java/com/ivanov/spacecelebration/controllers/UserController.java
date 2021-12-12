package com.ivanov.spacecelebration.controllers;

import com.ivanov.spacecelebration.dto.UserDTO;
import com.ivanov.spacecelebration.model.User;
import com.ivanov.spacecelebration.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(value = "/new")
    public User newUser(@RequestBody UserDTO user) {
        return userService.save(user);
    }
}
