package org.example.OrganizingData.ReplaceTypeCodeWithSubclasses;

public class Type2Product extends Product{
    public Type2Product(String name) {
        super(name);
    }

    @Override
    public void process() {
        System.out.println("Processing type 2 " + name);
    }
}
