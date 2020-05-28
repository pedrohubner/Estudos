package com.playground.builderdois;

public class Leitura {
    public static void main(String[] args) {

        Blog blog = new BlogBuilder()
                .addTitulo("Blog Builder")
                .addPublicacao( "Pensamentos de estagiários", "Estagiário",
                        "13/05/20", "Puutz")
                .get();

        //System.out.println(blog);

        Revista revista = new RevistaBuilder()
                .addTitulo("Revista Builder")
                .addPreco(8.5)
                .addEditora("Dimed")
                .addQntdPaginas(30)
                .addPublicacao( "Builder Pattern como opção", "PNH",
                        "12/04/20", "Valeu, rapaziada!")
                .get();

        System.out.println(revista);
    }
}
