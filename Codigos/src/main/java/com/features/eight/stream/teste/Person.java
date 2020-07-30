package com.features.eight.stream.teste;

public class Person {

    private Integer age;

    Person(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return age.toString();
    }
}
