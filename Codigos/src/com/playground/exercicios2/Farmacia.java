package com.playground.exercicios2;

public class Farmacia {
    private String nomeProduto;
    static double preco;

    public Farmacia(String nomeProduto, double preco){
        this.nomeProduto = nomeProduto;
        this.preco = preco;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double aplicarDesconto(double preco){
        double desconto = ((preco * 2) /100);
        return desconto;
    }

    @Override
    public String toString() {
        return "\n" + nomeProduto + " - R$" + preco;
    }
}
