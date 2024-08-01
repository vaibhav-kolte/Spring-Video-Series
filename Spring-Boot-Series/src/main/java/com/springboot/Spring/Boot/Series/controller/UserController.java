package com.springboot.Spring.Boot.Series.controller;

import com.springboot.Spring.Boot.Series.UserRepository;
import com.springboot.Spring.Boot.Series.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

//    @GetMapping
//    public String hiUser(){
//        return "Hi";
//    }

    @Autowired
    private UserRepository userRepository;

//    @GetMapping
//    public List<User> hiUser() {
//        return List.of(
//                new User(1L, "Vaibhav", "vaibhav@gmail.com"),
//                new User(2L, "Sharad", "sharad@gmail.com"),
//                new User(3L, "Pankaj", "pankaj@gmail.com"),
//                new User(4L, "Sagar", "sagar@gmail.com")
//        );
//    }

    @GetMapping
    public List<User> hiUser() {
        return userRepository.findAll();
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }
}
