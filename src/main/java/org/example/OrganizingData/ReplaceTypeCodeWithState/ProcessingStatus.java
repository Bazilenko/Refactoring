package org.example.OrganizingData.ReplaceTypeCodeWithState;

public class ProcessingStatus implements OrderStatus {
    public void proceed(Order order) {
        order.setOrderStatus(new CompletedStatus());
    }

    public void cancel(Order order) {
        order.setOrderStatus(new CancelledStatus());
    }

    public String getName() {
        return "PROCESSING";
    }
}