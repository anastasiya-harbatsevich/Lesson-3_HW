package org.example.homework10.EmployeeProcessingOld;

import java.lang.reflect.Field;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {

            Employee e1 = new Employee("Minnie", "Mouse", "01/02/2015");
            Employee e2 = new Employee("Mickie", "Mouse", "05/08/2000");
            Employee e3 = new Employee("Daffy", "Duck", "11/02/2011");
            Employee e4 = new Employee("Daisy", "Duck", "05/03/2013");
            Employee e5 = new Employee("Goofy", "Dog", "23/07/2020");

            List<Employee> listOld = new ArrayList<>(Arrays.asList(e1, e2, e3, e4, e5));

        class AdditionalInfo {

            public void fullName() {
                for (int i = 0; i < listOld.size(); i++) {
                    String fullName = listOld.get(i).firstName.concat(" " + listOld.get(i).lastName);
                    System.out.println(fullName);
                }
            }

            public List<Integer> calculateWorkingYears() {
                List<Integer> workingYears = new ArrayList<>();
                for (int i = 0; i < listOld.size(); i++) {
                    int year = LocalDate.now().getYear() - LocalDate.parse(listOld.get(i).hireDate, DateTimeFormatter.ofPattern("dd/MM/yyyy")).getYear();
                    workingYears.add(year);
                }
                return workingYears;
            }
        }

        AdditionalInfo additionalInfo = new AdditionalInfo();
        additionalInfo.fullName();
        additionalInfo.calculateWorkingYears();

        printOrderedList(listOld, "firstName");
        System.out.println();
        printOrderedList(listOld, "hireDate");


        List<Integer> newList = additionalInfo.calculateWorkingYears();
        Collections.sort(newList, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                int comparisonByWorkingYears = o1.compareTo(o2);
                return comparisonByWorkingYears;
            }
        });

        System.out.println("Sorted list by hire date");
        for (Integer year : newList) {
            System.out.println(year);
        }
    }

    private static void printOrderedList(List<Employee> list, String name) {
        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                try {
                  Field field1 = o1.getClass().getDeclaredField(name);
                  Field field2 = o2.getClass().getDeclaredField(name);

                  return field1.get(o1).toString().compareTo(field2.get(o2).toString());
               } catch (NoSuchFieldException e) {
                   throw new RuntimeException(e);
               } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        System.out.println("Sorted list by " + name);
        for (Employee employee : list) {
            System.out.println(employee.firstName + " " + employee.lastName);
        }
    }
}
