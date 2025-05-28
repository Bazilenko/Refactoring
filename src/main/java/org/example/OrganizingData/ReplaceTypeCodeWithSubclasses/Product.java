package org.example.OrganizingData.ReplaceTypeCodeWithSubclasses;

public abstract class Product {
    String name;

    public Product(String name) {
        this.name = name;
    }

    public abstract void process();
}
