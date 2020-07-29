package com.datastructure.queue.priority;

public class Person implements Comparable<Person> {

    private String name;
    private Integer age;

    Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Person o) {
        if (age < o.age)
            return -1;
        else if (age.equals(o.age))
            return 0;
        return 1;
    }
}
