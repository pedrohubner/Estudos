package com.features.eight.stream.teste;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Person person = new Person(12);

        Stream<Person> personStream = Stream.of(person);

        personStream.filter(person1 -> person1.getAge() > 10)
                .map(person1 -> {
                    person1.setAge(person1.getAge() * 10);
                    return person1.getAge();
                })
                .forEach(System.out::println);

        System.out.println(person.getAge());
    }
}
