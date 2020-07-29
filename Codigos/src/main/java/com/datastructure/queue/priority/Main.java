package com.datastructure.queue.priority;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Naã", 15);
        Person person2 = new Person("Camila", 12);
        Person person1 = new Person("Pedro", 18);

        //
        Comparator<Person> compPerson = (age1, age2) -> age1.getAge().compareTo(age2.getAge());

        PriorityQueue<Person> integerPriorityQueue = new PriorityQueue<>(compPerson);

        integerPriorityQueue.add(person);
        integerPriorityQueue.add(person1);
        integerPriorityQueue.add(person2);
        integerPriorityQueue.stream().sorted()
                .forEachOrdered(System.out::println);
    }
}
