package com.semanadois.copy;

public class Revista implements Cloneable{

    private String name;
    private double preco;

    public Revista(String name, double preco){
        this.name = name;
        this.preco = preco;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
            return super.clone();
    }

    @Override
    public String toString() {
        return name + "\nValor: R$" + preco;
    }
}
