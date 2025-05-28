package org.example.SymplifyingMethodCalls.SeparateQueryFromModifier;

public class Account {
    private double balance;

    public void applyCommission(){
        double commission = 0.05;
        this.balance -= balance * commission;
    }
    public double getBalance(){
        return balance;
    }
}
