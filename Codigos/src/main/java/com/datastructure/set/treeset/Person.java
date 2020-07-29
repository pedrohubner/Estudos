package com.datastructure.set.treeset;

public class Person implements Comparable<Person> {

    private String name;

    Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Person o) {
//        if (name.length() < o.name.length())
//            return -1;
//        if (name.length() == o.name.length())
//            return 0;
//        return 1;
        return name.compareTo(o.name);
    }
}
