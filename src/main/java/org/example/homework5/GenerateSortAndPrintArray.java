package org.example.homework5;

import java.util.Random;
public class GenerateSortAndPrintArray {
    public static void main(String[] args) {
        int[] numbers = getIntegers(5);
        printArray(numbers);
        int[] sortedNumbers = sortIntegers(numbers);
        printArray(sortedNumbers);
    }
    public static int[] getIntegers(int size) {
        int[] array = new int[size];
        int i = 0;
        while (i < size) {
            Random random = new Random();
            int rand = random.nextInt(100);
            array[i] = rand;
            i++;
        }

        return array;
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }
    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = array.clone();

        for (int i = 0; i < sortedArray.length - 1; i++) {
            for (int n = 0; n < sortedArray.length - i - 1; n++) {
                if (sortedArray[n] < sortedArray[n + 1]) {
                    swap(sortedArray, n);
                }
            }
        }

        return sortedArray;
    }

    private static void swap(int[] array, int i) {
        array[i] =  array[i + 1] - array[i];
        array[i + 1] = array[i + 1] - array[i];
        array[i] = array[i] + array[i + 1];
    }
}
