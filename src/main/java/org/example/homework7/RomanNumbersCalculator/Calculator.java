package org.example.homework7.RomanNumbersCalculator;

public class Calculator {
    public int calculate(RomanNumber num1, RomanNumber num2, String operation) {
        int result = 0;
        int firstNumber = num1.number;
        int secondNumber = num2.number;

        switch (operation) {
            case "+" -> result = result + firstNumber + secondNumber;
            case "-" -> result = result + firstNumber - secondNumber;
            case "/" -> result = (int) (result + (double) firstNumber / secondNumber);
            case "*" -> result = (int) (result + (long) firstNumber * secondNumber);
            default -> System.out.println("Invalid operator. Use + , - , / , * .");
        }

        return result;

    }
}
