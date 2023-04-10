package com.example.demo.infrastructure.repository;

import com.example.demo.domain.model.User;
import com.example.demo.domain.port.UserRepository;
import com.example.demo.infrastructure.mapper.UserEntityMapper;
import com.example.demo.infrastructure.repository.jpa.JpaUser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserRepositoryImp implements UserRepository {

    private final JpaUser repository;
    private final UserEntityMapper mapper;


    @Override
    public User findUserById(Long id) {
        return mapper.toDomainUser(repository.findById(id)
                .orElseThrow(() -> new RuntimeException("No user Id found")));
    }
}
