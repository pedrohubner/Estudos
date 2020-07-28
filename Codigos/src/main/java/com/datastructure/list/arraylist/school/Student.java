package com.datastructure.list.arraylist.school;

public class Student {

    private String name;
    private Integer grade;

    public Student(String name, Integer grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer average() {
        grade =  ((grade * 4) / 2) ;
        return grade;
    }

    @Override
    public String toString() {
        return name + " nota: " + grade;
    }
}
