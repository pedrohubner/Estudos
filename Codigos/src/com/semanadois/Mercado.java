package com.semanadois;

public class Mercado {

    private String produto;
    private double valor;
    private int qntd;
    private int codigo;

    public Mercado(String produto, double valor, int qntd, int codigo){
        this.produto = produto;
        this.valor = valor;
        this.qntd = qntd;
        this.codigo = codigo;
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

    @Override
    public String toString() {
        //TODO
        return "O " + produto + " custa " + valor;
    }

    //Método abstrato
    public void exibirDados(){};
}
