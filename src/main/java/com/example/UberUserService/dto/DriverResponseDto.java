package com.example.UberUserService.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DriverResponseDto {
    private Long id;
    private Long userId;
    private String name;
    private String email;
    private String phoneNumber;
    private String licenseNumber;
    private String vehicleNumber;
    private String vehicleType;
    private String aadhaarNumber;
    private Boolean available;
    private Boolean online;
    private Double rating;
    private Integer totalRides;
    private Double currentLatitude;
    private Double currentLongitude;
}

