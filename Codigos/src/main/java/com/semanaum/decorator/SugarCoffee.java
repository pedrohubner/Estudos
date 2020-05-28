package com.semanaum.decorator;

public class SugarCoffee extends Additionals {

    private int sugarSpoons;

    SugarCoffee(Coffee coffee, int sugarSpoons) {
        super(coffee);
        this.sugarSpoons = sugarSpoons;
    }

    public int getSugarSpoons() {
        return sugarSpoons;
    }

    @Override
    protected String makeCoffee(int colheresCafe, double litrosAgua) {
        return coffee.makeCoffee(colheresCafe, litrosAgua) + addSugar();
    }

    String addSugar() {
        return "\nDepois que o café for servido, adicionar " + sugarSpoons
                + " colheres de açúcar.";
    }
}
