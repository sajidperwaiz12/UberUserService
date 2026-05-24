package com.example.UberUserService.services;

import com.example.UberUserService.dto.UserRequestDto;
import com.example.UberUserService.entities.User;

public interface UserService {
    User createUser(UserRequestDto request);

    User getUser(Long id);
}
