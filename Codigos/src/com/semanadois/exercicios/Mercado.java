package com.semanadois;

public class Mercado {

    private String produto;
    public static double valor;
    public static int qntd;
    private int codigo;
    private boolean carrinho;

    public Mercado(String produto, double valor, int qntd, int codigo, boolean carrinho){
        this.produto = produto;
        this.valor = valor;
        this.qntd = qntd;
        this.codigo = codigo;
        this.carrinho = carrinho;
    }

    public String getProduto(){
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQntd() {
        return qntd;
    }

    public void setQntd(int qntd) {
        this.qntd = qntd;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public boolean isCarrinho() {
        return carrinho;
    }

    public void setCarrinho(boolean carrinho) {
        this.carrinho = carrinho;
    }

    public double aplicarDesconto(){
        return valor/1.4 ;
    }

    public void pegarCarrinho(){}

    @Override
    public String toString() {
        //TODO
        return "O " + produto + " custa " + valor;
    }

}
