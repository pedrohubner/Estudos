package com.copy.register;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Register register = new Register("050.628.090-02");
        Person person = new Person(register, "Lucas");

        Register register1 = (Register) register.clone();
        Person person1 = (Person) person.clone();

        System.out.println("Pessoa 1: " + person.getName() + "\nDocumento 1: " + person.getRegister());
        System.out.println("Pessoa 2: " + person1.getName() + "\nDocumento 2: " + person1.getRegister());

        register1.setDocument("012.345.678-90");
        person1.setName("Naã");
        person1.setRegister(register1);

        System.out.println("\nPessoa 1: " + person.getName() + "\nDocumento 1: " + person.getRegister());
        System.out.println("Pessoa 2: " + person1.getName() + "\nDocumento 2: " + person1.getRegister());
    }
}
