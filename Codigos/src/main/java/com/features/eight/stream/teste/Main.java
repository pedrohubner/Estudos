package com.features.eight.stream.teste;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Person person = new Person(12);

        Stream<Person> personStream = Stream.of(person);

        personStream.filter(person1 -> person.getAge() > 10)
                .map(person1 -> person.getAge() * 10)
                .forEach(System.out::println);
    }
}
