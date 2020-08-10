package com.files.arquivo;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Read {
    public static void main(String[] args) {

        try {
            FileReader reader = new FileReader("arquivoteste.txt");
            Scanner myFile = new Scanner(reader);
            String meuFile = myFile.nextLine();
            System.out.println(meuFile);
        } catch (IOException e) {
            System.out.println("Ocorreu um erro.");
        }
    }
}
