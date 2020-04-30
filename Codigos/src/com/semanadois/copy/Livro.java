package com.semanadois.copy;

public class Livro implements Cloneable{

    private int qntdPags;
    private int edicao;
    private String idioma;
    private Revista revista;

    public Livro(Revista revista, int qntdPags, int edicao, String idioma){
        this.qntdPags = qntdPags;
        this.edicao = edicao;
        this.idioma = idioma;
        this.revista = revista;
    }

    public int getQntdPags() {
        return qntdPags;
    }

    public void setQntdPags(int qntdPags) {
        this.qntdPags = qntdPags;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return revista + " com " + qntdPags+ " páginas. " + edicao + " edição. Idioma: " + idioma;
    }
}
