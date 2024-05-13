package org.example.homework10.SplitTheSentence;

import java.util.Arrays;

public class SplitTheSentence {
    public static void main(String[] args) {
        String sentence = "New sentence is here";
        splitAndPrint(sentence);
        System.out.println();
    }

    public static void splitAndPrint(String sentence) {
        String[] arrOfSort = sentence.split(" ");
//        for (String words : arrOfSort) {
//            System.out.println(words);
//        }
        Arrays.stream(arrOfSort).forEach(words -> System.out.println(words));
    }
}
