package com.designpatterns.facade;

public class Product {

    private String produto;
    private double preco;

    public Product(String produto, double preco){
        this.produto = produto;
        this.preco = preco;
    }

    public String getProduto() {
        return produto;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String listaProdutos() {
        return "===Lista Produtos==="
                + "\nProduto: " + produto
                + "\nPreço: " + preco;
    }
}
