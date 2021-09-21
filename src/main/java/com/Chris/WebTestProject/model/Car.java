package com.Chris.WebTestProject.model;

public class Car {

    public String type;
    public String color;
    public int yearModel;

    public Car (String type, String color, int yearModel) {
        this.type = type;
        this.color = color;
        this.yearModel = yearModel;
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


