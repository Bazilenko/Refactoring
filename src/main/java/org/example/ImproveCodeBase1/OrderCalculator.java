package org.example.ImproveCodeBase1;

import java.util.List;

public class OrderCalculator {
    public double getItemPrice(String item){
        switch (item){
            case "Case for phone":
                return 200;
            case "Charge for notebook":
                return 1200;
            default:
                return 50; //мінімальна вартість товару в магазині
        }
    }

    public double calculatePrice(List<String> items){
        double price = 0;
        for(String item : items)
            price += getItemPrice(item);
        return price;

    }
}
