package com.copy.register;

public class Person implements Cloneable {

    private Register register;
    private String name;

    Person(Register register, String name) {
        this.register = register;
        this.name = name;
    }

    public Register getRegister() {
        return register;
    }

    public void setRegister(Register register) {
        this.register = register;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person person = (Person) super.clone();
        person.register = (Register) register.clone();
        return person;
    }

    @Override
    public String toString() {
        return "Documento: " + register + "\nName: " + name;
    }
}
