package org.example.service;

import org.springframework.stereotype.Service;
import org.example.model.User;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService {

    private Set<User> users = new HashSet<>();

    UserService() {
        users.add(User
                .builder()
                .id(1)
                .age(22)
                .name("David")
                .build());
        users.add(User
                .builder()
                .id(2)
                .age(25)
                .name("Oleg")
                .build());
    }

    public Set<User> getAll() {
        return users;
    }

    public String addUser(User user) {
        int length = users.size();
        user.setId(users.size() + 1);
        users.add(user);
        if (users.size() > length) return "200 OK";
        else return "500 Internal error";
    }

    public User getById(Integer id) {
       for (User user: users){
           if (user.getId().equals(id)) {
               return user;
           }
       }
       return null;
    }

    public String deleteUser(Integer id) {
        int length = users.size();
        for (User user: users){
            if (user.getId().equals(id)) {
                users.remove(user);
                break;
            }
        }
        if (users.size() < length) return "200 OK";
        else return "500 Internal error";
    }

}
