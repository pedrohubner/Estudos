package com.playground.builderdois;

public class BlogBuilder {

    private Blog blog;

    public BlogBuilder(){
        this.blog = new Blog();
    }

    public BlogBuilder addTitulo(String titulo){
        this.blog.setTitulo(titulo);
        return this;
    }

    public BlogBuilder addPublicacao(String tituloPublicacao, String nomeAutor, String dataPublicacao, String texto){
        this.blog.tituloPublicacao = tituloPublicacao;
        this.blog.nomeAutor = nomeAutor;
        this.blog.dataPublicacao = dataPublicacao;
        this.blog.texto = texto;
        return this;
    }

    public Blog get(){
        return this.blog;
    }
}
