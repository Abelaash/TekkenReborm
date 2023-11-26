package com.cpan252.tekkenreborn.controller.rest;

import com.cpan252.tekkenreborn.model.User;
import com.cpan252.tekkenreborn.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/userdashboard", produces = "application/json")
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;

    }

    @GetMapping
    public Iterable<User> getUsers(){
        return userRepository.findAll();
    }

}
