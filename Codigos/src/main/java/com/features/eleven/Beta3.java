package com.features.eleven;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Beta3 {
    public static void main(String[] args) throws IOException {

//        String endereco = " Casmurro ";
//
//        if (endereco.isBlank()) {
//            System.out.println("String está vazia");
//        }
//        System.out.println("String tem corpo");
//
//        System.out.print("\nDom");
//        System.out.print(endereco.strip());
//        System.out.println("55");
//
//        System.out.print("\nDom");
//        System.out.print(endereco.stripTrailing());
//        System.out.println("55");
//
//        System.out.print("\nDom");
//        System.out.print(endereco.stripLeading());
//        System.out.println("55");

        Path path = Files.writeString(Files.createTempFile("ppp", null),
                "Conteúdo file" );
        System.out.println(path);
        String s = Files.readString(path);
        System.out.println(s);
    }
}
