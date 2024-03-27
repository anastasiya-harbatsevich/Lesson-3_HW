package org.example.homework4;

public class LeapYear {
    public static void main(String[] args) {
        int year = 7;
         if (leapYear(year))  {
             System.out.println(year + " is a Leap Year");
         } else System.out.println(year + " isn't a Leap Year or out of range [1;9999]");
    }
    private static boolean leapYear(int yearNumber) {
        if (yearNumber < 1 || yearNumber > 9999) {
            return false;
        }
        if (yearNumber % 4 == 0 && yearNumber % 100 != 0) {
            return true;
        } else return yearNumber % 100 == 0 && yearNumber % 400 == 0;
    }
}
