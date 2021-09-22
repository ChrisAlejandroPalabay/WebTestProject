package com.Chris.WebTestProject.dao;

import com.Chris.WebTestProject.model.Car;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CarJdbcDAO implements DAO {

    private static final Logger log = LoggerFactory.getLogger(CarJdbcDAO.class);
    private JdbcTemplate jdbcTemplate;


    RowMapper<Car> rowMapper = (rs,rowNum) ->{
        Car car = new Car();
        car.setId(rs.getInt("car_id"));
        car.setManufacturer(rs.getString("manufacturer"));
        car.setColor(rs.getString("color"));
        car.setYearModel(rs.getInt("year_model"));
        return car;
    };

    public CarJdbcDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List list() {
        String sql = "SELECT car_id, manufacturer, color, year_model FROM cars";
        return jdbcTemplate.query(sql,rowMapper);
    }

    @Override
    public void create(Car car) {
        String sql = "INSERT INTO cars(manufacturer,color,year_model) values(?,?,?)";
        jdbcTemplate.update(sql,car.getManufacturer(),car.getColor(),car.yearModel);
        System.out.println("Add complete");
    }

    @Override
    public Optional get(int id) {
        return Optional.empty();
    }

    @Override
    public void update(Object o, int id) {

    }

    @Override
    public void delete(int id) {

    }
}
