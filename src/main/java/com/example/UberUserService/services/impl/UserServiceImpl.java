package com.example.UberUserService.services.impl;

import com.example.UberUserService.dto.UserRequestDto;
import com.example.UberUserService.entities.User;
import com.example.UberUserService.exceptions.ResourceNotFoundException;
import com.example.UberUserService.repositories.UserRepository;
import com.example.UberUserService.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User createUser(UserRequestDto request) {
        User user = new User();
        user.setEmail(request.getEmail());
        user.setName(request.getName());
        user.setPhoneNumber(request.getPhoneNumber());
        user.setRole(request.getRole());

        return userRepository.save(user);
    }

    @Override
    public User getUser(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not found"));
    }
}

