package com.example.UberUserService.repositories;

import com.example.UberUserService.entities.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DriverRepository extends JpaRepository<Driver,Long> {
    Optional<Driver> findByUserId(Long userId);
    Optional<Driver> findByVehicleNumber(String vehicleNumber);
    Optional<Driver> findByLicenseNumber(String licenseNumber);
    Optional<Driver> findByAadhaarNumber(String aadhaarNumber);
    List<Driver> findByOnlineTrueAndAvailableTrue();
}
