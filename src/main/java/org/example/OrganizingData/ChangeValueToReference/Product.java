package org.example.OrganizingData.ChangeValueToReference;

public class Product {
    private String name;
    private double price;
    private Currency currency;

    public Product(String name, double price, String currencyCode) {
        this.name = name;
        this.price = price;
        this.currency = CurrencyFactory.getCurrency(currencyCode);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
