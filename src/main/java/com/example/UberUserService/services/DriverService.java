package com.example.UberUserService.services;

import com.example.UberUserService.dto.CreateDriverRequestDto;
import com.example.UberUserService.dto.DriverResponseDto;

public interface DriverService {
    DriverResponseDto createDriver(CreateDriverRequestDto request);
    DriverResponseDto updateAvailability(Long driverId, Boolean available);
    DriverResponseDto updateLocation(Long driverId, Double latitude, Double longitude);
}

