package com.example.UberUserService.services;

import com.example.UberUserService.dto.CreateDriverRequestDto;
import com.example.UberUserService.entities.Driver;

public interface DriverService {
    Driver createDriver(CreateDriverRequestDto request);
    Driver updateAvailability(Long driverId, Boolean available);
    Driver updateLocation(Long driverId, Double latitude, Double longitude);
}

