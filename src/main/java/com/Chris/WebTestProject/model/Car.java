package com.Chris.WebTestProject.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {

    @Id
    public int id;
    public String manufacturer;
    public String color;
    public int yearModel;

    public Car(int id,String manufacturer, String color, int yearModel) {
        this.id = id;
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


