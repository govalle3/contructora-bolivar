package com.example.demo.infrastructure.controller;

import com.example.demo.application.dto.UserDto;
import com.example.demo.application.handler.UserHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class UserController {

    private final UserHandler userHandler;

    @GetMapping(value = "/user/{id}")
    @ResponseStatus(HttpStatus.OK)
    public UserDto getUser(@PathVariable("id") Long id) {
        return userHandler.execute(id);
    }
}
