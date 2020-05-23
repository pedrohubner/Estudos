package com.semanaquatro.bridge.comercio;

import com.semanaquatro.bridge.fabricacao.Produto;

public class Ps5 extends Console {

    public Ps5(Produto produto, Produto lancamento){
        super(produto, lancamento);
    }

    @Override
    public String vender() {
        return "Playstation 5" + produto.produzir() + lancamento.produzir();
    }
}
