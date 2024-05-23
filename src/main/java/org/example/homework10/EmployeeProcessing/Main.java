package org.example.homework10.EmployeeProcessing;

import java.lang.reflect.Field;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;

public class Main {

    public static void main(String[] args) throws ParseException {

        Employee e1 = new Employee("Minnie", "Mouse", "01/02/2015");
        Employee e2 = new Employee("Mickie", "Mouse", "05/08/2000");
        Employee e3 = new Employee("Daffy", "Duck", "11/02/2011");
        Employee e4 = new Employee("Daisy", "Duck", "05/03/2013");
        Employee e5 = new Employee("Goofy", "Dog", "23/07/2020");

        List<Employee> list = new ArrayList<>(Arrays.asList(e1, e2, e3, e4, e5));

        class AdditionalInfo {

            public void fullName() {
                for (int i = 0; i < list.size(); i++) {
                    String fullName = list.get(i).firstName.concat(" " + list.get(i).lastName);
                    System.out.println("Full name: " + fullName);
                }
            }

            public List<Integer> calculateWorkingYears() {
                List<Integer> workingYears = new ArrayList<>();
                for (int i = 0; i < list.size(); i++) {
                    int year = LocalDate.now().getYear() - LocalDate.parse(list.get(i).hireDate, DateTimeFormatter.ofPattern("dd/MM/yyyy")).getYear();
                    workingYears.add(year);
                }
                return workingYears;
            }
        }

        AdditionalInfo additionalInfo = new AdditionalInfo();
        additionalInfo.fullName();
        additionalInfo.calculateWorkingYears();

        printOrderedList(list, "name");
        System.out.println();
        printOrderedList(list, "year");
    }

    private static void printOrderedList(List<Employee> list, String field) {
        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (field == "name") {
                    return o1.firstName.compareTo(o2.firstName);
                } else if (field == "year") {

                    return new Date(o1.hireDate).compareTo(new Date(o2.hireDate));
                }
                return 0;
            }
        });

        System.out.println("Sorted list by " + field);
        for (Employee employee : list) {
            System.out.println(employee.firstName + " " + employee.lastName);
        }
    }
}
