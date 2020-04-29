package com.semanadois.copy;

public class Revista implements Cloneable{

    private String name;
    private String edicao;
    private int qntdPags;
    private double preco;
    private boolean rara;

    public Revista(String name, String edicao, int qntdPags, double preco, boolean rara){
        this.name = name;
        this.edicao = edicao;
        this.preco = preco;
        this.qntdPags = qntdPags;
        this.rara = rara;
    }

    public Revista(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQntdPags() {
        return qntdPags;
    }

    public void setQntdPags(int qntdPags) {
        this.qntdPags = qntdPags;
    }

    public boolean isRara() {
        return rara;
    }

    public void setRara(boolean rara) {
        this.rara = rara;
    }

    public void edicaoRara() {
        if (rara) {
            double multiply = preco * 30000;
        }else System.out.println("Edição não rara, preço normal.");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        try {
            return super.clone();
        }catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Revista " + name + edicao + ". Páginas: " + qntdPags + "\nValor: R$" + preco;
    }
}
