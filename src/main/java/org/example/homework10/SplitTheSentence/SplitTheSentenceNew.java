package org.example.homework10.SplitTheSentence;

import java.util.Arrays;

public class SplitTheSentenceNew {
    public static void main(String[] args) {
        String sentence = "New sentence is here";
        splitAndPrint(sentence);
        System.out.println();
    }

    public static void splitAndPrint(String sentence) {
        Arrays.stream(sentence.split(" ")).forEach(words -> System.out.println(words));
    }
}
