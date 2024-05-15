package org.example.homework11;

import java.util.HashMap;

public class LettersCounter {
    public static void main(String[] args) {
        String message = "Hello world tratatatata";
        countEachLetter(message);
    }

    public static void countEachLetter (String message) {
        message = message.toLowerCase();
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < message.length()-1; i++) {
            if (map.containsKey(message.charAt(i))) {
                int count = map.get(message.charAt(i));
                map.put(message.charAt(i), ++count);
            }
            else {
                map.put(message.charAt(i), 1);
            }
        }
        System.out.println(map);
    }
}
