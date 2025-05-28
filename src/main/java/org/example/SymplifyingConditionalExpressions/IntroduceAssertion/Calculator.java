package org.example.SymplifyingConditionalExpressions.IntroduceAssertion;

public class Calculator {
    public double calculateAverage(int[] numbers) {
        if(numbers == null)
            return 0;
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

}
