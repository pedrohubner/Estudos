package com.semanaquatro.bridge.comercio;

import com.semanaquatro.bridge.fabricacao.Produto;

public class Xseries extends Console {

    public Xseries(Produto produto, Produto lancamento){
        super(produto, lancamento);
    }

    @Override
    public String vender() {
        return "Xbox seriesX" + produto.produzir() + lancamento.produzir();
    }
}
