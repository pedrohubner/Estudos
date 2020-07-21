package com.weekone.decorator;

public class MakingCoffee {
    public static void main(String[] args) {

        Production coffee = new SugarCoffee(new Coffee(false), 2);
        System.out.println(coffee.makeCoffee(5, 0.8));
    }
}
