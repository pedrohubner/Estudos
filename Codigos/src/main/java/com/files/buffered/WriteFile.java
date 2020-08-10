package com.files.buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {

        try {
            FileWriter fileWriter = new FileWriter("testFile.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Olá, mundo");
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Ocorreu um erro.");
        }
    }
}
