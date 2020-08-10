package com.files.buffered;

import java.io.File;
import java.io.IOException;

public class Tst {
    public static void main(String[] args) {

        try {
            File novoArquivo = new File("testFile.txt");
            if (novoArquivo.createNewFile()) {
                System.out.println("Arquivo criado:" + novoArquivo.getName());
            } else System.out.println("Arquivo já existe");
        } catch (IOException e) {
            System.out.println("Um erro ocorreu");
        }
    }
}
