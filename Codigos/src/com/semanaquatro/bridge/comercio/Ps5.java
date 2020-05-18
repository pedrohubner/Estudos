package com.semanaquatro.bridge.comercio;

import com.semanaquatro.bridge.fabricacao.Produto;

public class Ps5 extends Console {

    public Ps5(Produto produto1, Produto produto2){
        super(produto1, produto2);
    }

    @Override
    public String vender() {
        return "Playstation 5" + produto1.produzir() + produto2.produzir();
    }
}
