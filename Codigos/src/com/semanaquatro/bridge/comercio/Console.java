package com.semanaquatro.bridge.comercio;

import com.semanaquatro.bridge.fabricacao.Produto;

abstract public class Console {

    public Produto produto1;
    public Produto produto2;

    public Console(Produto produto1, Produto produto2){
        this.produto1 = produto1;
        this.produto2 = produto2;
    }

    public abstract String vender();
}
