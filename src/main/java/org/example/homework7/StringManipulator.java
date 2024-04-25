package org.example.homework7;

import java.util.Arrays;

public class StringManipulator {
    public static void main(String[] args) {
        String initialString = "abcd4efabc123deabcdaaa";
        char[] charsToRemove = {'a', 'd', '3', 'b'};
        String modifiedString = removeCharacters(initialString, charsToRemove);
        System.out.println("Initial string: " + initialString);
        System.out.println("Characters to remove: " + Arrays.toString(charsToRemove));
        System.out.println("Modified string: " + modifiedString);
    }

    public static String removeCharacters(String input, char[] charsToRemove){
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (!new String(charsToRemove).contains("" + input.charAt(i))) {
                result.append(input.charAt(i));
            }
        }

        return result.toString();
    }

}
