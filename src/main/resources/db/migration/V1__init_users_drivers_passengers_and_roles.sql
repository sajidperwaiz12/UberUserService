CREATE TABLE users (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    email VARCHAR(100) NOT NULL UNIQUE,
    password VARCHAR(255),
    phone_number VARCHAR(20) NOT NULL UNIQUE,
    role VARCHAR(20) NOT NULL,
    created_at DATETIME,
    updated_at DATETIME
);

CREATE TABLE drivers (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,

    user_id BIGINT NOT NULL UNIQUE,

    license_number VARCHAR(100),
    aadhaar_number VARCHAR(100),
    vehicle_number VARCHAR(100),
    vehicle_type VARCHAR(100),
    available BOOLEAN DEFAULT TRUE,

    created_at DATETIME,
    updated_at DATETIME,

    CONSTRAINT fk_driver_user
    FOREIGN KEY (user_id)
    REFERENCES users(id)
    ON DELETE CASCADE
);

CREATE TABLE passengers (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,

    user_id BIGINT NOT NULL UNIQUE,

    home_address VARCHAR(255),

    created_at DATETIME,
    updated_at DATETIME,

    CONSTRAINT fk_passenger_user
    FOREIGN KEY (user_id)
    REFERENCES users(id)
    ON DELETE CASCADE
);