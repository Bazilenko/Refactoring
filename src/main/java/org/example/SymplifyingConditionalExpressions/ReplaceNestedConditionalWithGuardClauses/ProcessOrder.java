package org.example.SymplifyingConditionalExpressions.ReplaceNestedConditionalWithGuardClauses;

public class ProcessOrder {
    public void processOrder(int quantity, double price) {
        if (quantity <= 0){
            System.out.println("Invalid quantity");
            return;
        }
        if (price > 0)
            // Основна логіка
            System.out.println("Order processed successfully");
        else
            System.out.println("Invalid price");
    }

}
