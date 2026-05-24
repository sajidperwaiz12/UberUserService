package com.example.UberUserService.controllers;

import com.example.UberUserService.dto.CreateDriverRequestDto;
import com.example.UberUserService.dto.DriverResponseDto;
import com.example.UberUserService.services.DriverService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/drivers")
@RequiredArgsConstructor
public class DriverController {

    private final DriverService driverService;

    @PostMapping
    public ResponseEntity<DriverResponseDto> createDriver(@RequestBody CreateDriverRequestDto request) {
        return new ResponseEntity<>(driverService.createDriver(request), HttpStatus.CREATED);
    }

    @PostMapping("/{driverId}/availability")
    public ResponseEntity<DriverResponseDto> updateAvailability(@PathVariable Long driverId, @RequestParam Boolean available) {
        return new ResponseEntity<>(driverService.updateAvailability(driverId, available), HttpStatus.OK);
    }

    @PostMapping("/{driverId}/location")
    public ResponseEntity<DriverResponseDto> updateLocation(@PathVariable Long driverId, @RequestParam Double latitude, @RequestParam Double longitude) {
        return new ResponseEntity<>(driverService.updateLocation(driverId, latitude, longitude), HttpStatus.OK);
    }

}

