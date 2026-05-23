package com.example.UberUserService.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "passengers")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Passenger extends BaseModel {

    @OneToOne
    private User user;

    private String homeAddress;

}

