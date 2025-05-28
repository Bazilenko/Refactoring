package org.example.OrganizingData.ReplaceTypeCodeWithState;

public class CancelledStatus implements OrderStatus {
    public void proceed(Order order) {
        System.out.println("Cannot proceed. Order is cancelled.");
    }

    public void cancel(Order order) {
        System.out.println("Order already cancelled.");
    }

    public String getName() {
        return "CANCELLED";
    }
}