package com.semanaquatro.bridge.abstraction;

import com.semanaquatro.bridge.implementation.Produto;

abstract public class Console {

    Produto produto;
    Produto lancamento;

    Console(Produto produto, Produto lancamento){
        this.produto = produto;
        this.lancamento = lancamento;
    }

    public abstract String vender();
}
