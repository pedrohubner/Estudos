package com.features.nine.gaveta;

import java.io.*;

public class FilesContent {

    void readFileContent() {
        try (BufferedReader reader1 = new BufferedReader(new FileReader("greeting.txt"))) {
            System.out.println(reader1.readLine());
        } catch (IOException e) {
            System.out.println("Deu bad");
        }
    }
}
