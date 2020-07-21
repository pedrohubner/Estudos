package com.designpatterns.strategy;

public abstract class Opcoes {

    private double valor;
    private String destinatario;

    Opcoes(double valor, String destinatario){
        this.valor = valor;
        this.destinatario = destinatario;
    }

    public double getValor(){
        return valor;
    }

    protected String notaFiscal(){
        return "Destinatário: " + destinatario + "\nValor: " + valor;
    }

}
