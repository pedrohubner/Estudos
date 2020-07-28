package com.features.eight.thread;

public class Math {

    private Integer number;

    Math() {
        this.number =  0;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void increaseNumber() {
        System.out.println(number += 1);
    }

    @Override
    public String toString() {
        return number.toString();
    }
}
