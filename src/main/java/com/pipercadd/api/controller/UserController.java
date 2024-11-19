package com.pipercadd.api.controller;


import com.pipercadd.api.repository.userRepository;
import com.pipercadd.api.userdetails.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private userRepository UserRepository;

    @PostMapping("/user")
    user newUser(@RequestBody user newUser){
        return UserRepository.save(newUser);
    }
}
