package com.weekone.decorator;

public class Additionals extends Production {

    Coffee coffee;

    Additionals(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    protected String makeCoffee(Integer colheresCafe, Double litrosAgua) {
        return null;
    }
}
