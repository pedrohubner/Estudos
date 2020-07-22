package com.copy.cart;

public class Address implements Cloneable {

    private String street;
    private Integer number;
    private Country country;

    Address(String street, Integer number, Country country) {
        this.street = street;
        this.number = number;
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Endereço: " + "\nRua: " + street + "\nNúmero: " + number +
                "\nPaís: " + country;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
