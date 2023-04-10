package com.example.demo.application.factory;

import com.example.demo.application.dto.UserDto;
import com.example.demo.domain.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserMapper {


    public UserDto toUserDto(User user){
        return UserDto.builder()
                .name(user.getName())
                .id(user.getId())
                .dateOfBirth(user.getDateOfBirth())
                .build();
    }
}
