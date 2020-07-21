package com.designpatterns.bridge.implementation;

public class Producao implements Produto {

    @Override
    public String produzir() {
        return " produzido";
    }
}
