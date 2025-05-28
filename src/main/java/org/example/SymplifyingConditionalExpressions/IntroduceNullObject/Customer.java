package org.example.SymplifyingConditionalExpressions.IntroduceNullObject;

public class Customer {
    private Address address;
    public Customer(Address address) {
        this.address = address != null ? address : new NullAddress();
    }
    public Address getAddress() {
        return address;
    }
}

