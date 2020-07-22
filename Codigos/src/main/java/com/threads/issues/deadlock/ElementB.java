package com.threads.issues.deadlock;

public class ElementB {

    private Integer numero;

    ElementB(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
}
