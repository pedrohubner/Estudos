package com.semanatres.featuresonze;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;

public class Beta3 {
    public static void main(String[] args) throws IOException {

        String nomes = "Java\n11\nFeatures";
        String endereco = " Casmurro ";

        System.out.println("\nString está vazia? " + nomes.isBlank());

        System.out.print("\nDom");
        System.out.print(endereco.strip());
        System.out.println("55");

        System.out.print("\nDom");
        System.out.print(endereco.stripTrailing());
        System.out.println("55");

        System.out.print("\nDom");
        System.out.print(endereco.stripLeading());
        System.out.println("55");

        System.out.println("\n" + nomes.lines().collect(Collectors.toList()));

        //TODO implementar sintaxa de inferência de variável com lambda

        Path path = Files.writeString(Files.createTempFile("arquivo", ".txt"), "Conteúdo arquivo");
        System.out.println(path);
        String s = Files.readString(path);
        System.out.println(s);

    }
}
