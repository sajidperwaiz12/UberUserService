package com.example.UberUserService.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "drivers")
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Driver extends BaseModel {

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false, unique = true)
    private User user;

    @Column(nullable = false, unique = true)
    private String licenseNumber;

    @Column(nullable = false, unique = true)
    private String vehicleNumber;

    @Column(nullable = false)
    private String vehicleType;

    @Builder.Default
    private Boolean available = true;

    @Column(nullable = false, unique = true)
    private String aadhaarNumber;

    @Builder.Default
    private Boolean online = false;

    @Builder.Default
    private Double rating = 0.0;

    @Builder.Default
    private Integer totalRides = 0;

    private Double currentLatitude;

    private Double currentLongitude;

}

