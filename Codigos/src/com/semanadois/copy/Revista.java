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

    @Override
    protected Object clone() throws CloneNotSupportedException {
            return super.clone();
    }

    @Override
    public String toString() {
        return name + "\nValor: R$" + preco;
    }
}
