package org.example.homework7.RomanNumbersCalculator;

public class RomanNumbersCalculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        RomanNumber num1 = RomanNumber.X;
        RomanNumber num2 = RomanNumber.IV;

        String operation = "*";
        int result = calculator.calculate(num1, num2, operation);
        System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
    }

}
