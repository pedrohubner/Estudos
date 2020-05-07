package com.semanatres.featuresonze;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

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
