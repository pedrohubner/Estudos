package com.playground.miniprojeto;

public class Produtos {

    private String nome;
    private double preco;
    private int qntdDisponivel;
    private Loja loja;

    public Produtos(String nome, double preco, int qntdDisponivel, Loja loja){
        this.nome = nome;
        this.preco = preco;
        this.qntdDisponivel = qntdDisponivel;
        this.loja = loja;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQntdDisponivel() {
        return qntdDisponivel;
    }

    public void setQntdDisponivel(int qntdDisponivel) {
        this.qntdDisponivel = qntdDisponivel;
    }

    public Loja getLoja() {
        return loja;
    }

    public void comprarProduto(){
        if (qntdDisponivel > 0){
            System.out.println("Produto " + nome + " - Quantidade em estoque: "+ (qntdDisponivel - 1));
        }else System.out.println("Produto não disponível");
    }

    @Override
    public String toString() {
        return nome + " custa " + preco + " e possui " + qntdDisponivel + " em estoque.";
    }
}

