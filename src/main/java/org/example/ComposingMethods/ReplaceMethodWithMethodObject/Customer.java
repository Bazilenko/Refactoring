package org.example.ComposingMethods.ReplaceMethodWithMethodObject;

public class Customer {
    CustomerStatus customerStatus;

    public boolean isVip(){
        return customerStatus.equals(CustomerStatus.VIP);
    }
}
