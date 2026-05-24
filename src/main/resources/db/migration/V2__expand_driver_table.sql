ALTER TABLE drivers
    ADD COLUMN online BOOLEAN DEFAULT FALSE,
    ADD COLUMN rating DOUBLE DEFAULT 0,
    ADD COLUMN total_rides INT DEFAULT 0,
    ADD COLUMN current_latitude DOUBLE,
    ADD COLUMN current_longitude DOUBLE;

ALTER TABLE drivers
    MODIFY license_number VARCHAR(100) NOT NULL UNIQUE;

ALTER TABLE drivers
    MODIFY aadhaar_number VARCHAR(100) NOT NULL UNIQUE;

ALTER TABLE drivers
    MODIFY vehicle_number VARCHAR(100) NOT NULL UNIQUE;

ALTER TABLE drivers
    MODIFY vehicle_type VARCHAR(100) NOT NULL;