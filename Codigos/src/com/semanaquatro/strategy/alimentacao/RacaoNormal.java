package com.semanaquatro.strategy;

public class RacaoNormal implements Comida {

    @Override
    public void comer() {
        System.out.println("Cachorro está comendo sua ração normal");
    }
}
