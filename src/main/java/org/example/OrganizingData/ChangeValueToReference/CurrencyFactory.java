package org.example.OrganizingData.ChangeValueToReference;

import java.util.HashMap;
import java.util.Map;

public class CurrencyFactory {
    private static final Map<String, Currency> cache = new HashMap<>();

    public static Currency getCurrency(String code){
        if(!cache.containsKey(code))
            cache.put(code, new Currency(code));
        return cache.get(code);
    }
}
