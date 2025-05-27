package org.example.ComposingMethods.ExtractMethod;

public class SalaryCalculator {
    private Employee employee;

    public SalaryCalculator(Employee employee){
        this.employee = employee;
    }


    public double calculateGeneralSalary(){
        double salaryWithoutTax = calculateOvertimeBonus() + calculateBonusPercentage();
        return calculateTax(salaryWithoutTax);
    }

    private double calculateOvertimeBonus(){
        double overtimeBonus = 0;
        if(employee.getOvertimeHours() > 0)
            overtimeBonus = employee.getBaseSalary() * employee.getOvertimeHours() * 1.5;
        return overtimeBonus;
    }

    private double calculateBonusPercentage(){
        return employee.getBaseSalary() * employee.getBonusPercentage() / 100;
    }

    private double calculateTax(double totalSalary){
        return totalSalary * employee.getTaxRate() / 100;
    }

}
