package com.example.demo.application.handler;

import com.example.demo.application.dto.UserDto;
import com.example.demo.application.factory.UserMapper;
import com.example.demo.domain.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserHandler {

    private final UserService service;
    private final UserMapper mapper;


    public UserDto execute(Long id) {
        return mapper.toUserDto(service.execute(id));
    }
}
