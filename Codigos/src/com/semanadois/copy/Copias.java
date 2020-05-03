package com.semanadois.copy;

public class Copias {
    public static void main(String[] args) throws CloneNotSupportedException {

        /**
         * SHALLOW COPY
         */
        Revista revista1 = new Revista("Veja", 6.5);
        Revista revista2 = new Revista("Época", 7.9);
        Revista revista3 = new Revista("Guia do Estudante", 9.9);

        System.out.println("\n" + revista1);

        Revista novaRevista = revista1;

        novaRevista.setName("Science Daily");
        novaRevista.setPreco(10.6);

        //novaRevista e revista1 são impressos
        //com os mesmos dados
        System.out.println("\n" + novaRevista);
        System.out.println("\n" + revista1);

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

        //ao imprimir hq1, ela não possui dados alterados
        System.out.println("\n" + hq1);
        System.out.println("\n" + novaHQ);

    }
}
