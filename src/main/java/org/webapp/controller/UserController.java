package org.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.webapp.model.UserModel;

import java.util.Set;

@RestController
@RequestMapping(value = "/", method = RequestMethod.GET)
public class UserController {
    Set<UserModel> userList;

    @Autowired
    public UserController(Set<UserModel> userList) {
        this.userList = userList;
    }

    @GetMapping("/users")
    Set<UserModel> getAll() {
        return userList;
    }

    @GetMapping("/user/{userId}")
    UserModel getUser(@PathVariable int userId) throws Exception {
        for (UserModel user : userList) {
            if (user.getId() == userId) {
                return user;
            }
        }
        throw new Exception();
    }

    @GetMapping("/user")
    UserModel getUserByParam(@RequestParam int id) throws Exception {
        for (UserModel user : userList) {
            if (user.getId() == id) {
                return user;
            }
        }
        throw new Exception();
    }
}
