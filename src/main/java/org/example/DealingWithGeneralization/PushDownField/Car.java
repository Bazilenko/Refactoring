package org.example.DealingWithGeneralization.PushDownField;

public class Car extends Vehicle{
    private String brand;
    public Car(String model, String brand) {
        super(model);
        this.brand = brand;
    }
}
