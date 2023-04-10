package com.example.demo.domain.port;

import com.example.demo.domain.model.User;

public interface UserRepository {

    User findUserById(Long id);
}
