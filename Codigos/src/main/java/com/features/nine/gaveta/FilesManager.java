package com.features.nine.gaveta;

import java.io.*;

public class FilesManager {

    void readFileContent() {
        try (BufferedReader reader1 = new BufferedReader(new FileReader("greeting.txt"))) {
            reader1.close();
            System.out.println(reader1.readLine());
        } catch (IOException e) {
            System.out.println("Deu bad");
        }
    }
}
