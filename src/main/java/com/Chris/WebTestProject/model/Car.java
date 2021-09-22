package com.Chris.WebTestProject.model;

public class Car {

    public int id;
    public String manufacturer;
    public String color;
    public int yearModel;

    public Car() {

    }

    public Car (String manufacturer, String color, int yearModel) {
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

}


