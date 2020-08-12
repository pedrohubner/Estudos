package com.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Martha");
        Person person1 = new Person("Jonas");

        List<Subscriber> people = new ArrayList<>();

        Magazine magazine = new Magazine("Times", "disponível", people);

        magazine.registerSubscriber(person);
        magazine.registerSubscriber(person1);

        magazine.setAvailability("indisponível");

        magazine.removeSubscriber(person1);

        magazine.setAvailability("disponível");
    }
}
