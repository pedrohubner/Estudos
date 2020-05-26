package com.semanaquatro.bridge.abstraction;

import com.semanaquatro.bridge.implementation.Produto;

public class Xseries extends Console {

    public Xseries(Produto produto, Produto lancamento){
        super(produto, lancamento);
    }

    @Override
    public String vender() {
        return "Xbox seriesX" + produto.produzir() + lancamento.produzir();
    }
}
