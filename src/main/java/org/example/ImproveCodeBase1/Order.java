package org.example.ImproveCodeBase1;

import java.util.List;

public class Order {
    private String customerName;
    private List<String> items;
    private final OrderCalculator orderCalculator;
    private final double totalPrice;

    public Order(String customerName, List<String> items, OrderCalculator orderCalculator){
        this.items = items;
        this.customerName = customerName;
        this.orderCalculator = orderCalculator;
        this.totalPrice = orderCalculator.calculatePrice(this.items);
    }

    public void processOrder(){
        validateOrder();
        processPayment();
        isSuccessPaymentOrder();
    }

    public void validateOrder(){}

    public void processPayment(){}

    public boolean isSuccessPaymentOrder(){return true;}

    public double getTotalPrice() {
        return totalPrice;
    }

    public String getCustomerName() {
        return customerName;
    }

    public OrderCalculator getOrderCalculator() {
        return orderCalculator;
    }

    public List<String> getItems() {
        return items;
    }
}

