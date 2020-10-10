package org.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.example.model.User;
import org.example.service.UserService;

import java.util.Set;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getAll")
    Set<User> getAll() {
        return userService.getAll();
    }

    @GetMapping("/getById/{id}")
    User getUserById(@PathVariable Integer id) throws Exception {
        User user = userService.getById(id);
        if (user == null) throw new Exception();
        return user;
    }

    @PostMapping("/addUser")
    String addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @DeleteMapping("/deleteUserById")
    String deleteUser(@RequestParam Integer id) {
        return userService.deleteUser(id);
    }


}
