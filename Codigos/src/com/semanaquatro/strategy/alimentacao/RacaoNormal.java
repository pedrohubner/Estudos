package com.semanaquatro.strategy.alimentacao;

public class RacaoNormal implements Comida {

    @Override
    public String comer() {
        return " comendo sua ração normal";
    }
}
