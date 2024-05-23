package org.example.homework10.EmployeeProcessing;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class EmployeeProcessingNew {
    public record Employee (String name, String hireDate) {
        Employee(String firstName, String lastName, String hireDate){
            this(firstName + " " + lastName, hireDate);
        }
    }

    public static void main(String[] args) {

        Employee e1 = new Employee("Minnie", "Mouse", "01/02/2015");
        Employee e2 = new Employee("Mickie", "Mouse", "05/08/2000");
        Employee e3 = new Employee("Daffy", "Duck", "11/02/2011");
        Employee e4 = new Employee("Daisy", "Duck", "05/03/2013");
        Employee e5 = new Employee("Goofy", "Dog", "23/07/2020");

        List<Employee> list = new ArrayList<>(Arrays.asList(e1, e2, e3, e4, e5));

        printOrderedList(list, "name");
        System.out.println();
        printOrderedList(list, "year");
    }

    public static void printOrderedList(List<Employee> list, String sortBy) {
        class MyEmployee {
            int amountOfWorkedYears;
            String fullName;

            public MyEmployee(Employee containedEmployee) {
                this.fullName = containedEmployee.name;
                this.amountOfWorkedYears = LocalDate.now().getYear() - LocalDate.parse(containedEmployee.hireDate, DateTimeFormatter.ofPattern("dd/MM/yyyy")).getYear();
            }

            @Override
            public String toString() {
                return fullName + ", worked for " + amountOfWorkedYears;
            }
        }

        List<MyEmployee> myEmployees= new ArrayList<>();
        for (Employee employee : list) {
            myEmployees.add(new MyEmployee(employee));
        }

        Collections.sort(myEmployees, new Comparator<MyEmployee>() {
            @Override
            public int compare(MyEmployee employee1, MyEmployee employee2) {
                switch (sortBy) {
                    case "name":
                        return employee1.fullName.compareTo(employee2.fullName);
                    case "year":
                        return employee1.amountOfWorkedYears - employee2.amountOfWorkedYears;
                    default:
                        return 0;
                }
            }
        });


        for (MyEmployee myEmployee : myEmployees) {
            System.out.println(myEmployee);
        }
    }
}
