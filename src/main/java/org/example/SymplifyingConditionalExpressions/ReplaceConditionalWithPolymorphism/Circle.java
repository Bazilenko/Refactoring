package org.example.SymplifyingConditionalExpressions.ReplaceConditionalWithPolymorphism;

public class Circle extends Shape{
    private double radius;
    @Override
    public double calculateArea() {
        return Math.PI * getRadius() * getRadius();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
