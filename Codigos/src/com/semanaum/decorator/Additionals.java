package com.semanaum.decorator;

public class Additionals extends Production {

    Coffee coffee;

    Additionals(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    protected String makeCoffee(int colheresCafe, double litrosAgua) {
        return null;
    }
}
