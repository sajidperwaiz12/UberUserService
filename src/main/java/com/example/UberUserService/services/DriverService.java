package com.example.UberUserService.services;

import com.example.UberUserService.dto.CreateDriverRequestDto;
import com.example.UberUserService.dto.DriverResponseDto;
import com.example.UberUserService.dto.NearbyDriverResponseDto;

import java.util.List;

public interface DriverService {
    DriverResponseDto createDriver(CreateDriverRequestDto request);
    DriverResponseDto updateAvailability(Long driverId, Boolean available);
    DriverResponseDto updateOnline(Long driverId, Boolean online);
}

