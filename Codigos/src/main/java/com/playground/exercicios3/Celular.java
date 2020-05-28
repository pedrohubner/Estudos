package com.playground.exercicios3;

public class Celular {

    private String modelo;
    private int preco;
    private int cod;

    public Celular(String modelo, int preco, int cod){

        this.modelo = modelo;
        this.preco = preco;
        this.cod = cod;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return modelo + " custa " + preco;
    }
}
