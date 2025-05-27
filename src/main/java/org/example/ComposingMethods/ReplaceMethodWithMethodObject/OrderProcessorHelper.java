package org.example.ComposingMethods.ReplaceMethodWithMethodObject;

import org.example.ComposingMethods.ReplaceTempWithQuery.Item;

public class OrderProcessorHelper {
    private Order order;
    private double costWithoutDiscount = 0;
    private double finalCost;

    public OrderProcessorHelper(Order order){
        this.order = order;
    }

    public void process(){
        calculateCostWithoutDiscount();
        useDiscount();
        updateOrder();
    }

    private void calculateCostWithoutDiscount(){
        int itemCount = order.getCount();
        for (int i = 0; i < itemCount; i++) {
            Item item = order.getItem(i);
            costWithoutDiscount += item.getPrice() * item.getQuantity();
            
        }
    }

    private void useDiscount(){
        finalCost = costWithoutDiscount;
        if(order.getCustomer().isVip())
            finalCost = costWithoutDiscount * 0.9;
    }

    private void updateOrder(){
        order.setTotalCost(finalCost);
        order.setStatus("Processed");
    }


}
