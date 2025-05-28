package org.example.OrganizingData.DuplicateObservedData;

import java.util.List;

public class OrderManager {
    private List<Order> orders;

    public OrderManager(List<Order> orders) {
        this.orders = orders;
    }

    public void addOrder(Order order){
        orders.add(order);
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public void displayOrders() {
        for (Order order : orders) {
            System.out.println("Customer: " + order.getCustomerName());
            System.out.println("Product: " + order.getProductName());
            System.out.println("Quantity: " + order.getQuantity());
            System.out.println("---");
        }
    }
}
