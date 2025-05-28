package org.example.SymplifyingConditionalExpressions.IntroduceNullObject;

public class NullAddress extends Address{
    @Override
    public boolean isNull(){
        return true;
    }
    public NullAddress(){
        super("", "");
    }
    @Override
    public String getCity(){
        return "Unknown city!";
    }

    @Override
    public String getStreet(){
        return "Unknown street!";
    }
}
