package com.example.UberUserService.services.impl;

import com.example.UberUserService.dto.CreateDriverRequestDto;
import com.example.UberUserService.entities.Driver;
import com.example.UberUserService.entities.User;
import com.example.UberUserService.enums.Role;
import com.example.UberUserService.mapper.DriverMapper;
import com.example.UberUserService.repositories.DriverRepository;
import com.example.UberUserService.repositories.UserRepository;
import com.example.UberUserService.services.DriverService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DriverServiceImpl implements DriverService {

    private final UserRepository userRepository;
    private final DriverRepository driverRepository;
    private final DriverMapper driverMapper;

    @Override
    public Driver createDriver(CreateDriverRequestDto request) {
        User user = userRepository.findById(request.getId()).orElseThrow(() -> new RuntimeException("User not found"));

        if (user.getRole() != Role.DRIVER) {
            throw new RuntimeException("User role is not DRIVER");
        }

        if (driverRepository.findByUserId(user.getId()).isPresent()) {
            throw new RuntimeException("Driver profile already exists");
        }

        if (driverRepository.findByLicenseNumber(request.getLicenseNumber()).isPresent()) {
            throw new RuntimeException("License number already exists");
        }

        if (driverRepository.findByVehicleNumber(request.getVehicleNumber()).isPresent()) {
            throw new RuntimeException("Vehicle number already exists");
        }

        if (driverRepository.findByAadhaarNumber(request.getAadhaarNumber()).isPresent()) {
            throw new RuntimeException("Aadhaar number already exists");
        }

        Driver driver = driverMapper.toDriver(request, user);

        return driverRepository.save(driver);
    }

    @Override
    public Driver updateAvailability(Long driverId, Boolean available) {
        Driver driver = driverRepository.findById(driverId).orElseThrow(() -> new RuntimeException("Driver not found"));
        driver.setAvailable(available);
        return driverRepository.save(driver);
    }

    @Override
    public Driver updateLocation(Long driverId, Double latitude, Double longitude) {
        Driver driver = driverRepository.findById(driverId).orElseThrow(() -> new RuntimeException("Driver not found"));
        driver.setCurrentLatitude(latitude);
        driver.setCurrentLongitude(longitude);
        return driverRepository.save(driver);
    }
}

