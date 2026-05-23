package com.example.UberUserService.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "drivers")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Driver extends BaseModel {

    @OneToOne
    private User user;

    private String licenseNumber;

    private String vehicleNumber;

    private String vehicleType;

    private Boolean available = true;

    private String aadhaarNumber;

}

