package org.example.DealingWithGeneralization.ExtractInterface;

public class Square implements Quadrilateral{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        int quantityOfSides = 4;
        return quantityOfSides * side;
    }
}
