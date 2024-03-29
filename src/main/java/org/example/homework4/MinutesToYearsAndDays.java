package org.example.homework4;

public class MinutesToYearsAndDays {

    public static final int amountMinutesInYear = 365 * 24 * 60;
    public static final int amountMinutesInMonth = 24 * 60;

    public static void main(String[] args) {
        long min = 600000;
        printYearsAndDays(min);
    }
    private static void printYearsAndDays(long minutes) {
        if (minutes < 1) {
            System.out.println("Invalid value");
            return;
        }
        long yy = minutes / amountMinutesInYear;
        long dd = (minutes - yy * amountMinutesInYear) / amountMinutesInMonth;
        System.out.println(minutes + " min = " + yy + " y and " + dd + " d");
    }
}
