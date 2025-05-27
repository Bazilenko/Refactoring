package org.example.ComposingMethods.SplitTemporaryVariable;

public class LoanCalculator {
    public double calculateLoanInterest(double loanAmount, double annualInterestRate, int loanTermYears){
        double interestRateDecimal = annualInterestRate/ 100;
        double monthlyInterestRate = interestRateDecimal / 12;
        int totalMonths = loanTermYears * 12;

        double totalInterest = 0;

        for (int month = 0; month < totalMonths; month++) {
            totalInterest += loanAmount * monthlyInterestRate;
        }
        return totalInterest;

    }
}
