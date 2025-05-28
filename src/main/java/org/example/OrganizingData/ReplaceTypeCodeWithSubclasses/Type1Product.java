package org.example.OrganizingData.ReplaceTypeCodeWithSubclasses;

public class Type1Product extends Product{
    public Type1Product(String name) {
        super(name);
    }

    @Override
    public void process() {
        System.out.println("Processing type 1 " + name);
    }
}
