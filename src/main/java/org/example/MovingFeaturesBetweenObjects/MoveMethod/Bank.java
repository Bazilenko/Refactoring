package org.example.MovingFeaturesBetweenObjects.MoveMethod;

import java.util.List;

public class Bank {
    private List<Account> accounts;

    public Bank(List<Account> accounts){
        this.accounts = accounts;
    }

    public void processAccount(){
        for(Account account : accounts)
            calculateInterest(account.getBalance(), account.getInterestRate());
    }

    public void calculateInterest(double balance, double interestRate){
        double interest = balance * interestRate / 100;
        System.out.println("Interest calculated:");
    }
}
