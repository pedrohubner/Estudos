package com.weekone.decorator;

public class SweetnerCoffee extends Additionals {

    private final Integer sweetnerDrops;

    SweetnerCoffee(Coffee coffee, Integer sweetnerDrops) {
        super(coffee);
        this.sweetnerDrops = sweetnerDrops;
    }

    @Override
    protected String makeCoffee(Integer colheresCafe, Double litrosAgua) {
        return coffee.makeCoffee(colheresCafe, litrosAgua) + addSweetner();
    }

    String addSweetner() {
        return "\nDepois que o café for servido, adicionar " + sweetnerDrops
                + " gotas de adoçante.";
    }
}
