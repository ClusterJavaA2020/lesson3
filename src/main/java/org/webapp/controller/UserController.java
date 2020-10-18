package org.webapp.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.webapp.Service.UserService;
import org.webapp.model.UserModel;

import java.util.Set;

@RestController
@RequestMapping(value = "/", method = RequestMethod.GET)
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class UserController {
    public UserService userService;

    @GetMapping("/users")
    Set<UserModel> getAll() {
        return userService.getAll();
    }

    @GetMapping("/user/{userId}")
    UserModel getUserByPath(@PathVariable int userId) throws Exception {
        return userService.getUserByPath(userId);
    }

    @GetMapping("/user")
    UserModel getUserByParam(@RequestParam int userId) throws Exception {
        return userService.getUserByParam(userId);
    }

    @PostMapping("user/add")
    boolean addUser(@RequestBody UserModel userModel) {
        return userService.addUser(userModel);
    }

    @PutMapping("user/edit")
    UserModel editUser(@RequestBody UserModel userModel) {
        return userService.editUser(userModel);
    }

    @DeleteMapping("user/remove/{userId}")
    boolean removeUserById(@PathVariable int userId) {
        return userService.removeUserById(userId);
    }
}
