package com.designpatterns.bridge.abstraction;

import com.designpatterns.bridge.implementation.Produto;

public class Xseries extends Console {

    public Xseries(Produto produto, Produto lancamento){
        super(produto, lancamento);
    }

    @Override
    public String vender() {
        return "Xbox seriesX" + produto.produzir() + lancamento.produzir();
    }
}
