package com.semanaquatro.strategy;

public class LatidoAlerta implements Latido {

    @Override
    public void latir() {
        System.out.println("Cachorro fazendo latido de alerta");
    }
}
