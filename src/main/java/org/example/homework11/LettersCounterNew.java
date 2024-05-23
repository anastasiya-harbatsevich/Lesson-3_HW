package org.example.homework11;

import java.util.HashMap;

public class LettersCounterNew {
    public static void main(String[] args) {
        String message = "Hello world tratatatata";
        countEachLetter(message);
    }

    public static void countEachLetter (String message) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char character : message.toCharArray()) {
            if (Character.isLetter(character)) {
                char lowercaseCharacter = Character.toLowerCase(character);
                map.put(lowercaseCharacter, map.getOrDefault(lowercaseCharacter, 0) + 1);
            }
        }
        System.out.println(map);
    }
}
