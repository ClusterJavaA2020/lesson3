package org.iryna97.lesson3.controller;

import org.iryna97.lesson3.model.UserModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/users")
public class MyController {
    @GetMapping
    ResponseEntity<Set<UserModel>> returnHello(){
        HashSet<UserModel> users = new HashSet<UserModel>();
        users.add(UserModel.builder().name("Iryna").email("my@email.com").password("12345").id(1).build());
        users.add(UserModel.builder().name("Iryna2").email("my@email.com").password("12345").id(2).build());

        return new ResponseEntity<Set<UserModel>>(users, HttpStatus.OK);
    }

    @GetMapping("/{userId}")
        UserModel getuser(@PathVariable int userId){
            return UserModel.builder().name("Iryna").email("my@email.com").password("12345").id(userId).build();
        }
    }

