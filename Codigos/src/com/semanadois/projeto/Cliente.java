package com.semanadois.projeto;

public class Cliente {
    private String nome;
    private double qntdDinheiro;

    public Cliente(String nome, double qntdDinheiro){
        this.nome = nome;
        this.qntdDinheiro = qntdDinheiro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getQntdDinheiro() {
        return qntdDinheiro;
    }

    public void setQntdDinheiro(double qntdDinheiro) {
        this.qntdDinheiro = qntdDinheiro;
    }

    public double comprarProduto(double qntdDinheiro){
        if (this.qntdDinheiro < Farmacia.preco){
            Exception e;
        } else System.out.println(qntdDinheiro - Farmacia.preco);
        return comprarProduto(qntdDinheiro);
    }

    @Override
    public String toString() {
        return "Cliente: " + nome + "\n Saldo: " + qntdDinheiro;
    }
}
