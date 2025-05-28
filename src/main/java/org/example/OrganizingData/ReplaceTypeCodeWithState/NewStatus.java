package org.example.OrganizingData.ReplaceTypeCodeWithState;

import org.example.OrganizingData.ReplaceTypeCodeWithState.Order;

public class NewStatus implements OrderStatus{
    @Override
    public void proceed(Order order) {
        order.setOrderStatus(new ProcessingStatus());
    }

    @Override
    public void cancel(Order order) {
        order.setOrderStatus(new CancelledStatus());
    }

    @Override
    public String getName() {
        return "NEW";
    }
}
