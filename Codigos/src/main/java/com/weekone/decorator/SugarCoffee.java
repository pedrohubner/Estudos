package com.weekone.decorator;

public class SugarCoffee extends Additionals {

    private final Integer sugarSpoons;

    SugarCoffee(Coffee coffee, Integer sugarSpoons) {
        super(coffee);
        this.sugarSpoons = sugarSpoons;
    }

    public Integer getSugarSpoons() {
        return sugarSpoons;
    }

    @Override
    protected String makeCoffee(Integer colheresCafe, Double litrosAgua) {
        return coffee.makeCoffee(colheresCafe, litrosAgua) + addSugar();
    }

    String addSugar() {
        return "\nDepois que o café for servido, adicionar " + sugarSpoons
                + " colheres de açúcar.";
    }
}
