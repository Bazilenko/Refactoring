package org.example.ComposingMethods.ReplaceMethodWithMethodObject;

import org.example.ComposingMethods.ReplaceTempWithQuery.Item;

import java.util.List;

public class Order {
    private Customer customer;
    private int count;
    private double price;

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    private double totalCost;
    private List<Item> items;


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String status;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Item getItem(int index) {
        return items.get(index);
    }
}
