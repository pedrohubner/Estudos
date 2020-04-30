package com.semanadois.copy;

public class Copias {
    public static void main(String[] args) throws CloneNotSupportedException {

        /**
         * SHALLOW COPY
         */

        Revista revista1 = new Revista("Carbono Alterado", 49.9);
        Revista revista2 = new Revista("Duna", 74.9);
        Revista revista3 = new Revista("Carbono Alterado", 49.9);

        Livro livro1 = new Livro(revista1, 400, 2, "Português");
        Livro livro2 = new Livro(revista2, 642, 6, "Inglês");

        System.out.println("\n" + livro1);

        livro1.setQntdPags(500);
        livro1.setEdicao(3);
        livro1.setIdioma("Inglês");

        //Criando clone após alterações de livro1
        Livro novaEdicao = (Livro) livro1.clone();

        novaEdicao.setIdioma("Espanhol");
        novaEdicao.setEdicao(4);

        //imprimindo com informações de livro1 e não novaEdicao
        System.out.println(livro1);
        System.out.println(novaEdicao);

        /**
         * DEEP COPY
         */

        Revista revista4 = new Revista("Amazing Fantasy", 4.5);
        Revista revista5 = new Revista("Detective Comics", 8.7);
        Revista revista6 = new Revista("Daredevil", 10.9);

        HQ hq1 = new HQ(revista4, "#15", 20);

        System.out.println("\n" + hq1);

        HQ novaHQ = (HQ) hq1.clone();

        novaHQ.setEdicao("#21");

        System.out.println("\n" + hq1);
        System.out.println("\n" + novaHQ);

    }
}
