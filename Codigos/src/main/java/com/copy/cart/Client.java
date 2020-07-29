package com.copy.cart;

public class Client implements Cloneable {

    private String firstName;
    private String lastName;
    private Integer age;
    private Address address;

    Client(String firstName, String lastName, Integer age, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Cliente: " + firstName;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Client client = (Client) super.clone();
        client.address = (Address) address.clone();
        return client;
    }
}
