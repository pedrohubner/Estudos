package com.features.nine.gaveta;

import java.io.*;

public class GerenciadorDeArquivos {

    void readFileContent() throws IOException{
        BufferedReader reader1 = new BufferedReader(new FileReader("greeting.txt"));
        try (reader1) {
            System.out.println(reader1.readLine());
        }
    }
}
