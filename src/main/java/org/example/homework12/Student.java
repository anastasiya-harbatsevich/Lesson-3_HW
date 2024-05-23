package org.example.homework12;

public class Student {
    String name;
    Integer age;
    Integer grade;

    public Student(String name, Integer age, Integer grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name " + name +
                ", age = " + age +
                ", grade = " + grade +
                '}';
    }

}
