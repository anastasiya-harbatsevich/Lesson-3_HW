package org.example.homework6;

import java.util.Scanner;
public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        countVowelsAndConsonants(input);
    }
    private static void countVowelsAndConsonants(String input) {
        int vowelsCount = 0;
        int consonantsCount = 0;
        char[] array = input.toLowerCase().toCharArray();

        for (char ch : array) {
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'o' || ch == 'i' || ch == 'u' || ch == 'y') {
                    vowelsCount++;
                } else {
                    consonantsCount++;
                }
            }
        }

        System.out.println("Number of vowels:" + vowelsCount);
        System.out.println("Number of consonants:" + consonantsCount);
    }
}
