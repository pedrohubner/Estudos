package com.playground.builderdois;

public class RevistaBuilder {

    private Revista revista;

    public RevistaBuilder(){
        this.revista = new Revista();
    }

    public RevistaBuilder addTitulo(String titulo){
        this.revista.setTitulo(titulo);
        return this;
    }

    public RevistaBuilder addPreco(double preco){
        this.revista.setPreco(preco);
        return this;
    }

    public RevistaBuilder addQntdPaginas(int qntdPaginas){
        this.revista.setQntdPaginas(qntdPaginas);
        return this;
    }

    public RevistaBuilder addEditora(String editora){
        this.revista.setEditora(editora);
        return this;
    }

    public RevistaBuilder addPublicacao(String tituloPublicacao, String nomeAutor, String dataPublicacao, String texto){
        this.revista.tituloPublicacao =tituloPublicacao;
        this.revista.nomeAutor = nomeAutor;
        this.revista.dataPublicacao = dataPublicacao;
        this.revista.texto = texto;
        return this;
    }

    public Revista get(){
        return this.revista;
    }
}
