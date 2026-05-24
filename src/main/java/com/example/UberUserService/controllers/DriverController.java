package com.example.UberUserService.controllers;

import com.example.UberUserService.dto.CreateDriverRequestDto;
import com.example.UberUserService.dto.DriverResponseDto;
import com.example.UberUserService.dto.NearbyDriverResponseDto;
import com.example.UberUserService.services.DriverService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/drivers")
@RequiredArgsConstructor
@Tag(name = "Driver APIs")
public class DriverController {

    private final DriverService driverService;

    @PostMapping
    @Operation(summary = "Create Driver")
    public ResponseEntity<DriverResponseDto> createDriver(@RequestBody CreateDriverRequestDto request) {
        return new ResponseEntity<>(driverService.createDriver(request), HttpStatus.CREATED);
    }

    @PostMapping("/{driverId}/availability")
    @Operation(summary = "Update Availability")
    public ResponseEntity<DriverResponseDto> updateAvailability(@PathVariable Long driverId, @RequestParam Boolean available) {
        return new ResponseEntity<>(driverService.updateAvailability(driverId, available), HttpStatus.OK);
    }

    @PostMapping("/{driverId}/location")
    @Operation(summary = "Update Location")
    public ResponseEntity<DriverResponseDto> updateLocation(@PathVariable Long driverId, @RequestParam Double latitude, @RequestParam Double longitude) {
        return new ResponseEntity<>(driverService.updateLocation(driverId, latitude, longitude), HttpStatus.OK);
    }

    @GetMapping("/nearby")
    @Operation(summary = "Find Nearby Drivers")
    public ResponseEntity<List<NearbyDriverResponseDto>> findNearbyDrivers(
            @RequestParam Double latitude,
            @RequestParam Double longitude,
            @RequestParam(defaultValue = "5") Double radiusKm
    ) {
        return ResponseEntity.ok(driverService.findNearbyDrivers(latitude, longitude, radiusKm));
    }

}

