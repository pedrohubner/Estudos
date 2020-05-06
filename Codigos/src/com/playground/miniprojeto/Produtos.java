package com.playground.miniprojeto;

public class Produtos {

    private String nome;
    private Double preco;
    private Integer qntdDisponivel;
    private Loja loja;

    public Produtos(String nome, Double preco, Integer qntdDisponivel, Loja loja){
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

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getQntdDisponivel() {
        return qntdDisponivel;
    }

    public void setQntdDisponivel(Integer qntdDisponivel) {
        this.qntdDisponivel = qntdDisponivel;
    }

    public Loja getLoja() {
        return loja;
    }

    public int comprarProduto(){
        if (qntdDisponivel > 0)
            return qntdDisponivel - 1;
        else
            return qntdDisponivel;
    }

    public int reporEstoque(){
        return qntdDisponivel + 1;
    }

    @Override
    public String toString() {
        return nome + " custa " + preco + " e possui " + qntdDisponivel + " em estoque.";
    }
}

