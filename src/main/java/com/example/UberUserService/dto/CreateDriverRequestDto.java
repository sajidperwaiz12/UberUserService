package com.example.UberUserService.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateDriverRequestDto {

    private Long id;
    private String licenseNumber;
    private String aadhaarNumber;
    private String vehicleNumber;
    private String vehicleType;

}

