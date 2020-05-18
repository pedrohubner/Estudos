package com.semanaquatro.bridge.comercio;

import com.semanaquatro.bridge.fabricacao.Produto;

public class Xseries extends Console {

    public Xseries(Produto produto1, Produto produto2){
        super(produto1, produto2);
    }

    @Override
    public String vender() {
        return "Xbox seriesX" + produto1.produzir() + produto2.produzir();
    }
}
