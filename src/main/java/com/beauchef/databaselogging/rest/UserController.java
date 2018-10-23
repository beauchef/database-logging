package com.beauchef.databaselogging.rest;

import com.beauchef.databaselogging.model.User;
import com.beauchef.databaselogging.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author beauchef on 2018-10-04.
 */
@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> get() {
        return userService.getUsers();
    }

    @GetMapping("/id/{id}")
    public User get(@PathVariable long id) {
        return userService.getById(id);
    }

    @PostMapping
    public User add(@RequestBody User user) {
        return userService.addUser(user);
    }
}
