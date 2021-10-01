package com.Chris.WebTestProject.model;


import javax.persistence.*;

@Table(name = "car_table")
@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    public String manufacturer;

    public String color;

    @Column(name = "year_model")
    public int yearModel;

    public Car(String manufacturer, String color, int yearModel) {
        this.manufacturer = manufacturer;
        this.color = color;
        this.yearModel = yearModel;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYearModel() {
        return yearModel;
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                '}';
    }
}


