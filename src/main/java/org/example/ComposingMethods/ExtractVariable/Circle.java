package org.example.ComposingMethods.ExtractVariable;

public class Circle {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double calculateArea(){
        return Math.PI * radius * radius;
    }

    public double calculateCircumference(){
        return 2 * Math.PI * radius;
    }

    public void printCircleDetails(){
        double area = calculateArea();
        double circumference = calculateCircumference();

        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
        System.out.println("Radius: " + this.radius);
    }



}
