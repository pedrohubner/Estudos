package com.semanaquatro.bridge.comercio;

import com.semanaquatro.bridge.fabricacao.Produto;

abstract public class Console {

    Produto produto;
    Produto lancamento;

    Console(Produto produto, Produto lancamento){
        this.produto = lancamento;
        this.lancamento = lancamento;
    }

    public abstract String vender();
}
