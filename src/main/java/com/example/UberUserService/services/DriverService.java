package com.example.UberUserService.services;

import com.example.UberUserService.dto.CreateDriverRequestDto;
import com.example.UberUserService.dto.DriverResponseDto;
import com.example.UberUserService.dto.NearbyDriverResponseDto;

import java.util.List;

public interface DriverService {
    DriverResponseDto createDriver(CreateDriverRequestDto request);
    DriverResponseDto updateAvailability(Long driverId, Boolean available);
    DriverResponseDto updateLocation(Long driverId, Double latitude, Double longitude);

    List<NearbyDriverResponseDto> findNearbyDrivers(Double latitude, Double longitude, Double radiusKm);

    DriverResponseDto updateOnline(Long driverId, Boolean online);
}

