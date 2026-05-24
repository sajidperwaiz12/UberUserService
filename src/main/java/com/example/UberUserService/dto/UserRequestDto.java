package com.example.UberUserService.dto;

import com.example.UberUserService.enums.Role;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserRequestDto {
    private String name;
    private String email;
    private String phoneNumber;
    private Role role;
}

