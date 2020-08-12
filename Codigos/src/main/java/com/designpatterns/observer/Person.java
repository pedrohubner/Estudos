package com.designpatterns.observer;

public class Person implements Subscriber {

    private String firstName;

    Person() {
    }

    Person(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public void update(Magazine magazine) {
        System.out.println("Olá, " + firstName + "! A nova edição de " +
                magazine.getName() + " está " + magazine.getAvailability() + " para compra!");
    }
}
