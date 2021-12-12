package com.ivanov.spacecelebration.repository;

import com.ivanov.spacecelebration.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findFirstByName(String name);
}
