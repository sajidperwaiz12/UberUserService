package com.example.UberUserService.mapper;

import com.example.UberUserService.dto.CreateDriverRequestDto;
import com.example.UberUserService.dto.DriverResponseDto;
import com.example.UberUserService.dto.NearbyDriverResponseDto;
import com.example.UberUserService.entities.Driver;
import com.example.UberUserService.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface DriverMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "user", source = "user")
    @Mapping(target = "available", constant = "true")
    @Mapping(target = "online", constant = "false")
    @Mapping(target = "rating", constant = "0.0")
    @Mapping(target = "totalRides", constant = "0")
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    Driver toDriver(CreateDriverRequestDto driver, User user);

    @Mapping(target = "userId", source = "user.id")
    @Mapping(target = "name", source = "user.name")
    @Mapping(target = "email", source = "user.email")
    @Mapping(target = "phoneNumber", source = "user.phoneNumber")
    DriverResponseDto toDriverResponseDto(Driver driver);

    @Mapping(target = "driverId", source = "id")
    @Mapping(target = "driverName", source = "user.name")
    NearbyDriverResponseDto toNearbyDriverResponseDto(Driver driver);

}

