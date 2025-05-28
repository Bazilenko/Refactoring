package org.example.DealingWithGeneralization.PullUpField;

abstract class Vehicle {
    protected String color;
    protected String model;
    public Vehicle(String color, String model) {
        this.color = color;
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

