package org.example.SymplifyingMethodCalls.AddParameter;

public class CalculateTax {
    public double calculateTotal(double price, int quantity, double taxRate){
        return (price * quantity) * taxRate / 100;
    }
}
