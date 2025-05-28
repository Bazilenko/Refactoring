package org.example.SymplifyingMethodCalls.ReplaceExceptionWithTest;

public class TemperatureConverter {
    public static double convertToCelsius(double fahrenheit) {
        if (fahrenheit < -459.67) {
            System.out.println("Неприпустима температура: менше абсолютного нуля");
            return -1;
        }
        return (fahrenheit - 32) * 5 / 9;
    }
    public static void main(String[] args) {
            double celsius = convertToCelsius(-500);
            System.out.println("Температура в градусах Цельсія: " + celsius);
    }
}