package com.example.demo.infrastructure.mapper;

import com.example.demo.domain.model.User;
import com.example.demo.infrastructure.entity.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserEntityMapper {

    public User toDomainUser(UserEntity userEntity) {
        return User.builder()
                .name(userEntity.getName())
                .dateOfBirth(userEntity.getDateOfBirth())
                .id(userEntity.getId())
                .build();
    }
}
