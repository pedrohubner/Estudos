package com.semanaquatro.strategy;

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

    public void setValor(double valor){
        this.valor = valor;
    }

    public String getDestinatario(){
        return destinatario;
    }

    public void setDestinatario(String destinatario){
        this.destinatario = destinatario;
    }

    protected String notaFiscal(){
        return "Destinatário: " + destinatario + "\nValor: " + valor;
    }

}
