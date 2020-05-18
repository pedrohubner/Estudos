package com.semanaquatro.strategy;

import com.semanaquatro.strategy.alimentacao.Comida;
import com.semanaquatro.strategy.comunicacao.Latido;

public abstract class Cachorro {

    Comida comida;
    Latido latido;

    public Cachorro(){}

    public void doEat(){
        comida.comer();
    }

    public void doBark(){
        latido.latir();
    }

}
