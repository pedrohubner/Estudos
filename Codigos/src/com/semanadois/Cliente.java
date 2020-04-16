package com.semanadois;

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

    public void entrarNoMercado(){
        System.out.println(nome + " entrou no mercado");
    }

    public double comprarProduto(){
        return qntdDinheiro - Mercado.valor;
    }

    @Override
    public String toString() {
        return nome;
    }
}
