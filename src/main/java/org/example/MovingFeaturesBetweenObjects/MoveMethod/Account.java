package org.example.MovingFeaturesBetweenObjects.MoveMethod;

public class Account {
    private double balance;
    private double interestRate;

    public Account(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }


    public double getInterestRate() {
        return interestRate;
    }

    public double getBalance() {
        return balance;
    }

}
