package org.example.homework10.EmployeeProcessing;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class EmployeeProcessing {
        public record Employee(String firstName, String lastName, String hireDate) {
        }
    public static void main(String[] args) {

            Employee e1 = new Employee("Minnie", "Mouse", "01/02/2015");
            Employee e2 = new Employee("Mickie", "Mouse", "05/08/2000");
            Employee e3 = new Employee("Daffy", "Duck", "11/02/2011");
            Employee e4 = new Employee("Daisy", "Duck", "05/03/2013");
            Employee e5 = new Employee("Goofy", "Dog", "23/07/2020");

            List<Employee> list = new ArrayList<>(Arrays.asList(e5, e1, e2, e3, e4));

            Collections.sort(list, new Comparator<Employee>() {
                    @Override
                    public int compare(Employee e1, Employee e2) {
                            String fullName1 = e1.firstName + " " + e1.lastName;
                            String fullName2 = e2.firstName + " " + e2.lastName;
                            return  fullName1.compareTo(fullName2);
                    }
            });
            printOrderedList(list, "name");

            Collections.sort(list, new Comparator<Employee>() {
                    @Override
                    public int compare(Employee e1, Employee e2) {
                            int amountOfWorkedYears1 = LocalDate.now().getYear() - LocalDate.parse(e1.hireDate, DateTimeFormatter.ofPattern("dd/MM/yyyy")).getYear();
                            int amountOfWorkedYears2 = LocalDate.now().getYear() - LocalDate.parse(e2.hireDate, DateTimeFormatter.ofPattern("dd/MM/yyyy")).getYear();
                            return amountOfWorkedYears1 - amountOfWorkedYears2;
                    }
            });

            System.out.println();
            printOrderedList(list, "year");
    }
        private static void printOrderedList(List<Employee> list, String sortBy) {
                System.out.println("Sorted by " + sortBy + ": ");
                for (Employee employee : list) {
                        int amountOfWorkedYears = LocalDate.now().getYear() - LocalDate.parse(employee.hireDate, DateTimeFormatter.ofPattern("dd/MM/yyyy")).getYear();
                        System.out.println(employee.firstName() + " " + employee.lastName() + " worked for " + amountOfWorkedYears + " years");
                }
        }
}
