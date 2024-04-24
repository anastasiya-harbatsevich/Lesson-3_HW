package org.example.homework6;

import java.util.Objects;
import java.util.Scanner;

public class BasicInteractiveCalculator {
    public static void main(String[] args) {
        boolean flag = true;

        while (flag) {
            calculateSum();
            flag = requestContinue();
        }
    }
    private static void calculateSum() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        double firstNumber = Integer.parseInt(scanner.nextLine());

        String arithmeticOperation = "";
        boolean flagCheckAritchmeticOperationInput = true;

        while (flagCheckAritchmeticOperationInput) {
            System.out.println("Enter an operation (+, -, *, /): ");
            arithmeticOperation = scanner.nextLine();

            if (Objects.equals(arithmeticOperation, "+") || Objects.equals(arithmeticOperation, "-") || Objects.equals(arithmeticOperation, "*") || Objects.equals(arithmeticOperation, "/")) {
                flagCheckAritchmeticOperationInput = false;
            } else {
                System.out.println("Invalid operation");
            }
        }

        System.out.println("Enter a number: ");
        double secondNumber = Integer.parseInt(scanner.nextLine());
        checkRule(firstNumber, secondNumber, arithmeticOperation);
    }
    public static void checkRule(double firstNumber, double secondNumber, String arithmeticOperation) {

        double result = 0;

        if (secondNumber == 0 && Objects.equals(arithmeticOperation, "/")) {
            System.out.println("Error: Division by zero");
        } else {
            switch (arithmeticOperation) {
                case "+" -> result = result + firstNumber + secondNumber;
                case "-" -> result = result + firstNumber - secondNumber;
                case "/" -> result = result + firstNumber / secondNumber;
                case "*" -> result = result + (long) firstNumber * secondNumber;
            }

            System.out.println("Result: " + result);
        }
    }
    public static boolean requestContinue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to perform another calculation? (yes/no): ");
        String question = scanner.nextLine();

        if (question.equals("yes")) {
           return true;
        } else if (question.equals("no")) {
            System.out.println("Exiting the calculator.");
            return false;
        } else {
            System.out.println("Invalid input");
            return false;
        }
    }
}
