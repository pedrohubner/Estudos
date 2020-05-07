package com.semanatres.featuresonze;

public class Beta3 {
    public static void main(String[] args) {

        String nomes = "Pedro\nNaã\nHübner";
        System.out.println(nomes);

        //Verificando se a String tá vazia
        System.out.println(nomes.isBlank());

        //Transformando string em uma coleção(uma lista)
        nomes.lines()
                .map(n -> "/" + nomes)
                .forEach(System.out::println);

    }
}
