package org.example.SymplifyingMethodCalls.ReplaceErrorCodeWithException;

public class Calculator {
    public static int divide(int dividend, int divisor) throws ArithmeticException {
        if(divisor == 0)
            throw new ArithmeticException("Divided by zero!!!");
        return dividend / divisor;
    }
    public static void main(String[] args) {
        try{
            int result = divide(10, 0);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
