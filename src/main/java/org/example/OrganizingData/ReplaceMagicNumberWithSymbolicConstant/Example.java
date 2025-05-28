package org.example.OrganizingData.ReplaceMagicNumberWithSymbolicConstant;

import java.util.ArrayList;
import java.util.List;

public class Example {
    private static final int MAX_CAPACITY = 100;
    public static void main(String[] args){
        List<String> items = new ArrayList<>();

        for (int i = 0; i < MAX_CAPACITY; i++) {
            items.add("Item: " + i);
            
        }
        
    }
}
