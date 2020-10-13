package org.example.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class UserController {

    @GetMapping("/{message}/user")
    String returnHello(@PathVariable String message, @RequestParam int age) {
        return "{'message': 'param1', 'age': 'param2'}"
                .replace("param1", message)
                .replace("param2", String.valueOf(age));
    }

}
