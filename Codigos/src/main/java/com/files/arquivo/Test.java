package com.files.arquivo;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {

        try {
            File myFile = new File("arquivoteste.txt");
            if (myFile.createNewFile()) {
                System.out.println("Arquivo criado:" + myFile.getName());
            } else System.out.println("Arquivo já existe");
        } catch (IOException e) {
            System.out.println("Um erro ocorreu");
        }
    }
}
