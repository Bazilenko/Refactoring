package org.example.OrganizingData.ReplaceTypeCodeWithState;

public class Order {
    private OrderStatus orderStatus;

    public Order() {
        this.orderStatus = new NewStatus();
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }


}
