package com.features.twelve.mismatch;

import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws Exception{

        Path path = Files.writeString(
                Files.createTempFile("arquivoUm", ".txt"), "Olá, mundo");
        System.out.println(path);
        String s = Files.readString(path);
        System.out.println(s);
//
//        Path path1 = Files.writeString(
//                Files.createTempFile("arquivoDois", ".txt"), "Hello, world");
//        System.out.println(path);
//        String s1 = Files.readString(path);
//        System.out.println(s);
//
//        System.out.println("\nOs arquivos '" + " arquivoUm " + "' e '" + " arquivoDois " + "' são iguais? "
//                + (Files.mismatch(path, path1) == -1 ? "Sim" : "Não"));
    }
}
