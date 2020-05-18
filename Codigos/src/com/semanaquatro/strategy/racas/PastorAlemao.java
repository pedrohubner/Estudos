package com.semanaquatro.strategy.racas;

import com.semanaquatro.strategy.alimentacao.RacaoMaisProteina;
import com.semanaquatro.strategy.comunicacao.LatidoAlerta;

public class PastorAlemao extends Cachorro {

    private String nome;

    public PastorAlemao(String nome) {

        comida = new RacaoMaisProteina();
        latido = new LatidoAlerta();
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String doEat() {
        return nome + super.doEat();
    }

    @Override
    public String doBark() {
        return nome + super.doBark();
    }
}
