package com.semanaquatro.strategy.racas;

import com.semanaquatro.strategy.alimentacao.RacaoNormal;
import com.semanaquatro.strategy.comunicacao.LatidoNormal;

public class Labrador extends Cachorro {

    private String nome;

    public Labrador(String nome) {

        comida = new RacaoNormal();
        latido = new LatidoNormal();
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String doBark() {
        return nome + latido.latir();
    }

    @Override
    public String doEat() {
        return nome + comida.comer();
    }
}
