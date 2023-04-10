package com.example.demo.infrastructure.repository.jpa;

import com.example.demo.infrastructure.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaUser extends JpaRepository<UserEntity, Long> {
}
