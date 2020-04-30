package com.semanadois.copy;

public class Lancamento implements Cloneable{

    private String dataLancamento;
    private String name;
    private String edicao;
    private int qntdPags;
    private double preco;
    private Revista revista;

    public Lancamento(String dataLancamento, String name, String edicao, int qntdPags, double preco, Revista revista){
        this.dataLancamento = dataLancamento;
        this.name = name;
        this.edicao = edicao;
        this.qntdPags = qntdPags;
        this.preco = preco;
        this.revista = revista;

    }

    public String getDataLancamento(){
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

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

    public int getQntdPags() {
        return qntdPags;
    }

    public void setQntdPags(int qntdPags) {
        this.qntdPags = qntdPags;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Lancamento novaRevista = (Lancamento) super.clone();
        novaRevista.revista = (Revista) revista.clone();
        return novaRevista;
    }

    @Override
    public String toString() {
        return revista + " será lançada em " + dataLancamento;
    }
}
