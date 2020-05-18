package com.semanaquatro.strategy.alimentacao;

public class RacaoMaisProteina implements Comida {

    @Override
    public String comer() {
        return " comendo ração com proteína extra.";
    }
}
