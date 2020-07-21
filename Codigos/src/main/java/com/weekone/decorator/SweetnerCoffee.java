package com.weekone.decorator;

public class SweetnerCoffee extends Additionals {

    private int sweetnerDrops;

    SweetnerCoffee(Coffee coffee, int sweetnerDrops) {
        super(coffee);
        this.sweetnerDrops = sweetnerDrops;
    }

    @Override
    protected String makeCoffee(int colheresCafe, double litrosAgua) {
        return coffee.makeCoffee(colheresCafe, litrosAgua) + addSweetner();
    }

    String addSweetner() {
        return "\nDepois que o café for servido, adicionar " + sweetnerDrops
                + " gotas de adoçante.";
    }
}
