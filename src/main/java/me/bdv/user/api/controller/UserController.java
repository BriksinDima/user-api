package me.bdv.user.api.controller;

import me.bdv.user.api.dto.UserDto;
import me.bdv.user.api.producer.UserProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserProducer userProducer;

    @PostMapping
    public ResponseEntity<Void> createUser(@RequestBody UserDto user) {
        userProducer.createCashUser(user);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}