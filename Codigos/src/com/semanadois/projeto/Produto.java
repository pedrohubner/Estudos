package com.semanadois.projeto;

public class Produto {

    private String nomeProduto;
    private double preco;

    public Produto(String nomeProduto, double preco){

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

    public double aplicarDesconto(){
        double desconto = preco/2;
        return desconto;
    }

    @Override
    public String toString() {
        return " " + nomeProduto + " - " + preco;
    }
}
