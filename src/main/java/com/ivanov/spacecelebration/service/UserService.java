package com.ivanov.spacecelebration.service;

import com.ivanov.spacecelebration.dto.UserDTO;
import com.ivanov.spacecelebration.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserDTO userDTO);
}