package com.example.UberUserService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class UberUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UberUserServiceApplication.class, args);
	}

}
