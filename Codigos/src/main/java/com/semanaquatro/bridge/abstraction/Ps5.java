package com.semanaquatro.bridge.abstraction;

import com.semanaquatro.bridge.implementation.Produto;

public class Ps5 extends Console {

    public Ps5(Produto produto, Produto lancamento){
        super(produto, lancamento);
    }

    @Override
    public String vender() {
        return "Playstation 5" + produto.produzir() + lancamento.produzir();
    }
}
