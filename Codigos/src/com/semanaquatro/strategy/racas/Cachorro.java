package com.semanaquatro.strategy.racas;

import com.semanaquatro.strategy.alimentacao.Comida;
import com.semanaquatro.strategy.comunicacao.Latido;

public abstract class Cachorro {

    Comida comida;
    Latido latido;

    Cachorro() {
    }

    public String doEat() {
        return comida.comer();
    }

    public String doBark() {
        return latido.latir();
    }

}
