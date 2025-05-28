package org.example.DealingWithGeneralization.PullUpConstructorBody;

import org.example.SymplifyingMethodCalls.ReplaceConstructorWithFactoryMethod.Car;

public class Cat extends Animal{
    private String color;
    public Cat(String name, int age, String color){
        super(name, age);
        this.color = color;
    }
}
