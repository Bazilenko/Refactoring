package org.example.OrganizingData.ReplaceTypeCodeWithState;

import org.example.OrganizingData.ReplaceTypeCodeWithState.Order;

public interface OrderStatus {
    void proceed(Order order);
    void cancel(Order order);
    String getName();
}
