package com.designpatterns.bridge.implementation;

public class Lancamento implements Produto {

    @Override
    public String produzir() {
        return " e pronto pra ser lançado.";
    }
}
