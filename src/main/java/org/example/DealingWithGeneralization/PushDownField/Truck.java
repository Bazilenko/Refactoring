package org.example.DealingWithGeneralization.PushDownField;

public class Truck extends Vehicle{
    private int loadCapacity;

    public Truck(String model, int loadCapacity) {
        super(model);
        this.loadCapacity = loadCapacity;
    }
}
