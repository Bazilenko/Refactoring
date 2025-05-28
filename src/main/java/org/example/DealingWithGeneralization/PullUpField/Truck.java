package org.example.DealingWithGeneralization.PullUpField;

class Truck extends Vehicle {
    private int loadCapacity;
    public Truck(String color, int loadCapacity, String model) {
        super(color, model);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
