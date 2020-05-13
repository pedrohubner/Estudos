package com.playground.criandobuilder;

public class Leitura {
    public static void main(String[] args) {

        Blog blog = new BlogBuilder()
                .addTitulo("Testando Builder")
                .addPublicacao( "Pensamentos de estagiários", "Estagiário",
                        "13/05/20", "Puutz")
                .get();

        //System.out.println(blog);

        Revista revista = new RevistaBuilder()
                .addTitulo("Época")
                .addPreco(8.5)
                .addEditora("Abril")
                .addQntdPaginas(30)
                .addPublicacao( "Pensamentos de um Ex-Ministro", "Sérgio Moro",
                        "12/04/20", "Valeu, rapaziada!")
                .get();

        System.out.println(revista);
    }
}
