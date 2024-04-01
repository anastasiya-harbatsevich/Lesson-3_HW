package org.example.homework5;

import java.lang.reflect.Array;

public class EvenDigitSumOldSolution {
    public static void main(String[] args) {
        int initialNumber = 2782;
        System.out.println(getEvenDigitSum(initialNumber));
    }
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int result = 0;
        char[] stringNumber = Integer.toString(number).toCharArray();

        for (int i = 0; i < stringNumber.length; i++) {
            int digitNumber = Array.getChar(stringNumber, i) - '0';
            if (digitNumber % 2 == 0) {
                result += digitNumber;
            }
        }

        return result;
    }
}
