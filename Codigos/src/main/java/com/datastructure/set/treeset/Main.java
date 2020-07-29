package com.datastructure.set.treeset;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Person> treeSet = new TreeSet<>();

        Person person3 = new Person("Viviane");
        Person person = new Person("Pedro");
        Person person2 = new Person("Samuel");
        Person person1 = new Person("Davi");

        treeSet.add(person2);
        treeSet.add(person1);
        treeSet.add(person);
        treeSet.add(person3);

        System.out.println(treeSet);
    }
}