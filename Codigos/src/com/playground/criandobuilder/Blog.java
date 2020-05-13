package com.playground.criandobuilder;

public class Blog extends Publicacao {

    private String titulo;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "\"" + tituloPublicacao + "\"\n" + this.nomeAutor + " - " + this.dataPublicacao + "\n==========\n"
                + this.texto;
    }
}

