package com.semanadois.mutability;

public final class JavaImutavel {

    private String name;
    private int age;

    public JavaImutavel(String name, int age){

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " tem " + age + " anos";
    }
}
