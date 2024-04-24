package org.example.homework6;

import java.util.Arrays;
import java.util.Scanner;
public class FindMinElement {
    public static void main(String[] args) {
        int[] returnedArray = readIntegers();
        System.out.println(Arrays.toString(returnedArray));

        int minValue = findMin(returnedArray);
        System.out.println("Min = " + minValue);
    }
    private static int findMin(int[] returnedArray) {
        int min = Integer.MAX_VALUE;
        for (int element : returnedArray) {
            if (element < min) {
                min = element;
            }
        }

        return min;
    }
    private static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of integers separated by commas: ");
        String input = scanner.nextLine();

        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for (int i = 0; i < splits.length; i++) {
            values[i] = Integer.parseInt(splits[i].trim());
        }

        return values;
    }
}
