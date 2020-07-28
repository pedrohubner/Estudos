package com.datastructure.list.arraylist.school;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("Pedro", 9);
        Student student1 = new Student("Davi", 6);
        Student student2 = new Student("Samuel", 8);
        Student student4 = new Student("Ariana", 10);

        List<Student> studentList = List.of(student, student1, student2, student4);

        studentList.forEach(Student::average);

        Set<Student> studentSet = Set.copyOf(studentList);

        System.out.println(studentSet);
    }
}
