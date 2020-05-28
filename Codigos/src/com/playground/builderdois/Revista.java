package com.playground.builderdois;

public class Revista extends Publicacao{

    private String titulo;
    private double preco;
    private int qntdPaginas;
    private String editora;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQntdPaginas() {
        return qntdPaginas;
    }

    public void setQntdPaginas(int qntdPaginas) {
        this.qntdPaginas = qntdPaginas;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    @Override
    public String toString() {
        return "\nTrecho da revista " + titulo + "\n=======================\n" + tituloPublicacao + ":\n\"" + texto +
                "\"\n" + nomeAutor + " - " + dataPublicacao;
    }
}
