package org.example.OrganizingData.ReplaceTypeCodeWithState;

public class CompletedStatus implements OrderStatus {
    public void proceed(Order order) {
        System.out.println("Order already completed.");
    }

    public void cancel(Order order) {
        System.out.println("Cannot cancel a completed order.");
    }

    public String getName() {
        return "COMPLETED";
    }
}
