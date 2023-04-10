package com.example.demo.domain.service;

import com.example.demo.domain.model.User;
import com.example.demo.domain.port.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;

    public User execute(Long id) {
        return repository.findUserById(id);
    }
}
