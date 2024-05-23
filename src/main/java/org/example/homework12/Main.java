package org.example.homework12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Mark", 25, 90));
        studentList.add(new Student("Bob", 18, 150));
        studentList.add(new Student("Stutti", 35, 80));
        studentList.add(new Student("Alexa", 40, 20));
        studentList.add(new Student("David", 50, 55));
        studentList.add(new Student("Tom", 15, 30));
        studentList.add(new Student("Dylan", 28, 200));


        System.out.println("List of all students: ");
        printAllNamesOfEachStudent(studentList);

        System.out.println("List of students older than 20: ");
        printNamesOfStudentOlderThan20(studentList);

        System.out.println("List of students sorted by Grade: ");
        printNamesSortedByGrade(studentList);

        System.out.println("Amount of students with Grade less than 60: " + calculateAmountOfStudentsByGrade(studentList));

        System.out.println("Student with the highest grade: " + printStudentWithTheHighestGrade(studentList));

        System.out.println("Average Grade of Students: " + calculateAverageGrade(studentList));
    }

    private static void printAllNamesOfEachStudent(List<Student> studentList) {
         studentList.stream()
                .map(Student::getName)
                .forEach(System.out::println);
    }

    private static void printNamesOfStudentOlderThan20  (List<Student> studentList) {
        studentList.stream()
                .filter(student -> student.getAge() > 20)
                .map(Student::getName)
                .forEach(System.out::println);
    }

    private static void printNamesSortedByGrade  (List<Student> studentList) {
        studentList.stream()
                .filter(student -> student.getGrade() >= 90)
                .map(Student::getName)
                .forEach(System.out::println);
    }

    private static double calculateAverageGrade  (List<Student> studentList) {
        return studentList.stream()
                .mapToInt(Student::getGrade)
                .average()
                .orElse(0.0);
    }

    private static Student printStudentWithTheHighestGrade (List<Student> studentList) {
        return studentList.stream()
                .max(Comparator.comparingInt(Student::getGrade))
                .orElseThrow();
    }

    private static long calculateAmountOfStudentsByGrade (List<Student> studentList) {
        return studentList.stream()
                .filter(student -> student.getGrade() <= 60)
                .count();
    }
}
