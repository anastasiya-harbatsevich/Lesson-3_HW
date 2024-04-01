package org.example.homework5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberGenerator {
    public static void main(String[] args) {
        List<Integer> randomArray = generateRandomArray();
        arraySum(randomArray);
    }
    public static List<Integer> generateRandomArray() {
        List<Integer> array = new ArrayList<Integer>();
        boolean flag = true;

        while (flag) {
            Random random = new Random();
            int randomNumber = random.nextInt(100) + 1;

            if (array.indexOf(randomNumber) >= 0) {
                flag = false;
            } else {
                array.add(randomNumber);
            }
        }

        System.out.println("Array of random generated numbers: " + array);

        return array;
    }

    public static void arraySum(List<Integer> randomArray) {
        int sum = 0;

        for (int i = 0; i < randomArray.size(); i++) {
            sum += randomArray.get(i);
        }

        System.out.println("Sum of all numbers in array: " + sum);
    }
}
