package org.example.homework4;

public class MinutesToYearsAndDays {
    public static void main(String[] args) {
        long min = 1441;
        printYearsAndDays(min);
    }
    private static void printYearsAndDays(long minutes) {
        if (minutes < 1) {
            System.out.println("Invalid value");
            return;
        }
        long yy = minutes / 525600;
        long dd = (minutes - yy * 525600) / 1440;
        System.out.println(minutes + " min = " + yy + " y and " + dd + " d");
    }
}
