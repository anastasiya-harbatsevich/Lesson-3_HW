package org.example.homework5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberGenerator {
    public static void main(String[] args) {
        generateRandomArray();
    }
    public static void generateRandomArray() {
        List<Integer> array = new ArrayList<Integer>();

        int sum = 0;
        int amountOfNumbers = 0;
        int i = 0;
        while (true) {
            Random random = new Random();
            int randomNumber = random.nextInt(100) + 1;
            amountOfNumbers++;
            sum += randomNumber;

            if (array.contains(randomNumber)) {
                break;
            }

            array.add(randomNumber);
        }

        System.out.println("Total amount of numbers: " + amountOfNumbers);
        System.out.println("Sum of all numbers in array: " + sum);
    }
}
