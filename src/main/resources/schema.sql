CREATE TABLE cars(
    car_id INTEGER identity NOT NULL,
    manufacturer VARCHAR(20) NOT NULL,
    color VARCHAR(20) NOT NULL,
    year_model INTEGER NOT NULL,
    CONSTRAINT pk_cars_cars_id PRIMARY KEY (car_id)
);
