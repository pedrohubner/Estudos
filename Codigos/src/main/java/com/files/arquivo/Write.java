package com.files.arquivo;

import java.io.FileWriter;
import java.io.IOException;

public class Write {
    public static void main(String[] args) {

        try {
            FileWriter myWriter = new FileWriter("arquivoteste.txt");
            myWriter.write("Hello, world!");
            myWriter.close();
            System.out.println("Conteúdo foi escrito com sucesso.");
        } catch (IOException e) {
            System.out.println("Um erro ocorreu.");
        }
    }
}
