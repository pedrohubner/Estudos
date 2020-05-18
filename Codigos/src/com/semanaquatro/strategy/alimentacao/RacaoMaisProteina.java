package com.semanaquatro.strategy.alimentacao;

public class RacaoComProteina implements Racao {

    @Override
    public void comer() {
        System.out.println(" comendo ração com proteína extra.");
    }
}
